package br.com.doador.api.modelo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GrupoSanguineo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    public String tipoSanguineo;
    public String doadores;
    public String receptores;
    public String guid;

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getDoadores() {
        return doadores;
    }

    public void setDoadores(String doadores) {
        this.doadores = doadores;
    }

    public String getReceptores() {
        return receptores;
    }

    public void setReceptores(String receptores) {
        this.receptores = receptores;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

}
