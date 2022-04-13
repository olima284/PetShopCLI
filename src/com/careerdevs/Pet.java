package com.careerdevs;

public class Pet {
    private String petName;
    private String petType;
    private  short petAge;
    private double pricePerPet;


    public Pet(String petName, String petType, short petAge, double pricePerPet){

        this.petName = petName;
        this.petType = petType;
        this.petAge = petAge;
        this.pricePerPet = pricePerPet;


    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public short getPetAge() {
        return petAge;
    }

    public void setPetAge(short petAge) {
        this.petAge = petAge;
    }

    public double getPricePerPet() {


        return pricePerPet;
    }


    public void setPricePerPet(float pricePerPet) {
        this.pricePerPet = pricePerPet;
    }



    @Override
    public String toString () {
        return petName + " " + petType + " "+  petAge + " Will be " +
                pricePerPet ;

    }
}

/*

companyStoreName ="Tiny Pets"
petName= ["hamsters","kittens", "rabbits"]
petInventory = ["Timothy hay", "Kitten Food", "greens-mixed"]
pricePerPet = [10, 50, 20]
*/