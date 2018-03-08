package service;


import model.Teacher;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

import java.util.List;


public class TeacherTest {

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();//获取session工厂

    private void add() {
        Session session = sessionFactory.openSession();//生成一个session
        session.beginTransaction();//开启事务

        Teacher s = new Teacher();
        s.setName("张三");
        session.save(s);

        session.getTransaction().commit();//提交事务
        session.close();//关闭事务
    }

    private void delete() {
        Session session = sessionFactory.openSession();//生成一个session
        session.beginTransaction();//开启事务

        Teacher Teacher = (Teacher)session.get(Teacher.class, Long.valueOf(1));
        session.delete(Teacher);

        session.getTransaction().commit();//提交事务
        session.close();//关闭事务
    }

    private void update() {
        Session session = sessionFactory.openSession();//生成一个session
        session.beginTransaction();//开启事务

        Teacher Teacher = (Teacher)session.get(Teacher.class, Long.valueOf(2));
        Teacher.setName("张三2");
        session.save(Teacher);

        session.getTransaction().commit();//提交事务
        session.close();//关闭事务
    }

    private void getAllTeacher() {
        Session session = sessionFactory.openSession();//生成一个session
        session.beginTransaction();//开启事务

        String hql = "from Teacher";
        Query query = session.createQuery(hql);
        List<Teacher> TeacherList = query.list();
        for (Teacher Teacher:TeacherList) {
            System.out.println(Teacher);
        }

        session.getTransaction().commit();//提交事务
        session.close();//关闭事务
    }


    public static void main(String[] args) {
        TeacherTest TeacherTest = new TeacherTest();
        //TeacherTest.add();
//        TeacherTest.delete();
//        TeacherTest.update();
        TeacherTest.getAllTeacher();
    }
}
