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
public class Locatario extends Pessoa {
    private String telefone;

    public Locatario() {
    }

    public Locatario(String telefone, String nome, Date dataNasc, String email) {
        super(nome, dataNasc, email);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
