package com.stackroute.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringJdbcExampleDemo {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        StudentDao studentDao=applicationContext.getBean("sdao",StudentDao.class);
        //inserting values into table
       int status=studentDao.saveStudent(new Student(6,"yaksha","female",23));
       System.out.println(status);
        //updating values
       int status1=studentDao.updateStudent(new Student(4,"yaksha","female",22));
        System.out.println(status1);
        //deleting values using id
       Student student=new Student();
         student.setId(4);
         int status2=studentDao.deleteStudent(student);
         System.out.println(status2);

         //dispalying list of studnets in table
        List<Student> list =  studentDao.getAllStudents();

        for(Student st:list)
        {
            System.out.println(st);

        }


    }
}

