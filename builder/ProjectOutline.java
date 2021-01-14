// This is the interface that will be returned from the builder
package builder;

import java.util.Date;

// This is the interface that will be returned from the builder
public interface ProjectOutline {

    public void setProjectName(String name);
    public void setProjectDescription(String description);
    public void setProjectDeadline(Date deadline);
    public void setProjectRemarks(String remarks);
    public void setStudentsPerTeam(int num);
}
