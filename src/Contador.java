import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println("O valor do segundo parâmetro precisa ser MAIOR que o primeiro: " + parametroUm);
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;

        System.out.println("Imprimindo o número de ocorrências: ");

        for(int ocorrencia = contagem; ocorrencia >0; ocorrencia-- ){
            System.out.println("O numero de ocorrencia: " + ocorrencia);
        }
    }
}

