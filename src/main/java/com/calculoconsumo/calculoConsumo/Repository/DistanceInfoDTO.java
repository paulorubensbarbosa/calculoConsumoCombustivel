package com.calculoconsumo.calculoConsumo.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class DistanceInfoDTO {
    private String origem;
    private String destino;
    private double distancia;
    private double kmPorLitro;
    private double precodoLitro;
    private double valorDaViagem;

    public DistanceInfoDTO() {
    }

    public DistanceInfoDTO(String origem, String destino, double distancia, double kmPorLitro, double precodoLitro, double valorDaViagem) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.kmPorLitro = kmPorLitro;
        this.precodoLitro = precodoLitro;
        this.valorDaViagem = valorDaViagem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getKmPorLitro() {
        return kmPorLitro;
    }

    public void setKmPorLitro(double kmPorLitro) {
        this.kmPorLitro = kmPorLitro;
    }

    public double getPrecodoLitro() {
        return precodoLitro;
    }

    public void setPrecodoLitro(double precodoLitro) {
        this.precodoLitro = precodoLitro;
    }

    public double getValorDaViagem() {
        return valorDaViagem;
    }

    public void setValorDaViagem(double valorDaViagem) {
        this.valorDaViagem = valorDaViagem;
    }
}
