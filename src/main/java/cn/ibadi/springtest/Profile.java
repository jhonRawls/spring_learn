package cn.ibadi.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by jhon on 8/3/2016.
 */
public class Profile {
    @Autowired
    @Qualifier("student")
    private  Student student;

    public Profile(){
        System.out.println("inside profile constructor");
    }

    public  void printAge(){
        System.out.println("Age"+student.getAge());
    }

    public  void printName(){
        System.out.println("Name"+student.getName());
    }
}
