public class Coche {
    public int velocidad;

    //Alex Morcillo Caubera
    public void acelerar_Alex_Morcillo_Caubera(int aceleracion) {
        velocidad += aceleracion;
    }

    //Alex Morcillo Caubera
    public void decelerar_Alex_Morcillo_Caubera(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad < 0) velocidad = 0;
    }
}
