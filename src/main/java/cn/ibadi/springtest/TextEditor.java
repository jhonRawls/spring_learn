package cn.ibadi.springtest;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jhon on 7/31/2016.
 */
public class TextEditor {

    public  TextEditor(){
        System.out.println("Inside TextEditor constructor");
    }

    @Autowired
    private SpellChecker spellChecker;

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}
