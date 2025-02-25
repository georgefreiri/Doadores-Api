package br.com.doador.api.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.doador.api.modelo.Obeso;

@Repository
public interface ObesoRepositorio extends CrudRepository<Obeso, Integer> {

    @SuppressWarnings("null")
    List<Obeso> findAll();

    Obeso findByCodigo(int codigo);

    boolean existsByGuid(String guid);
}
