package "banco.repository";

import banco.model.ContaModel;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClienteRepository extends CrudRepository<ContaModel, Long>{}
