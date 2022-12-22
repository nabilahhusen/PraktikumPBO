
package com.Nabilahusen.PBO.pertemuan2;

import java.util.Scanner;


public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();
        
        System.out.print("Masukan usia : ");
        int usia = input.nextInt();
        
        System.out.println("Nama Saya : " + nama);
        System.out.println("Usia saya : " + usia + " tahun" );
    }
    
}
