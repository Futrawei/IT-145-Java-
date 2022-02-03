/*
Author: Travis Barbur
Course: IT-145 - X3993
Date: 02/03/2022
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    // Instance variables (if needed)
    private static final ArrayList< Dog > dogList = new ArrayList<Dog>();
    private static final ArrayList< Monkey > monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {
        initializeDogList();
        initializeMonkeyList();

        // Controls the menu traversal
        boolean acceptingInput = true;
        Scanner input = new Scanner(System.in);

        do {
            displayMenu();
            String option = input.nextLine().trim().toLowerCase();

            switch(option) {
                case "1":
                    // Input a new dog
                    intakeNewDog(input);
                    break;

                case "2":
                    // Input a new monkey
                    intakeNewMonkey(input);
                    break;

                case "3":
                    // Reserve an animal
                    reserveAnimal(input);
                    break;

                case "4":
                    // Print all the dogs
                    printAnimals("dog");
                    break;

                case "5":
                    // Print all the monkeys
                    printAnimals("monkey");
                    break;

                case "6":
                    // Print all non-reserved animals
                    printAnimals("available");
                    break;

                case "q":
                    // Quit
                    acceptingInput = false;
                    break;

                default:
                    System.out.println("Invalid option, please input a valid option");
                    break;
            }
        } while(acceptingInput);

        System.out.println("Goodbye");
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println(" *=======================* ");
        System.out.println(" Rescue Animal System Menu ");
        System.out.println(" *=======================* ");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Add dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Fruit Pie", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Tamale", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Jangles", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Add monkeys to a list for testing (optional)
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Richard","Capuchin","1", "1", "30", "male","1","25.6","05-21-2021", "United States", "intake", false, "United States");
        Monkey monkey2 = new Monkey("Rojo", "Macaque", "2", "3", "48", "female","3","35.2","02-29-2002", "United States", "Phase I", false, "United States");
        Monkey monkey3 = new Monkey("Maria", "Tamarin", "3", "4", "25", "female","4","25.6","12-21-2012", "Canada", "in service", false, "Canada");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }

    // Complete the intakeNewDog method
    // The input validation to check that the dog is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine().trim();
        for(Dog dog : dogList)
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return;
            }

        // Prints dog output to user, and accepts an input from user
        System.out.println("What is " + name + "'s breed? (\"German Shepherd\", \"Great Dane\", \"Chihuahua\")");
        String breed = scanner.nextLine().trim();

        System.out.println("What is " + name + "'s gender? (\"male\", \"female\")");
        String gender = scanner.nextLine().trim().toLowerCase();

        System.out.println("What is " + name + "'s age?");
        String age = scanner.nextLine().trim();

        System.out.println("What is " + name + "'s weight? (in pounds)");
        String weight = scanner.nextLine().trim();

        System.out.println("When was " + name + "'s acquired? (MM-DD-YYYY)");
        String acquisitionDate = scanner.nextLine().trim();

        System.out.println("Where was " + name + "'s acquired? (Country)");
        String acquisitionCountry = scanner.nextLine().trim();

        System.out.println("What is " + name + "'s training status? (\"intake\", \"in service\", \"Phase I/II/III\")");
        String trainingStatus = scanner.nextLine().trim();

        System.out.println("Is " + name + " reserved? (Y/N)");
        boolean reserved = scanner.nextLine().trim().equalsIgnoreCase("Y");

        System.out.println("What is " + name + "'s service country?");
        String inServiceCountry = scanner.nextLine().trim();

        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);

        dogList.add(newDog);
    }

    // Added new monkey to monkey list.
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine().trim();

        for(Monkey monkey : monkeyList)
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return;
            }

        // Code to instantiate a new monkey
        boolean invalidBreed = true;

        // Validate the monkey's breed
        String breed;
        do {
            System.out.println("What is " + name + "'s Species? (Capuchin, Guenon, Macaque, Marmoset, Squirrel Monkey, Tamarin)");
            breed = scanner.nextLine().trim();

            for(String validBreed : Monkey.validation)
                if (breed.equalsIgnoreCase(validBreed)) {
                    invalidBreed = false;
                    break;
                }

            if(invalidBreed)
                System.out.println("Species option Invalid");
        } while(invalidBreed);

        // Prints monkey output to user, and accepts an input from user
        System.out.println("What is " + name + "'s gender? (\"male\", \"female\")");
        String gender = scanner.nextLine().trim().toLowerCase();

        System.out.println("What is " + name + "'s age?");
        String age = scanner.nextLine().trim();

        System.out.println("What is " + name + "'s weight? (in pounds)");
        String weight = scanner.nextLine().trim();

        System.out.println("What is " + name + "'s Height? (in inches)");
        String Height = scanner.nextLine().trim();

        System.out.println("What is " + name + "'s TailLength? (in inches)");
        String TailLength = scanner.nextLine().trim();

        System.out.println("What is " + name + "'s weight? (in inches)");
        String BodyLength = scanner.nextLine().trim();

        System.out.println("When was " + name + "'s acquired? (MM-DD-YYYY)");
        String acquisitionDate = scanner.nextLine().trim();

        System.out.println("Where was " + name + "'s acquired? (Country)");
        String acquisitionCountry = scanner.nextLine().trim();

        System.out.println("What is " + name + "'s training status? (\"intake\", \"in service\", \"Phase I/II/III\")");
        String trainingStatus = scanner.nextLine().trim();

        System.out.println("Is " + name + " reserved? (Y/N)");
        boolean reserved = scanner.nextLine().trim().equalsIgnoreCase("Y");

        System.out.println("What is " + name + "'s service country?");
        String inServiceCountry = scanner.nextLine().trim();

        Monkey newMonkey = new Monkey(name, breed, gender, age, weight, Height, TailLength, BodyLength, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);

        monkeyList.add(newMonkey);
    }

    // Reserves an animal (by type and country)
    // reserveAnimal(scanner:Scanner) -> void
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("What type of animal will be needed? (\"dog\", \"monkey\")");
        String animalType = scanner.nextLine().trim();

        System.out.println("Where will the animal be serving? (Country)");
        String animalServiceCountry = scanner.nextLine().trim();

        // Go through all dogs
        // Reserves the first non-reserved, in-service dog in the country
        if(animalType.equalsIgnoreCase("dog"))
            // && dog.getTrainingStatus().equalsIgnoreCase("in service")
            for(Dog dog : dogList)
                if(dog.getInServiceLocation().equalsIgnoreCase(animalServiceCountry)
                        && !dog.getReserved()
                ) {
                    dog.setReserved(true);

                    System.out.println(dog.getName() + " has been reserved");
                    return;
                }

        // Go through all monkeys
        // Reserves the first non-reserved, in-service monkey in the country
        if(animalType.equalsIgnoreCase("monkey"))
            // && monkey.getTrainingStatus().equalsIgnoreCase("in service")
            for(Monkey monkey : monkeyList)
                if(monkey.getInServiceLocation().equalsIgnoreCase(animalServiceCountry)
                        && !monkey.getReserved()
                ) {
                    monkey.setReserved(true);

                    System.out.println(monkey.getName() + " has been reserved");
                    return;
                }

        System.out.println("Unable to reserve a " + animalType + " from " + animalServiceCountry + " at this time");
    }

    // Prints a list of animals depending upon the `outputType`
    // printAnimals(outputType:String) -> void
    public static void printAnimals(String outputType) {
        // Print the animal's name, status, acquisition country
        // and reserve status
        System.out.printf("%-3.15s\t| %-2.15s\t| %-1.15s\t| %s%n%n", "Name", "Status", "Acq. Country", "Reserved");

        switch(outputType) {
            case "dog":
                for(Dog dog : dogList) {
                    String name = dog.getName();
                    String status = dog.getTrainingStatus();
                    String acquisitionCountry = dog.getAcquisitionLocation();
                    boolean reserved = dog.getReserved();

                    System.out.printf("%-3.15s\t| %-1.15s\t| %-1.15s\t| %s%n", name, status, acquisitionCountry, reserved);
                }
                break;

            case "monkey":
                for(Monkey monkey : monkeyList) {
                    String name = monkey.getName();
                    String status = monkey.getTrainingStatus();
                    String acquisitionCountry = monkey.getAcquisitionLocation();
                    boolean reserved = monkey.getReserved();

                    System.out.printf("%-3.15s\t| %-1.15s\t| %-1.15s\t| %s%n", name, status, acquisitionCountry, reserved);
                }
                break;

            case "available":
                // Prints all non-reserved dogs
                for(Dog dog : dogList) {
                    String name = dog.getName();
                    String status = dog.getTrainingStatus();
                    String acquisitionCountry = dog.getAcquisitionLocation();
                    boolean reserved = dog.getReserved();

                    boolean available = !reserved && status.equalsIgnoreCase("in service");
                    if(!available)
                        continue;

                    System.out.printf("%-3.15s\t| %-1.15s\t| %-1.15s\t| %s%n", name, status, acquisitionCountry, false);
                }

                // Prints all non-reserved monkeys
                for(Monkey monkey : monkeyList) {
                    String name = monkey.getName();
                    String status = monkey.getTrainingStatus();
                    String acquisitionCountry = monkey.getAcquisitionLocation();
                    boolean reserved = monkey.getReserved();

                    boolean available = !reserved && status.equalsIgnoreCase("in service");
                    if(!available)
                        continue;

                    System.out.printf("%-3.15s\t| %-1.15s\t| %-1.15s\t| %s%n", name, status, acquisitionCountry, false);
                }
                break;

            // There shouldn't be any outlying values...
        }
    }
}
