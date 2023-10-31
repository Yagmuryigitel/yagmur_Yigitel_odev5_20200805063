
package arkadassayilar;


public class ArkadasSayilar {

    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            int j = toplam(i);
            if (i < j && i == toplam(j) && j <= 9999) {
                System.out.println(i + " ve " + j + " arkadaş sayılardır.");
            }
        }
    }

    public static int toplam (int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }   }
            return sum;
    }
        
    
    
}
