package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import util.HibernateUtil;

public class UserTest {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private Session session;

    @Before
    public void setUp() throws Exception {
        this.session = this.sessionFactory.openSession();
        this.session.beginTransaction();
    }

    @After
    public void tearDown() throws Exception {
        this.session.getTransaction().commit();
        this.session.close();
    }

    @Test
    public void testSave1() {

    }

}
