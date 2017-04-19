package org.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.dao.CjDao;
import org.dao.XkDao;
import org.dao.imp.XkDaoImp;
import org.model.Xsb;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteKc extends ActionSupport {
	private String unseKch;
	
	
	
	public String getUnseKch() {
		return unseKch;
	}



	public void setUnseKch(String unseKch) {
		this.unseKch = unseKch;
	}



	@Override
	public String execute() throws Exception {
		
		ApplicationContext context=new 				
		FileSystemXmlApplicationContext(ServletActionContext.getServletContext().getRealPath("/")+"WEB-INF/classes/applicationContext.xml");
		
		
		Map session=(Map)ActionContext.getContext().getSession();
		Xsb xs = (Xsb) session.get("xsxx");
		session.put("unseKch",unseKch);
		XkDao xkdao = (XkDao) context.getBean("xkDao");
		xkdao.txkc(xs, unseKch);
		CjDao cjDao = (CjDao) context.getBean("cjDao");
		cjDao.delOneCj(xs.getXh(), unseKch);
		
		
		return SUCCESS;
	}
}
