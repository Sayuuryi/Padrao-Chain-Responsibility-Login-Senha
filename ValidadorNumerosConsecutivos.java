public class ValidadorNumerosConsecutivos extends Validador {
    public boolean validar(String login, String senha) {
        for (int i = 0; i < senha.length() - 2; i++) {
            char a = senha.charAt(i);
            char b = senha.charAt(i + 1);
            char c = senha.charAt(i + 2);
            if (Character.isDigit(a) && Character.isDigit(b) && Character.isDigit(c)) {
                if (b == a + 1 && c == b + 1) {
                    System.out.println("Senha possui 3 numeros consecutivos");
                    return false;
                }
            }
        }
        return validarProximo(login, senha);
    }
}
