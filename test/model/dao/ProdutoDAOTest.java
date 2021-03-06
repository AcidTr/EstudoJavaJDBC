/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Categoria;
import model.bean.Produto;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Victor
 */
public class ProdutoDAOTest {
    
    public ProdutoDAOTest() {
    }

    /**
     * Test of save method, of class ProdutoDAO.
     */
    @Test
    @Ignore
    public void inserir() {
        
        Categoria categoria = new Categoria();
        categoria.setIdCategoria(2);
        
        Produto produto = new Produto();
        produto.setDescricao("Feijão");
        produto.setQtd(20);
        produto.setValor(10);
        produto.setCategoria(categoria);
        
        ProdutoDAO dao = new ProdutoDAO();
        
        if(dao.save(produto)){
            System.out.println("Salvo com sucesso!");
        }else{
            fail("Erro ao salvar");
        }
        
    }
    @Test
    public void listar(){
        ProdutoDAO dao = new ProdutoDAO();
        
        for(Produto p: dao.findAll()){
            
            System.out.println("Descrição: "+p.getDescricao()+" Descrição Categoria: "+p.getCategoria().getDescricao());
            
        }
    }
    
}
