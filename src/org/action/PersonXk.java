package org.action;
import java.util.Map;
import java.util.Set;

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
public class PersonXk extends ActionSupport{
	// Dlb类对象，用于存取Dlb属性的值
	
	
	public String execute() throws Exception {
		ApplicationContext context=new 				
		FileSystemXmlApplicationContext(ServletActionContext.getServletContext().getRealPath("/")+"WEB-INF/classes/applicationContext.xml");
		Map session=(Map)ActionContext.getContext().getSession();
		String xh = session.get("xh").toString();
		GrDao grDao= (GrDao) context.getBean("grDao");
		Set kcbs = grDao.getKcb(xh);
		session.put("grkb",kcbs);
			return SUCCESS;
	}
}
