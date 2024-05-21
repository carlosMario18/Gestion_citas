package com.unibague.CitasMedicas.repository;

import com.unibague.CitasMedicas.model.Consultorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultorioRepository extends JpaRepository <Consultorio, String>{

}
