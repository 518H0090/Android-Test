package com.example.customadapter;

public class Employee {
    private String Name;
    private int Age;
    private int Img;

    public Employee(String name, int age, int img) {
        Name = name;
        Age = age;
        Img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }
}
