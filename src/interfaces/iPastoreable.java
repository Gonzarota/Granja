package interfaces;

import animales.Animal;

public interface iPastoreable{

    String getNombre();
    String getTipo();


    public void pastorear();

    public boolean isEnRedil();
    public void setEnRedil(boolean enRedil);
}
