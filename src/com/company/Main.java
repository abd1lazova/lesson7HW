package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic(60, 30);
        Magic magic = new Magic(80, 50);
        Warrior warrior = new Warrior(90, 10);

        Hero[] abd = {medic, magic, warrior};
        for (int i = 0; i < abd.length; i++) { // i=0<i=2
            System.out.println(abd[i].applySuperAbility());


        }
    }
}
