package org.dao.imp;
import java.util.Set;

import org.dao.XgDao;
import org.dao.XxDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.model.Kcb;
import org.model.Xsb;
public class XgDaoImp implements XgDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void xgXs(Xsb xs) {
		
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		session.merge(xs);
		ts.commit();
		session.close();
	}
}
