package introducao;

public class Aula4_condicao{

    public static void main(String[] args) {
        
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        int ano = 16;
        boolean temAutorizacao = true;

        if (ano < 18) {
            if (temAutorizacao) {
                System.out.println("Pode entrar com autorização");
            } else {
                System.out.println("Menor de idade sem autorização");
            }
        } else {
            System.out.println("Maior de idade, pode entrar");
        }


        double ale = Math.random();
        int dia = (int) (0 + ale * (3-0));
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            default:
                System.out.println("Outro dia");
        }

    }

}