public class Runner {
    public static void main(String[] args) {
        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Wpisz temp. w Fahrenheit");
        temperature = in.nextInt();

        temperature = ((temperature - 32)*5)/9;

        System.out.println("temperata w Celsjuszach = " + temperature);
    }


}
