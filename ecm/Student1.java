package com.tks.ecm;

public class Student1 {

    private String name;
    private int marks;

    
    Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

  
    String getName() {
        return name;
    }
    int getMarks() {
        return marks;
    }

   
    String getGrade() {

        if(marks >= 75)
            return "A";
        else if(marks >= 60)
            return "B";
        else if(marks >= 40)
            return "C";
        else
            return "Fail";
    }

}
