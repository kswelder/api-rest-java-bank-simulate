package apibanco.repository;

import apibanco.model.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
  @Query(nativeQuery = true, value = "SELECT * FROM client u WHERE u.nome LIKE %?1%")
  List<Client> findByNomes(@Param(value = "nome") String nome);
  Client findByNomeLike(String nome);
}
