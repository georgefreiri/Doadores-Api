package br.com.doador.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import br.com.doador.api.modelo.Data;
import br.com.doador.api.modelo.Estado;
import br.com.doador.api.modelo.GrupoSanguineo;
import br.com.doador.api.modelo.Imc;
import br.com.doador.api.modelo.Obeso;
import br.com.doador.api.modelo.Relatorio;
import br.com.doador.api.modelo.TipoSanguineo;
import br.com.doador.api.repositorio.EstadoRepositorio;
import br.com.doador.api.repositorio.GrupoSanguineoRepositorio;
import br.com.doador.api.repositorio.ImcRepositorio;
import br.com.doador.api.repositorio.ObesoRepositorio;
import br.com.doador.api.repositorio.Repositorio;
import br.com.doador.api.repositorio.TipoSanguineoRepositorio;

@RestController
public class Controle {

    @Autowired
    private Repositorio repositorio;
    @Autowired
    private EstadoRepositorio estadoRepositorio;
    @Autowired
    private GrupoSanguineoRepositorio grupoSanguineoRepositorio;
    @Autowired
    private ImcRepositorio imcRepositorio;
    @Autowired
    private ObesoRepositorio obesoRepositorio;
    @Autowired
    private TipoSanguineoRepositorio tipoSanguineoRepositorio;

    @PostMapping("/json")
    public String incluir(@RequestBody Relatorio relatorio) {

        Data data = relatorio.getData();

        for (Estado estado : data.getEstados()) {
            if (!estadoRepositorio.existsByGuid(estado.getGuid())) {
                estadoRepositorio.save(estado);
            }
        }
        for (GrupoSanguineo gruposanguineo : data.getGrupoSanguineo()) {
            if (!grupoSanguineoRepositorio.existsByGuid(gruposanguineo.getGuid())) {
                grupoSanguineoRepositorio.save(gruposanguineo);
            }
        }
        for (Imc imc : data.getImc()) {
            if (!imcRepositorio.existsByGuid(imc.getGuid())) {
                imcRepositorio.save(imc);
            }
        }
        for (Obeso obeso : data.getObesos()) {
            if (!obesoRepositorio.existsByGuid(obeso.getGuid())) {
                obesoRepositorio.save(obeso);
            }
        }
        for (TipoSanguineo tipoSanguineo : data.getTipoSanguineo()) {
            if (!tipoSanguineoRepositorio.existsByGuid(tipoSanguineo.getGuid())) {
                tipoSanguineoRepositorio.save(tipoSanguineo);
            }
        }

        try {
            ObjectWriter owObjectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
            return owObjectWriter.writeValueAsString(relatorio);
        } catch (JsonProcessingException e) {
            return "json";
        }

    }

    /*
     * @GetMapping("/api")
     * public List<Relatorio> todosRelatorios() {
     * return repositorio.findAll();
     * }
     */

    /*
     * @GetMapping("/api/{codigo}")
     * public Relatorio selecRelatorioPorCodigo(@PathVariable int codigo) {
     * return repositorio.findByCodigo(codigo);
     * }
     */

    @GetMapping("")
    public String mensagem() {
        return "Hello Word";
    }

    @GetMapping("/Relatorio/{json}")
    public String relatorio(@PathVariable String json) {
        return "Seja bem vindo" + json;
    }

    @PostMapping("/relatorio")
    public Relatorio getRelatorio(@RequestBody Relatorio relatorio) {
        return relatorio;
    }

}
