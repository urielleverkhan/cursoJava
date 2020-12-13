package com.digital.innovation.jdbcjpamysql.conexao.jdbc.jpa.mysql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ConectionJPA {
    public static void main(String[] args) {
        try {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part2-DIO");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            //adicionar dados
            alunos adicionarAluno = new alunos("Oliver", 49, "Sp");
            String nome = "Uriel";
            String estado = "Sp";


            //entityManager.getTransaction().begin();

            //entityManager.persist(adicionarAluno);


            //entityManager.getTransaction().commit();

            //puxar dados

           // alunos encontrarAluno = entityManager.find(alunos.class,8);

           // System.out.println("ALuno encontrado antes de alterar "+encontrarAluno.getId()+ " " + encontrarAluno.getNome()+ " "+encontrarAluno.getEstado());

            //alterar dados
           // entityManager.getTransaction().begin();
           // encontrarAluno.setNome("Josiane");
           // encontrarAluno.setIdade(45);
                       //remove dados
            //entityManager.remove(encontrarAluno);
           // entityManager.getTransaction().commit();

           // System.out.println("ALuno encontrado depois de alterar "+encontrarAluno.getId()+ " " + encontrarAluno.getNome()+ " "+encontrarAluno.getEstado());


            //consulta jpql, trazer um aluno de acordo com o nome

            String jpql = "select a from alunos a where a.nome = :nome";
            alunos alunoJPQL = entityManager.createQuery(jpql, alunos.class).setParameter("nome", nome).getSingleResult();
            //System.out.println(alunoJPQL.getNome());

            String jpqlList = "select a from alunos a where a.estado =:estado";
            List<alunos> alunoJPQlList = entityManager.createQuery(jpqlList, alunos.class).setParameter("estado", estado).getResultList();
            alunoJPQlList.forEach(alunoPego -> System.out.println(alunoPego.getNome()+ " "));

            entityManager.close();
            entityManagerFactory.close();
        }catch (Exception e){
            System.out.println("falha " + e);
        }


    }
}
