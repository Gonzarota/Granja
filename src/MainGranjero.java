import animales.enEstablo.Vaca;
import animales.enGallinero.Gallina;
import animales.enGallinero.Pavo;
import granja.Granja;

public class MainGranjero {
    public static void main(String[] args) {


        Gallina gallina=new Gallina("Roberta");
        Vaca vaca=new Vaca("Paca");

        Granja granja=new Granja();
/*
        granja.gallinero.añadirAnimal(gallina);
        System.out.println(granja.gallinero.getNumeroDeGallinas());
        granja.gallinero.takeEggs();
        granja.matadero.sacrificar(granja.gallinero,gallina);
        granja.gallinero.takeEggs();
        granja.matadero.sacrificar(granja.gallinero,gallina);

        Pavo pavo=new Pavo("Paco");

        granja.gallinero.añadirAnimal(pavo);
        granja.gallinero.takeEggs();*/

        granja.gallinero.añadirAnimal(gallina);
        granja.establo.añadirAnimal(vaca);
        System.out.println(gallina.isEnRedil());
        System.out.println(vaca.isEnRedil());
        System.out.println(granja.gallinero.getNumeroDeGallinas());
        System.out.println();

        granja.trasladoPastoreoGallina(gallina);
        granja.trasladoPastoreoVaca(vaca);

        System.out.println();
        System.out.println(gallina.isEnRedil());
        System.out.println(vaca.isEnRedil());
        System.out.println(granja.gallinero.getNumeroDeGallinas());
        System.out.println();

        granja.redil.pastorearAnimales();
        System.out.println();


        granja.vueltaDelPastoreoGallina();
        System.out.println(gallina.isEnRedil());
        System.out.println(vaca.isEnRedil());
        System.out.println(granja.gallinero.getNumeroDeGallinas());
        granja.redil.pastorearAnimales();




    }
}
