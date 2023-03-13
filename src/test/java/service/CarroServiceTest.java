package service;

import model.Carro;
import org.junit.Assert;
import org.junit.Test;

// test -> service -> CarroService
public class CarroServiceTest {

    // Cada teste será em um método

    @Test
    public void deveAcelerarCorretamenteUmCarroLigado() {
        // Given:
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);

        // When:
        carroService.acelerar(carro, 10);

        // Sempre que um método de teste NÃO possuir um assert ele vai passar
        // Then - Asserts

        Integer velocidadeEsperada = 10;
        Assert.assertEquals(velocidadeEsperada, carro.getVelocidadeAtual());
    }

    @Test
    public void deveLigarCorretamente() {
        // Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();

        // When
        carroService.ligar(carro);

        // Then
        Assert.assertTrue(carro.getLigado());
    }
}
