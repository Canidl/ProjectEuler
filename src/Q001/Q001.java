/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q001;

/**
 *
 * @author kimse
 */
public class Q001 {
    public static void main(String[] args){
        int sonuc = 0;
        for (int i = 0; i < 1000; i++) {
            if(i%3 == 0 || i%5 == 0){
                sonuc += i;
            }            
        }
        System.out.println(sonuc);
    }
}
