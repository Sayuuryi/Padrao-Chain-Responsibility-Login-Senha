public class UsuarioSistema {
    private String[] logins = {"joao", "maria", "admin"};
    public boolean existe(String login) {
        for (String cadastrado : logins) {
            if (cadastrado.equals(login)) {
                return true;
            }
        }
        return false;
    }
}
