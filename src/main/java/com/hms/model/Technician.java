package com.hms.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Technician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "technician_id")
    private Long technicianId;

    @Column(name = "technician_name")
    private String technicianName;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

}
