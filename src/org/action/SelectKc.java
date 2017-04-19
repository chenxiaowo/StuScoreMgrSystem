package org.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.dao.CjDao;
import org.dao.XkDao;
import org.dao.imp.XkDaoImp;
import org.model.Cjb;
import org.model.CjbId;
import org.model.Xsb;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SelectKc extends ActionSupport {
	private String seKch;
	public String getSeKch() {
		return seKch;
	}
	public void setSeKch(String seKch) {
		this.seKch = seKch;
	}
	@Override
	public String execute() throws Exception {
		ApplicationContext context=new 				
		FileSystemXmlApplicationContext(ServletActionContext.getServletContext().getRealPath("/")+"WEB-INF/classes/applicationContext.xml");
		Map session=(Map)ActionContext.getContext().getSession();
		Xsb xs = (Xsb) session.get("xsxx");
		session.put("seKch",seKch);
		XkDao xkdao = (XkDao) context.getBean("xkDao");
		xkdao.xsxk(xs, seKch);
		CjDao cjDao = (CjDao) context.getBean("cjDao");
		
		cjDao.addCj(xs.getXh(), seKch, 0);
		
		return SUCCESS;
	}

}
