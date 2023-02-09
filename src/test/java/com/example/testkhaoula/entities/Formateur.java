package com.example.testkhaoula.entities;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.Set;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Formateur implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idFormateur;
    String nom;
    String prenom;
    Integer tarifHoraire;
    String email;

    @OneToMany(mappedBy = "formateur", cascade = CascadeType.ALL)
    public Set<Formation> formations;

}
