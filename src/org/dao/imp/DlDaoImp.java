package org.dao.imp;

import javax.annotation.Resource;

import org.dao.DlDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.model.Dlb;
import org.springframework.beans.factory.annotation.Autowired;

public class DlDaoImp implements DlDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Dlb validate(String xh, String kl) {
		try {
			Session session = sessionFactory.openSession();
			
			Transaction ts = session.beginTransaction();
			Query query = session.createQuery("from Dlb where xh=? and kl=?");
			query.setParameter(0, xh);
			query.setParameter(1, kl);
			query.setMaxResults(1);
			Dlb dlb = (Dlb) query.uniqueResult();
			if (dlb != null) {
				return dlb;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
