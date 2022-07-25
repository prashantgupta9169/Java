package com.example.FirstAPI;

import java.util.HashMap;

public class DataStore {
    HashMap<Integer, String > db=new HashMap<Integer, String>();

    public DataStore(){
        db.put(32,"Priya Sarkar");
        db.put(56,"Yashpal Singh");
        db.put(62,"Prashant Gupta");
        db.put(132,"Rajani Kumari");
    }

    public String getName(Integer id){
        return db.get(id);
    }

}
