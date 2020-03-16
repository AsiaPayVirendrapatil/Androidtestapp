package com.asiapay.percentagecalulate;

public class Student {

    String StudentName;
    String StudentRollNo;
    String Physics;
    String Chemistry;
    String Maths;
    String English, Hindi;
    float percentage;

    public String getMaths() {
        return Maths;
    }

    public void setMaths(String maths) {
        Maths = maths;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentRollNo() {
        return StudentRollNo;
    }

    public void setStudentRollNo(String studentRollNo) {
        StudentRollNo = studentRollNo;
    }

    public String getPhysics() {
        return Physics;
    }

    public void setPhysics(String physics) {
        Physics = physics;
    }

    public String getChemistry() {
        return Chemistry;
    }

    public void setChemistry(String chemistry) {
        Chemistry = chemistry;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String english) {
        English = english;
    }

    public String getHindi() {
        return Hindi;
    }

    public void setHindi(String hindi) {
        Hindi = hindi;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
}
