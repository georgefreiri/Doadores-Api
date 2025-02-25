package br.com.doador.api.modelo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Obeso implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    public String masculino;
    public String feminino;
    public double percentualMasculino;
    public double percentualFeminino;
    public String guid;

    public String getMasculino() {
        return masculino;
    }

    public void setMasculino(String masculino) {
        this.masculino = masculino;
    }

    public String getFeminino() {
        return feminino;
    }

    public void setFeminino(String feminino) {
        this.feminino = feminino;
    }

    public double getPercentualMasculino() {
        return percentualMasculino;
    }

    public void setPercentualMasculino(double percentualMasculino) {
        this.percentualMasculino = percentualMasculino;
    }

    public double getPercentualFeminino() {
        return percentualFeminino;
    }

    public void setPercentualFeminino(double percentualFeminino) {
        this.percentualFeminino = percentualFeminino;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

}
