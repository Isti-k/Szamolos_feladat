/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package szamlalosfeladat;

import java.util.Random;

public class Beugro {
    
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        final int DB = 5;
        int[] tomb = new int[DB];
        for (int i = 0; i < DB; i++) {
            //tomb[i] = (int)(Math.random());//0
            //tomb[i] = (int)(Math.random()*10);//0..9
            //tomb[i] = (int)(Math.random()*(99-11+1)+11);//11..99
            //tomb[i] = (int)(Math.random()*45);//0....44
            //tomb[i] = (int)(Math.random()*45)*2;//0...88
            tomb[i] = (int)(Math.random()*45)*2+11;//11...99
        }
        
        //biztos legyen páros:
        tomb[DB/2]++;
        
        //kiírás:
        for (int i = 0; i < DB; i++) {
            System.out.print(tomb[i] + "");
        }
        System.out.println("");
        
        //kiválasztás:
        int i = 0;
        while (!(tomb[i] % 2 == 0)) {
            i++;
        }
        System.out.println("a tömb 1. páros eleme: " + tomb[i]);
    }
}
