package com.mohanadalkrunz99.myapplication;

public class Student {

    String std_id;
    String std_name;
    String std_level;
    String std_avg;
    String std_dept;


    public Student(String std_id, String std_name, String std_level, String std_avg, String std_dept) {
        this.std_id = std_id;
        this.std_name = std_name;
        this.std_level = std_level;
        this.std_avg = std_avg;
        this.std_dept = std_dept;

    }


    public String getStd_id() {
        return std_id;
    }

    public void setStd_id(String std_id) {
        this.std_id = std_id;
    }

    public String getStd_name() {
        return std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public String getStd_level() {
        return std_level;
    }

    public void setStd_level(String std_level) {
        this.std_level = std_level;
    }

    public String getStd_avg() {
        return std_avg;
    }

    public void setStd_avg(String std_avg) {
        this.std_avg = std_avg;
    }

    public String getStd_dept(){
        return std_dept;
    }

    public void setStd_dept(String std_dept) {
        this.std_dept = std_dept;
    }

}