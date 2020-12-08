package schoolexcercise.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import schoolexcercise.demo.data.StudentRepository;
import schoolexcercise.demo.entity.Student;

@Component
public class Start {

    private StudentRepository studentRepository;

    @Autowired
    public Start(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onStartApplication(){
        Student student = new Student("Kamil","Wroclaw");
        Student student1 = new Student("Arek","Krakow");

        studentRepository.save(student);
        studentRepository.save(student1);
    }
}
