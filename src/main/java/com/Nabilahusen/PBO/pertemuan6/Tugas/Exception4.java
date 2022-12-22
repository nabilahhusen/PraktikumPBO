
package com.Nabilahusen.PBO.pertemuan6.Tugas;

public class Exception4 {
    public static void main(String[] args) {
        try{
         Object[] array = new String[3];
         array[0] = 8;
        }catch(ArrayStoreException e){
         e.printStackTrace();
        }
        System.out.println("Terus Running....");
    }
}
