package br.com.jamilysilva.produtosapi.entity.repository;

import br.com.jamilysilva.produtosapi.entity.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String>{

    List<Produto> findByNome(String nome);


}
