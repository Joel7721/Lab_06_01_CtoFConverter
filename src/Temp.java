import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {

        double DegreeF;
        double DegreeC;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the degrees in Celsius: ");

        if(in.hasNextDouble()){
            DegreeC = in.nextDouble();
            in.nextLine();

            DegreeF = (DegreeC * 9/5) + 32;

            System.out.println("The degrees in fahrenheit is: " + DegreeF);
        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid degree value: " + trash);
            System.exit(0);
        }

    }
}
