package br.com.rodrigo.controlec02.repository;


import br.com.rodrigo.controlec02.model.Papel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PapelRepository extends JpaRepository<Papel, Long> {
}
