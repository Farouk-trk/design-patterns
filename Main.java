import builder.*;
import memento.*;
import observer.*;
public class Main {

    public static void main(String[] args) {
//this is the memento part

        Versions version = new Versions(); //caretaker that contains the ArrayList with all the files versions in
        File file = new File();

        Student student1 = new Student("Daniel");//creates two students objects that can modify the file object
        Student student2 = new Student("Max");


        file.setText("The memento pattern is a software design pattern. ",student1); //modify the file content by student1
        version.addMemento( file.save() ); //store  the file in a new memento and add it to versions

        file.setText("The memento pattern is a software design pattern. (undo via rollback).",student2);
        version.addMemento( file.save() );

        file.setText("The memento pattern is a software design pattern. (undo via rollback).Source - Wikipedia",student1);
        version.addMemento( file.save() );

        file.history( version.getMementos() ); //displays the history of the file object

//this is the observer part
        System.out.println("-------------------");

        Professor professor= new Professor("Mark");//creates a professor (subject) object
        student1.subscribe(professor);//subscribes students (observers) to the professor (subject)
        student2.subscribe(professor);


        professor.setAnnouncement("I have added a new requirements, check it out!!!");//subject setting new announcement

        student2.unsubscribe(professor); //unsubscribe student 2 from the professor

        professor.setAnnouncement("All teams should be composed of 3 members.");//subject setting new announcement

        student1.getAnnouncments(); //displays announcements from the observer object
        student2.getAnnouncments(); //displays announcements from the observer object



//this is the builder part
        System.out.println("-------------------");
        ProjectBuilder project = new ConcreteProjectBuilder(); // creates a ProjectBuilder of type ConcreteProjectBuilder
        ProjectDirector projectDirector = new ProjectDirector(project); // Pass the ConcreteProjectBuilder specification to the director
        projectDirector.makeProject(); // Tells the director to make the Robot using the specifications of the ConcreteProjectBuilder class

        // The director returns the right project based off of the specifics sent to it
        Project appDesignProject = projectDirector.getProject();
        System.out.println("Project built");
        System.out.println("Title: "+appDesignProject.getProjectName());
        System.out.println("Description: "+appDesignProject.getProjectDescription());
        System.out.println("Number of students per team: " +appDesignProject.getStudentsPerTeam());
        System.out.println("Remarks: " +appDesignProject.getProjectRemarks());
        System.out.println("deadline for submission: " +appDesignProject.getProjectDeadline());


    }


}