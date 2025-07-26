package com.example.apiprac.Model;

import java.util.ArrayList;
import java.util.List;

public class Assignment {
    String name;
    int id;
    public Assignment(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

}

