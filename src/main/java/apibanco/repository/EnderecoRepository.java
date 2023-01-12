package apibanco.repository;

import apibanco.model.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
//import java.util.Optional;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{}
