import model.Carro;
import service.CarroService;

public class Main {
    /**
     * Um carro tem os seguintes atributos:
     * - cor
     * - marca
     * - ano
     * - ligado
     * - velocidadeAtual
     *
     * Enquanto o carro estiver desligado deve ser capaz de:
     * - Ligar
     * - Motrar estado atual
     *
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Desligar
     * - Acelerar
     * - Frear
     * - Motrar estado atual
     *
     * Regras:
     * - O carro não pode passar de sua velocidade máxima
     * - Só podemos realizar as ações com o carro ligado
     * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
     * - Não existe velocidade negativa
     *
     */


    /**

     Cenário 1:
     Given: Carro ligado

     When: Ligar o carro

     Then: Informar que o carro está ligado

     ---------

     Cenário 2:
     Dado: Carro ligado

     Quando: Frear o carro

     Então: Ligado e Velocidade = 0

     -------------------

     Cenário 3:
     Dado: Carro Ligado e na velocidade máxima

     Quando: Acelerar

     Então: Manter a velocidade

     ----------------------

     Cenário 4:
     Dado: Carro Ligado e na velocidade != 0

     Quando: Desligar

     Então: Carro continua liga e mostra um erro

     -----------------------

     Cenário 4:
     Dado: Carro Ligado e na velocidade != 0

     Quando: Desligar

     Então: Carro continua liga e mostra um erro

     */

    public static void main(String[] args) {
        /**
         * Cenário 01:
         *
         * Dado: Um carro
         *
         * Quando:
         * Ligar o carro
         * Acelerar o carro
         *
         * Então:
         * Velocidade atual = 10
         */

        // Dado: Um carro
//        CarroService carroService1 = new CarroService();
//        Carro carro1 = new Carro();
//
//        // Quando: Ligar o carro e Acelerar o carro
//        carroService1.ligar(carro1);
//        carroService1.acelerar(carro1);
//
//        // Então
//        System.out.println(carro1.getVelocidadeAtual() == 10);
//
//
//        // -------------------------
//        // Cenário 02
//        // Dado: Um carro
//        // Quando: Acelerar o carro
//        // Então: a velocidade = 0
//
//        CarroService carroService2 = new CarroService();
//        Carro carro2 = new Carro();
//
//        carroService2.acelerar(carro2);
//
//        System.out.println(carro2.getVelocidadeAtual() == 0);
//
//        // Junit 4

    }
}
