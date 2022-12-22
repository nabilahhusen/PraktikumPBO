
package com.Nabilahusen.PBO.pertemuan6.Tugas;

import java.util.*;

public class Exception1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        String strInput = input.nextLine();
        int intInput = 5;
//        String str1 = "10AB1";
        try{
//            int x = Integer.parseInt(str1);
            intInput = Integer.parseInt(strInput);
            System.out.println(strInput);
            System.out.println("Yeayyy Berhasil");
        }catch(NumberFormatException e){
//            System.out.println("Kenapa String anda salah");
//            e.printStackTrace();
            System.out.println("Tidak bisa memproses karena bukan angka");
        }
    }
}