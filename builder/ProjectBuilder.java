package builder;

public interface ProjectBuilder {
    public void buildProjectName();
    public void buildProjectDescription();
    public void buildProjectDeadline();
    public void buildProjectRemarks();
    public void buildStudentsPerTeam();
    public Project getProject();

}
