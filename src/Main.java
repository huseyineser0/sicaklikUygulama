import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Koşullar :
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

         */
        int sicaklik;
        Scanner scan=new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz: ");
        sicaklik= scan.nextInt();

        if (sicaklik<5){
            System.out.println("kayak yapın");
        } else if (sicaklik>=5 &&sicaklik<15){
            System.out.println("sinema izleyin");
            if (sicaklik>=10 &&sicaklik<25){
                System.out.println("piknik yapın");
            }

        }
        else {
            System.out.println("yüzmeye gidin");
        }

    }
}
