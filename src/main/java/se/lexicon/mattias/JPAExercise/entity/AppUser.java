package se.lexicon.mattias.JPAExercise.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

/** @Entity = Tells JPA to map this class to a table in DB **/
@Entity
public class AppUser {

/** @Id = Indicates that var id, should be a primary key in DB
    @GeneratedValue = Is telling DB to generate ID number      **/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String userName;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private boolean active;
    private String password;

    //Empty constructor Needed for JPA
    public AppUser() {
    }

    public AppUser(String userName, String firstName, String lastName, LocalDate birthDate, boolean active, String password) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.active = active;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return id == appUser.id &&
                active == appUser.active &&
                Objects.equals(userName, appUser.userName) &&
                Objects.equals(firstName, appUser.firstName) &&
                Objects.equals(lastName, appUser.lastName) &&
                Objects.equals(birthDate, appUser.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, firstName, lastName, birthDate, active);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", active=" + active +
                '}';
    }
}
