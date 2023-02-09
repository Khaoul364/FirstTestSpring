package com.example.testkhaoula.services;
import java.util.List;

import com.example.testkhaoula.entities.Apprenant;
import tn.esprit.spring.entities.CategorieProduit;

public interface IApprenantService {
    List<Apprenant> retrieveCategorieProduit();
    Apprenant retrieveById(Long id);
    Apprenant saveCategorieProduit(Apprenant A);
    Apprenant updateCategorieProduit(Apprenant A);
}
