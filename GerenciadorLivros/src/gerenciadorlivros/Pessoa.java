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
public abstract class Pessoa {
    private String nome;
    private Date dataNasc;
    private String email;

    public Pessoa() {
    }

    public Pessoa(String nome, Date dataNasc, String email) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
