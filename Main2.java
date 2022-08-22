public class Main2 {
    public static void main(String[] args) {
        // Criando objetos da classe carro
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        // Preenchendo as informações de cada carro
        c1.modelo = "Civic";
        c1.marca = "Honda";
        c1.cor = "Cinza";
        c1.velocidadeAtual = 0;
        c1.velocidadeMax = 220.42f;
        c1.motor.potencia = 220;
        c1.motor.tipo = "Flex 1.6";

        c2.modelo = "Fusca";
        c2.marca = "Volkswagen";
        c2.cor = "Azul";
        c2.velocidadeAtual = 0;
        c2.velocidadeMax = 340.14f;
        c2.motor.potencia = 220;
        c2.motor.tipo = "Flex 1.6";

        // Testando os metodos de cada objeto
        c1.acelera();
        c1.mostraInfos();

        c2.acelera();
        c2.mostraInfos();
    }
}
