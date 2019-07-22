package com.finalproject.automated.refactoring.tool.longg.parameter.methods.refactoring.service;

import com.finalproject.automated.refactoring.tool.model.MethodModel;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MergeObjectClass {
    String refactor(@NonNull MethodModel methodModel);

    List<String> refactor(@NonNull List<MethodModel> methodModels);
}
