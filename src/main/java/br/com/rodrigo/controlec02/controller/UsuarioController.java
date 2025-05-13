package br.com.rodrigo.controlec02.controller;


import br.com.rodrigo.controlec02.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import br.com.rodrigo.controlec02.model.Usuario;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioRepository ups;

    @Autowired
    private PasswordEncoder pse;

    @PostMapping
    public String cadastrarUsuario(@RequestBody @Valid Usuario usuario) {
        usuario.setSenha(pse.encode(usuario.getSenha()));
        ups.save(usuario);
        return "O Usuario " + usuario.getNome() + " foi cadastrado com sucesso!";
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return ups.findAll();
    }

}