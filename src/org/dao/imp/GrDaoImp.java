package org.dao.imp;
import java.util.Set;

import org.dao.GrDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.model.Dlb;
import org.model.Kcb;
import org.model.Xsb;


public class GrDaoImp implements GrDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Set getKcb(String xh) {
		try{
			Session session=sessionFactory.openSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Xsb where xh=?");
			query.setParameter(0, xh);
			query.setMaxResults(1);
			Xsb xsb=(Xsb) query.uniqueResult();
			if(xsb!=null){
				return xsb.getKcbs();
			}else{
				return null;
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	
	}

	


}
