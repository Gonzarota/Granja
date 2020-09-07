import animales.enGallinero.Gallina;
import granja.Granja;

public class MainGranjero {
    public static void main(String[] args) {


        Gallina gallina=new Gallina("Roberta");


        Granja granja=new Granja();
        granja.gallinero.añadirAnimal(gallina);
        granja.gallinero.takeEggs();
        granja.matadero.sacrificar(granja.gallinero,gallina);



    }
}
