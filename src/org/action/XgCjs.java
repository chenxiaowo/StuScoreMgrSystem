package org.action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.dao.CjDao;
import org.dao.DlDao;
import org.dao.XkDao;
import org.dao.imp.DlDaoImp;
import org.dao.imp.XkDaoImp;
import org.model.Cjb;
import org.model.CjbView;
import org.model.Dlb;
import org.model.JsonCjbView;
import org.model.Kcb;
import org.model.Xsb;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.util.GetRequestJsonUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class XgCjs extends ActionSupport{
	
	private String xh;
	private String vxm;
	private String kch;
	private String vkcm;
	private int xf;
	private int cj;
	
	
	public String getXh() {
		return xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	public String getVxm() {
		return vxm;
	}


	public void setVxm(String vxm) {
		this.vxm = vxm;
	}


	public String getKch() {
		return kch;
	}


	public void setKch(String kch) {
		this.kch = kch;
	}


	public String getVkcm() {
		return vkcm;
	}


	public void setVkcm(String vkcm) {
		this.vkcm = vkcm;
	}

	public int getXf() {
		return xf;
	}

	public void setXf(int xf) {
		this.xf = xf;
	}

	public int getCj() {
		return cj;
	}

	public void setCj(int cj) {
		this.cj = cj;
	}

	public String execute() throws Exception {
		ApplicationContext context=new 				
		FileSystemXmlApplicationContext(ServletActionContext.getServletContext().getRealPath("/")+"WEB-INF/classes/applicationContext.xml");
		Map session=(Map)ActionContext.getContext().getSession();
		
		CjDao cjDao = (CjDao) context.getBean("cjDao");
//		List cjs = cjDao.getCjs();
//		
//		List<CjbView> vcjbs = new ArrayList<CjbView>();
//		int i =  0;
//		Iterator<Cjb> it = cjs.iterator();
//		while(it.hasNext())
//		{
//			Cjb tcj = it.next();
//			CjbView view = new CjbView();
//			view.setId(tcj.getId());
//			view.setVxm(cjDao.getOneXsM(tcj.getId().getXh()));
//			view.setVkcm(cjDao.getOneKcM(tcj.getId().getKch()));
//			view.setXf(tcj.getXf());
//			view.setCj(tcj.getCj());
//			vcjbs.add(view);
//			System.out.println("��"+(i+1)+"��");
//		}
//		session.put("vcjbs", vcjbs);
		
//		HttpServletRequest request = ServletActionContext.getRequest();
//		
//		String str = GetRequestJsonUtils.getRequestJsonString(request);
//		
		System.out.println("学号是："+xh);
		System.out.println("姓名是："+vxm);
		System.out.println("课程号:"+kch);
		System.out.println("课程名是："+vkcm);
		System.out.println("学分是："+xf);
		System.out.println("成绩是："+cj);
		
		cjDao.xgOneCj(xh, kch, cj);
		
		
		return "got";
	}
	
}
