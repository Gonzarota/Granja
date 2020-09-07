package granja;

import animales.enGallinero.Ave;
import animales.enGallinero.Gallina;

import java.util.ArrayList;
import java.util.List;

public class Gallinero {
    public List<Ave> animalesGallinero=new ArrayList<>();

    public void añadirAnimal(Ave animal){
        animalesGallinero.add(animal);
    }

    public void removeAnimal(Ave animal){
        if(animalesGallinero.size()==0){
            System.out.println("No hay animales");
        }else{
            animalesGallinero.remove(animal);
        }
    }

    public void takeEggs(){
        for (int i = 0; i < animalesGallinero.size(); i++) {
            if(animalesGallinero.get(i) instanceof Gallina){
                System.out.println("Tienes gallinas, tienes huevos");
                break;
            }
            System.out.println("No tienes gallinas");
        }
    }
}
