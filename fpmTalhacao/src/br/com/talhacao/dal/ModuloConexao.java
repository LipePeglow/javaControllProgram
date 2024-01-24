/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.talhacao.dal;

import java.sql.*;

/**
 *
 * @author felip
 */
public class ModuloConexao {

    //método responsável por estabelecer a conexão com o banco
    public static Connection conector() {

        Connection conexao = null;

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbtalhacao";
        String user = "root";
        String password = "root123";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            //System.out.println(e);
            
            return null;
        }
        
    }
}
