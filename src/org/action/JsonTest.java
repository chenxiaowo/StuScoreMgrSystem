package org.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.dao.CjDao;
import org.model.Cjb;
import org.model.CjbView;
import org.model.JsonCjbView;
import org.model.Xsb;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;



public class JsonTest extends ActionSupport {

	
	private List vcjbs;


	public List getVcjbs() {
		return vcjbs;
	}


	public void setVcjbs(List vcjbs) {
		this.vcjbs = vcjbs;
	}


	@Override
	public String execute() throws Exception {
		ApplicationContext context=new 				
		FileSystemXmlApplicationContext(ServletActionContext.getServletContext().getRealPath("/")+"WEB-INF/classes/applicationContext.xml");
		Map session=(Map)ActionContext.getContext().getSession();
		CjDao cjDao = (CjDao) context.getBean("cjDao");
		List cjs = cjDao.getCjs();
		
		vcjbs = new ArrayList<JsonCjbView>();
		int i = 0;
		Iterator<Cjb> it = cjs.iterator();
		while(it.hasNext())
		{
			Cjb tcj = it.next();
			JsonCjbView view = new JsonCjbView();
			view.setXh(tcj.getId().getXh());
			view.setKch(tcj.getId().getKch());
			view.setVxm(cjDao.getOneXs(tcj.getId().getXh()).getXm());
			view.setVkcm(cjDao.getOneKc(tcj.getId().getKch()).getKcm());
			view.setXf(tcj.getXf());
			view.setCj(tcj.getCj());
			vcjbs.add(view);
//			Cjb tcj = it.next();
//			CjbView view = new CjbView();
//			view.setId(tcj.getId());
//			view.setVxm(cjDao.getOneXs(tcj.getId().getXh()).getXm());
//			view.setVkcm(cjDao.getOneKc(tcj.getId().getKch()).getKcm());
//			view.setXf(tcj.getXf());
//			view.setCj(tcj.getCj());
//			vcjbs.add(view);
			
		}
//		vcjbs = cjs;
		return "jsonv";
	
	}
	
}
