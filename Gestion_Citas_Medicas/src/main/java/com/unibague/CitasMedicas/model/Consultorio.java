package com.unibague.CitasMedicas.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
public class Consultorio {
    @Id
    private String id;
    private String nombre;
    @OneToMany(mappedBy = "consultorio")
    private List<CitaGeneral> citas;
}


