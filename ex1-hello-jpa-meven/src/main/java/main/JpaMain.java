package main;

import entity.Child;
import entity.ChildId;
import entity.Parent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.SQLException;

public class JpaMain {
    public static void main(String[] args) throws SQLException {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        try {
            System.out.println("--------------------------시작------------------------");

            Parent parent = new Parent();
            parent.setName("부모");

            em.persist(parent);
            Child child = new Child(parent,"자식");
            em.persist(child);
//            ChildId childId = new ChildId(parent.getId(),);



            tx.commit();
        } catch (Exception e){

        }finally {
            em.close();
            emf.close();

        }
    }
}
