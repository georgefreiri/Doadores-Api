package br.com.doador.api.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.doador.api.modelo.Estado;

@Repository
public interface EstadoRepositorio extends CrudRepository<Estado, Integer> {

    @SuppressWarnings("null")
    List<Estado> findAll();

    boolean existsByGuid(String guid);
}
