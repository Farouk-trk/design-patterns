package observer;

import java.util.ArrayList;

public class Student implements Observer {

    private ArrayList<String> announcments;
    private  String name;

    // holds reference to the professor object
    private Subject professor;

    public Student(String name){
        this.name = name;
        announcments=new ArrayList<String>(); //store all the announcements updated by the subject

        // Message notifies user of new observer
        System.out.println("New student has been created " );
    }
    public String getName(){return this.name; }

    // subscribes the student object to a subject
    public void subscribe(Subject professor){
        this.professor = professor;
        professor.register(this);
        System.out.println("Student "+name+" Subscribed to Professor "+professor.getName());
    }

    // unsubscribes the student object from a  subject
    public void unsubscribe(Subject professor){
        this.professor = professor;
        professor.unregister(this);
        System.out.println("Student "+name+" unsubscribed from Professor "+professor.getName());
    }


    public void getAnnouncments(){
        System.out.println(name +" announcments:");
        for(String announcment : announcments){
            System.out.println(announcment);
        }
    }

    // Called to notify an observer of a new announcement
    public void update(String announcment) {
        System.out.println("New announcement from Professor "+professor.getName()+" : "+announcment);
        announcments.add(announcment);
    }
}
