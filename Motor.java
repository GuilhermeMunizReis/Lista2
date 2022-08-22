public class Motor {
    int potencia;       // Indica a potência do motor
    String tipo;        // Indica o tipo do motor

    // Mostra as informações do motor
    void mostraInfos(){
        System.out.format("Tipo: %s\t\tPotencia: %d\n", tipo, potencia);
    }
}
