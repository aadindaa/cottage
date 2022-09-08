/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cottage;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Cottage {

    private static String duku;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int harga = 0;
       Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nama kamar");
        String kamar = input.nextLine();
        System.out.println("Masukkan hari");
        String hari = input.nextLine();
        
      if (kamar.equals("duku")) {
          if(hari.equals("weekday")) {
              harga = 915000 ;
          } else if(hari.equals("weekend")) {
              harga = 1025000;
          } else {
              harga = 1225000;
          }
      } if (kamar.equals("jeruk")) {
          if (hari.equals ("weekday")) {
               harga = 915000 ;
          } else if (hari.equals ("weekend")) {
              harga = 1025000;
          } else {
              harga = 1225000; 
          }
      } if (kamar.equals("alpukat")) {
          if (hari.equals ("weekday")) {
               harga = 575000;
          } else if (hari.equals ("weekend")) {
              harga = 695000 ;
          } else { 
              harga = 895000;
          }
      } if (kamar.equals("jambu air")) {
          if (hari.equals("weekday")) {
              harga = 575000 ;
          } else if (hari.equals ("weekend")) {
              harga = 695000 ;
          } else {
              harga =  895000 ;
          } 
      } if (kamar.equals("durian")) {
          if (hari.equals ("weekday")) {
              harga = 595000;
          } else if (hari.equals ("weekend")) {
              harga = 715000;
          } else {
              harga = 915000;
          }
      } if (kamar.equals("melon")) {
          if (hari.equals ("weekday")) {
              harga = 595000;
          } else if (hari.equals ("weekend")) {
              harga = 715000;
          } else { 
             harga = 915000;
          }
      } if (kamar.equals("belimbing")) {
          if (hari.equals ("weekday")) {
              harga = 495000;
          } else if (hari.equals ("weekend")) {
              harga = 575000;
          } else {
              harga = 755000;
          }
      } if (kamar.equals ("mangga")) {
          if (hari.equals ("weekday")){
              harga = 575000;
          } else if (hari.equals ("weekend")) {
              harga = 575000;
          } else {
              harga = 755000;
          }
      } if (kamar.equals ("kedondong")){
          if (hari.equals ("weekday")){
              harga = 495000;
          } else if (hari.equals("weekend")){
              harga = 575000;
          } else {
              harga = 755000;
              String cottage = null;
              String day = null;
              String room = null;
              
  
          }
      }
      
  System.out.println("cottage:" + kamar + "\nday:" + hari + "\nharga"+harga);              
    }
    
}

