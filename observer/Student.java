package observer;

import java.util.ArrayList;

public class Student implements Observer {

    private ArrayList<String> announcments;
    private String name;

    // holds reference to the professor object
    private Subject professor;

    public Student(String name){
        this.name = name;
        announcments=new ArrayList<String>();
        // Store the reference to the professor object so we can make calls to its methods

        // Message notifies user of new observer
        System.out.println("New student has been created " );
        // Add the observer to the Subjects ArrayList

    }
    public void subscribe(Subject professor){
        this.professor = professor;
        professor.register(this);
        System.out.println("Student "+name+" Subscribed to Professor "+professor.getName());
    }
    public String getName(){return this.name; }

    public void getAnnouncments(){
        System.out.println(name +" announcments:");
        for(String announcment : announcments){
            System.out.println(announcment);
        }
    }

    public void update(String announcment) {
        System.out.println("New announcment from Professor "+professor.getName()+" : "+announcment);
        announcments.add(announcment);
    }
}
