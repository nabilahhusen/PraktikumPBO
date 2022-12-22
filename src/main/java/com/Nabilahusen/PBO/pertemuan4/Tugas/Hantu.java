
package com.Nabilahusen.PBO.pertemuan4.Tugas;

public class Hantu {
    String nama;
    String keadaan;
    int jml;
    
    public void disclaimer(){
        System.out.println("Anak-anak Cepat Pulang Sudah " + keadaan +"!");
    }
    
    public void showInfo(){
        System.out.println("Awas ada " + nama + " Jumlahnya sebanyak : " + jml + ", Cepat Kabur Sebelum Kena Terror!");
        extraInfo();
    }
    
    public void extraInfo(){}
}