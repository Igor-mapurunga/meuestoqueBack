package com.meuEstoque.estoque_app.service;

import com.meuEstoque.estoque_app.model.Produto;
import com.meuEstoque.estoque_app.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(UUID id) {
        return produtoRepository.findById(id);
    }

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto atualizar(UUID id, Produto produtoAtualizado) {
        return produtoRepository.findById(id).map(produto -> {
            produto.setNome(produtoAtualizado.getNome());
            produto.setTipo(produtoAtualizado.getTipo());
            produto.setQuantidade(produtoAtualizado.getQuantidade());
            produto.setPreco(produtoAtualizado.getPreco());
            return produtoRepository.save(produto);
        }).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public void deletar(UUID id) {
        if (!produtoRepository.existsById(id)) {
            throw new RuntimeException("Produto não encontrado");
        }
        produtoRepository.deleteById(id);
    }
}
