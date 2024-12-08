package com.whyjoin.user;

import java.util.Objects;

import com.whyjoin.branch.Branch;

import jakarta.persistence.Entity;

/**
 * User object created representing the user of the class and the need data to
 * improve their experience.
 */
@Entity
public class User {
    String id;
    String firstName;
    String lastName;
    Branch branch;
    int age;

    public User() {
    }

    public User(String id, String firstName, String lastName, Branch branch, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.branch = branch;
        this.age = age;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Branch getBranch() {
        return this.branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User id(String id) {
        setId(id);
        return this;
    }

    public User firstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    public User lastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    public User branch(Branch branch) {
        setBranch(branch);
        return this;
    }

    public User age(int age) {
        setAge(age);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(firstName, user.firstName)
                && Objects.equals(lastName, user.lastName) && Objects.equals(branch, user.branch) && age == user.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, branch, age);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", firstName='" + getFirstName() + "'" +
                ", lastName='" + getLastName() + "'" +
                ", branch='" + getBranch() + "'" +
                ", age='" + getAge() + "'" +
                "}";
    }
}
