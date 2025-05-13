package br.com.rodrigo.controlec02.dto;

import java.time.LocalDate;

public class PapelDTO {
    private Long id;
    private String turma;
    private long qtd;
    private float co2;
    private LocalDate dataCadastro;

    public PapelDTO() {
    }

    public PapelDTO(Long id, String turma, long qtd, float co2, LocalDate dataCadastro) {
        this.id = id;
        this.turma = turma;
        this.qtd = qtd;
        this.co2 = co2;
        this.dataCadastro = dataCadastro;
    }

    public PapelDTO(Long id, String turma, long qtd, float co2, Object o, LocalDate dataCadastro) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public long getQtd() {
        return qtd;
    }

    public void setQtd(long qtd) {
        this.qtd = qtd;
    }

    public float getCo2() {
        return co2;
    }

    public void setCo2(float co2) {
        this.co2 = co2;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
