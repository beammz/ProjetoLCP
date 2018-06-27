/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.ConnectionEventos;
import classes.Usuario;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/**
 *
 * @author beama
 */
public class UsuarioDAO {
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    
    public UsuarioDAO(){
        this.connection = new ConnectionEventos().conectaBaseDados();
    }
    public void adiciona(Usuario usuario){
        String sql = INSERT INTO usuario(nome,cpf,email,telefone)VALUES(?,?,?,?,?);
        try{
            
        }
    }
}
