public class ValidadorTamanhoMinimo extends Validador {
    public boolean validar(String login, String senha) {
        if (senha.length() < 8) {
            System.out.println("Senha menor que 8 caracteres");
            return false;
        }
        return validarProximo(login, senha);
    }
}
