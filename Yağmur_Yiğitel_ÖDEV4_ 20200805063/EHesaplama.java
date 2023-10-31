
package EHesaplama;


public class EHesaplama {

    public static void main(String[] args) {
      int n = 18; // Serinin terim sayısı (daha fazla terim, daha yakın bir tahmin sağlar)
        double eApproximation = hesaplaE(n);
        System.out.println("e sayısının yaklaşık değeri: " + eApproximation); }

    public static double hesaplaE(int n) {
        double eApproximation = 1.0;
        double factorial = 1.0;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            eApproximation += 1.0 / factorial;
        }

        return eApproximation;
    }
    }
    

