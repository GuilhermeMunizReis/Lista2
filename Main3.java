public class Main3 {
    public static void main(String[] args) {
        // Criando objetos da classe estudante
        Estudante e1 = new Estudante();
        Estudante e2 = new Estudante();

        // Criando objetos da classe infoscontato
        InfosContato i1 = new InfosContato();
        InfosContato i2 = new InfosContato();

        // Preenchendo as informações de cada objeto
        e1.nome = "Fulano da Silva";
        e1.idade = 14;
        i1.email = "fulano@gmail.com";
        i1.enderoCasa = "Rua dos bobos, 0";
        i1.numTelefone = 123456789;
        e1.info = i1;

        e2.nome = "Beltrano Ferreira";
        e2.idade = 13;
        i2.email = "beltrano@gmail.com";
        i2.enderoCasa = "Rua dos bobos, 1";
        i2.numTelefone = 987654321;
        e2.info = i2;

        // Mostrando as informações da cada objeto
        e1.mostraInfo();

        e2.mostraInfo();
    }
}
