package br.com.bancodigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bancodigital.model.Proposta1;

@Repository
public interface Proposta1Repository extends JpaRepository<Proposta1, Long>{

}
