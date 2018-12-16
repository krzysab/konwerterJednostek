import java.util.Scanner;

public class Runner {

    /**
     * konwerter jednostek Lb to Kg
     * */

    static double lbToKg(int lb){
        final double KG = 0.45;
        return lb*KG;
    }


    private static final double MILES_TO_KM_FACTOR = 1.609;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj numer menu od 1 do 4 ");
        int menu = scanner.nextInt();
        switch (menu){
            case 1:
                System.out.println("wybrales 1");

                break;
            case 2:
                System.out.println("wybrales 2");
                Scanner lbScanner = new Scanner(System.in);
                int lb = lbScanner.nextInt();
                System.out.println(Runner.lbToKg(lb));
                break;
            case 3:
                System.out.println("wybrales 3");
                Scanner mileScanner = new Scanner(System.in);
                double mile = mileScanner.nextDouble();
//                System.out.println(Runner.mi2km(double mile));
                break;
            case 4:
                System.out.println("wybrales 4");
                break;
                default: {
                    if (menu < 1 || menu > 4)
                    System.out.println("wybierz ponownie");
                }
        }


    }
    public static double mi2km (double miles) {
        return miles*MILES_TO_KM_FACTOR;
    }
}
