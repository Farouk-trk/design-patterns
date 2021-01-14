package memento;

import java.util.Date;

class Memento {

    //the File  stored in memento object

    private String fileContent="";
    private Date modifiedOn = new Date();
    private observer.Student  modifiedBy ;

    public String getText() { return fileContent; }
    public Date getModifiedOn(){
        return modifiedOn;
    }
    public observer.Student getModifiedBy(){
        return modifiedBy;
    }

    // Save a new file String to the memento Object
    public Memento(File file) {
        this.fileContent = file.getText();
        this.modifiedBy = file.getModifiedBy();
    }


}
