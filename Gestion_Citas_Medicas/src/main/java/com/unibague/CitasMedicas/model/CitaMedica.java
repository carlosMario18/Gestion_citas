package com.unibague.CitasMedicas.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class CitaMedica {
    @Id
    private String  numeroIdentificacion;
    private String nombrePaciente;
    @NotNull
    private LocalDate fecha;
    @NotNull
    private  double costo;
    private  String  tipoCita;
}
