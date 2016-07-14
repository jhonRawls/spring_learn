package cn.ibadi.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String [] args){
//		@SuppressWarnings("resource")
		//ApplicationContext`
//		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
//		HelloWorld obj=(HelloWorld)context.getBean("helloWorld");
		
//		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//		HelloWorld obj=(HelloWorld)factory.getBean("helloWorld");
		
//		ApplicationContext context=new FileSystemXmlApplicationContext("E:/JavaCode/spring_learn/src/main/java/Beans.xml");
//		HelloWorld obj=(HelloWorld)context.getBean("helloWorld");
//		obj.getMessage();
//		context.registerShutdownHook();
//		
//		Parent parent=(Parent)context.getBean("parentBean");
//		
//		parent.getMessage1();
//		parent.getMessage2();
//		
//		Child child=(Child)context.getBean("childBean");
//		child.getMessage1();
//		child.getMessage2();
//		child.getMessage3();

		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		
	}
	
	
}
