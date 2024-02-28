/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package szamlalosfeladat;


public class Gyakorlas {
    
    public static void main(String[] args) {
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
