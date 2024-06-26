package com.example.back_monolito.Dao;


import com.example.back_monolito.Entity.Alergia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlergiaRepository extends JpaRepository<Alergia, Integer> {
    //Lista de alergias de un paciente
    @Query("SELECT a FROM Alergia a WHERE a.idPaciente = ?1")
    public List<Alergia> findAlergiasByPaciente(Integer idPaciente);
}
