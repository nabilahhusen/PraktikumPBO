
package com.Nabilahusen.PBO.pertemuan3;

public class animal {
    //Attribute
    private String name;
    private int age;
    private String color;
    
    // COnstructor
    public animal(){}
    
    // Alt + Fn + Insert --> Constructor ---> Select all
    
   public animal(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    

    // this menunjuk atribute , name menunjuk parameter
//    public Animal(String name, int age, String color) {
//        this.name = name;
//        this.age = age;
//        this.color = color;
//    }
    
    
    //Method mencetak semua attribute
    public void showProfile(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Color : " + color);
        System.out.println();
    }

    // Alt + Fn + insert ---> Getter and Setter ---> Select all
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}