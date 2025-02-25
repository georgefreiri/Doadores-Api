package br.com.doador.api.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.doador.api.modelo.GrupoSanguineo;

@Repository
public interface GrupoSanguineoRepositorio extends CrudRepository<GrupoSanguineo, Integer> {

    @SuppressWarnings("null")
    List<GrupoSanguineo> findAll();

    GrupoSanguineo findByCodigo(int codigo);

    boolean existsByGuid(String guid);
}
