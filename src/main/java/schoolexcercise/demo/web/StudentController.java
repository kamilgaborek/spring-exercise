package schoolexcercise.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import schoolexcercise.demo.data.StudentRepository;
import schoolexcercise.demo.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @GetMapping("/all")
    private Iterable<Student> getAll(){
        return studentRepository.findAll();
    }

    @PostMapping
    public Student save(@RequestBody Student student){
        return studentRepository.save(student);
    }
}
