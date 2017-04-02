/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q002;

/**
 *
 * @author kimse
 */
public class Q002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int i = 0, a = 1, b = 2, toplam = 2;
        while(i < 4000000){
            i = a + b;
            if(i % 2 == 0)
                toplam += i;
            a = b;
            b = i;           
            
        }
        System.out.println(toplam);
        
        
    
}
}
