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
public class Emprestimo {
    private Date dataEmpresimo;
    private Date dataDevolucao;
    private Livro livro;

    public Emprestimo() {
    }

    public Emprestimo(Date dataEmpresimo, Date dataDevolucao, Livro livro) {
        this.dataEmpresimo = dataEmpresimo;
        this.dataDevolucao = dataDevolucao;
        this.livro = livro;
    }

    public Date getDataEmpresimo() {
        return dataEmpresimo;
    }

    public void setDataEmpresimo(Date dataEmpresimo) {
        this.dataEmpresimo = dataEmpresimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    
    
}
