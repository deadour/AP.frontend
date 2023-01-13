package com.portfolio.emr.Service;

import com.portfolio.emr.Entity.Persona;
import com.portfolio.emr.Interface.IPersonaService;
import com.portfolio.emr.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository IpersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = IpersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        IpersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        IpersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = IpersonaRepository.findById(id) .orElse(null);
        return persona;
    }
    
}
