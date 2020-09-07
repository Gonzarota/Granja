package granja;

import animales.enEstablo.Estabulable;

import java.util.ArrayList;
import java.util.List;

public class Establo {

    public List<Estabulable> animalesEstablo=new ArrayList<>(5);


    public void añadirAnimal(Estabulable animal){
        if (animalesEstablo.size()<5){
            animalesEstablo.add(animal);
        }else{
            System.out.println("No caben más");
        }
    }

    public void removeAnimal(Estabulable animal){
        if(animalesEstablo.size()==0){
            System.out.println("No hay animales");
        }else{
            animalesEstablo.remove(animal);
        }
    }
}


