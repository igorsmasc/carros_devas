package service;

import model.Carro;
import org.junit.Assert;
import org.junit.Test;

public class AssertivasTest {

    // Assert.assertEquals();

    @Test
    public void assertEquals_exemplo() {
        Carro carro = new Carro("Fiat");
        Carro carro2 = new Carro("Fiat");

        Assert.assertEquals(carro, carro2); // equals()
    }

    @Test
    public void assertNotEquals_exemplo() {
        Carro carro = new Carro("Gol");
        Carro carro2 = new Carro("Fiat");

        Assert.assertNotEquals(carro, carro2);
    }

    @Test
    public void assertTrue_exemplo() {
        CarroService carroService = new CarroService();
        Carro carro = new Carro();

        carroService.ligar(carro);

        Assert.assertTrue(carro.getLigado());
    }

    @Test
    public void assertFalse_exemplo() {
        Carro carro = new Carro();

        Assert.assertFalse(carro.getLigado());
    }

    @Test
    public void assertNull_exemplo() {
        Carro carro = null;

        Assert.assertNull(carro);
    }

    @Test
    public void assertNotNull_exemplo() {
        Carro carro = new Carro();

        Assert.assertNotNull(carro);
    }

    @Test
    public void assertSame_exemplo() {
        Carro carro = new Carro("Fiat"); // obj1
        Carro carro2 = carro; // obj2

        Assert.assertSame(carro, carro2);
    }

    @Test
    public void assertNotSame_exemplo() {
        Carro carro = new Carro("Fiat"); // obj1
        Carro carro2 = new Carro("Fiat"); // obj2

        Assert.assertNotSame(carro, carro2);
    }
}
