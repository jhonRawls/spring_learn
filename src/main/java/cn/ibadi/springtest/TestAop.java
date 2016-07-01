package cn.ibadi.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
	@SuppressWarnings("resource")
	public static void main(String [] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Student student=(Student)context.getBean("student");
		student.getName();
		student.getAge();
		student.printThrowException();
	}
}
