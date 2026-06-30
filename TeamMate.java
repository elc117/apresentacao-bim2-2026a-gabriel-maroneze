public class TeamMate {
    String userId;
    String name;
    boolean online;

    public TeamMate() {
        this.userId = "user";
        this.name = "fulano";
        this.online = false;
    }

    public TeamMate(String userId, String name, boolean online) {
        this.userId = userId;
        this.name = name;
        this.online = online;
    }

    public TeamMate(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.online = false;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getOnline() {
        return this.online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}