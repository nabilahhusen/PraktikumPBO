
package com.Nabilahusen.PBO.pertemuan4.Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" === HANTU ===  ");
        System.out.println("   1. Valak  ");
        System.out.println("   2. Vampir   ");
        System.out.println("   3. Jalangkung       ");
        System.out.println("   4. Keluar       ");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = input.nextInt();
        System.out.println();
        Valak vk = new Valak();
        Hantu hu = new Hantu();
        Vampir vp = new Vampir();
        
        vk.nama = "Valak";
        vk.jml = 2;
        vk.keadaan = "Malam";
        vk.ciriCiri = "Memakai Baju suster gereja";
        
        hu.nama = "Kuntilanak";
        hu.keadaan ="Malam";
        hu.jml = 1;
        
        vp.nama = "Vampir";
        vp.jml = 3;
        vp.keadaan = "Malam";
        vp.ciriCiri = "Terbang mencari mangsa";
        
        switch(pilihan){
            case 1:
               vk.disclaimer();
               vk.showInfo();
               vk.funFact();
               vk.extraInfo(); 
            break;
            
            case 2:
                hu.disclaimer();
                hu.showInfo();
            break;
            
            case 3:
               vp.disclaimer();
               vp.showInfo();
               vp.funFact();
               vp.extraInfo(); 
            break;
            
            case 4:
                System.out.println("Silahkan Keluar");
            break;
        }
    }
}