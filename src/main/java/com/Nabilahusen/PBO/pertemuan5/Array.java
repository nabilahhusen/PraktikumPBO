
package com.Nabilahusen.PBO.pertemuan5;

public class Array {
    public static void main(String[] args) {
        // Pembuatan array
        String[] names = new String[3];
        
        // Cek Panjang Array
        System.out.println("Panjang Array : "+ names.length);
        
        // Memasukkan nilai ke array
        names[0] = "lala";
        names[1] = "lulu";
        names[2] = "lili";
        
        // Menampilkan semua nilai array
        for(int i=0; i<names.length; i++){
            System.out.println("Nama " + i + " : "+ names[i]);
        }
    }
}
