package org.action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.ServletActionContext;
import org.dao.CjDao;
import org.dao.DlDao;
import org.dao.XkDao;
import org.dao.imp.DlDaoImp;
import org.dao.imp.XkDaoImp;
import org.model.Cjb;
import org.model.CjbView;
import org.model.Dlb;
import org.model.Kcb;
import org.model.Xsb;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class AllCjs extends ActionSupport{
	
	
	public String execute() throws Exception {
		ApplicationContext context=new 				
		FileSystemXmlApplicationContext(ServletActionContext.getServletContext().getRealPath("/")+"WEB-INF/classes/applicationContext.xml");
		Map session=(Map)ActionContext.getContext().getSession();
		CjDao cjDao = (CjDao) context.getBean("cjDao");
		List cjs = cjDao.getCjs();
		
		List<CjbView> vcjbs = new ArrayList<CjbView>();
		int i =  0;
		Iterator<Cjb> it = cjs.iterator();
		while(it.hasNext())
		{
			Cjb tcj = it.next();
			CjbView view = new CjbView();
			view.setId(tcj.getId());
			view.setVxm(cjDao.getOneXsM(tcj.getId().getXh()));
			view.setVkcm(cjDao.getOneKcM(tcj.getId().getKch()));
			view.setXf(tcj.getXf());
			view.setCj(tcj.getCj());
			vcjbs.add(view);
			System.out.println("µÚ"+(i+1)+"Ìõ");
		}
		session.put("vcjbs", vcjbs);
		
		return SUCCESS;
	}
	
}
