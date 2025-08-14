package com.deliverytech.delivery_api.service;

import java.util.List;

import com.deliverytech.delivery_api.dto.ProdutoDto;

public interface ProdutoService {
    public Long cadastrarProduto(ProdutoDto dto);

    public List<ProdutoDto> buscarProdutosPorRestaurante(Long restauranteId);

    public ProdutoDto buscarProdutoPorId(Long id);

    public ProdutoDto atualizarProduto(Long id, ProdutoDto ProdutoDto);

    public ProdutoDto alterarDisponibilidade(Long id, boolean disponivel);

    public ProdutoDto buscarProdutosPorCategoria(String categoria);

    public List<ProdutoDto> findAll();
}
