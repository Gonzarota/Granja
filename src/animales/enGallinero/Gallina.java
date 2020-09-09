package animales.enGallinero;


import interfaces.iPastoreable;

public class Gallina extends Ave implements iPastoreable {



    private boolean enRedil=false;

    public Gallina(String nombre) {
        super(nombre, "Gallina");
        enRedil=false;
    }


    @Override
    public void pastorear() {

        if(enRedil){
            System.out.println("Soy tipo "+ getTipo()+", me llamo "+ getNombre() +" y estoy pastoreando");
        }else{
            System.out.println("No puedo pastar, no estoy en el redil");
        }


    }

    public boolean isEnRedil() {
        System.out.print("Estado gallina del redil: ");
        return enRedil;
    }

    public void setEnRedil(boolean enRedil) {
        this.enRedil = enRedil;
    }
}
