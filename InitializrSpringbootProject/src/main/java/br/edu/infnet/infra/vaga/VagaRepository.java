package br.edu.infnet.infra.vaga;

import br.edu.infnet.domain.vaga.Vaga;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface VagaRepository extends CrudRepository<Vaga, Integer> {
    
    List<Vaga> findByIdUsuario (int idUsuario);
    
    List<Vaga> findByCargoContainingIgnoreCase (String pesquisa);
    
    List<Vaga> findByCidadeContainingIgnoreCase (String pesquisa);
}
