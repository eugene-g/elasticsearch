/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.watcher.input.http;

import org.elasticsearch.watcher.input.InputException;

/**
 *
 */
public class HttpInputException extends InputException {

    public HttpInputException(String msg, Object... args) {
        super(msg, args);
    }

    public HttpInputException(String msg, Throwable cause, Object... args) {
        super(msg, cause, args);
    }
}
