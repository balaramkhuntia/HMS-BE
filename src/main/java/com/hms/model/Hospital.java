package com.hms.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Setter
@Getter
@ToString
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hospital_id")
    private Long hospitalId;

    @OneToOne(mappedBy = "hospital", cascade = CascadeType.ALL)
    private Admin admin;

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL)
    private Set<Pharmasist> pharmasists;

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL)
    private Set<Doctor> doctors;

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL)
    private Set<Patient> patients;

}

