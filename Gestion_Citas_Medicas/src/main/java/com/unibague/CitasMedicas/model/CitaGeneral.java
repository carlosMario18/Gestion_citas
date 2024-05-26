package com.unibague.CitasMedicas.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import javax.persistence.*;

@Data
@AllArgsConstructor
@Builder
@Entity
public class CitaGeneral extends CitaMedica {
    private String nombreGeneralista;
    private String observacion;
    private String idConsultorio;

    @ManyToOne
    private Consultorio consultorio;
    public CitaGeneral() {
    }

    public CitaGeneral(String numeroIdentificacion, String nombrePaciente, LocalDate fecha, double costo, String tipoCita, String nombreGeneralista, String observacion, String idConsultorio) {
        super(numeroIdentificacion, nombrePaciente, fecha, costo, tipoCita);
        this.nombreGeneralista = nombreGeneralista;
        this.observacion = observacion;
        this.idConsultorio = idConsultorio;
    }


}
