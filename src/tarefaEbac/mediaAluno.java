package tarefaEbac;
import java.util.Scanner;

public class mediaAluno {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ola caro(a) aluno(a)");
        System.out.println("Digite sua primeira nota: ");
        float nota1 = s.nextFloat();
        System.out.println("Digite sua segunda nota: ");
        float nota2 = s.nextFloat();
        System.out.println("Digite sua terceira nota: ");
        float nota3 = s.nextFloat();
        System.out.println("Digite sua quarta nota: ");
        float nota4 = s.nextFloat();
        
        
        float media = getMedia(nota1, nota2, nota3, nota4);
        if (media >= 7) {
            System.out.println("Voce esta Aprovado(a)");
        } else if (media >= 5) {
            System.out.println("Voce esta em Recuperacao");
        } else {
            System.out.println("Voce esta Reprovado(a)");
        }

        s.close();
    }

    public static float getMedia(float nota1, float nota2, float nota3, float nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
}