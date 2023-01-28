package apibanco.repository;

import apibanco.model.Cliente;

import apibanco.records.ClienteRecord;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
  //@Query(value = " SELECT * FROM cliente where nome like :nome ")
  Cliente findByNomeLike(String nome);
}
