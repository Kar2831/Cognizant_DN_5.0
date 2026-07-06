package com.example.Ex2.service;

import com.example.Ex2.model.Employee;
import com.example.Ex2.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .buildSessionFactory();

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Transactional
    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void addEmployeeHibernate(Employee employee){
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeId = null;
        try{
            tx = session.beginTransaction();
            session.persist(employee);
            tx.commit();
        }catch(HibernateException e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally{
            session.close();
        }
    }

}
