package com.example.testkhaoula.entities;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Apprenant implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idApprennat;
    String nom;
    String prenom;
    Integer telephone;
    String email;

    @ManyToMany

    (mappedBy = "apprenant")
    public Set<Formation> formations;

}
