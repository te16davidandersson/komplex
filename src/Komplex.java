/* David Andersson
05/02 2018
Addition av komplexa tal
 */

//Variabler

public class Komplex {
    private double a;
    private double b;

    public Komplex(double re, double im) {
        this.a = re;
        this.b = im;
    }

    // ?

    public String toString() {
        if (b < 0){
            return a + " - " + (-b) + " i";
        } else {
            return a + " + " + b + " i";
        }
    }

    //Metoder

    public void add(Komplex z2) {
        a = a+z2.a;
        b = b+z2.b;
    }

    public void Multiply(Komplex z2) {
        a = a*z2.a;
        b = b*z2.b;
    }
}
