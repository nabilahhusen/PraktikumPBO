
package com.Nabilahusen.PBO.pertemuan3;

public class main{
        public static void main(String[] args) {
            // Pembuatan Class
            animal cat = new animal("Joko", 3, "Black");
            animal dog = new animal("warm", 4, "Red");
            animal rabbit = new animal("Mkae", 1, "White");
            
            
            //Menjalankan method 'showProfile()' masing masing object
            cat.showProfile();
            dog.showProfile();
            rabbit.showProfile(); 
             
 
            // Demo Getter & Setter
            System.out.println("Dog's name (before) : " + dog.getName());
            dog.setName("Blackky");
            System.out.println("Dog's name (after) : " + dog.getName());
        }
    }