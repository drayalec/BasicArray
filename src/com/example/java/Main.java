package com.example.java;
// This program will create an array of strings and will print each string on a seperate line using a for loop
public class Main {

    public static void main(String[] args) {
	// Creating array
        String[] hot_dog_materials = {"Hotdogs", "Buns", "Ketchup", "Mayo", "Mustard"};

        for(int i=0; i <= hot_dog_materials.length; i++){
            System.out.println(hot_dog_materials[i]);
        }

    }
}
