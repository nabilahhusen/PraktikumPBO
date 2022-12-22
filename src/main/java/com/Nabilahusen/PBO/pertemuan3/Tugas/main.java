
package com.Nabilahusen.PBO.pertemuan3.Tugas;

public class main {
    public static void main(String[] args) {
       
        lala saya = new lala ("Nabila", 168, 64, 20);
        lala dia = new lala ("Husem", 166, 60, 19);
        
        // menjalankan Method
        saya.tentangSaya();
        dia.tentangSaya();
        
        // Menjalankan Getter & Setter dari class Aldi
        System.out.println("Tinggi badan saya(sebelum diet) : " + dia.getBerat());
        dia.setBerat(75);
        System.out.println("Tinggi badan saya (setelah diet) : " + dia.getBerat());
        
        System.out.println("\n");
        // menghitung massa tubuh
        double massa = dia.getBerat() / ((dia.getTinggi() * 0.01) * (dia.getTinggi() * 0.01));
        
        System.out.println("Massa Tubuh saya adalah " + massa);
        
        System.out.println("\n");
        
        //Inheritance = menghubungkan dua objek atau lebih
        test hewan = new test(); // memanggil class Test
        System.out.println("Apakah hewan adalah Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan adalah Hewan -> " + (hewan instanceof test));
        System.out.println("Apakah hewan adalah paus -> " + (hewan instanceof paus));
        System.out.println("------------------------"); // spasi
 
        paus ikan = new paus(); // Memanggil class Kucing “Hiu Bernafas dengan 5 liang insang” 
        System.out.println("Apakah hewan adalah Objek -> " + (ikan instanceof Object));
        System.out.println("Apakah hiu adalah Hewan -> " + (ikan instanceof test));
        System.out.println("Apakah hiu adalah Hiu -> " + (ikan instanceof paus)); 
    }
}