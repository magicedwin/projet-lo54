package fr.utbm.core;

import java.util.List;

import fr.utbm.core.dao.HibernateAreaDao;
import fr.utbm.core.dao.HibernateSensorDao;
import fr.utbm.core.dao.HibernateStationDao;
import fr.utbm.core.dao.HibernateTemperatureDao;
import fr.utbm.core.entity.Area;
import fr.utbm.core.entity.Sensor;
import fr.utbm.core.entity.Station;
import fr.utbm.core.entity.Temperature;
import fr.utbm.core.entity.User;
import fr.utbm.core.tools.HibernateUtil;

import org.hibernate.Session;

/**
 * Hello world!
 */
public class App {

	public static void main(String[] args) {
		// Session session = HibernateUtil.getSessionFactory().openSession();
		// session.beginTransaction();
		// User user = new User();
		// user.setUsername("toto");
		// try {
		// session.persist(user);
		// session.getTransaction().commit();
		// session.close();
		// } catch (Exception e) {
		// if (e instanceof java.sql.SQLException) {
		// java.sql.SQLException ne = ((java.sql.SQLException)
		// e).getNextException();
		// ne.printStackTrace();
		// } else {
		// throw e;
		// }
		// }
		List<Area> areas = HibernateAreaDao.GetArea();

		for (Area ar : areas) {
			List<Station> stations = HibernateStationDao.GetStation(ar);
			System.out.println(ar.getLabel());
			for (Station stat : stations) {
				List<Sensor> sensors = HibernateSensorDao.GetSensor(stat);
				System.out.println(" - " + stat.getLabel());
				for (Sensor sens : sensors) {
					List<Temperature> temperatures = HibernateTemperatureDao
							.GetTemperature(sens);
					System.out.println("    - " + sens.getLabel());
					for (Temperature temp : temperatures) {
						System.out.println("        - " + temp.getValue());
					}
				}
			}
		}
	}
}
