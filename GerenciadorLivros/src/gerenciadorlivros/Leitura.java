/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorlivros;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 0194166
 */
public class Leitura {
    private boolean status;
    private Date dataInicial;
    private Date dataFinal;
    private List<Comentario> comentarios = new ArrayList<Comentario>();

    public Leitura() {
    }

    public Leitura(boolean status, Date dataInicial, Date dataFinal) {
        this.status = status;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }
      
    
}
