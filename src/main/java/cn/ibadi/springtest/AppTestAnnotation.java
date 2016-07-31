package cn.ibadi.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jhon on 7/31/2016.
 */
public class AppTestAnnotation {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        Student student=(Student)context.getBean("student");
        System.out.println(student.getName()+" "+student.getAge());
    }
}
