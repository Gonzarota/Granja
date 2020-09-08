package granja;

import animales.enGallinero.Ave;

public class Matadero {


    public void sacrificar(Gallinero gallinero, Ave animal){
        if(gallinero.getAnimalesGallinero().size()==0 && gallinero!=null){
            System.out.println("No hay animales en el gallinero");
        }else {
            gallinero.removeAnimal(animal);
            System.out.println("Vas a sacrificar a " + animal.getNombre());
        }
    }
}
