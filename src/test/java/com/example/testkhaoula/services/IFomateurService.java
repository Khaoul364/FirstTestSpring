package com.example.testkhaoula.services;

import com.example.testkhaoula.entities.Formateur;

import java.util.List;

public interface IFomateurService {

    List<Formateur> retrieveFormateur();
    Formateur retrieveById(Long id);
    Formateur saveFormateur(Formateur F);
    Formateur updateFormateur(Formateur F);
    void deleteFormateur(Long id);

}
