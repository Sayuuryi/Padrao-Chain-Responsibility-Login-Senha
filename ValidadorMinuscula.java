public class ValidadorMinuscula extends Validador {
    public boolean validar(String login, String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return validarProximo(login, senha);
            }
        }
        System.out.println("Senha sem letra minuscula");
        return false;
    }
}
