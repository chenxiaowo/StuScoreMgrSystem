package org.action;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.ServletActionContext;
import org.dao.DlDao;
import org.dao.GrDao;
import org.dao.XkDao;
import org.dao.imp.DlDaoImp;
import org.dao.imp.XkDaoImp;
import org.model.Dlb;
import org.model.Kcb;
import org.model.Xsb;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class AllKc extends ActionSupport{
	// Dlb��������ڴ�ȡDlb���Ե�ֵ
	private Dlb dlb;
	// �����get��set����
	
	public Dlb getDlb() {
		return dlb;
	}

	public void setDlb(Dlb dlb) {
		this.dlb = dlb;
	}
	
	
	public String execute() throws Exception {
		ApplicationContext context=new 				
		FileSystemXmlApplicationContext(ServletActionContext.getServletContext().getRealPath("/")+"WEB-INF/classes/applicationContext.xml");
		Map session=(Map)ActionContext.getContext().getSession();
//		Set mykb = (Set) session.get("grkb");
		
		Xsb xs = (Xsb) session.get("xsxx");
		
		GrDao grDao = (GrDao) context.getBean("grDao");
		Set mykb =  grDao.getKcb(xs.getXh());
		
		XkDao kc = (XkDao) context.getBean("xkDao");
		List kcs = kc.allKc();
		Iterator<Kcb> it = kcs.iterator();
		while(it.hasNext()&&mykb!=null)
		{
			Kcb tmp = it.next();
			Iterator<Kcb> it2 = mykb.iterator();
			while(it2.hasNext())
			{
				Kcb tmp2 = it2.next();
				if(tmp.getKch().equals(tmp2.getKch()))
				{
					it.remove();
				}
			}
		}
		session.put("kcs", kcs);
		
		return SUCCESS;
	}
	
}
