package observer;

import java.util.ArrayList;

public class Student implements Observer {

    private ArrayList<String> announcments;
    private String name;

    // holds reference to the professor object
    private Subject professor;

    public Student(String name,Subject professor){
        this.name = name;
        announcments=new ArrayList<String>();
        // Store the reference to the professor object so we can make calls to its methods
        this.professor = professor;
        // Message notifies user of new observer
        System.out.println("New student Observer has been created " );
        // Add the observer to the Subjects ArrayList
        professor.register(this);
    }
    public String getName(){return this.name; }
    public void getAnnouncments(){
        for(String announcment : announcments){
            System.out.println(announcment);
        }
    }

    public void update(String announcment) {
        System.out.println("New announcment from Professor "+professor.getName()+" : "+announcment);
        announcments.add(announcment);
    }
}
