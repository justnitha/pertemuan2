/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author LAB F
 */
public class input {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bala = new BufferedReader(new InputStreamReader(System.in));
        
       String nama;
       String nim;
       int tinggi;
       
       System.out.println("===========================================");
       System.out.print("masukan nama anda: ");
       nama = bala.readLine();
       System.out.print("masukan nim anda:  ");
       nim = bala.readLine();
       System.out.print("masukan tinggi badan:  ");
       tinggi =Integer.parseInt(bala.readLine());
       System.out.println("nama  = "+nama);
       System.out.println("nim   = "+nim);
       System.out.println("inggi = "+tinggi);
//
        System.out.println("===============Persegi Panjang============================");
       Scanner input=new Scanner(System.in);
         int lebar;
         int panjang;        
         int luas;
//       
       System.out.print("Masukan lebar : ");
       lebar=input.nextInt();
       System.out.print("Masukan panjang : ");
       panjang=input.nextInt();
//       
       luas=panjang * lebar;
//
       //Tampilkan hasil
       System.out.println("Luas persegi panjang = "+luas);
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
}
