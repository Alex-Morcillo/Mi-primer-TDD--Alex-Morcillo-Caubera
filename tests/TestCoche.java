import org.junit.Test;
import org.junit.jupiter.api.Assertions;
//Alex Morcillo Caubera
public class TestCoche {
    //Alex Morcillo Caubera
    @Test
    public void test_al_crear_un_coche_su_velocidad_es_cero() {
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
}
