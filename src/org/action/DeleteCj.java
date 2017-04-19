package org.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.dao.CjDao;
import org.dao.XkDao;
import org.dao.imp.XkDaoImp;
import org.model.CjbId;
import org.model.Xsb;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteCj extends ActionSupport {
	private String delCjXh;
	private String delCjKch;
	
	

	public String getDelCjXh() {
		return delCjXh;
	}



	public void setDelCjXh(String delCjXh) {
		this.delCjXh = delCjXh;
	}



	public String getDelCjKch() {
		return delCjKch;
	}



	public void setDelCjKch(String delCjKch) {
		this.delCjKch = delCjKch;
	}



	@Override
	public String execute() throws Exception {
		
		ApplicationContext context=new 				
		FileSystemXmlApplicationContext(ServletActionContext.getServletContext().getRealPath("/")+"WEB-INF/classes/applicationContext.xml");
		
		CjDao cjDao = (CjDao) context.getBean("cjDao");
		cjDao.delOneCj(delCjXh,delCjKch);
		
		
		
		
		return SUCCESS;
	}
}
