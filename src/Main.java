import java.util.Scanner;

public class Main {

    static int pow (int taban, int us) {
        if (us==0) {
            return 1;
        }
        return taban * pow(taban,us-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban sayıyı giriniz : ");
        int taban = input.nextInt();

        System.out.print("Ussu giriniz : ");
        int us = input.nextInt();

        System.out.println("Sonuc = " + pow(taban,us));
    }
}
