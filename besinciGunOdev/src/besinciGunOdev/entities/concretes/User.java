package besinciGunOdev.entities.concretes;

import besinciGunOdev.entities.abstracts.Entity;

public class User implements Entity {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean authType;

    public User(int id, String firstName, String lastName, String email, String password,boolean authType) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPassword(password);
        this.setAuthType(authType);
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public boolean isAuthType() {
        return authType;
    }

    public void setAuthType(boolean authType) {
        this.authType = authType;
    }
}
