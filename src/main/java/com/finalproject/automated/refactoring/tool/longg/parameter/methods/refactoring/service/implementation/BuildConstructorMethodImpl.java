package com.finalproject.automated.refactoring.tool.longg.parameter.methods.refactoring.service.implementation;

import com.finalproject.automated.refactoring.tool.longg.parameter.methods.refactoring.service.BuildConstructorMethod;
import com.finalproject.automated.refactoring.tool.model.MethodModel;
import com.finalproject.automated.refactoring.tool.model.PropertyModel;
import org.springframework.stereotype.Service;

@Service
public class BuildConstructorMethodImpl implements BuildConstructorMethod {

    private static final String KEYWORD = "public";
    private static final String OPEN_PARENTHESIS = "(";
    private static final String CLOSE_PARENTHESIS = ")";
    private static final String OPEN_BRACKETS = "{";
    private static final String CLOSE_BRACKETS = "}";
    private static final String SEMI_COLON = "(";
    private static final String EQUALS = "=";
    private static final String SPACE = " ";
    private static final String LINE_BREAK = "\n";
    private static final String COMMA = ",";

    @Override
    public String build(MethodModel methodModel) {
        StringBuilder objectClass = new StringBuilder();
        objectClass.append(KEYWORD).append(SPACE)
                .append(methodModel.getName())
                .append(OPEN_PARENTHESIS);
        for (PropertyModel cont : methodModel.getParameters()) {
            objectClass.append(cont.getType()).append(SPACE).append(cont.getName()).append(COMMA);
        }
        objectClass.append(CLOSE_PARENTHESIS).append(OPEN_BRACKETS).append(LINE_BREAK);
        for (PropertyModel varr : methodModel.getParameters()) {
            objectClass.append("this.")
                    .append(varr.getName())
                    .append(SPACE).append(EQUALS).append(SPACE)
                    .append(varr.getName())
                    .append(SEMI_COLON)
                    .append(LINE_BREAK);

        }
        objectClass.append(CLOSE_BRACKETS);

        return objectClass.toString();
    }
}
