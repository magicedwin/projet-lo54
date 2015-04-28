package fr.utbm.core.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import fr.utbm.core.entity.Sensor;
import fr.utbm.core.entity.Temperature;
import fr.utbm.core.tools.HibernateUtil;

public class HibernateTemperatureDao {
	
	public static List<Temperature> GetTemperature(Sensor sensor) {
		List<Temperature> temperatures = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try {
			Query query = session.createQuery("from Temperature where sensor = ?");
			query.setParameter(0, sensor);
			temperatures = query.list();
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
		return temperatures;
	}
}
