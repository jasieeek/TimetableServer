package pl.timetable.shedule;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.timetable.shedule.model.Lesson;
import pl.timetable.shedule.model.User;
import pl.timetable.shedule.repository.LessonRepository;
import pl.timetable.shedule.repository.UserRepository;

import java.util.stream.Stream;

@SpringBootApplication
public class SheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SheduleApplication.class, args);
    }

//    @Bean
//    CommandLineRunner initUser(UserRepository userRepository) {
//        return args -> {
//            Stream.of("John", "Adrianna", "Jennifer", "Helen", "Rachel").forEach(name -> {
//                User user = new User();
//                user.setName(name);
//                userRepository.save(user);
//            });
//            userRepository.findAll().forEach(System.out::println);
//        };
//    }

    @Bean
    CommandLineRunner initLesson(LessonRepository lessonRepository) {
        return args -> {
            Stream.of("Matematyka", "Polski", "Angielski", "Religia", "Informatyka", "WF").forEach(name -> {
                Lesson lesson = new Lesson(name, "Teacher", " 404");
                lesson.setClassName("1C");
                lessonRepository.save(lesson);
            });
            Stream.of("Matematyka", "Polski", "Angielski", "Religia", "Informatyka").forEach(name -> {
                Lesson lesson = new Lesson(name, "Teacher", " 404");
                lesson.setClassName("2C");
                lessonRepository.save(lesson);
            });
            lessonRepository.findAll().forEach(System.out::println);
        };
    }
    @Bean
    CommandLineRunner initClassName(LessonRepository lessonRepository) {
        return args -> {
            System.out.println(lessonRepository.findDistinctClassName());
        };
    }
}
