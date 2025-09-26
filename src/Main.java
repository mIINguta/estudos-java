import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    // realizando leitura
        //No java, é necessário criar um objeto Scanner para ler as linhas, do C# que usa console.readLine();
        Scanner scan = new Scanner(System.in);

        int n1, n2, res = 0;
        String nome = "";

        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.println("Digite um numeral: ");
        n1 = scan.nextInt();

        System.out.println("Digite outro numeral: ");
        n2 = scan.nextInt();

        res = n1 + n2;

        System.out.printf("%s, o resultado da soma dos numerais é: %d ",  nome,  res);


    }}
