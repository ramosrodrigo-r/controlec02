package br.com.rodrigo.controlec02.controller;

import br.com.rodrigo.controlec02.model.Papel;
import br.com.rodrigo.controlec02.repository.PapelRepository;
import br.com.rodrigo.controlec02.services.IPapelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class PapelController {

    @Autowired
    IPapelService ips;

    @Autowired
    PapelRepository prs;

    @PostMapping("/cadastrarpapel")
    public String cadastrarPapel(@RequestBody Papel paper){
        paper = ips.calcularCo2(paper, 0.0176f);
        paper.setDataCadastro(LocalDate.now());
        prs.save(paper);
        System.out.println("Cadastrando: " + paper.getTurma() + "/" + paper.getQtd() + "-CO2: " + paper.getCo2());
        return "Papelada cadastrada com sucesso. A quantidade de " + paper.getQtd() + " papéis da " + paper.getTurma() + " teve a emissão estimada de CO2 em " + paper.getCo2() + " Kg";
    }

    @GetMapping("/papeis")
    public List<Papel> listarTodosOsPapeis() {
        return prs.findAll();
    }
}



