/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;


/**
 *
 * @author LAB F
 */
public class Scener {
    public static void main(String[] args) {
       
//        Scanner bebas = new Scanner(System.in);
//        
//        String nama;
//        String nim;
//        int tng;
//        
//        System.out.print("masukan nama anda: ");
//        nama = bebas.nextLine();
//        System.out.print("masukan nim  anda: ");
//        nim = bebas.nextLine();
//        System.out.print("masukan nim  tinggi: ");
//        tng = bebas.nextInt();
//        
//        System.out.println("Hey.." + nama + "    NIM :" + nim);


Scanner scan = new Scanner(System.in);
        int x;
        
        boolean menu =true;
        while(menu)
        {
         System.out.print("Masukkan nilai x =");
         x = scan.nextInt();
        
         System.out.println("\nCetak Segitiga Siku-siku");
         System.out.println("==========================");
         for (int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
                System.out.println();
         }
         System.out.print("\nIngin Mencoba lagi (Y/N) ?:");
         String cek = scan.next();
         
         if(cek.equalsIgnoreCase("N"))
         {
          menu = false;
         }
         else if(cek.equalsIgnoreCase("Y"))
         {
          menu = true;
         }
         else
            System.exit(0);
        }   
    }
}
