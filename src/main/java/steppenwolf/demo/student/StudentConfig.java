package steppenwolf.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
                    Student luciana = new Student("Luciana", "lu@gmail.com", LocalDate.of(2000, Month.JANUARY, 5));
                    Student paula = new Student("Paula", "paula@gmail.com", LocalDate.of(2000, Month.FEBRUARY, 15));

                    repository.saveAll(Arrays.asList(luciana, paula));

        };
    }
}
