import builder.*;
import memento.*;
import memento.Student;
import observer.*;
public class Main {

    public static void main(String[] args) {

//this is the observer part

        Professor professor= new Professor("Mark");
        observer.Student studentO = new observer.Student("Daniel",professor);
        observer.Student student1 = new observer.Student("Max",professor);
        professor.setAnnouncement("I have added a new requirments, check it out!!!");
        professor.setAnnouncement("All teams should be composed of 3 members.");
        studentO.getAnnouncments();

//this is the memento part
        System.out.println("-------------------");
        Versions version = new Versions();
        File file = new File();
        //Student student = new Student("Farouk");
        //Student student2 = new Student("Luis");


        file.setText("The memento pattern is a software design pattern. ",studentO);
        version.addMemento( file.save() );

        file.setText("The memento pattern is a software design pattern. (undo via rollback).",student1);
        version.addMemento( file.save() );

        file.setText("The memento pattern is a software design pattern. (undo via rollback).Source - Wikipedia",studentO);
        version.addMemento( file.save() );

        file.history( version.getMementos() );

//this is the builder part
        System.out.println("-------------------");
        ProjectBuilder project = new ConcreteProjectBuilder();
        ProjectDirector projectDirector = new ProjectDirector(project);
        projectDirector.makeProject();

        Project appDesignProject = projectDirector.getProject();
        System.out.println("Project built");
        System.out.println("Title: "+appDesignProject.getProjectName());
        System.out.println("Description: "+appDesignProject.getProjectDescription());
        System.out.println("Number of students per team: " +appDesignProject.getStudentsPerTeam());
        System.out.println("Remarks: " +appDesignProject.getProjectRemarks());
        System.out.println("deadline for submission: " +appDesignProject.getProjectDeadline());


    }


}