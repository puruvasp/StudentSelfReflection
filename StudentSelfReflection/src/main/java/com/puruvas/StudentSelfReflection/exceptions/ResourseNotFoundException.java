package com.puruvas.StudentSelfReflection.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value =HttpStatus.NOT_FOUND)
public class ResourseNotFoundException extends RuntimeException{
    public ResourseNotFoundException(String resourceName, String fieldName, String fieldValue)
    {
        super(String.format("%s Not Found With %s : %s",resourceName,fieldName,fieldValue));
    }

}
