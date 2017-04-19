package org.action;
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
import org.model.Dlb;
import org.model.Kcb;
import org.model.Xsb;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class TestAction extends ActionSupport{
	// Dlb类对象，用于存取Dlb属性的值
	private Dlb dlb;
	// 生成其get和set方法
	
	public Dlb getDlb() {
		return dlb;
	}

	public void setDlb(Dlb dlb) {
		this.dlb = dlb;
	}
	
	
	public String execute() throws Exception {
		ApplicationContext context=new 				
		FileSystemXmlApplicationContext(ServletActionContext.getServletContext().getRealPath("/")+"WEB-INF/classes/applicationContext.xml");
		CjDao cj = (CjDao) context.getBean("cjDao");
		cj.xgOneCj("000001", "000001", 20);
		return SUCCESS;
	}
	
}
