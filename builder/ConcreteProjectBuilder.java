// The concrete builder class that assembles the parts of the finished Project object
package builder;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ConcreteProjectBuilder implements ProjectBuilder{
    private Project project;

    public ConcreteProjectBuilder(){
        this.project = new Project();
    }

    @Override
    public void buildProjectName() {
        project.setProjectName("Application Design Project");
    }

    @Override
    public void buildProjectDescription() {
        project.setProjectDescription("The goal of the project is to design an application as a software-architecture and usability demonstration prototype.");
    }

    @Override
    public void buildProjectDeadline() {
        project.setProjectDeadline(new GregorianCalendar(2021, Calendar.JANUARY, 19).getTime());
    }

    @Override
    public void buildProjectRemarks() {
        project.setProjectRemarks("Implement the design patterns in your favorite object oriented programming language");
    }

    @Override
    public void buildStudentsPerTeam() {
        project.setStudentsPerTeam(2);

    }

    @Override
    public Project getProject() {
        return this.project;
    }
}
