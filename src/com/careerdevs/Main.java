package com.careerdevs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pet Pet1 = new Pet("Max", "hamster", (short) 5, 20.50d);
        Pet Pet2 = new Pet("Georgina", "rabbit", (short) 2, 15.50d);
        Pet Pet3 = new Pet("Andy", "hamster", (short) 5, 20.50d);
        Pet Pet4 = new Pet("Oreo", "kitten", (short) 2, 50.00d);

        //System.out.println(Pet1);
        PetShop PetShopName1 = new PetShop("Tiny Pets");
        PetShopName1.getNotYetAdopted().add(Pet1);
        PetShopName1.getNotYetAdopted().add(Pet2);
        PetShopName1.getNotYetAdopted().add(Pet3);
        PetShopName1.getNotYetAdopted().add(Pet4);


        while (true) {

            System.out.println("Welcome To" + " " + PetShopName1.getPetShopName());
            System.out.println("Would you like to ....");
            System.out.println(" 1) Adopted A Tiny Pet");
            System.out.println(" 2) Return a Tiny Pet");
            System.out.println(" 3)Leave The Pet shop");
            System.out.println("Selection:");
            int res = 0;

            try {
                res = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception ex) {
                System.out.println("Invalid Input!");
            }


            if (res == 3) {
                System.out.println("You are now leaving The Tiny Pet Shop...");
                break;
            } else if (res == 2) {
                while (true) {
                    System.out.println("Which pet would you like to return? Please input the Pets Name");

                    for (int i = 0; i < PetShopName1.getAdoptedPets().size(); i++) {
                        System.out.println(PetShopName1.getAdoptedPets().get(i));
                    }
                    String userInput = scanner.nextLine();
                    boolean isValidInput = PetShopName1.buyPet(userInput);
                    System.out.println(PetShopName1.getNotYetAdopted());
                    System.out.println(PetShopName1.getAdoptedPets());
                    if (isValidInput) {
                        break;
                    }
                }
            } else if (res == 1) {
                while (true) {
                    System.out.println("Which Pet would you like to Adopted ? Please input the Pet giving Name. ");

                    for (int i = 0; i < PetShopName1.getNotYetAdopted().size(); i++) {
                        System.out.println(PetShopName1.getNotYetAdopted().get(i));
                    }
                    String userInput = scanner.nextLine();
                    boolean isValidInput = PetShopName1.buyPet(userInput);
                    System.out.println(PetShopName1.getNotYetAdopted());
                    System.out.println(PetShopName1.getAdoptedPets());
                    if (isValidInput) {
                        break;
                    }

                }

            } else {
                System.out.println("Enter 1.2 or 3 Please");
                ;
            }


            String userInput = scanner.nextLine();
            boolean isValidInput = PetShopName1.buyPet(userInput);
            System.out.println(PetShopName1.getNotYetAdopted());
            System.out.println(PetShopName1.getAdoptedPets());


        }

    }
}
    //  for (int i = 0; i < PetShopName1.getNotYetAdopted().size(); i++);{
      //      System.out.println(PetShopName1.getNotYetAdopted().get());
      //  }

 //   }
//}
/*
companyStoreName ="Tiny Pets"
        petType= ["hamsters","kittens", "rabbits"]
        petInventory = ["Timothy hay", "Kitten Food", "greensmixed"]
        pricePerPet = [10, 50, 20]
        */