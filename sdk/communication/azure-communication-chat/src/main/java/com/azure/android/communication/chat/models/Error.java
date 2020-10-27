// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.android.communication.chat.models;

import com.azure.android.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The Error model.
 */
@Immutable
public final class Error {
    /*
     * The code property.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * The message property.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * The target property.
     */
    @JsonProperty(value = "target", access = JsonProperty.Access.WRITE_ONLY)
    private String target;

    /*
     * The innerErrors property.
     */
    @JsonProperty(value = "innerErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<Error> innerErrors;

    /**
     * Get the code property: The code property.
     * 
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: The message property.
     * 
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the target property: The target property.
     * 
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Get the innerErrors property: The innerErrors property.
     * 
     * @return the innerErrors value.
     */
    public List<Error> getInnerErrors() {
        return this.innerErrors;
    }
}