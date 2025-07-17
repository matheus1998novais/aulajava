package Aula03.separado;



public class Main {// Método principal para execução
    public static void main(String[] args) {
        // Criação de um objeto da classe Carro
        Aula03.separado.Carro meuCarro01 = new Carro();

        // Definindo valores para os atributos
        meuCarro01.cor = "Vermelho";
        meuCarro01.modelo = "Civic";
        meuCarro01.ano = 2022;

        // Chamando o método ligar()
        meuCarro01.ligar();
        meuCarro01.parabrisa();
        meuCarro01.luz();
    }
}
