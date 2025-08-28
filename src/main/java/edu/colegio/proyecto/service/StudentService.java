package edu.colegio.proyecto.service;

import edu.colegio.proyecto.dao.StudentDAO;
import edu.colegio.proyecto.model.Student;
import java.util.List;

public class StudentService {
    private StudentDAO dao = new StudentDAO();

    public void guardarEstudiante(Student s) {
        dao.guardar(s);
    }

    public List<Student> listarEstudiantes() {
        return dao.listar();
    }
}
