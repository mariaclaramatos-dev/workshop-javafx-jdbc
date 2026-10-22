package org.example.workshopjavafxjdbc.model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException {

    private Map<String, String> errors = new HashMap<>(); //coleção com todos os erros possíveis

    public ValidationException(String msg) {
        super(msg);
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String errorMessage) {
        errors.put(fieldName, errorMessage);
    }
}
