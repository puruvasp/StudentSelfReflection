package com.puruvas.StudentSelfReflection.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;



@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler
{
    @ExceptionHandler(ResourseNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(
            ResourseNotFoundException exception,
            WebRequest webRequest
    )
    {
        ErrorDetails errorDetails = new ErrorDetails(
                LocalDateTime.now(),exception.getMessage(),
                webRequest.getDescription(false),
                "USER_NOT_FOUND");

        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleGlobalException(
            ResourseNotFoundException exception,
            WebRequest webRequest
    )
    {
        ErrorDetails errorDetails = new ErrorDetails(
                LocalDateTime.now(),exception.getMessage(),
                webRequest.getDescription(false),
                "INTERNAL_SERVER_ERROR");

        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
