package com.finalproject.automated.refactoring.tool.longg.parameter.methods.refactoring.service.implementation;

import com.finalproject.automated.refactoring.tool.longg.parameter.methods.refactoring.service.ClassBuilding;
import com.finalproject.automated.refactoring.tool.model.MethodModel;
import org.springframework.stereotype.Service;

@Service
public class ClassBuildingImpl implements ClassBuilding {

    public static final String KEYWORD = "public";
    public static final String TYPE = "class";
    public static final String SPACE = " ";

    @Override
    public String declare(MethodModel methodModel) {
        StringBuilder objectClass = new StringBuilder();
        objectClass.append(KEYWORD).append(SPACE).append(TYPE).append(SPACE);

        return objectClass.toString();
    }
}
