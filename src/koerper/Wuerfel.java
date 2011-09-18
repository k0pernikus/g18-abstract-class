/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package koerper;

public class Wuerfel extends Quader {
    Wuerfel(double a){
        super(a, a, a);
    }

    @Override
    public String getFormBezeichnung() {
        return "Würfel";
    }
}