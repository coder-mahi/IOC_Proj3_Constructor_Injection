package com.beans;

import java.beans.ConstructorProperties;

public class Faculty {
    private int id;
    private String name,subject;
    @ConstructorProperties({"no","fname","sub"}) //optional in spring 4.x
    public Faculty(int no, String fname, String sub){
        System.out.println("Faculty : 3-param constructor");
        this.id = no;
        this.name = fname;
        this.subject = sub;
    }

    @Override
    public String toString(){
        return "Faculty [id:"+id+", name:"+name+", subject:"+subject+"];";
    }
}
