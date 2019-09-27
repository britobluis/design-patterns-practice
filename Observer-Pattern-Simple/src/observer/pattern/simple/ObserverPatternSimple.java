/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.pattern.simple;

/**
 *
 * @author Luis Brito
 */
public class ObserverPatternSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleSubject simpleSubject1 = new SimpleSubject();

        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject1);

        simpleSubject1.setValue(80);
    }

}
