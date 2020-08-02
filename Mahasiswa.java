package javaapplication9;

import java.util.Scanner;
public class Mahasiswa {
    public static void main(String args[]) {
     
        String nama, fakultas , nim;
       
   
        Scanner keyboard = new Scanner(System.in);


        System.out.print("Nama : ");
        nama = keyboard.nextLine();
    
    
        System.out.print("Fakultas : ");
        fakultas = keyboard.nextLine();
    
        
        System.out.print("NIM : ");
        nim = keyboard.nextLine();
       
            System.out.println("Nama: " + nama);
            System.out.println("Fakultas: " + fakultas);
            System.out.println("NIM: " + nim );
    }


}
