import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        System.out.println("ucgenin birinci kenarini giriniz.");
        Scanner scanner = new Scanner(System.in);
        double kenar1 = scanner.nextDouble();
        System.out.println("ikinci kenari girin.");
double kenar2 = scanner.nextDouble();
        System.out.println("ucuncu kenari girin.");
double kenar3 = scanner.nextDouble();

double cevre = kenar1 + kenar2 + kenar3;
double u = cevre/2;
double alan = u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        System.out.println("alan = "+ Math.sqrt(alan));
        if(Math.sqrt(alan)<=0){
            System.out.println("girdiginiz degerlerden bir ucgen olusturulamamistir.");
        }

    }
}