/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lamim.arrayoutofbounds;
import java.util.Scanner;

/**
 *
 * @author devsys-a
 */
public class ArrayOutOfBounds {
    public static void main (String [] args){
        
       Scanner t = new Scanner(System.in);
       
        int [] vetor = new int [4];
       
    try{
        System.out.println("Digite qual indice você deseja acessar: ");
        System.out.println("Entre 0 - 3: ");
            int vt = t.nextInt();
        
        System.out.println(vetor[vt]);
        
        System.out.println(vt);
        
    }catch(ArrayIndexOutOfBoundsException exception){
        
        System.out.printf("Exceção ao acessar índice do vetor que não existe" ,exception);
        
    }
    
    }
}