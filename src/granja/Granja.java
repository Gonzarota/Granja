package granja;


import animales.enEstablo.Vaca;
import animales.enGallinero.Gallina;
import interfaces.iPastoreable;


public class Granja {

    public Gallinero gallinero= new Gallinero();
    public Establo establo= new Establo();
    public Matadero matadero= new Matadero();
    public Redil redil=new Redil();


    public void trasladoPastoreoGallina(Gallina gallina){

        gallinero.removeAnimal(gallina);

        mostrarMensajeTraslado(gallina);

        redil.addAnimal(gallina);

    }

    public void vueltaDelPastoreoGallina(){
        Gallina gallina=redil.sacarGallina();

        mostrarMensajeTraslado(gallina);

        gallinero.añadirAnimal(gallina);

    }

    public void trasladoPastoreoVaca(Vaca vaca){

        establo.removeAnimal(vaca);

        mostrarMensajeTraslado(vaca);

        redil.addAnimal(vaca);

    }

    public void vueltaDelPastoreoVaca(){
        Vaca vaca=redil.sacarVaca();

        mostrarMensajeTraslado(vaca);

        establo.añadirAnimal(vaca);
    }

    public void mostrarMensajeTraslado(iPastoreable animal){
        System.out.println("Tranqui " + animal.getNombre()+ " no te va a pasar nada");

    }





}
