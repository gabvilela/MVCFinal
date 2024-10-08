package Model;

public class User {
    private String tipoLogin;
    private String username;
    private String senha;

    public User(String tipoLogin, String username, String senha) {
        this.tipoLogin = tipoLogin;
        this.username = username;
        this.senha = senha;
    }

    public String getTipoLogin() {
        return tipoLogin;
    }

    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }
}
