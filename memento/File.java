package memento;

import observer.Student;
import java.util.ArrayList;


public class File {
    private String fileContent="";
    private Student  modifiedBy ;

    public String getText(){
        return this.fileContent;
    }
    public Student getModifiedBy(){
        return this.modifiedBy;
    }

    //set the new file content and the student who modified
    public void setText(String text, observer.Student student) {
        System.out.println("Originator: Setting text to: " + text+"");
        this.fileContent = text;
        modifiedBy=student;

    }
    // Creates a new Memento with a new file
    public Memento save() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(this);
    }

    //display the history of the file object
    public void history(ArrayList<Memento> m) {
        System.out.println("displaying all File's versions:");
        for(int i = 0; i < m.size(); i++)
        {
            System.out.println("file content: " + m.get(i).getText() +" ...Modified by " + m.get(i).getModifiedBy().getName() + " on "+ m.get(i).getModifiedOn());
        }
    }

    //restores a previous version of the file
    public void restore(Memento m) {
        fileContent = m.getText();
        System.out.println("Text after restoring from Memento: " + fileContent + "\n");
    }
}
