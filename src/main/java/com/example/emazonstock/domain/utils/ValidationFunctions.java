package com.example.emazonstock.domain.utils;

import com.example.emazonstock.domain.exceptions.*;

import static com.example.emazonstock.domain.utils.DomainConstants.*;

public class ValidationFunctions{

    private ValidationFunctions() {throw new IllegalStateException("Utility class");
    }

    public static void alreadyDeclaredValueValidation(String value){
        if(value != null) {throw new AlreadyDeclaredValueException(FIELD_ALREADY_DECLARED_VALUE);}
    }

}
