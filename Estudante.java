public class Estudante {
    String nome;    // Nome do estudante
    int idade;      // Idade do estudante

    InfosContato info;  // Obejto contendo informações do contato

    void estudar(){
        System.out.format("%s esta estudando.", nome);
    }

    void mostraInfo(){
        System.out.format("Nome: %s\t\tIdade: %d\n", nome, idade);
        System.out.format("Email:%s\t\tTelefone: %d\t\tEndereco: %s\n",info.email, info.numTelefone, info.enderoCasa);
    }
}
