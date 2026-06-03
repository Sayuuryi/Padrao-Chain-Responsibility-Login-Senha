public abstract class Validador {
    private Validador proximo;
    public Validador ligarCom(Validador proximo) {
        this.proximo = proximo;
        return proximo;
    }
    public abstract boolean validar(String login, String senha);
    protected boolean validarProximo(String login, String senha) {
        if (proximo == null) {
            return true;
        }
        return proximo.validar(login, senha);
    }
}
