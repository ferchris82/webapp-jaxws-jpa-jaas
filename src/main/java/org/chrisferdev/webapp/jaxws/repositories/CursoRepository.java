package org.chrisferdev.webapp.jaxws.repositories;

import org.chrisferdev.webapp.jaxws.models.Curso;

import java.util.List;

public interface CursoRepository {
    List<Curso>listar();
    Curso guardar(Curso curso);
}
