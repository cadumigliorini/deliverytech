package com.deliverytech.delivery_api.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ItemPedidoDto {
    private int quantidade;
    private BigDecimal precoUnitario;
    private BigDecimal subtotal;
}
