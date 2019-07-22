package com.finalproject.automated.refactoring.tool.longg.parameter.methods.refactoring.service;

import com.finalproject.automated.refactoring.tool.model.MethodModel;
import lombok.NonNull;

public interface BuildConstructorMethod {
    String build(@NonNull MethodModel methodModel);
}
