package com.finalproject.automated.refactoring.tool.longg.parameter.refactoring.service;

import com.finalproject.automated.refactoring.tool.model.MethodModel;
import org.springframework.lang.NonNull;

/**
 * @author Jismayadi
 * @version 1.0.0
 * @since 19 Juli 2019
 */

public interface ClassBuilding {
    String declare(@NonNull MethodModel methodModel);
}
