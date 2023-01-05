package apibanco.repository;

import apibanco.model.Conta;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
//import java.util.Optional;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{}
