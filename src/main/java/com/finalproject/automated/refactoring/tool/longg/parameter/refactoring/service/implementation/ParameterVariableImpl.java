package com.finalproject.automated.refactoring.tool.longg.parameter.refactoring.service.implementation;

import com.finalproject.automated.refactoring.tool.longg.parameter.refactoring.service.ParameterVariable;
import com.finalproject.automated.refactoring.tool.model.MethodModel;
import com.finalproject.automated.refactoring.tool.model.PropertyModel;

import java.util.List;
import java.util.Map;

public class ParameterVariableImpl implements ParameterVariable {
    private static final String KEYWORD = "private";
    private static final String SPACE = " ";
    private static final String SEMI_COLON = ";";
    private static final String LINE_BREAK = "\n";

    @Override
    public String build(MethodModel methodModel) {
        StringBuilder objectClass = new StringBuilder();
        for (PropertyModel attr : methodModel.getParameters()) {
            objectClass.append(KEYWORD).append(SPACE)
                    .append(attr.getType())
                    .append(SPACE)
                    .append(attr.getName())
                    .append(SEMI_COLON)
                    .append(LINE_BREAK);
        }
        return objectClass.toString();
    }
}
