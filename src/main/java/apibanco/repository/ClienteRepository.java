package apibanco.repository;

import apibanco.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
  @Query(nativeQuery = true, value = "SELECT * FROM cliente u WHERE u.nome LIKE %?1%")
  List<Cliente> findByNomes(@Param(value = "nome") String nome);
  Cliente findByNomeLike(String nome);
}
