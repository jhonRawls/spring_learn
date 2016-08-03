package cn.ibadi.springtest;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jhon on 7/31/2016.
 */
public class TextEditor {

    @Autowired
    public  TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor");
        this.spellChecker=spellChecker;
    }

    private SpellChecker spellChecker;

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}
