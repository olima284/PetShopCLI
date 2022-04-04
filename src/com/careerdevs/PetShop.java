package com.careerdevs;

import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private String petShopName;
    private List<Pet> notYetAdopted;
    private  List<Pet>adoptedPets;

    public PetShop(String petShopName){
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
        this.petShopName = petShopName;
        this.notYetAdopted = notYetAdopted;
        this.adoptedPets = adoptedPets;
    }
}
