
package com.Nabilahusen.PBO.pertemuan6.Tugas;

import java.util.Scanner;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Exception3 {
    public static boolean urlValid(String url){
        try{
            URL obj = new URL(url);
            obj.toURI();
            return true;
        }catch(MalformedURLException e){
            return false;
        }catch(URISyntaxException e){
           return false; 
        }
    }
    public static void main(String[] args) throws IOException {
        String url = "ht://replit.com/";
        if(urlValid(url)){
            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestMethod("GET");
            int response = conn.getResponseCode(); 
            if(response == 200){
                Scanner responseReader = new Scanner(conn.getInputStream());
                StringBuffer buffer = new StringBuffer();
                while(responseReader.hasNextLine()){
                    buffer.append(responseReader.nextLine()+"");
                }
                responseReader.close();
                System.out.println(buffer.toString());
            }
        }else{
            System.out.println("Tuliskan dengan benar URL-nya !!?!");
        }
    }
}
