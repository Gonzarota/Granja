package animales.enEstablo;

import interfaces.iPastoreable;

public class Vaca extends Estabulable implements iPastoreable {

    private boolean enRedil;

    public Vaca(String nombre) {
        super(nombre, "Vaca");
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
        System.out.print("Estado vaca del redil: ");
        return enRedil;
    }

    public void setEnRedil(boolean enRedil) {
        this.enRedil = enRedil;
    }
}
