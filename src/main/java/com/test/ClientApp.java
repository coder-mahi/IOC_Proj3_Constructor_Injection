package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Faculty;
import com.beans.Student;
import com.beans.Marks;

public class ClientApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Faculty f = context.getBean("fac",Faculty.class);
        Student s = context.getBean("stud",Student.class);
        Marks m = context.getBean("mk",Marks.class);

        System.out.println("Calling methods using bean object :> ");
        System.out.println(s.toString());
        System.out.println(f.toString());
        System.out.println(m.toString());

    }
}
