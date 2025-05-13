package br.com.rodrigo.controlec02.services;


import br.com.rodrigo.controlec02.model.Papel;
import org.springframework.stereotype.Component;

@Component
public class PapelService implements IPapelService{
    @Override
    public Papel calcularCo2(Papel paper, float multiplicador) {
        float resultado = paper.getQtd() * multiplicador;
        paper.setCo2(resultado);
        return paper;
    }
}
