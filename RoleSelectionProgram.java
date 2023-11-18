
import java.util.Scanner;

public class RoleSelectionProgram {
                    public static void main(String[] args) {
                                        Scanner scanner = new Scanner(System.in);
                                        int choice;

                                        do {
                                                            displayRoleMenu();
                                                            choice = scanner.nextInt();
                                                            switch (choice) {
                                                                                case 1:
                                                                                                    handleRealEstateOwner("John Doe", "123 Main St");
                                                                                                    break;
                                                                                case 2:
                                                                                                    handleRenter("Alice", 2);
                                                                                                    break;
                                                                                case 3:
                                                                                                    handleManagementCompanyRep("Rent-Me Inc.",
                                                                                                                                            50);
                                                                                                    break;
                                                                                case 4:
                                                                                                    System.out.println("Goodbye!");
                                                                                                    break;
                                                                                default:
                                                                                                    System.out.println("Invalid choice. Please select a valid role (1-4).");
                                                            }
                                        } while (choice != 4);
                    }

                    public static void displayRoleMenu() {
                                        System.out.println("Select a role:");
                                        System.out.println("1. Real-estate Owner");
                                        System.out.println("2. Renter");
                                        System.out.println("3. Rent-Me Management Company Representative");
                                        System.out.println("4. Quit");
                                        System.out.print("Enter your choice (1-4): ");
                    }

                    public static void handleRealEstateOwner(String ownerName, String propertyAddress) {
                                        System.out.println("Welcome, Real-estate Owner: " + ownerName);
                                        System.out.println("Property Address: " + propertyAddress);
                                        // Implement owner-specific actions here
                    }

                    public static void handleRenter(String renterName, int maxBudget) {
                                        System.out.println("Welcome, Renter: " + renterName);
                                        System.out.println("Maximum Budget: $" + maxBudget);
                                        // Implement renter-specific actions here
                    }

                    public static void handleManagementCompanyRep(String companyName, int availableUnits) {
                                        System.out.println("Welcome, Rent-Me Management Company Representative: "
                                                                                + companyName);
                                        System.out.println("Available Units: " + availableUnits);
                                        // Implement management company-specific actions here
                    }
}
