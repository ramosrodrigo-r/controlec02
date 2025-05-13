package br.com.rodrigo.controlec02.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_papel")
public class Papel {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "TBL_PAPEL_SEQ"
    )
    @SequenceGenerator(
            name = "TBL_PAPEL_SEQ",
            sequenceName = "TBL_PAPEL_SEQ",
            allocationSize = 1
    )
    private Long id;

    @Column(name = "turma_cadastro")
    private String Turma;

    @Column(name = "quantidade_cadastro")
    private long Qtd;

    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getCo2() {
        return co2;
    }

    public void setCo2(float co2) {
        this.co2 = co2;
    }

    private float co2;


    public String getTurma() {
        return Turma;
    }

    public void setTurma(String turma) {
        this.Turma = turma;
    }

    public long getQtd() {
        return Qtd;
    }

    public void setQtd(long qtd) {
        this.Qtd = qtd;
    }
}
