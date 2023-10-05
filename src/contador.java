import java.util.Locale;
import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroDois > parametroUm) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for(int index = 1; index <= contagem; index += 1) {
            System.out.println("Imprimindo o número: " + index);
        }
    }
}
