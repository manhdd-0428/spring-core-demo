package com.example.demoweb.dao;

import com.example.demoweb.entity.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentDaoImpl {
    private HibernateTemplate hTemplate;

    public void sethTemplate(HibernateTemplate hTemplate) {
        this.hTemplate = hTemplate;
    }

    @Transactional
    public int insert(Student s) {
        return (int) hTemplate.save(s);
    }

    @Transactional
    public void delete(int id) {
        Student s=hTemplate.get(Student.class,id);
        hTemplate.delete(s);
    }

    @Transactional
    public void delete(Student s) {
        hTemplate.delete(s);
    }

    @Transactional
    public void update(Student s) {
        hTemplate.update(s);
    }

    public Student getStudent(int id) {
        return hTemplate.get(Student.class,id);
    }

    public List<Student> getAllStudents() {
        return hTemplate.loadAll(Student.class);
    }
}
