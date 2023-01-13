package com.portfolio.emr.Interface;

import com.portfolio.emr.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un usuario
    public void deletePersona(Long id);
    
    //buscar una persona por ID
    
    public Persona findPersona (Long id);
}
