package com.careerdevs;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        Pet pet1 = new Pet("Max", "Hamster", (short) 5, 20.50d);
        Pet pet2 = new Pet("Georgina", "Rabbit", (short) 2, 15.50d);
        Pet pet3 = new Pet("Andy", "Hamster", (short) 5, 20.50d);
        Pet pet4 = new Pet("Oreo", "Kitten", (short) 2, 50.00d);

        //System.out.println(Pet1);
        PetShop PetShopName1 = new PetShop("Tiny Pets");
        PetShopName1.getNotYetAdopted().add(pet1);
        PetShopName1.getNotYetAdopted().add(pet2);
        PetShopName1.getNotYetAdopted().add(pet3);
        PetShopName1.getNotYetAdopted().add(pet4);




        while (true) {

            System.out.println("Welcome To" + " " + PetShopName1.getPetShopName());
            System.out.println("Would you like to ....");
            System.out.println(" 1) Adopted A Tiny Pet");
            System.out.println(" 2) Return A Tiny Pet");
            System.out.println(" 3)Leave The Pet shop");
            System.out.println("Enter 1 2 or 3 Selection:");

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
                    System.out.println("Tiny's Available"+PetShopName1.getNotYetAdopted());
                    System.out.println("Recently Adopted "+PetShopName1.getAdoptedPets());
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
        petInventory = ["Timothy hay", "Kitten Food", "Mummy Mixed Green"]
        pricePerPet = [10, 50, 20]
        */