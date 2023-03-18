package service;

import model.Carro;
import org.junit.*;
import org.junit.runners.MethodSorters;

// test -> service -> CarroService
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CarroServiceTest {

    // Cada teste será em um método

    CarroService carroService;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");

        // Subi o banco
    }

    @Before
    public void before() {
        // Executa antes de CADA teste
        carroService = new CarroService();
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
        // apago os registros
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
        // Fechar
    }

    @Test
    public void deveAcelerarCorretamenteUmCarroLigado() {
        System.out.println("deveAcelerarCorretamenteUmCarroLigado");
        // Given:
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
        System.out.println("deveLigarCorretamente");
        // Given
        Carro carro = new Carro();

        // When
        carroService.ligar(carro);

        // Then
        Assert.assertTrue(carro.getLigado());
    }

    @Test
    public void dadoUmCarroLigadoQuandoFrearAVelocidadeDeveSerZero() {
        System.out.println("dadoUmCarroLigadoQuandoFrearAVelocidadeDeveSerZero");
        Carro carro = new Carro();
        carroService.ligar(carro);

        carroService.frear(carro, 100);

        Assert.assertEquals((Integer) 0, carro.getVelocidadeAtual());
    }

    @Test
    public void naoDeveUltrapassaAVelocidadeMaxima() {
        System.out.println("naoDeveUltrapassaAVelocidadeMaxima");
        // Dado: um carro na velocidade max
        Carro carro = new Carro(50);
        carroService.ligar(carro);
        carroService.acelerar(carro, 40);

        // Quando:
        carroService.acelerar(carro, 20);

        // Então:
        System.out.println(carro.getVelocidadeAtual());
        Assert.assertEquals((Integer) 50, carro.getVelocidadeAtual());
    }
}
