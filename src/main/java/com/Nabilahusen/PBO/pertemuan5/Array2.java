
package com.Nabilahusen.PBO.pertemuan5;

public class Array2 {
    public static void main(String[] args) {
        // Pembuatan array
        String[] names = {"Panji", "Paijo", "Parto"};
        
        // Cek Panjang Array
        System.out.println("Panjang Array : "+ names.length);

        
        // Menampilkan semua nilai array
        for(int i=0; i<names.length; i++){
            System.out.println("Nama " + i + " : "+ names[i]);
        }
    }
}
