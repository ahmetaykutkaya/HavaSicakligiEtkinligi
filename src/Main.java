import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int heat;
        System.out.println("Sicakligi Giriniz : ");
        heat = input.nextInt();

        if (heat <= 5){
            System.out.println("Kayak Yapmaya Gidilebilir ...");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinamaya Gidilebilir...");
            }
            if (heat >= 10) {
                System.out.println("Piknige Gidilebilir...");
            }
        }
           else {
              System.out.println("Yuzmeye Gidilebilir...");
            }

    }
}