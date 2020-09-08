import animales.enGallinero.Gallina;
import animales.enGallinero.Pavo;
import granja.Granja;

public class MainGranjero {
    public static void main(String[] args) {


        Gallina gallina=new Gallina("Roberta");

        Granja granja=new Granja();

        granja.gallinero.añadirAnimal(gallina);
        System.out.println(granja.gallinero.getNumeroDeGallinas());
        granja.gallinero.takeEggs();
        granja.matadero.sacrificar(granja.gallinero,gallina);
        granja.gallinero.takeEggs();
        granja.matadero.sacrificar(granja.gallinero,gallina);

        Pavo pavo=new Pavo("Paco");

        granja.gallinero.añadirAnimal(pavo);
        granja.gallinero.takeEggs();




    }
}
