package com.sprigboot_crud.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException {
    private String resourceName;
    private String fieldName;
    private Object fieldValue;

    public ResourceNotFound( String resourceName, String fieldName, Object fieldValue) {
        super(String.format(  "%s %s $s", resourceName, fieldName));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    public String getFieldName() {
        return fieldName;
    }
}
