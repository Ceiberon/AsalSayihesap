import java.util.Scanner;

public class Main {

    static boolean asal(int n, int i) {
        if (n < 2) {
            System.out.println("Girdiğiniz Sayı 2 den küçük olamaz");
            return false;
        }

        if (i * i > n)
            return true;

        if (n % i == 0)
            return false;

        return asal(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz :");
        int n = input.nextInt();

        if (asal(n, 2)) {
            System.out.println("Sayınız Asaldır");
        } else {
            System.out.println("Sayınız Asal Değildir");
        }
    }
}