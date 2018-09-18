/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carpet;

/**
 *
 * @author evrob0095
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double length = 8.5;
        int width = 6;
        double price = 19.95;
        double cost = width*length*price;
        System.out.println("The total cost is $" + cost);
    }
    
}
