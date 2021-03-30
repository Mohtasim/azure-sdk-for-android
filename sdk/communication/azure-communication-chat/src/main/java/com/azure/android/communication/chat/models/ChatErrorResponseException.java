// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.android.communication.chat.models;

import com.azure.android.core.http.exception.HttpResponseException;
import com.azure.android.core.http.HttpResponse;

/**
 * Exception thrown on chat specific errors
 */
public final class ChatErrorResponseException extends HttpResponseException {
    /**
     * Initializes a new instance of the ChatErrorResponseException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public ChatErrorResponseException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the ChatErrorResponseException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public ChatErrorResponseException(
        String message, HttpResponse response, ChatError value) {
        super(message, response, value);
    }

    @Override
    public ChatError getValue() {
        return (ChatError) super.getValue();
    }
}
