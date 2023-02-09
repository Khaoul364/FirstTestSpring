package com.example.testkhaoula.entities;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.ManyToAny;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Formation implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long idFormation;
    String titre;
    @Enumerated(EnumType.STRING)
    Niveau niveau;
    @Temporal(TemporalType.DATE)
    Date dateDebut;
    @Temporal(TemporalType.DATE)
    Date dateFin;
    Integer NbrHeures;
    Integer NbrMaxParticipant;
    Integer Frais;


    @OneToOne(cascade = CascadeType.ALL)
    public DetailFormation detailFormation;

    @ManyToMany
    public Set<Apprenant> apprenants;

    @ManyToOne
    public Formateur formateur;


}

