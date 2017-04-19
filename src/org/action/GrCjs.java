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
public class GrCjs extends ActionSupport{
	
	
	public String execute() throws Exception {
		ApplicationContext context=new 				
		FileSystemXmlApplicationContext(ServletActionContext.getServletContext().getRealPath("/")+"WEB-INF/classes/applicationContext.xml");
		Map session=(Map)ActionContext.getContext().getSession();
		Xsb xs = (Xsb) session.get("xsxx");
		CjDao cjDao = (CjDao) context.getBean("cjDao");
		List cjs = cjDao.getGrCjs(xs.getXh());
		
		List<CjbView> vcjbs = new ArrayList<CjbView>();
		
		Iterator<Cjb> it = cjs.iterator();
		while(it.hasNext())
		{
			Cjb tcj = it.next();
			CjbView view = new CjbView();
			view.setId(tcj.getId());
			view.setVxm(cjDao.getOneXs(tcj.getId().getXh()).getXm());
			view.setVkcm(cjDao.getOneKc(tcj.getId().getKch()).getKcm());
			view.setXf(tcj.getXf());
			view.setCj(tcj.getCj());
			vcjbs.add(view);
		}
		session.put("vgrcjs", vcjbs);
		
		return SUCCESS;
	}
	
}
