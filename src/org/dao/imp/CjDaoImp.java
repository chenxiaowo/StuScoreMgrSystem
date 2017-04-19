package org.dao.imp;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.dao.CjDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.model.Cjb;
import org.model.CjbId;
import org.model.Dlb;
import org.model.Kcb;
import org.model.Xsb;

public class CjDaoImp implements CjDao{

	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addCj(String xh, String kch, int cj) {
		try {
			Session session=sessionFactory.openSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Kcb where kch=?");
			query.setParameter(0, kch);
			query.setMaxResults(1);
			Kcb kc = (Kcb) query.uniqueResult();
			
			CjbId cid = new CjbId();
			cid.setXh(xh);
			cid.setKch(kch);
			Cjb cjb = new Cjb();
			cjb.setId(cid);
			cjb.setXf(kc.getXf());
			cjb.setCj(cj);
			
			session.merge(cjb);
			ts.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void xgAllCj(List<Cjb> cjbs) {
		// TODO Auto-generated method stub
		
	}

	public void xgOneCj(String xh, String kch, int cj) {
		try {
			Session session=sessionFactory.openSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Kcb where kch=?");
			query.setParameter(0, kch);
			query.setMaxResults(1);
			Kcb kc = (Kcb) query.uniqueResult();
			
			CjbId cid = new CjbId();
			cid.setXh(xh);
			cid.setKch(kch);
			Cjb cjb = new Cjb();
			cjb.setId(cid);
			cjb.setXf(kc.getXf());
			cjb.setCj(cj);
			
			session.merge(cjb);
			ts.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Cjb> getCjs() {
		
		List cjs = null;
		try {
			Session session=sessionFactory.openSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Cjb");
			cjs = query.list();
			System.out.println("成绩表的长度是："+cjs.size());
			ts.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cjs;
	}
	
	
	public Xsb getOneXs(String xh)
	{
		Xsb xsb = null;
		try {
			Session session = sessionFactory.openSession();
			
			Transaction ts = session.beginTransaction();
			Query query = session.createQuery("from Xsb where xh=?");
			query.setParameter(0, xh);
			query.setMaxResults(1);
			xsb = (Xsb) query.uniqueResult();
			ts.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return xsb;
		
	}
	
	public Kcb getOneKc(String kch)
	{
		
		Kcb kcb = null;
		try {
			Session session = sessionFactory.openSession();
			
			Transaction ts = session.beginTransaction();
			Query query = session.createQuery("from Kcb where kch=?");
			query.setParameter(0, kch);
			query.setMaxResults(1);
			kcb = (Kcb) query.uniqueResult();
			ts.commit();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return kcb;
		
	}

	public void delOneCj(String xh, String kch) {
		
		try{
			Session session=sessionFactory.openSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Cjb where xh=? and kch=?");
			query.setParameter(0, xh);
			query.setParameter(1, kch);
			query.setMaxResults(1);
			Cjb cjb = (Cjb) query.uniqueResult();
			
			session.delete(cjb);
			
			ts.commit();
			session.close();
		
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public List<Cjb> getGrCjs(String xh) {

		List cjs = null;
		try {
			Session session=sessionFactory.openSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Cjb where xh=?");
			query.setParameter(0, xh);
			cjs = query.list();
			
			ts.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cjs;
		
	}

	public String getOneKcM(String kch) {
		Kcb kcb = null;
		try {
			Session session = sessionFactory.openSession();
			
			Transaction ts = session.beginTransaction();
			Query query = session.createQuery("from Kcb where kch=?");
			query.setParameter(0, kch);
			query.setMaxResults(1);
			kcb = (Kcb) query.uniqueResult();
			ts.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return kcb.getKcm();
	}

	public String getOneXsM(String xh) {
		Xsb xsb = null;
		try {
			Session session = sessionFactory.openSession();
			
			Transaction ts = session.beginTransaction();
			Query query = session.createQuery("from Xsb where xh=?");
			query.setParameter(0, xh);
			query.setMaxResults(1);
			xsb = (Xsb) query.uniqueResult();
			ts.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return xsb.getXm();
	}

	
}
