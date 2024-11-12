package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(1001));
        System.out.println(isPerfectNumber(28));
        System.out.println(numberToWords(12));

    }

    // Palindrome Örneği:

    public static boolean isPalindrome(int number) {
     number = Math.abs(number);
     //Negatif değeri de alabilmek için kullanırız. Negatif ise pozitif olur.

        char[] digists = String.valueOf(number).toCharArray(); // Number'i önce stringe ceviririz. //toCharArray -- sayıdaki her char'ı tutuyor.
        // Gelen number'ı da stringe çevirmeliyiz. Number olarak alırsak 0001 olduğu zaman bu 1' eşit olur.
        String reversed = "";
        for(int i = digists.length-1; i>=0; i--){
            reversed += digists[i];
        }
        return reversed.equalsIgnoreCase(String.valueOf(number));
    }



// Mükemmel Sayıları Bulma Örneği:

public static boolean isPerfectNumber(int number) {
       if (number < 0) return false;
       int total = 0; //Kendisi hariç bölenlerini tutar.
    for(int i = 1; i<=number / 2 ; i++) {
        if(number % i == 0){
            total += i; //Burda tam bölenleri toplarız.
        }
    }
    return number == total;
}

// Sayıları Kelimelere Dökme Örneği:

    public static String numberToWords(int number) {
        if (number < 0)
            return "Invalid Value"; // Negatif sayılar için hata mesajı

        char[] digits = String.valueOf(number).toCharArray();
        String numberToString = "";

        for (char digit : digits) {
            switch (digit) {
                case '0': // char olduğu için burada "" yerine '' kullanılmalı
                    numberToString += "Zero ";
                    break;  // break ekleyelim, diğer case'lere geçmesini engelleyelim.
                case '1':
                    numberToString += "One ";
                    break;
                case '2':
                    numberToString += "Two ";
                    break;
                case '3':
                    numberToString += "Three ";
                    break;
                case '4':
                    numberToString += "Four ";
                    break;
                case '5':
                    numberToString += "Five ";
                    break;
                case '6':
                    numberToString += "Six ";
                    break;
                case '7':
                    numberToString += "Seven ";
                    break;
                case '8':
                    numberToString += "Eight ";
                    break;
                case '9':
                    numberToString += "Nine ";
                    break;
            }
        }

        return numberToString.trim(); // Başındaki ve sonundaki boşlukları temizler
    }
    }