package builder;

// The director class creates a project using the builder interface that is defined
public class ProjectDirector {
    private ProjectBuilder projectBuilder; //maintain a reference of the project builder to use it to build a project

    public ProjectDirector(ProjectBuilder projectBuilder){
        this.projectBuilder = projectBuilder;
    }

    //returns the final project
    public Project getProject(){
        return this.projectBuilder.getProject();
    }

    //builds the project
    public void makeProject(){
        this.projectBuilder.buildProjectName();
        this.projectBuilder.buildProjectDescription();
        this.projectBuilder.buildProjectDeadline();
        this.projectBuilder.buildStudentsPerTeam();
        this.projectBuilder.buildProjectRemarks();
    }
}
