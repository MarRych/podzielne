import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String liczby = scanner.nextLine();
        String[] dane = liczby.split("\u0020");

        // int a,b,n,m;
        int a = Integer.parseInt(dane[0]);
        int b = Integer.parseInt(dane[1]);
        int n = Integer.parseInt(dane[2]);
        int m = Integer.parseInt(dane[3]);

        int wynik = 0;

        for (int i = a; i <= b; i++) {
            if (i % n == 0 && i % m != 0) {
                wynik += 1;

            }
        }
        System.out.println(wynik);


    }
}