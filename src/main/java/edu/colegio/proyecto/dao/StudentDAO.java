package edu.colegio.proyecto.dao;

import edu.colegio.proyecto.model.Student;
import jakarta.persistence.*;
import java.util.List;

public class StudentDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("colegioPU");

    public void guardar(Student s) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
        em.close();
    }

    public List<Student> listar() {
        EntityManager em = emf.createEntityManager();
        List<Student> lista = em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
        em.close();
        return lista;
    }
}
