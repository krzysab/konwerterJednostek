import java.util.Scanner;

public class Runner {


    private static final double MILES_TO_KM_FACTOR = 1.609;
    private static final double KILOGRAM_TO_POUND_FACTOR = 0.45;

    /**
     * konwerter jednostek Funty na Kilogramy
     * */

    static double lbToKg(int lb){
        return lb*KILOGRAM_TO_POUND_FACTOR;
    }

    /**
    * konwerter jednostek mile na kilometry
    * */

    public static double mi2km (double miles) {
        return miles*MILES_TO_KM_FACTOR;
    }

    /**
     * konwerter costam
     * */

    public static void costam(double tamcos){

    }

    /**
     * konwerter stopni Celcjusza na Fahrenheita
     * */

    static void celcjuszToFahrenheit(double celcjusz){

    }

    /**
     * pokaz menu na zadanie
     * */

    static void showMenu(){
        System.out.println("0. wyjscie z programu");
        System.out.println("1. konwerter stopni Celcjusza na Fahrenheita");
        System.out.println("2. konwerter Funtow na Kilogramy");
        System.out.println("3. konwerter Mile na Kilometry");
        System.out.println("4. konwerter czegos tam tam tam");
        System.out.println("5. pokaz menu");
        System.out.println();
        System.out.print("Podaj numer menu od 0 do 5 : ");
        choseMenu(getNumber());
    }

    /**
     * pobierz liczbe int z klawiatury
     * */

    static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * wybierz jedna z opcji dostepna w menu
     * */

    static void choseMenu(int menuNumber){
        switch (menuNumber){
            case 0:
                System.out.println("wyszedles z programu");
                System.exit(0);
                break;

            case 1:
                System.out.print("wybrales konwerter stopni Celcjusza na Fahrenheita, podaj liczbe stopni Celcjusza: ");
                int celcjusz = getNumber();
                //System.out.printf("%d Celcjusza to %f Fahrenheita \n", celcjusz, celcjuszToFahrenheit(celcjusz));
                System.out.print("Co dalej, wybierz 0 - 5: ");
                choseMenu(getNumber());
                break;

            case 2:
                System.out.print("wybrales konwerter Funtow na Kilogramy, podaj liczbe Funtow: ");
                int lb = getNumber();
                System.out.printf("%d Funtow to %f Kilogramow \n", lb, lbToKg(lb));
                System.out.print("Co dalej, wybierz 0 - 5: ");
                choseMenu(getNumber());
                break;

            case 3:
                System.out.print("wybrales konwerter Mile na Kilometry, podaj liczbe Mil: ");
                int mile = getNumber();
                System.out.printf("%d Mil to %f km", mile, mi2km(mile));
                System.out.print("Co dalej, wybierz 0 - 5: ");
                choseMenu(getNumber());
                break;

            case 4:
                System.out.print("wybrales konwerter czegos tam tam tam, podaj liczbe czegos tam: ");
                int costam = getNumber();
                //System.out.printf("%d Costam to %f Tamcos", costam, costam(costam));
                System.out.print("Co dalej, wybierz 0 - 5: ");
                choseMenu(getNumber());
                break;

            case 5:
                showMenu();
                break;

            default: {
                if (menuNumber < 0 || menuNumber > 5)
                    System.out.println("Bledny numer menu, wybierz ponownie 0 - 5: ");
                choseMenu(getNumber());
            }
        }
    }

    public static void main(String[] args) {

        showMenu();
        choseMenu(getNumber());

    }
}
