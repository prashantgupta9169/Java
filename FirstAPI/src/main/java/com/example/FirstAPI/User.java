package com.example.FirstAPI;



public class User {

    private int roll;
    private String Name;
    private String branch;

    public User(int roll, String name, String branch) {
        this.roll = roll;
        this.Name = name;
        this.branch = branch;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
