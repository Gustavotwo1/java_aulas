package introducao;

import java.util.Scanner;

public class Aula2_entrada {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("coloque o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.println("coloque a nota do aluno:");
        float nota = teclado.nextFloat();
        System.out.println("coloque a idade do aluno:");
        int idade = teclado.nextInt();

        System.out.printf("nome: %s\n", nome);
        System.out.printf("idade: %d\n", idade);
        System.out.printf("sua nota é: %.2f\n\n", nota);

        String num = Integer.toString(idade);
        String valor = String.valueOf(nota);
        float number = Float.parseFloat(valor);
        System.out.printf("seu num é: %s\n", num);
        System.out.printf("seu valor é: %s\n", valor);
        System.out.printf("seu number é: %s\n", number);

        //fechar objeto para evitar vazamento de dados
        teclado.close();
    }

}
