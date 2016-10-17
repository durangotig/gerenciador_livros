/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorlivros;

import java.util.Date;

/**
 *
 * @author 0194166
 */
public class Usuario extends Pessoa{
    private String login;
    private String senha;

    public Usuario() {
    }

    public Usuario(String login, String senha, String nome, Date dataNasc, String email) {
        super(nome, dataNasc, email);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
