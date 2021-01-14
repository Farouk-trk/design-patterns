package builder;

import java.util.Calendar;
import java.util.GregorianCalendar;

// The concrete builder class that assembles the parts of the finished Project object
public class ConcreteProjectBuilder implements ProjectBuilder{
    private Project project;

    public ConcreteProjectBuilder(){
        this.project = new Project();
    }


    public void buildProjectName() {
        project.setProjectName("Application Design Project");
    }

    public void buildProjectDescription() {
        project.setProjectDescription("The goal of the project is to design an application as a software-architecture and usability demonstration prototype.");
    }

    public void buildProjectDeadline() {
        project.setProjectDeadline(new GregorianCalendar(2021, Calendar.JANUARY, 19).getTime());
    }

    public void buildProjectRemarks() {
        project.setProjectRemarks("Implement the design patterns in your favorite object oriented programming language");
    }

    public void buildStudentsPerTeam() {
        project.setStudentsPerTeam(2);

    }

    public Project getProject() {
        return this.project;
    }
}
