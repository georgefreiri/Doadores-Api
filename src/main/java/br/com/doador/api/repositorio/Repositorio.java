package br.com.doador.api.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.doador.api.modelo.Relatorio;

@Repository
public interface Repositorio extends CrudRepository<Relatorio, Integer> {

    @SuppressWarnings("null")
    List<Relatorio> findAll();

    Relatorio findByCodigo(int codigo);

    boolean existsByGuid(String guid);
}
