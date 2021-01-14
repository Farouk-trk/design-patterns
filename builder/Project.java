// The concrete project class based on the ProjectOutline interface
package builder;

import java.util.Date;

public class Project implements ProjectOutline{

    private String projectName;
    private String projectDescription;
    private Date projectDeadline;
    private String projectRemarks;
    private int studentsPerTeam;

    @Override
    public void setProjectName(String name) {
        projectName=name;
    }
    public String getProjectName(){return projectName;}

    @Override
    public void setProjectDescription(String description) {
        projectDescription=description;
    }
    public String getProjectDescription(){return projectDescription;}

    @Override
    public void setProjectDeadline(Date deadline) {
        projectDeadline = deadline;
    }
    public Date getProjectDeadline(){return projectDeadline ;}

    @Override
    public void setProjectRemarks(String remarks) {
        projectRemarks = remarks;
    }
    public String getProjectRemarks(){return projectRemarks;}

    @Override
    public void setStudentsPerTeam(int num) {
        studentsPerTeam = num ;
    }
    public int getStudentsPerTeam(){return studentsPerTeam;}
}
