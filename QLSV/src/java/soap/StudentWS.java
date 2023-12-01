/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soap;

import entities.Student;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
@WebService(serviceName = "StudentWS")
public class StudentWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "findAll")
    public List<Student> findAll() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QLSVPU");
        EntityManager em = factory.createEntityManager();
        Query q = em.createNamedQuery("Student.findAll",Student.class);
        return q.getResultList();
    }
    
    @WebMethod(operationName = "addStudent")
    public void addStuednt(String rollNo, String name, String emali, int age){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QLSVPU");
        EntityManager em = factory.createEntityManager();
        
        Student std = new Student();
        std.setRollno(rollNo);
        std.setName(name);
        std.setEmail(emali);
        std.setAge(age);
        
        em.getTransaction().begin();
        em.persist(std);
        em.getTransaction().commit();
    }
    
    @WebMethod(operationName = "deleteStudent")
    public void deleteStudent (String rollNo){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QLSVPU");
        EntityManager em = factory.createEntityManager();
        
        Student std = em.find(Student.class, rollNo);

        em.getTransaction().begin();
        em.remove(std);
        em.getTransaction().commit();
    }
    
    @WebMethod(operationName = "updateStudent")
    public void updateStudent (String rollNo, String name, String emali, int age){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QLSVPU");
        EntityManager em = factory.createEntityManager();
        
        Student std = em.find(Student.class, rollNo);
        
        em.getTransaction().begin();
        std.setName(name);
        std.setEmail(emali);
        std.setAge(age);
        em.getTransaction().commit();
    }
    
    @WebMethod(operationName = "findStudent")
    public Student findStudent(String id) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("QLSVPU");
        EntityManager em = factory.createEntityManager();
        
        return em.find(Student.class, id);
    }
}
