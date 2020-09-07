package granja;

import animales.enGallinero.Ave;

public class Matadero {


    public static void sacrificar(Gallinero gallinero, Ave animal){
        gallinero.removeAnimal(animal);
        System.out.println("Vas a sacrificar a "+animal.getNombre());
    }
}
