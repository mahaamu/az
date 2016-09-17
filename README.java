/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camelcase;

import java.util.Scanner;
public class Camelcase {

  
    public static void main(String[] args) {
       
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = src.nextLine();
        String res = "";
        char firstChar = input.charAt(0);
        res = res + Character.toUpperCase(firstChar);
        for (int i = 1; i < input.length(); i++) {
            char cChar = input.charAt(i);
            char pChar = input.charAt(i - 1);
            if (pChar == ' ') {
                res = res + Character.toUpperCase(cChar);
            } else {
                res = res + cChar;
            }
        }
        System.out.println(res);
    }
    }
