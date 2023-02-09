package com.example.testkhaoula.entities;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class DetailFormation implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idDetail;
    String salle;
    String equipement;

    @OneToOne(mappedBy = "detailFormation")
    public Formation formation;
}
