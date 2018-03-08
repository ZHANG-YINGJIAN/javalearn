package service;


import model.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import util.HibernateUtil;

import java.util.List;


public class StudentTest {

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();//获取session工厂

    @Test
    public void add() {
        Session session = sessionFactory.openSession();//生成一个session
        session.beginTransaction();//开启事务

        Student s = new Student();
        s.setName("张三");
        session.save(s);

        session.getTransaction().commit();//提交事务
        session.close();//关闭事务
    }

    private void delete() {
        Session session = sessionFactory.openSession();//生成一个session
        session.beginTransaction();//开启事务

        Student student = (Student)session.get(Student.class, Long.valueOf(1));
        session.delete(student);

        session.getTransaction().commit();//提交事务
        session.close();//关闭事务
    }

    private void update() {
        Session session = sessionFactory.openSession();//生成一个session
        session.beginTransaction();//开启事务

        Student student = (Student)session.get(Student.class, Long.valueOf(2));
        student.setName("张三2");
        session.save(student);

        session.getTransaction().commit();//提交事务
        session.close();//关闭事务
    }

    private void getAllStudent() {
        Session session = sessionFactory.openSession();//生成一个session
        session.beginTransaction();//开启事务

        String hql = "from Student";
        Query query = session.createQuery(hql);
        List<Student> studentList = query.list();
        for (Student student:studentList) {
            System.out.println(student);
        }

        session.getTransaction().commit();//提交事务
        session.close();//关闭事务
    }


    public static void main(String[] args) {
        StudentTest studentTest = new StudentTest();
        //studentTest.add();
//        studentTest.delete();
//        studentTest.update();
        studentTest.getAllStudent();
    }
}
