package br.edu.infnet.app.usuario;

import br.edu.infnet.domain.usuario.Usuario;
import br.edu.infnet.infra.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(path = {"/usuarios"})
public class UsuarioController {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @GetMapping(path = {"/{id}"})
    public ResponseEntity obterPorId(@PathVariable int id) {
    
        ResponseEntity retorno = ResponseEntity.notFound().build();
        Usuario usuario = this.findById(id);
        if (usuario != null) {
        
            retorno = ResponseEntity.ok().body(usuario);
        }
        
        return retorno;
    }
    
    @GetMapping(path = {"/email/{email}"})
    public ResponseEntity obterPorEmail(@PathVariable String email) {
    
        ResponseEntity retorno = ResponseEntity.notFound().build();
        Usuario usuario = usuarioRepository.findByEmail(email);
        if (usuario != null) {
        
            retorno = ResponseEntity.ok().body(usuario);
        }
        
        return retorno;
    }
    
    @PostMapping
    public ResponseEntity inserirUsuario(@RequestBody Usuario usuario) {
    
        ResponseEntity retorno = ResponseEntity.badRequest().build();
        if (usuario != null && usuario.getId() == null) {
            
            try {
            
                Usuario usuarioInserido = usuarioRepository.save(usuario);
                retorno = ResponseEntity.status(HttpStatus.CREATED).body(usuarioInserido);
            } catch(Exception e) {
            
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
            }
        }
        return retorno;
    }
    
    @PatchMapping
    public ResponseEntity atualizarUsuario(@RequestBody Usuario usuario) {
    
        ResponseEntity retorno = ResponseEntity.badRequest().build();
        if (usuario != null && usuario.getId() != null) {
        
            Usuario usuarioGravado = this.findById(usuario.getId());
            if (usuarioGravado != null) {
            
                try {
                
                    usuarioGravado = usuarioRepository.save(usuario);
                    retorno = ResponseEntity.ok().body(usuarioGravado);
                } catch(Exception e) {
                }
            }
        }
        
        return retorno;
    }
    
    private Usuario findById(int id) {
    
        Usuario retorno = null;
        try {
        
            retorno = usuarioRepository.findById(id).get();
        } catch(Exception e) {
        }
        return retorno;
    }
}
