package br.edu.infnet.infra.vaga;

import br.edu.infnet.domain.vaga.Vaga;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "http://localhost:8082/vagas", name = "Vagas")
public interface VagaService {
    
    @GetMapping(path = "/usuario/{idUsuario}")
    List<Vaga> listarPorIdUsuario(@PathVariable("idUsuario") int idUsuario);
    
    @GetMapping(path = "/cargo/{pesquisa}")
    List<Vaga> pesquisarVagasPorCargo(@PathVariable("pesquisa") String pesquisa);
    
    @GetMapping(path = "/cidade/{pesquisa}")
    List<Vaga> pesquisarVagasPorCidade(@PathVariable("pesquisa") String pesquisa);
    
    @PostMapping
    Vaga publicarVaga(@RequestBody Vaga vaga);
}
