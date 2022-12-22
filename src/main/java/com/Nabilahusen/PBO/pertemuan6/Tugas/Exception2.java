
package com.Nabilahusen.PBO.pertemuan6.Tugas;

public class Exception2 {
    public static void main(String[] args) {
        String str = "Something Adorable";
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println("Panjang String : " + str.length());
        
        try{
            // Mengakses Elemen Lebih Besar dari Panjang String
            System.out.println(str.charAt(25));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Terjadi Exception");
        }
    }
}
