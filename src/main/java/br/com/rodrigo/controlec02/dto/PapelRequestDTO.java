package br.com.rodrigo.controlec02.dto;

public class PapelRequestDTO {
    private String turma;
    private long qtd;

    public PapelRequestDTO() {
    }

    public PapelRequestDTO(String turma, long qtd) {
        this.turma = turma;
        this.qtd = qtd;
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
}
