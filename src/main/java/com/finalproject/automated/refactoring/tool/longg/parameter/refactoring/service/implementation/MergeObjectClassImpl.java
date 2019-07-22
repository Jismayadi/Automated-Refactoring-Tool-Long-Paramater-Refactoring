package com.finalproject.automated.refactoring.tool.longg.parameter.refactoring.service.implementation;

import com.finalproject.automated.refactoring.tool.longg.parameter.refactoring.service.BuildConstructorMethod;
import com.finalproject.automated.refactoring.tool.longg.parameter.refactoring.service.ClassBuilding;
import com.finalproject.automated.refactoring.tool.longg.parameter.refactoring.service.MergeObjectClass;
import com.finalproject.automated.refactoring.tool.longg.parameter.refactoring.service.ParameterVariable;
import com.finalproject.automated.refactoring.tool.model.MethodModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MergeObjectClassImpl implements MergeObjectClass {

    @Autowired
    ClassBuilding classBuilding;

    @Autowired
    ParameterVariable parameterVariable;

    @Autowired
    BuildConstructorMethod buildConstructorMethod;

    private String LINE_BREAK = "\n";
    private String OPEN_BRACKET_PARENTHESIS = "{";
    private String CLOSE_BRACKET_PARENTHESIS = "}";

    @Override
    public String refactor(MethodModel methodModel) {
        return classBuilding.declare(methodModel) + OPEN_BRACKET_PARENTHESIS + LINE_BREAK +
                parameterVariable.build(methodModel) + LINE_BREAK + LINE_BREAK +
                buildConstructorMethod.build(methodModel) + LINE_BREAK +
                CLOSE_BRACKET_PARENTHESIS;
    }

    @Override
    public List<String> refactor(List<MethodModel> methodModels) {
        List<String> refactoringStrings = new ArrayList<>();
        for(MethodModel source : methodModels){
            refactoringStrings.add(refactor(source));
        }
        return refactoringStrings;
    }
}
