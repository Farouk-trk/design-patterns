package builder;

// Defines the methods needed for creating parts for the project
public interface ProjectBuilder {
    public void buildProjectName();
    public void buildProjectDescription();
    public void buildProjectDeadline();
    public void buildProjectRemarks();
    public void buildStudentsPerTeam();
    public Project getProject();

}
