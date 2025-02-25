package br.com.doador.api.modelo;

import java.io.Serializable;
import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Data implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    public ArrayList<Estado> estados;
    public ArrayList<Imc> imc;
    public ArrayList<Obeso> obesos;
    public ArrayList<TipoSanguineo> tipo_sanguineo;
    public ArrayList<GrupoSanguineo> grupo_sanguineo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Estado> getEstados() {
        return estados;
    }

    public void setEstados(ArrayList<Estado> estados) {
        this.estados = estados;
    }

    public ArrayList<Imc> getImc() {
        return imc;
    }

    public void setImc(ArrayList<Imc> imc) {
        this.imc = imc;
    }

    public ArrayList<Obeso> getObesos() {
        return obesos;
    }

    public void setObesos(ArrayList<Obeso> obesos) {
        this.obesos = obesos;
    }

    public ArrayList<TipoSanguineo> getTipoSanguineo() {
        return tipo_sanguineo;
    }

    public void setTipoSanguineo(ArrayList<TipoSanguineo> tipo_sanguineo) {
        this.tipo_sanguineo = tipo_sanguineo;
    }

    public ArrayList<GrupoSanguineo> getGrupoSanguineo() {
        return grupo_sanguineo;
    }

    public void setGrupoSanguineo(ArrayList<GrupoSanguineo> grupo_sanguineo) {
        this.grupo_sanguineo = grupo_sanguineo;
    }

}
