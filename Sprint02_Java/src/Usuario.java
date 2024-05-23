import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {


    private class Login {

        private static void main(String[] args) {
            // Exemplo de uso do método de login
            String email = "usuario@example.com";
            String senha = "senhaSegura123";

            // Chamada do método de login
            boolean loginSucesso = fazerLogin(email, senha);

            if (loginSucesso) {
                System.out.println("Login bem-sucedido!");
            } else {
                System.out.println("E-mail ou senha inválidos!");
            }
        }

        private static boolean fazerLogin(String email, String senha) {
            // Expressão regular para validar e-mail
            String regexEmail = "^[a-zA-Z0-9_+&*-]+(?:\\\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$";

            // Expressão regular para validar senha (pelo menos 8 caracteres, contendo letras maiúsculas, minúsculas, números e caracteres especiais)
            String regexSenha = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$";

            // Compilar as expressões regulares
            Pattern patternEmail = Pattern.compile(regexEmail);
            Pattern patternSenha = Pattern.compile(regexSenha);

            // Verificar se o e-mail e a senha correspondem aos padrões definidos
            Matcher matcherEmail = patternEmail.matcher(email);
            Matcher matcherSenha = patternSenha.matcher(senha);

            return matcherEmail.matches() && matcherSenha.matches();
        }
    }


}
