package org.action;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.dao.DlDao;
import org.dao.XxDao;
import org.dao.imp.DlDaoImp;
import org.dao.imp.XxDaoImp;
import org.model.Dlb;
import org.model.Xsb;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport{
	// Dlb��������ڴ�ȡDlb���Ե�ֵ
	private Dlb dlb;
	private boolean mgr;
	
	
	// �����get��set����
	
	public boolean isMgr() {
		return mgr;
	}

	public void setMgr(boolean mgr) {
		this.mgr = mgr;
	}

	public Dlb getDlb() {
		return dlb;
	}

	public void setDlb(Dlb dlb) {
		this.dlb = dlb;
	}
	
	
	public String execute() throws Exception {
		
		
		ApplicationContext context=new 				
		FileSystemXmlApplicationContext(ServletActionContext.getServletContext().getRealPath("/")+"WEB-INF/classes/applicationContext.xml");

//		DlDao dlDao=(DlDao) context.getBean("dlDao");
//		Dlb user=dlDao.validate(dlb.getXh(), dlb.getKl());//����Dao�еķ���
		
		DlDao dlDao = (DlDao) context.getBean("dlDaoSpt");
		Dlb user = dlDao.validate(dlb.getXh(), dlb.getKl());
		
		if(user!=null){
		//���Ϊ�գ����浽Session��
			Map session=(Map)ActionContext.getContext().getSession();
			Dlb dlbl = null;
			dlbl = (Dlb) session.get("dlb");
			if(dlbl==null)
			{
				dlbl=dlb;
			}
			
			session.put("dlb", dlbl);
			session.put("xh",dlb.getXh());
			XxDao xxDao=(XxDao) context.getBean("xxDao");
			System.out.println(dlb.getXh());
			Xsb xs=xxDao.getXsb(dlb.getXh());
			session.put("xsxx",xs);
			
			if(mgr)
			{
				return "mgr";
			}
			
			return SUCCESS;
		}else{
			return ERROR;
		}
	}

	



	
}
