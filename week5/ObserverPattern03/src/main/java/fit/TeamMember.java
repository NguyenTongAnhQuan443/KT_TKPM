// Nguyễn Quân
package fit;

public class TeamMember implements Observer {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskInfo, String status) {
        System.out.println("Member " + name + " notified: Task '" + taskInfo + "' updated to status: " + status);
    }
}