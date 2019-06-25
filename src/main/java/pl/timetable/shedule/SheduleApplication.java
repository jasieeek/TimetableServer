package pl.timetable.shedule;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.timetable.shedule.model.Classroom;
import pl.timetable.shedule.model.Lesson;
import pl.timetable.shedule.model.Teacher;
import pl.timetable.shedule.model.User;
import pl.timetable.shedule.repository.ClassroomRepository;
import pl.timetable.shedule.repository.LessonRepository;
import pl.timetable.shedule.repository.TeacherRepository;
import pl.timetable.shedule.repository.UserRepository;


import java.time.DayOfWeek;
import java.util.stream.Stream;

@SpringBootApplication
public class SheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SheduleApplication.class, args);
    }

    @Bean
    CommandLineRunner initUser(UserRepository userRepository) {
        return args -> {
            Stream.of("John", "Adrianna", "Jennifer", "Helen", "Rachel").forEach(name -> {
                User user = new User();
                user.setName(name);
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }

    @Bean
    CommandLineRunner initLesson(LessonRepository lessonRepository) {
        return args -> {
            Lesson lesson1 = new Lesson("Matematyka", "Andrzej Lenarcik", "114", "1A", DayOfWeek.MONDAY, 4);
            Lesson lesson2 = new Lesson("Programowanie JAVA", "Pawel Paduch", "314", "1A", DayOfWeek.TUESDAY, 3);
            Lesson lesson3 = new Lesson("Statystyka", "Stanislaw Deniziak", "211", "1C", DayOfWeek.FRIDAY, 6);

            lessonRepository.save(lesson1);
            lessonRepository.save(lesson2);
            lessonRepository.save(lesson3);

            lessonRepository.findAll().forEach(System.out::println);
        };
    }
    @Bean
    CommandLineRunner initTeacher(TeacherRepository teacherRepository) {
        return args -> {
            Teacher teacher1 = new Teacher("Arkadiusz", "Chrobot");
            Teacher teacher2 = new Teacher("Andrzej", "Lenarcik");
            Teacher teacher3 = new Teacher("Miroslaw", "Plaza");
            teacherRepository.save(teacher1);
            teacherRepository.save(teacher2);
            teacherRepository.save(teacher3);
            teacherRepository.findAll().forEach(System.out::println);
        };
    }
    @Bean
    CommandLineRunner initClassName(LessonRepository lessonRepository) {
        return args -> {
            System.out.println(lessonRepository.findDistinctClassName());
        };
    }

    @Bean
    CommandLineRunner initClassroom(ClassroomRepository classroomRepository) {
        return args -> {
            Classroom classroom1 = new Classroom("101");
            Classroom classroom2 = new Classroom("102");
            Classroom classroom3 = new Classroom("201");

            classroomRepository.save(classroom1);
            classroomRepository.save(classroom2);
            classroomRepository.save(classroom3);
        };
    }
}
