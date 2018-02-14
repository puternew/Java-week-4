/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie;

/**
 *
 * @author INT105
 */
public class TestMain {
    public static void main(String[] args) {
        Theater SomaEP1 = new Theater("Theater1");
        Theater SomaEP2 = new Theater("Theater2");
        Theater SomaEP3 = new Theater("Theater1");
        System.out.println(SomaEP1.equals(SomaEP2));
        System.out.println(SomaEP2.equals(SomaEP3));
        System.out.println(SomaEP1.equals(SomaEP3));
        
        System.out.println(SomaEP1.equals(SomaEP1));
        
    }
}
