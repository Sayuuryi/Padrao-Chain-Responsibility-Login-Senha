public class Main {
    public static void main(String[] args) {
        UsuarioSistema sistema = new UsuarioSistema();
        Validador chain = new ValidadorLogin(sistema);
        chain.ligarCom(new ValidadorMaiuscula())
                .ligarCom(new ValidadorMinuscula())
                .ligarCom(new ValidadorEspecial())
                .ligarCom(new ValidadorNumero())
                .ligarCom(new ValidadorNumerosConsecutivos())
                .ligarCom(new ValidadorTamanhoMinimo())
                .ligarCom(new ValidadorTamanhoMaximo());
        testar(chain, "joao", "Senha@45");
        testar(chain, "maria", "abc123&");
        testar(chain, "pedro", "Senha@45");
        testar(chain, "admin", "Ab123&senha");
    }
    private static void testar(Validador chain, String login, String senha) {
        System.out.println("Testando: " + login + " / " + senha);
        if (chain.validar(login, senha)) {
            System.out.println("Login e senha aceitos");
        } else {
            System.out.println("Login e senha recusados");
        }
        System.out.println();
    }
}
