
package mukemmelsay;
import java.util.Scanner;

public class MukemmelSay {

    
    public static void main(String[] args) {  {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        int sayi = input.nextInt();

        boolean sonuc = isPerfect(sayi);

        if (sonuc) {
            System.out.println(sayi + " bir mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " bir mükemmel sayı değildir.");
        }

        input.close();
    }
    

    public static boolean isPerfect(int sayi) {
        if (sayi <= 0) {
            return false;
        }

        int toplam = 0;

        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        return toplam == sayi;
    }
        
    }
    

