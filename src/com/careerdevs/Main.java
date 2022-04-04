package com.careerdevs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pet Pet1 = new Pet( "Max", "hamster", (short) 5,  20.50f);
        Pet Pet2 = new Pet( "Georgina", "rabbit", (short) 2,  15.50f);
        Pet Pet3 = new Pet( "Andy", "hamster", (short) 5,  20.50f);
        Pet Pet4 = new Pet( "Oreo", "kitten", (short) 2,  50.00f);

        //System.out.println(Pet1);
        PetShop PetShopName1 = new PetShop("Tiny Pets");
        PetShopName1.getNotYetAdopted().add(Pet1);
        PetShopName1.getNotYetAdopted().add(Pet2);
        PetShopName1.getNotYetAdopted().add(Pet3);
        PetShopName1.getNotYetAdopted().add(Pet4);

        System.out.println("Welcome To" + " "+ PetShopName1.getPetShopName() + "\n" );

      //  for (int i = 0; i < PetShopName1.getNotYetAdopted().size(); i++);{
      //      System.out.println(PetShopName1.getNotYetAdopted().get());
      //  }

    }
}
/*
companyStoreName ="Tiny Pets"
        petType= ["hamsters","kittens", "rabbits"]
        petInventory = ["Timothy hay", "Kitten Food", "greensmixed"]
        pricePerPet = [10, 50, 20]
        */