
package sifrebelirlemearayuz;

import java.util.Scanner;
import java.util.regex.Pattern;
public class SifreBelirlemeArayuz {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sifre Belirleme Arayüzü");
        System.out.println("----");

        while (true) {
            System.out.print("Sifre belirlemek için bir Sifre girin: ");
            String sifre = input.nextLine();

            if (checksifre(sifre)) {
                System.out.println("Şifre geçerli, tebrikler!");
                break;
            } else {
                System.out.println("Sifre geçerli değil. Sifre en az 8 karakter uzunluğunda olmalı, en fazla 96 karakter uzunluğunda olmalı ve en az bir büyük harf, küçük harf, rakam ve özel karakter içermelidir. Boşluk içeremez.");
            }
        }

        input.close();
    }

    public static boolean checksifre(String sifre) {
        // Şifre en az 8 karakter uzunluğunda olmalı ve en fazla 96 karakter uzunluğunda olmalı.
        if (sifre.length() < 8 || sifre.length() > 96) {
            return false;
        }

        // Şifre en az bir büyük harf, küçük harf, rakam ve özel karakter içermelidir. Boşluk içeremez.
        Pattern upperCasePattern = Pattern.compile(".*[A-Z].*");
        Pattern lowerCasePattern = Pattern.compile(".*[a-z].*");
        Pattern digitPattern = Pattern.compile(".*\\d.*");
        Pattern specialCharacterPattern = Pattern.compile(".*[@#$%^&+=!].*");
        Pattern spacePattern = Pattern.compile(".*\\s.*");

        return upperCasePattern.matcher(sifre).matches()
                && lowerCasePattern.matcher(sifre).matches()
                && digitPattern.matcher(sifre).matches()
                && specialCharacterPattern.matcher(sifre).matches()
                && !spacePattern.matcher(sifre).matches();
    } /*TODO code application logic here
    Pattern sınıfı, Java'nın java.util.regex paketi içinde yer alır ve düzenli ifadeler
    (regular expressions) ile metin eşleştirmek ve işlemek için kullanılır. Pattern sınıfı,
    düzenli ifadeyi derlemek ve bu düzenli ifadeyi kullanarak metin üzerinde aramalar yapmak için kullanılır. 
    Pattern.compile() ile düzenli ifadeyi derleyip, ardından Pattern.matcher() ile bu düzenli ifadeyi bir metin üzerinde uygulayarak eşleşmeleri Matcher nesnesi içinde buluyoruz.

Düzenli ifadeler oldukça güçlü ve çok yönlü bir araçtır ve metin analizi, veri işleme, metin işleme ve 
    daha pek çok alanda kullanılır. Daha karmaşık düzenli ifadeleri kullanırken, düzenli ifade
    örüntülerini anlamak ve kullanmak önemlidir.
    */
    
    }
    /*

