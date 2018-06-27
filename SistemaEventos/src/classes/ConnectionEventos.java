/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author curso
 */
public class ConnectionEventos 
{
    
    public ConnectionEventos()
    {}
    
    //Função para conectar ao banco de dados
    public Connection conectaBaseDados()
    {
        //private Connection conn;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String strUrl = "jdbc:mysql://localhost:3306/SistemaEventos";
            Connection conn = DriverManager.getConnection(strUrl, "root", "");
            
            System.out.println("Conexão efetuada com Sucesso!!");
            
            return conn;
        }
        catch (Exception e)
        {
            System.out.println("Erro ao realizar a conexão.");
            e.printStackTrace();
            return null;
        }
     }
    
    //Desconectar o banco de dados
    public void desconectaBaseDados(Connection con)
    {
        try
        {
            con.close();
            System.out.println ("Conexão Finalizada");
        }
        catch (Exception e)
        {
            System.out.println ("Problemas com a desconexão!!");
        }
    }
}
