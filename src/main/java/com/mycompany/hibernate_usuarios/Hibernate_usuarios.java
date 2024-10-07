package com.mycompany.hibernate_usuarios;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Hibernate_usuarios {

    public static void main(String[] args) {   
        SessionFactory sessionFactory = HiberneteUtil.getSessionFactory();
        Transaction transaction = null;
        
        try (Session session = sessionFactory.openSession()) {
            // Iniciar una transacción 
            transaction = session.beginTransaction();
            
            Usuario usuario = new Usuario("Pedro","123");                      
            session.persist(usuario);
            
            usuario = new Usuario("César","123");                      
            session.persist(usuario);
            
            usuario = new Usuario("Juán","123");            
            session.persist(usuario);
            
            usuario = new Usuario("Isabel","123");            
            session.persist(usuario);
            
            transaction.commit();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
