package br.com.doador.api.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.doador.api.modelo.Imc;

@Repository
public interface ImcRepositorio extends CrudRepository<Imc, Integer> {

    @SuppressWarnings("null")
    List<Imc> findAll();

    Imc findByCodigo(int codigo);

    boolean existsByGuid(String guid);
}