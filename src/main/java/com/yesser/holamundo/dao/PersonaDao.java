package com.yesser.holamundo.dao;


import com.yesser.holamundo.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {
}
