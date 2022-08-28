package com.portfolioweb.jb.Security.Service;

import com.portfolioweb.jb.Security.Entity.Usuario;
import com.portfolioweb.jb.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iUsuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario (String nombreUsuario){
        return iUsuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existByNombreUsuario (String nombreUsuario){
        return iUsuarioRepository.existByNombreUsuario(nombreUsuario);
    }
    
    public boolean existByEmail (String email){
        return iUsuarioRepository.existByEmail(email);
    }
    
    public void save(Usuario usuario){
        iUsuarioRepository.save(usuario);
    }
}
