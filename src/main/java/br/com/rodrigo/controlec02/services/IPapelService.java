package br.com.rodrigo.controlec02.services;

import br.com.rodrigo.controlec02.model.Papel;

public interface IPapelService {
    public Papel calcularCo2 (Papel paper, float multiplicador);
}
