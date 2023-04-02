import org.junit.Test;
import org.junit.jupiter.api.Assertions;
//Alex Morcillo Caubera
public class TestCoche {
    //Alex Morcillo Caubera
    @Test
    public void test_al_crear_un_coche_su_velocidad_es_cero_Alex_Morcillo_Caubera() {
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
    //Alex Morcillo Caubera
    @Test
    public void test_al_acelerar_un_coche_su_velocidad_aumenta_Alex_Morcillo_Caubera() {
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar_Alex_Morcillo_Caubera(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
    //Alex Morcillo Caubera
    public void test_al_decelerar_un_coche_su_velocidad_disminuye_Alex_Morcillo_Caubera() {
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar_Alex_Morcillo_Caubera(20);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
    //Alex Morcillo Caubera
    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero_Alex_Morcillo_Caubera() {
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar_Alex_Morcillo_Caubera(80);
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
}
