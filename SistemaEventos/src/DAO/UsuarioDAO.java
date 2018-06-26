/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author beama
 */
public class UsuarioDAO {
    //private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    
    public UsuarioDAO(){
        this.connection = new ConncetionFactory().getConnection();
    }
    public void adiciona(Usuario usuario){
        String sql = INSERT INTO usuario(nome,cpf,email,telefone)VALUES(?,?,?,?,?);
        try{
            
        }
    }
}
