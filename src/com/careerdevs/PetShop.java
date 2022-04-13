package com.careerdevs;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private String petShopName;
    private List<Pet> notYetAdopted;
    private List<Pet> adoptedPets;

    public PetShop(String petShopName) {
        this.petShopName = petShopName;
        this.notYetAdopted = new ArrayList<>();
        this.adoptedPets = new ArrayList<>();
    }

    public String getPetShopName() {
        return petShopName;
    }

    public void setPetShopName(String petShopName) {
        this.petShopName = petShopName;
    }

    public List<Pet> getNotYetAdopted() {
        return notYetAdopted;
    }

    public void setNotYetAdopted(List<Pet> notYetAdopted) {
        this.notYetAdopted = notYetAdopted;
    }

    public List<Pet> getAdoptedPets() {
        return adoptedPets;
    }

    public void setAdoptedPets(List<Pet> adoptedPets) {
        this.adoptedPets = adoptedPets;
    }

    public PetShop(String petShopName, List<Pet> notYetAdopted, List<Pet> adoptedPets) {


    }

//    @Override
//    public String toString() {
//        return "PetShop" +
//                "petShopName='" + petShopName + '\'' +
//                ", notYetAdopted=" + notYetAdopted +
//                ", adoptedPets=" + adoptedPets +"";
  //  }

    public boolean buyPet(String yourPetName) {
        if (notYetAdopted.size() == 0) {
            System.out.println("All our Tiny pets have been adopted");
            return true;

        }
        for (int i = 0; i < notYetAdopted.size(); i++) {
            if (yourPetName.equals(notYetAdopted.get(i).getPetName())) {
                System.out.println("Congratulation You Adopted " + notYetAdopted.get(i) + "\n");

                adoptedPets.add(notYetAdopted.get(i));
                notYetAdopted.remove(notYetAdopted.get(i));
                return true;
            }
        }

        System.out.println("Invalid input");
        return false;
    }

    public void returnPet(String yourPetName) {
        if (adoptedPets.size() == 0) {
            System.out.println("We are out of Pets");
            return;

        }

        for (int i = 0; i < adoptedPets.size(); i++) {
            if (yourPetName.equals(adoptedPets.get(i).getPetName())) {
                System.out.println("Thank you giving us A try and returning" + adoptedPets.get(i));
                notYetAdopted.add(adoptedPets.get(i));
                adoptedPets.remove(adoptedPets.get(i));
                return;
            }
        }
    }


}