package com.deliverytech.delivery_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliverytech.delivery_api.entity.ItemPedido;

public interface IItemPedidoRepository extends JpaRepository<ItemPedido, Long> {

}
