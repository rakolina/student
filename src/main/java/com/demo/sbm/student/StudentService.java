package com.demo.sbm.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService ( StudentRepository studentRepository ) {
        this.studentRepository = studentRepository;
    }

    public List< Student > getStudents ( ) {
        return studentRepository.findAll ( );
    }

    public void addNewStudent ( Student newStudent ) {
        Optional< Student > studentByEmail = studentRepository
                .findStudentByEmail ( newStudent.getEmail ( ) );
        if ( studentByEmail.isPresent ( ) ) {
            throw new IllegalStateException ( "email exists" );
        }
        studentRepository.save ( newStudent );
    }

    public void removeStudent ( Long studentId ) {
        Optional < Student > removeStudent = studentRepository
                .findById ( studentId );
        if ( removeStudent.isPresent () ) {
            studentRepository.delete ( removeStudent.get () );
        }
    }
}
