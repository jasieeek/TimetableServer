package pl.timetable.shedule.controller;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import pl.timetable.shedule.model.ExceptionResponse;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;

@RestController
@ControllerAdvice(assignableTypes = ClassroomController.class)
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public final ResponseEntity<Object> handleEntityNotFound(EntityNotFoundException exception, WebRequest request) {
        ExceptionResponse response = new ExceptionResponse(LocalDateTime.now(), exception.getMessage(), request.getDescription(true));
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);

    }
}
