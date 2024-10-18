package packagecom.collection;

import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Select the type of conversion:");
            System.out.println("1. Length");
            System.out.println("2. Weight");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertLength(scanner);
                    break;
                case 2:
                    convertWeight(scanner);
                    break;
                case 3:
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        System.out.println("Thank you for using the Unit Converter!");
        scanner.close();
    }

    private static void convertLength(Scanner scanner) {
        System.out.println("Select the conversion:");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.println("3. Inches to Feet");
        System.out.println("4. Feet to Inches");
        int choice = scanner.nextInt();

        System.out.print("Enter the value: ");
        double value = scanner.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = value / 1000;
                System.out.println(value + " meters = " + result + " kilometers");
                break;
            case 2:
                result = value * 1000;
                System.out.println(value + " kilometers = " + result + " meters");
                break;
            case 3:
                result = value / 12;
                System.out.println(value + " inches = " + result + " feet");
                break;
            case 4:
                result = value * 12;
                System.out.println(value + " feet = " + result + " inches");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private static void convertWeight(Scanner scanner) {
        System.out.println("Select the conversion:");
        System.out.println("1. Grams to Kilograms");
        System.out.println("2. Kilograms to Grams");
        System.out.println("3. Pounds to Ounces");
        System.out.println("4. Ounces to Pounds");
        int choice = scanner.nextInt();

        System.out.print("Enter the value: ");
        double value = scanner.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = value / 1000;
                System.out.println(value + " grams = " + result + " kilograms");
                break;
            case 2:
                result = value * 1000;
                System.out.println(value + " kilograms = " + result + " grams");
                break;
            case 3:
                result = value * 16;
                System.out.println(value + " pounds = " + result + " ounces");
                break;
            case 4:
                result = value / 16;
                System.out.println(value + " ounces = " + result + " pounds");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
}
