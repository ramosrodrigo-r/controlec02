package br.com.rodrigo.controlec02.controller;

import br.com.rodrigo.controlec02.dto.PapelDTO;
import br.com.rodrigo.controlec02.dto.PapelRequestDTO;
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
    public String cadastrarPapel(@RequestBody PapelRequestDTO dto){
        Papel paper = new Papel();
        paper.setTurma(dto.getTurma());
        paper.setQtd(dto.getQtd());
        paper.setDataCadastro(LocalDate.now());
        paper = ips.calcularCo2(paper, 0.0176f);
        prs.save(paper);
        System.out.println("Cadastrando: " + paper.getTurma() + "/" + paper.getQtd() + "-CO2: " + paper.getCo2());
        return "Papelada cadastrada com sucesso. A quantidade de " + paper.getQtd() + " papéis da " + paper.getTurma() + " teve a emissão estimada de CO2 em " + paper.getCo2() + " Kg";
    }

    @GetMapping("/papeis")
    public List<PapelDTO> listarTodosOsPapeis() {
        return prs.findAll()
                .stream()
                .map(p -> new PapelDTO(
                        p.getId(),
                        p.getTurma(),
                        p.getQtd(),
                        p.getCo2(),
                        p.getDataCadastro()))
                .toList();
    }
}



