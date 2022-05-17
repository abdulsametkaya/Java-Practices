package haftanin_Sorusu;

import java.time.LocalDateTime;

public class User {

    private String name;
    private LocalDateTime registerDate;

    public User(String name, LocalDateTime registerDate) {
        this.name = name;
        this.registerDate = registerDate;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }
}
