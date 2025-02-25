package br.com.doador.api.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.doador.api.modelo.TipoSanguineo;

@Repository
public interface TipoSanguineoRepositorio extends CrudRepository<TipoSanguineo, Integer> {

    @SuppressWarnings("null")
    List<TipoSanguineo> findAll();

    TipoSanguineo findByCodigo(int codigo);

    boolean existsByGuid(String guid);
}
