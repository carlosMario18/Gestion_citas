package com.unibague.CitasMedicas.services;


import com.unibague.CitasMedicas.model.CitaGeneral;
import com.unibague.CitasMedicas.model.Consultorio;
import com.unibague.CitasMedicas.repository.CitaGeneralRepository;
import com.unibague.CitasMedicas.repository.ConsultorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsultorioServiceImpl implements ConsultorioService {

    @Autowired
    private ConsultorioRepository consultorioRepository;
    @Autowired
    private CitaGeneralRepository citaGeneralRepository;

    @Override

    public Consultorio crearConsultorio(Consultorio consultorio) {

        return consultorioRepository.save(consultorio);
    }

    @Override
    public Consultorio obtenerConsultorioPorId(String id) {
        return consultorioRepository.findById(id).orElse(null);
    }

    @Override
    public List<Consultorio> obtenerTodosConsultorios() {
        return consultorioRepository.findAll();
    }

    @Override
    public Consultorio actualizarConsultorio(String id, Consultorio consultorioActualizado) {
        Consultorio consultorioExistente = consultorioRepository.findById(id).orElse(null);
        if (consultorioExistente != null) {
            consultorioExistente.setNombre(consultorioActualizado.getNombre());
            if (consultorioActualizado.getCitas() != null) {
                for (CitaGeneral cita : consultorioActualizado.getCitas()) {
                    cita.setIdConsultorio(consultorioExistente.getId());
                }
                consultorioExistente.setCitas(consultorioActualizado.getCitas());
            }
            return consultorioRepository.save(consultorioExistente);
        }
        return null;
    }

    private void actualizarCitasConsultorio(Consultorio consultorioActualizado) {
        for (CitaGeneral cita : consultorioActualizado.getCitas()) {
            cita.setIdConsultorio(consultorioActualizado.getId());
        }
    }


    @Override
    public void eliminarConsultorio(String id) {
        consultorioRepository.deleteById(id);
    }
}





