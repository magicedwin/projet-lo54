package fr.utbm.core.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import fr.utbm.core.entity.Area;
import fr.utbm.core.tools.HibernateUtil;

public class HibernateAreaDao {

	public static List<Area> GetArea() {
		List<Area> areas = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try {
			Query query = session.createQuery("from Area");
			areas = (List<Area>) query.list();
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			if (e instanceof java.sql.SQLException) {
				java.sql.SQLException ne = ((java.sql.SQLException) e)
						.getNextException();
				ne.printStackTrace();
			} else {
				try {
					throw e;
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return areas;
	}
}
