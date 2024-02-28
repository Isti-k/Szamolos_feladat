/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package szamlalosfeladat;

import java.util.Random;

public class SzamlalosFeladat {
    
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        for (int i = 3; i >= -3; i--) {
            System.out.printf("|%2d| = %d\n",i,Math.abs(i));
        }
        
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
        
        final byte F_M = 18;
        long f = 1;
        for (int i = 1; i <= F_M; i++) {
            //f = f * i;
            f *= i;
        }
        System.out.println(F_M + "! = " + f);
         System.out.printf("min %-5s: %20d\n","byte", Integer.MIN_VALUE);
        System.out.printf("max %-5s: %20d\n","byte", Integer.MAX_VALUE);
        System.out.printf("min %-5s: %20d\n","short", Short.MIN_VALUE);
        System.out.printf("max %-5s: %20d\n","short", Short.MAX_VALUE);
        System.out.printf("min %-5s: %20d\n","int", Integer.MIN_VALUE);
        System.out.printf("max %-5s: %20d\n","int", Integer.MAX_VALUE);
        System.out.printf("min %-5s: %20d\n","long", Long.MIN_VALUE);
        System.out.printf("max %-5s: %20d\n","long", Long.MAX_VALUE);
        
        long nagy = 123_456_789_000L;
        
        System.out.println("Karakter intervalluma: ");
        System.out.printf("min %s (betű): %c\n","char", Character.MIN_VALUE);
        System.out.printf("max %s (betű): %c\n","char", Character.MAX_VALUE);
        System.out.printf("min %s (szám): %d\n","char", (int)Character.MIN_VALUE);
        System.out.printf("max %s (szám): %d\n","char", (int)Character.MAX_VALUE);
        
        // ASCII a=97, b=98, A=65
        System.out.println("char és int");
        System.out.println("\'a\' ASCII");
        System.out.println("ASCII kós ismerete: ");
        
        double dPi = Math.PI;
        float fPi = (float) Math.PI;
        System.out.println("printf: " + dPi);
        System.out.println("printf: " + fPi);
        System.out.println("printf: %f\n" + dPi);
        System.out.println("printf: %f\n" + dPi);
        System.out.println("printf: %.15f\n" + dPi);
        System.out.println("printf: %.15f\n" + dPi);
        
        //String[] betuk = {"a", " ", "\n", ""};
        char[] betuk = {'a', ' ', '\n'};
        
        betuk = new char[5];
        betuk[0] = 'x';
        betuk[1] = 'x';
        betuk[2] = 'x';
        betuk[3] = 'x';
        
        
        for (int i = 0; i < 9; i++) {
            //System.out.print((char)(i+97) + " ");
            char betu = (char)(i+97);
            betuk[i] = betu;
        }
        
        for (int i = 0; i < DB; i++){
            if (i != 0 && i % 3 == 0){
                System.out.println("");
            }
            System.out.println((char)(i+97) + "");
        }
        
        
        for (int i = 0; i < betuk.length; i++) {
            System.out.print(betuk[i] + "");
        }
        System.out.println("");
    }

}
