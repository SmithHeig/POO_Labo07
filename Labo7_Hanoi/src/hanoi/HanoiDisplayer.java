/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

/**
 *
 * @author James
 */
public class HanoiDisplayer {
    
    public void display(Hanoi h){
        System.out.println("-- Turn: " + h.turn());
        System.out.println(h);
    }
}
