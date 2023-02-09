package com.example.testkhaoula.services;
import java.util.List;

import com.example.testkhaoula.entities.Formateur;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class FormateurService implements IFomateurService{
    formateurRepository formateurRepository;

    @Override
    public List<Formateur> retrieveFormateur() {

        return formateurRepository.findAll();
    }

    @Override
    public Formateur retrieveById(Long id) {
        return formateurRepository.findById(id).orElse(null);
    }

    @Override
    public Formateur saveFormateur(Formateur F) {
        return formateurRepository.save(F);
    }

    @Override
    public Formateur updateFormateur(Formateur F) {
        return formateurRepository.save(F);
    }

    @Override
    public void deleteFormateur(Long id) {
        formateurRepository.deleteById(id);
    }
}

}
