public class ValidadorEspecial extends Validador {
    public boolean validar(String login, String senha) {
        String especiais = "@#$%&*";
        for (char c : senha.toCharArray()) {
            if (especiais.indexOf(c) >= 0) {
                return validarProximo(login, senha);
            }
        }
        System.out.println("Senha sem caractere especial");
        return false;
    }
}
