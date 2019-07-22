package com.finalproject.automated.refactoring.tool.longg.parameter.refactoring.service;

import com.finalproject.automated.refactoring.tool.model.MethodModel;
import org.springframework.lang.NonNull;

import java.util.List;

public interface MergeObjectClass {
    String refactor(@NonNull MethodModel methodModel);

    List<String> refactor(@NonNull List<MethodModel> methodModels);
}
