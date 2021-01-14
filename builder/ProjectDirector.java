package builder;

public class ProjectDirector {
    private ProjectBuilder projectBuilder;

    public ProjectDirector(ProjectBuilder projectBuilder){
        this.projectBuilder = projectBuilder;
    }
    public Project getProject(){
        return this.projectBuilder.getProject();
    }
    public void makeProject(){
        this.projectBuilder.buildProjectName();
        this.projectBuilder.buildProjectDescription();
        this.projectBuilder.buildProjectDeadline();
        this.projectBuilder.buildStudentsPerTeam();
        this.projectBuilder.buildProjectRemarks();
    }
}
