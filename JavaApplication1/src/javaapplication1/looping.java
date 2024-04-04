/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;

/**
 *
 * @author LAB F
 */
public class looping {
    public static void main(String[] args) {
//===========================================================
//        IF ELSE 
//===========================================================
       Scanner scan = new Scanner(System.in);
//       
//      System.out.println("masukan nilai anda : ");

 

//
//       int nilai = scan.nextInt();
//       if(nilai < 65)
//       {
//           System.out.println("anda tidak lulus");
//       }
//       else if(nilai > 100)
//       {
//           System.out.println("nilai anda mencurigakan");
//       }
//       else{
//           System.out.println("anda lulus");
//       }
//===========================================================
//          FOR LOPP
//===========================================================
        System.out.println("masukan nilai anda : ");
        int awal = scan.nextInt();
        System.out.println("masukan nilai anda : ");
        int akhir = scan.nextInt();
            int x;
            for(x=awal;x<=akhir;x++) {
                if(x%3==0) 
                {
                    System.out.print(x+" ");
                }
            }
        
    }
}
