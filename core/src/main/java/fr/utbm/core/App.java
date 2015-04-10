package fr.utbm.core;

import fr.utbm.core.entity.User;
import fr.utbm.core.tools.HibernateUtil;
import org.hibernate.Session;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user = new User();
        user.setUsername("toto");
        try {
            session.persist(user);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            if (e instanceof java.sql.SQLException) {
                java.sql.SQLException ne = ((java.sql.SQLException) e).getNextException();
                ne.printStackTrace();
            } else {
                throw e;
            }
        }
    }
}
