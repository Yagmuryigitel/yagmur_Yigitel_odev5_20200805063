
package toplamfaktoriyel;


public class toplamfaktoriyel {

  
    public static void main(String[] args) {
        // TODO cint number = 12; // Hesaplanacak sayı
        int toplamfaktoriyel = toplamfaktoriyel(number);
        System.out.println(number + " sayısının çarpanları toplamı: " + toplamfaktoriyel );
    }

    public static int toplamfaktoriyel (int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
    }
    

/*
sumFactors metodu her bir sayının kendisi hariç bölenlerinin toplamını 
hesaplar ve ardından bu toplamları karşılaştırarak arkadaş sayıları belirler
. Eğer farklı aralıklardaki arkadaş sayıları bulmak isterseniz, for döngüsünün başlangıç ve
bitiş değerlerini değiştirebilirsin
*/