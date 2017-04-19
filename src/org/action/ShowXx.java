package org.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.dao.DlDao;
import org.dao.GrDao;
import org.dao.XxDao;
import org.dao.imp.DlDaoImp;
import org.dao.imp.GrDaoImp;
import org.dao.imp.XxDaoImp;
import org.model.Dlb;
import org.model.Xsb;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowXx extends ActionSupport {
	private Xsb xsb;

	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext context=new 				
		FileSystemXmlApplicationContext(ServletActionContext.getServletContext().getRealPath("/")+"WEB-INF/classes/applicationContext.xml");
		Map session=(Map)ActionContext.getContext().getSession();
		String xh = session.get("xh").toString();
		XxDao xxDao= (XxDao) context.getBean("xxDao");
		Xsb xs=xxDao.getXsb(xh);
		session.put("xsxx",xs);
		
		return SUCCESS;
	}
	
}
