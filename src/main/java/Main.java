import java.util.Scanner;

public class Main {

    public double convertCtoF(String str, Scanner in) {
        if (str.equalsIgnoreCase("c f")) {
            System.out.println("Enter temperature(C)");
            str = in.nextLine();
            try {
                double sum = Double.parseDouble(str) * 9 / 5 + 32;
                System.out.println(str + "C = " + sum + "F");
                return sum;
            } catch (Exception e) {
                System.out.println("Number input error. Next time, please try to enter a number. Example: 23 or 23.55");
                return 0;
            }
        }
        return 0;
    }

    public double convertCtoK(String str, Scanner in) {
        if (str.equalsIgnoreCase("c k")) {
            System.out.println("Enter temperature(C)");
            str = in.nextLine();
            try {
                double sum = (Double.parseDouble(str) + 273.15D);
                System.out.println(str + "C = " + sum + "K");
                return sum;
            } catch (Exception e) {
                System.out.println("Number input error. Next time, please try to enter a number. Example: 23 or 23.55");
                return 0;
            }
        }
        return 0;
    }

    public double convertFtoC(String str, Scanner in) {
        if (str.equalsIgnoreCase("f c")) {
            System.out.println("Enter temperature(F)");
            str = in.nextLine();
            try {
                double sum = (Double.parseDouble(str) - 32) * 5 / 9;
                System.out.println(str + "F = " + sum + "C");
                return sum;
            } catch (Exception e) {
                System.out.println("Number input error. Next time, please try to enter a number. Example: 23 or 23.55");
                return 0;
            }
        }
        return 0;
    }

    public double convertFtoK(String str, Scanner in) {
        if (str.equalsIgnoreCase("f k")) {
            System.out.println("Enter temperature(F)");
            str = in.nextLine();
            try {
                double sum = ((Double.parseDouble(str) - 32) * 5 / 9 + 273.15D);
                System.out.println(str + "F = " + sum + "K");
                return sum;
            } catch (Exception e) {
                System.out.println("Number input error. Next time, please try to enter a number. Example: 23 or 23.55");
                return 0;
            }
        }
        return 0;
    }

    public double convertKtoC(String str, Scanner in) {
        if (str.equalsIgnoreCase("k c")) {
            System.out.println("Enter temperature(K)");
            str = in.nextLine();
            try {
                double sum = (Double.parseDouble(str) - 273.15D);
                System.out.println(str + "K = " + sum + "C");
                return sum;
            } catch (Exception e) {
                System.out.println("Number input error. Next time, please try to enter a number. Example: 23 or 23.55");
                return 0;
            }
        }
        return 0;
    }

    public double convertKtoF(String str, Scanner in) {
        if (str.equalsIgnoreCase("k f")) {
            System.out.println("Enter temperature(K)");
            str = in.nextLine();
            try {
                double sum = ((Double.parseDouble(str) - 273.15D) * 9 / 5 + 32);
                System.out.println(str + "K = " + sum + "F");
                return sum;
            } catch (Exception e) {
                System.out.println("Number input error. Next time, please try to enter a number. Example: 23 or 23.55");
                return 0;
            }
        }
        return 0;
    }

    public void choiceConverter(String str, Scanner in) {
        if (str.equalsIgnoreCase("c f")) {
            convertCtoF(str, in);
        } else if (str.equalsIgnoreCase("c k")) {
            convertCtoK(str, in);
        } else if (str.equalsIgnoreCase("f c")) {
            convertFtoC(str, in);
        } else if (str.equalsIgnoreCase("f k")) {
            convertFtoK(str, in);
        } else if (str.equalsIgnoreCase("k c")) {
            convertKtoC(str, in);
        } else if (str.equalsIgnoreCase("k f")) {
            convertKtoF(str, in);
        }
    }

    public static void main(String[] args) {

        Main main = new Main();

        System.out.println("========================");
        System.out.println("Original unit of measurement then a space and desired unit of measurement.");
        System.out.println("To exit, enter \"-exit\"");
        System.out.println("Example: c f or F K");
        System.out.println("C - Degree Celsius, F - Degree Fahrenheit, K - Degree Kelvin.");

        boolean flag = true;
        Scanner in = new Scanner(System.in);
        String str;

        while (flag) {
            System.out.println("========================");
            System.out.println("Enter units(C,F,K):");
            str = in.nextLine();
            main.choiceConverter(str, in);
            if (str.equalsIgnoreCase("-exit")) {
                flag = false;
            }
        }
    }

}
