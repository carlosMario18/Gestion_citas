package com.unibague.CitasMedicas.model;

import lombok.*;

import javax.persistence.*;
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
    @OneToMany(mappedBy = "consultorio" ,cascade = CascadeType.ALL)
    private List<CitaGeneral> citas;
}


