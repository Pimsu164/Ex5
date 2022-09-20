package ex5.pkg1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Subscriber2 implements ScoreListener {

    public void scoreChange(ScoreEvent e) {
        System.out.println("Live Result : " + e.getSomeData());
   }
}
