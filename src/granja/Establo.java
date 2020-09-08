package granja;

import animales.enEstablo.Buey;
import animales.enEstablo.Caballo;
import animales.enEstablo.Estabulable;
import animales.enEstablo.Vaca;

import java.util.ArrayList;
import java.util.List;

public class Establo {

    private static final int NUMERO_DE_MAMIFEROS=5;
    private List<Estabulable> animalesEstablo=new ArrayList<>();


    public void añadirAnimal(Estabulable animal){
        if (animalesEstablo.size()>=NUMERO_DE_MAMIFEROS){
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

    public int getNumeroDeVacas(){
        int numeroVacas=0;
        for (Estabulable estabulable:animalesEstablo) {
            if(estabulable instanceof Vaca){
                numeroVacas++;
            }
        }
        return numeroVacas;
    }

    public int getNumeroDeBueyes(){
        int numeroBueyes=0;
        for (Estabulable estabulable:animalesEstablo) {
            if(estabulable instanceof Buey){
                numeroBueyes++;
            }
        }
        return numeroBueyes;
    }

    public int getNumeroDeCaballos(){
        int numeroCaballos=0;
        for (Estabulable estabulable:animalesEstablo) {
            if(estabulable instanceof Caballo){
                numeroCaballos++;
            }
        }
        return numeroCaballos;
    }
}


