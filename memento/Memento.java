package memento;

import java.util.Date;

class Memento {
    private String text="";
    private Date modifiedOn = new Date();
    private observer.Student  modifiedBy ;

    public Memento(File file) {

        this.text = file.getText();
        this.modifiedBy = file.getModifiedBy();
        this.modifiedOn = file.getModifiedOn();
    }

    public String getText() {
        return text;
    }
    public Date getModifiedOn(){
        return modifiedOn;
    }
    public observer.Student getModifiedBy(){
        return modifiedBy;
    }
}
