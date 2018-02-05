/*David Andersson
05/02 2018
 */

public class KomplexTest {
    public static void main(String[] args) {
        Komplex z = new Komplex(25,-50);
        System.out.println(z.toString());
        Komplex z2 = new Komplex(2,3);
        System.out.println(z2.toString());

        z.add(z2);
        System.out.println("Addition: " + z);
    }
}
