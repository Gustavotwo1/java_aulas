package introducao;


public class Aula3_math{
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2)/2;

        System.out.printf("media é: %.2f", media);

        int numero = 5;
        System.out.printf("numero = %d\n", numero);
        //ele vai somar depois ele vai acresentar mais um no numero
        int valor = 5 + numero++;
        System.out.printf("valor= %d\n", valor);
        System.out.printf("numero = %d\n", numero);
        
        numero = 5;
        //ele vai adicionar mais um ao numero depois somar
        valor = 5 + ++numero;
        System.out.printf("valor= %d\n", valor);
        System.out.printf("numero = %d\n", numero);

        System.out.printf("math.sqrt: %.2f\n", Math.sqrt(25));
        float v =  4.8f;
        
        int ar = (int) Math.floor(v);
        int ar2 = (int) Math.ceil(v);
        System.out.printf("arredondamento para baixo: %d \n",ar);
        System.out.printf("arredondamento para cima: %d\n",ar2);

        double ale = Math.random();
        System.out.println(ale);
        //quero um numero entre 5 e 10
        int n = (int) (5 + ale * (10-5));
        System.out.println(n);


    }

}