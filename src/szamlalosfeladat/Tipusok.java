/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package szamlalosfeladat;


public class Tipusok {
    public static void main(String[] args) {
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
        
        
    }
}
