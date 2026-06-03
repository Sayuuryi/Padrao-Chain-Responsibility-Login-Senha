public class ValidadorMaiuscula extends Validador {
    public boolean validar(String login, String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return validarProximo(login, senha);
            }
        }
        System.out.println("Senha sem letra maiuscula");
        return false;
    }
}
