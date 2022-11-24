import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner klavye=new Scanner(System.in);
        System.out.print("Kaç Adım Gitmek İstiyorsunuz? : ");
        int sayi= klavye.nextInt();
        int a=0;
        int b=1;
        int toplam;

        for (int i = 0; i <sayi ; i++) {
            System.out.print(a+ ",");
            toplam=a+b;
            a=b;
            b=toplam;

        }



    }
}