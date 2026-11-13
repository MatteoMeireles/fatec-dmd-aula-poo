import java.util.Scanner;

public class Ex10 {

    static Scanner sc = new Scanner(System.in);

    public static String lerUsuario() {
        System.out.print("Usuario: ");
        return sc.nextLine();
    }

    public static String lerSenha() {
        System.out.print("Senha: ");
        return sc.nextLine();
    }

    public static boolean validarLogin(String usuario, String senha) {
        return usuario.equals("admin") && senha.equals("1234");
    }

    public static void mostrarResultado(boolean loginCorreto) {
        if (loginCorreto) {
            System.out.println("Login realizado com sucesso! Bem-vindo!");
        } else {
            System.out.println("Usuario ou senha incorretos.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== LOGIN ===");
        System.out.println("(dica: usuario admin e senha 1234)");

        String usuario = lerUsuario();
        String senha = lerSenha();

        boolean loginCorreto = validarLogin(usuario, senha);
        mostrarResultado(loginCorreto);
    }
}
