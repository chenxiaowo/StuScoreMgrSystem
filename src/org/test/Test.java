package org.test;

import org.apache.struts2.ServletActionContext;
import org.dao.CjDao;
import org.dao.imp.CjDaoImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context=new 				
		FileSystemXmlApplicationContext(ServletActionContext.getServletContext().getRealPath("/")+"WEB-INF/classes/applicationContext.xml");
		CjDao cj = (CjDao) context.getBean("cjDao");
		cj.addCj("000001", "000001", 50);
		
	}

}
