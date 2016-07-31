package cn.ibadi.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
    }


}
