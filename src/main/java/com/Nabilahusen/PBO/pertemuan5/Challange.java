
package com.Nabilahusen.PBO.pertemuan5;

import java.util.Scanner;

public class Challange {
    public static void main(String[] args) {
        // Deklarasi Scanner untuk inputan
        Scanner input = new Scanner(System.in);
        double total = 0;
        
        // membuat agar panjang array ditentukan inputan user
        System.out.println("---Program Input Nilai---");
        System.out.print("Masukkan jumlah matkul : ");
        int jml = input.nextInt();
        System.out.println("");
        
        // membuat array baru dengan panjang sesuai inputan user
        int[] nilai = new int[jml];
        
        // memasukkan nilai ke array
        for(int i=0; i<jml; i++){
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }
        
        System.out.println();
        
        // Menampilkan semua nilai array
        System.out.println("===Daftar Nilai===");
        for(int i=0; i<jml; i++){
            System.out.println("Nilai ke-"+ (i+1) + " : " + nilai[i]);
        }
        
        System.out.println();
        
        // Menghitung total nilai
        for(int i=0; i<jml; i++){
            total = total + nilai[i];
        }
       
        
        // Menghitung rata-rata nilai
      
        double rata = total / jml;
        System.out.println("rata rata nilai :" + rata);
        
  }
}
