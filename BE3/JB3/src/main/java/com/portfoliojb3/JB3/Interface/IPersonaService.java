package com.portfoliojb3.JB3.Interface;

import com.portfoliojb3.JB3.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> getPersona();

    public void savePersona(Persona persona);
    
    public void deletePersona (Long id);
    
    public Persona findPersona(Long id);
    
}
