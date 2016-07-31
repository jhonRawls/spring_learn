package cn.ibadi.springtest;

/**
 * Created by jhon on 7/31/2016.
 */
public class TextEditor {
    private SpellChecker spellChecker;
    public  TextEditor(SpellChecker spellChecker){
        this.spellChecker=spellChecker;
    }

    public  void spellCheck(){
        spellChecker.checkSpelling();
    }

}
