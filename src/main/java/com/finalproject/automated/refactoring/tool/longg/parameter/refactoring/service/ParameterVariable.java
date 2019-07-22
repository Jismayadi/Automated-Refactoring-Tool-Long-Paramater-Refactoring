package com.finalproject.automated.refactoring.tool.longg.parameter.refactoring.service;

import com.finalproject.automated.refactoring.tool.model.MethodModel;
import org.springframework.lang.NonNull;

public interface ParameterVariable {
    String build(@NonNull MethodModel methodModel);
}
