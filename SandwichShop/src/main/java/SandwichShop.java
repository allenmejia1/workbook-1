import java.util.Scanner;

class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for sandwich size
        System.out.println("Enter the size of the sandwich (1 or 2):");
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large ($8.95)");
        int sizeChoice = scanner.nextInt();

        double basePrice = 0;
        if (sizeChoice == 1) {
            basePrice = 5.45;
        } else if (sizeChoice == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Enter the size of the sandwich (1or 2?).");
            basePrice = 5.45;
        }

        // Prompt for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        double discount = 0;
        if (age <= 17) {
            discount = 0.10; // 10% discount for students
        } else if (age >= 65) {
            discount = 0.20; // 20% discount for seniors
        }

        // Calculate the cost
        double discountedPrice = basePrice * (1 - discount);

        // Display the cost
        System.out.printf("The cost of the sandwich is: $%.2f%n", discountedPrice);

        scanner.close();
    }
}
