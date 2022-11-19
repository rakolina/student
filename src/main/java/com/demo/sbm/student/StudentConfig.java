package com.demo.sbm.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository ) {

        return args -> {
            Student lain = new Student("Lain Iwakura",
                    "lain@serialexperiments.com" ,
                    LocalDate.of ( 1984, Month.JULY, 6 )
                    );
            Student mika = new Student("Mika Iwakura",
                    "mika@serialexperiments.com" ,
                    LocalDate.of ( 1982, Month.MARCH, 7 )
            );
            studentRepository.saveAll (
                    List.of( lain, mika )
            );
        };
/*

//                new Student (
//                        1L,
//                        "Mary Rose",
//                        "maryrose@maryrose.com",
//                        LocalDate.of ( 2000, Month.OCTOBER, 5 ),
//                        21 )
 */
    }

}
