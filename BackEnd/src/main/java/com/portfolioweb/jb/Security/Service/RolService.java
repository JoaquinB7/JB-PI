
package com.portfolioweb.jb.Security.Service;

import com.portfolioweb.jb.Security.Entity.Rol;
import com.portfolioweb.jb.Security.Enums.RolNombre;
import com.portfolioweb.jb.Security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol); 
    }
}
