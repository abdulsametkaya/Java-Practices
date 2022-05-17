package _15_Exceptions.Q04;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    private String username, password;
    private boolean active, signedIn;
    static List<User> userList = new ArrayList<>();

    public User(int id, String username, String password, boolean active, boolean signedIn) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.active = active;
        this.signedIn = signedIn;
    }
    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
