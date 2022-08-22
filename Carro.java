public class Carro {
    String cor;                 // Cor do carro
    String marca;               // Marca do carro
    String modelo;              // Modelo do carro
    double velocidadeMax;       // Velocidade máxima que o carro pode atingir
    double velocidadeAtual;     // Velocidade atual que o carro está

    Motor motor = new Motor();  // Motor do carro


    boolean ligado = false;     // Informa se o carro está ligado ou não

    void ligar() {
        // Verifica se o carro ja está ligado ou nao
        if (ligado == false) {
            System.out.println("O carro esta ligado");
            ligado = true;
        } else {
            System.out.println("O carro esta desligado");
            ligado = false;
        }
    }

    // Acelera o carro
    void acelera() {
        velocidadeAtual += 10;  // Acréscimo de velocidade

        // Verifica se a velocidade ultrapassa o limite
        if (velocidadeAtual > velocidadeMax)
            velocidadeAtual = velocidadeMax;

        System.out.println("O carro esta acelerando");
        System.out.println("Velocidade atual: " + velocidadeAtual);
    }

    // Mostra as informações do carro
    void mostraInfos() {
        System.out.format("Modelo: %s\t\tMarca: %s\t\tCor: %s\n", modelo, marca, cor);
        System.out.format("Velocidade Atual: %.2f Km/h\t\tVelocidade maxima: %.2f Km/h\n", velocidadeAtual, velocidadeMax);

        if (motor != null)
            motor.mostraInfos();
    }
}
