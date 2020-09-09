package granja;

import animales.enGallinero.Ave;
import animales.enGallinero.Gallina;
import animales.enGallinero.Pavo;

import java.util.ArrayList;
import java.util.List;

public class Gallinero {

    private List<Ave> animalesGallinero=new ArrayList<>();

    public void añadirAnimal(Ave animal){
        animalesGallinero.add(animal);
        mostrarMensajeAñadir(animal);
    }

    public void removeAnimal(Ave animal){
        if(animalesGallinero.size()==0){
            System.out.println("No hay animales");
        }else{
            animalesGallinero.remove(animal);
            mostrarMensajeSacar(animal);
        }
    }

    public void mostrarMensajeAñadir(Ave ave){
        System.out.println("Has añadido al gallinero: "+ ave.getTipo()+" "+ ave.getNombre());
    }

    public void mostrarMensajeSacar(Ave ave){
        System.out.println("Has sacado del gallinero: "+ ave.getTipo()+" "+ ave.getNombre());
    }

    public void takeEggs(){
        if(getNumeroDeGallinas()==0){
            System.out.println("No tienes gallinas");
        }else{
            System.out.println("Tienes gallinas, tienes huevos");
        }
    }

    public int getNumeroDeGallinas(){
        int numeroGallinas=0;
        for (Ave ave:animalesGallinero) {
            if(ave instanceof Gallina){
                numeroGallinas++;
            }
        }
        System.out.println("nº de gallinas en gallinero: ");
        return  numeroGallinas;
    }

    public int getNumeroDePavos(){
        int numeroPavos=0;
        for (Ave ave:animalesGallinero) {
            if(ave instanceof Pavo){
                numeroPavos++;
            }
        }
        return numeroPavos;
    }

    public List<Ave> getAnimalesGallinero() {
        return animalesGallinero;
    }
}
