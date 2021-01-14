// The concrete project class based on the ProjectOutline interface
package builder;

import java.util.Date;

// The concrete Project class based on the ProjectOutline interface
public class Project implements ProjectOutline{

    private String projectName;
    private String projectDescription;
    private Date projectDeadline;
    private String projectRemarks;
    private int studentsPerTeam;

    public void setProjectName(String name) {
        projectName=name;
    }
    public String getProjectName(){return projectName;}

    public void setProjectDescription(String description) {
        projectDescription=description;
    }
    public String getProjectDescription(){return projectDescription;}

    public void setProjectDeadline(Date deadline) {
        projectDeadline = deadline;
    }
    public Date getProjectDeadline(){return projectDeadline ;}

    public void setProjectRemarks(String remarks) {
        projectRemarks = remarks;
    }
    public String getProjectRemarks(){return projectRemarks;}

    public void setStudentsPerTeam(int num) {
        studentsPerTeam = num ;
    }
    public int getStudentsPerTeam(){return studentsPerTeam;}
}
