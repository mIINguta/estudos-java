import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    // comando de loop, estruturas de repetição.

        int i = 0;

        //while
        while(i<8){
            System.out.printf("Contando com while: %d\n", i);
            i++;
        }
        // do while - primeiro ele faz e depois testa.
        System.out.println("Começando a contagem!");
        do{
            System.out.printf("%d\n", i);
        }while(i<10);

        //for (para), a configuração vem dentro da primeira linha.
        for(int cont=0; cont<10; cont++){
            System.out.printf("Contando com for: %d\n", cont);
        }





    }}
