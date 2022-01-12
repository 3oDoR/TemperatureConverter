import java.util.Scanner;

public class Main {

    public void convertCtoF(String str, Scanner in) {
        if (str.equalsIgnoreCase("c f")) {
            System.out.println("Enter temperature(C)");
            str = in.nextLine();
            try {
                double sum = Double.parseDouble(str) * 9 / 5 + 32;
                System.out.println(str + "C = " + sum + "F");
            } catch (Exception e) {
                System.out.println("Number input error. Next time, please try to enter a number. Example: 23 or 23.55");
            }
        }
    }

    public void convertCtoK(String str, Scanner in) {
        if (str.equalsIgnoreCase("c k")) {
            System.out.println("Enter temperature(C)");
            str = in.nextLine();
            try {
                double sum = (Double.parseDouble(str) + 273.15D);
                System.out.println(str + "C = " + sum + "K");
            } catch (Exception e) {
                System.out.println("Number input error. Next time, please try to enter a number. Example: 23 or 23.55");
            }
        }
    }
}
