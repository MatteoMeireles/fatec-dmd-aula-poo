import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tentativas = 0;
        boolean acesso = false;

        while (tentativas < 3) {
            System.out.print("Usuário: ");
            String usuario = sc.next();

            System.out.print("Senha: ");
            String senha = sc.next();

            if (usuario.equals("admin") && senha.equals("1234")) {
                acesso = true;
                break;
            }

            tentativas++;
        }

        if (acesso) {
            System.out.println("Login realizado");
        } else {
            System.out.println("Conta bloqueada");
        }

        sc.close();
    }
}