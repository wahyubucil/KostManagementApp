package dev.primakara.model;

public class User {
    private String username;
    private String email;
    private String password;
    private String displayName;
    private String type;

    public User() {}

    public User(String username, String email, String password, String displayName, String type) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.displayName = displayName;
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
