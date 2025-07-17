package Aula03;

public class mediaaluno {
    public static void main(String[] args) {
        double n1 = 8;
        double n2 = 0;
        double n3 = 7;
        double n4 = 0;
        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("resultado; " + media);

        if (media >= 7) {
            System.out.println(" você passou, parabens !");

        } else {
            System.out.println (" Você reprovou de semestre ");
        }

    }
}
