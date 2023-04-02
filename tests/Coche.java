public class Coche {
    public int velocidad;

    //Alex Morcillo Caubera
    public void acelerar(int aceleracion) {
        velocidad += aceleracion;
    }

    //Alex Morcillo Caubera
    public void decelerar(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad < 0) velocidad = 0;
    }
}
