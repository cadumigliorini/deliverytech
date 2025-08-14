package com.deliverytech.delivery_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deliverytech.delivery_api.dto.ProdutoDto;
import com.deliverytech.delivery_api.entity.Produto;
import com.deliverytech.delivery_api.repository.IProdutoRepository;

import jakarta.persistence.EntityNotFoundException;

import org.modelmapper.ModelMapper;

@Service
public class ProdutoServiceImpl implements ProdutoService {
    @Autowired
    private IProdutoRepository repository;

    public ProdutoServiceImpl(IProdutoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Long cadastrarProduto(ProdutoDto produtoDto) {
        ModelMapper modelMapper = new ModelMapper();
        Produto produto = modelMapper.map(produtoDto, Produto.class);
        Produto ProdutoSalvo = repository.save(produto);
        return ProdutoSalvo.getId();
    }

    @Override
    public List<ProdutoDto> buscarProdutosPorRestaurante(Long restauranteId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarProdutosPorRestaurante'");
    }

    @Override
    public ProdutoDto buscarProdutoPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarProdutoPorId'");
    }

    @Override
    public ProdutoDto atualizarProduto(Long id, ProdutoDto produtoDto) {
        Produto produto = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Produto não encontrado com ID: " + id));
        produto.setNome(produtoDto.getNome());
        produto.setCategoria(produtoDto.getCategoria());
        produto.setDescricao(produtoDto.getDescricao());
        produto.setPreco(produtoDto.getPreco());
        produto.setDisponivel(produtoDto.isDisponivel());
        repository.save(produto);
        return produtoDto;
    }

    @Override
    public ProdutoDto alterarDisponibilidade(Long id, boolean disponivel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterarDisponibilidade'");
    }

    @Override
    public ProdutoDto buscarProdutosPorCategoria(String categoria) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarProdutosPorCategoria'");
    }

    @Override
    public List<ProdutoDto> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

}
