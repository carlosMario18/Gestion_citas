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
    private String id;
    @Id
    private String nombre;
    @OneToMany(mappedBy = "consultorio" ,cascade = CascadeType.ALL)
    private List<CitaGeneral> citas;
}


