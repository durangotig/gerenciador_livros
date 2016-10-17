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
public class Comentario {
    private int paginaInicial;
    private int paginaFinal;
    private String comentario;
    private Date horaInicial;
    private Date horaFinal;
    private int sequencia;

    public Comentario() {
    }

    public Comentario(int paginaInicial, int paginaFinal, String comentario, Date horaInicial, Date horaFinal, int sequencia) {
        this.paginaInicial = paginaInicial;
        this.paginaFinal = paginaFinal;
        this.comentario = comentario;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.sequencia = sequencia;
    }

    public int getPaginaInicial() {
        return paginaInicial;
    }

    public void setPaginaInicial(int paginaInicial) {
        this.paginaInicial = paginaInicial;
    }

    public int getPaginaFinal() {
        return paginaFinal;
    }

    public void setPaginaFinal(int paginaFinal) {
        this.paginaFinal = paginaFinal;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Date horaInicial) {
        this.horaInicial = horaInicial;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }
    
    
}
