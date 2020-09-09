package granja;

import animales.enEstablo.Vaca;
import animales.enGallinero.Gallina;
import interfaces.iPastoreable;

import java.util.ArrayList;
import java.util.List;

public class Redil {

    private List<iPastoreable> animalesRedil=new ArrayList<>();

    public iPastoreable sacarAnimal(){
        if(!this.animalesRedil.isEmpty())
            return this.animalesRedil.remove(0);

        return null;
    }

    public void addAnimal(iPastoreable animal){
        animalesRedil.add(animal);
        mostrarMensajeAñadir(animal);
        animal.setEnRedil(true);

    }

    public Gallina sacarGallina() {
        for(iPastoreable pastoreable : this.animalesRedil){
            if(pastoreable instanceof Gallina){
                mostrarMensajeSacar(pastoreable);
                pastoreable.setEnRedil(false);
                return (Gallina)this.animalesRedil.remove(this.animalesRedil.indexOf(pastoreable));
            }

        }


        return null;
    }

    public Vaca sacarVaca() {
        for(iPastoreable pastoreable : this.animalesRedil){
            if(pastoreable instanceof Vaca){
                mostrarMensajeSacar(pastoreable);
                pastoreable.setEnRedil(false);
                return (Vaca)this.animalesRedil.remove(this.animalesRedil.indexOf(pastoreable));
            }

        }

        return null;
    }

    public void mostrarMensajeAñadir(iPastoreable animal){
        System.out.println("Has añadido al redil: "+ animal.getTipo()+" "+ animal.getNombre());
    }

    public void mostrarMensajeSacar(iPastoreable animal){
        System.out.println("Has sacado del redil: "+ animal.getTipo()+" "+ animal.getNombre());
    }

    public void pastorearAnimales(){
        System.out.println("PASTOREANDO");
        for(iPastoreable animal:animalesRedil){
            animal.pastorear();
        }
    }


}
