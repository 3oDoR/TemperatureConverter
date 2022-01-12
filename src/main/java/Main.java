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

    public void convertFtoC(String str, Scanner in) {
        if (str.equalsIgnoreCase("f c")) {
            System.out.println("Enter temperature(F)");
            str = in.nextLine();
            try {
                double sum = (Double.parseDouble(str) - 32) * 5 / 9;
                System.out.println(str + "F = " + sum + "C");
            } catch (Exception e) {
                System.out.println("Number input error. Next time, please try to enter a number. Example: 23 or 23.55");
            }
        }
    }

    public void convertFtoK(String str, Scanner in) {
        if (str.equalsIgnoreCase("f k")) {
            System.out.println("Enter temperature(F)");
            str = in.nextLine();
            try {
                double sum = ((Double.parseDouble(str) - 32) * 5 / 9 + 273.15D);
                System.out.println(str + "F = " + sum + "K");
            } catch (Exception e) {
                System.out.println("Number input error. Next time, please try to enter a number. Example: 23 or 23.55");
            }
        }
    }

    public void convertKtoC(String str, Scanner in) {
        if (str.equalsIgnoreCase("k c")) {
            System.out.println("Enter temperature(K)");
            str = in.nextLine();
            try {
                double sum = (Double.parseDouble(str) - 273.15D);
                System.out.println(str + "K = " + sum + "C");
            } catch (Exception e) {
                System.out.println("Number input error. Next time, please try to enter a number. Example: 23 or 23.55");
            }
        }
    }

    public void convertKtoF(String str, Scanner in) {
        if (str.equalsIgnoreCase("k f")) {
            System.out.println("Enter temperature(K)");
            str = in.nextLine();
            try {
                double sum = ((Double.parseDouble(str) - 273.15D) * 9 / 5 + 32);
                System.out.println(str + "K = " + sum + "F");
            } catch (Exception e) {
                System.out.println("Number input error. Next time, please try to enter a number. Example: 23 or 23.55");
            }
        }
    }
}
