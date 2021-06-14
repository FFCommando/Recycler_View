package com.example.recyclerview.model;

import com.example.recyclerview.MainActivity;

public class Student extends MainActivity {
    String Name,RollNo;

    public Student() {
    }

    public Student(String name, String rollNo) {
        Name = name;
        RollNo = rollNo;
    }
    public String getName()
    {
        return Name;
    }
    public String getRollNo()
    {
        return RollNo;
    }

    public void setName(String name)
    {
        Name=name;
    }
}
