package apibanco.repository;

import apibanco.model.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
  @Query(nativeQuery = true, value = "SELECT * FROM client u WHERE u.name LIKE %?1%")
  List<Client> findByNames(@Param(value = "name") String name);
  Client findByNameLike(String name);
}
