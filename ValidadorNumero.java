public class ValidadorNumero extends Validador {
    public boolean validar(String login, String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                return validarProximo(login, senha);
            }
        }
        System.out.println("Senha sem numero");
        return false;
    }
}
