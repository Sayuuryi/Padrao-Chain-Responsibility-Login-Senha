public class ValidadorLogin extends Validador {
    private UsuarioSistema sistema;
    public ValidadorLogin(UsuarioSistema sistema) {
        this.sistema = sistema;
    }
    public boolean validar(String login, String senha) {
        if (!sistema.existe(login)) {
            System.out.println("Login nao cadastrado");
            return false;
        }
        return validarProximo(login, senha);
    }
}
