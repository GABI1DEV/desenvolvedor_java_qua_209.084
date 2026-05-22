package com.crud.javalanches.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Pedido {
    private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long CodigoPedido;

    @Column(nullable = false)
    private LocalDateTime dataHoraPedido;
    @Column(precision = 10, scale = 2, nullable =  false)
    private BigDecimal valorTotalPedido;

    public Pedido() {

    }

    public long getCodigoPedido() {
        return this.CodigoPedido;
    }

    public void setCodigoPedido(long CodigoPedido) {
        this.CodigoPedido = CodigoPedido;
    }

    public LocalDateTime getDataHoraPedido() {
        return this.dataHoraPedido;
    }

    public void setDataHoraPedido(LocalDateTime dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public BigDecimal getValorTotalPedido() {
        return this.valorTotalPedido;
    }

    public void setValorTotalPedido(BigDecimal valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }



}
