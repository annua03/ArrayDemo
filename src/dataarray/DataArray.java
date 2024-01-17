/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dataarray;

import java.util.Scanner;

/**
 *
 * @author arman
 */
public class DataArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter a word");
        Scanner input = new Scanner(System.in);
        String myWord = input.nextLine();
        char[] myletters = new char[myWord.length()];
        
        for(int i=0;i<myletters.length;i++ )
        {
            myletters[i] = myWord.charAt(i);
        }
        
        System.out.println("printing in reverse");
                for(int i=myletters.length-1;i>=0;i-- )        
                {
                    System.out.print(myletters[i]);
                }
    }  
}
