package edu.colegio.proyecto.web.bean;

import edu.colegio.proyecto.model.Student;
import edu.colegio.proyecto.service.StudentService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class StudentBean {
    private Student student = new Student();
    private List<Student> students;
    private StudentService service = new StudentService();

    @PostConstruct
    public void init() {
        students = service.listarEstudiantes();
    }

    public void guardar() {
        service.guardarEstudiante(student);
        students = service.listarEstudiantes();
        student = new Student();
    }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
    public List<Student> getStudents() { return students; }
}
