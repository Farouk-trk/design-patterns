package memento;

import observer.Student;

import java.util.ArrayList;
import java.util.Date;

public class File {
    private String text="";
    private Date modifiedOn = new Date();
    private Student  modifiedBy ;

    public String getText(){
        return this.text;
    }
    public Date getModifiedOn(){
        return this.modifiedOn;
    }
    public Student getModifiedBy(){
        return this.modifiedBy;
    }

    public void setText(String text, observer.Student student) {
        System.out.println("Originator: Setting text to: " + text+"");
        this.text = text;
        modifiedOn = new Date();
        modifiedBy=student;

    }

    public Memento save() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(this);
    }
    public void history(ArrayList<Memento> m) {
        System.out.println("displaying all File's versions:");
        for(int i = 0; i < m.size(); i++)
        {
            System.out.println("file content: " + m.get(i).getText() +"modified by " + m.get(i).getModifiedBy().getName() + " on "+ m.get(i).getModifiedOn()+"\n");
        }
    }
}
