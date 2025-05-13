package br.com.rodrigo.controlec02.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table (name = "tbl_usuario")
public class Usuario {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "TBL_USUARIO_SEQ"
    )
    @SequenceGenerator(
            name = "TBL_USUARIO_SEQ",
            sequenceName = "TBL_USUARIO_SEQ",
            allocationSize = 1
    )
    private int id;

    @Column(name = "email_cadastro", nullable = false, unique = true)
    @Email
    @NotBlank
    private String email;

    @Column(name = "nome_cadastro", nullable = false)
    @NotBlank
    private String nome;

    @Column(name = "senha_cadastro", nullable = false)
    @NotBlank
    private String senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}