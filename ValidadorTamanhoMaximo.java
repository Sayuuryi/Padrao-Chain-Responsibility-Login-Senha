public class ValidadorTamanhoMaximo extends Validador {
    public boolean validar(String login, String senha) {
        if (senha.length() > 16) {
            System.out.println("Senha maior que 16 caracteres");
            return false;
        }
        return validarProximo(login, senha);
    }
}
