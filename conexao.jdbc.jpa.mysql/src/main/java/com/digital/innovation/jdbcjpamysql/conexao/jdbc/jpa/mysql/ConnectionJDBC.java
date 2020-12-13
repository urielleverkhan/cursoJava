 package com.digital.innovation.jdbcjpamysql.conexao.jdbc.jpa.mysql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

 public class ConnectionJDBC {
    public static void main(String[] args)  {
        List<alunos> alunos = new ArrayList<>();

        String urlConnection = "jdbc:mysql://localhost/digital_innovation?useTimezone=true&serverTimezone=UTC";
        Connection con= null;
        try{
            con = DriverManager.getConnection( urlConnection, "root", "2443");
            PreparedStatement selectAlunos = con.prepareStatement("SELECT * FROM aluno");
            ResultSet resultado = selectAlunos.executeQuery();

            while(resultado.next()){
                alunos aluno = new alunos(  resultado.getInt("id"),
                                            resultado.getString("nome"),
                                            resultado.getInt("idade"),
                                            resultado.getString("estado"));
                alunos.add(aluno);

            }

        }catch (Exception e){
                System.out.println("Falha :: " + e);
        }
        alunos.forEach(al -> System.out.println(al.getId() +" "+ al.getNome()+ " "+al.getIdade()+ " "+al.getEstado()));



        }


}
