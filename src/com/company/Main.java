package com.company;

public class Main {

    public static void main(String[] args) {

        cow myNewCow = new cow("Dolly",5,"Fluffy","Yesterday");
        Animal myNewAnimal = new Animal("Smarty", 3, "Spotty");

        sheep myNewSheep = new sheep("Dolly#2", 2, "White", "Never");

        System.out.println(myNewCow.toString());
        System.out.println(myNewSheep.toString());

    }
}
