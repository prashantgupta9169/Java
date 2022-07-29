package com.example.FirstAPI;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    List<User> userTable =new ArrayList<>();

    public DataStore(){
        userTable.add(new User(32,"Priya Sarkar","Civil"));
        userTable.add(new User(56,"Yashpal Singh","ECE"));
        userTable.add(new User(62,"Prashant Gupta","ECE"));
        userTable.add(new User(132,"Rajani Kumari","ECE"));
    }

    public List<User> getAll(){
        return userTable;
    }

    public User getAUser(int id){
        for(User user:userTable){
            if(user.getRoll()==id){
                return user;
            }
        }
        return null;
    }


}
