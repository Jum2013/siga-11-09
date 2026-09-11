package br.com.fatecfv.siga.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatecfv.siga.model.Aluno;

public interface AlunoRepository extends  JpaRepository<Aluno, Long> {
    
}
