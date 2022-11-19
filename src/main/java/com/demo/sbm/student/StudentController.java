package com.demo.sbm.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ( path = "api/v1/student" )
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController ( StudentService studentService ) {

        this.studentService = studentService;
    }

    @GetMapping
    public List< Student > greeting ( ) {
        return studentService.getStudents ( );
    }

    @PostMapping
    public void registerNewStudent ( @RequestBody Student newStudent ) {
        studentService.addNewStudent ( newStudent );
    }

    @DeleteMapping ( path = "{studentId}" )
    public void removeStudent ( @PathVariable ( "studentId" ) Long studentId) {
        studentService.removeStudent ( studentId );
    }
}
