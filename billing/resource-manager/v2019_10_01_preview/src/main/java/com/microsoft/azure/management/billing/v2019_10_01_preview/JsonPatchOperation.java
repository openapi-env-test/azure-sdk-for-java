/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Json Patch definition.
 */
public class JsonPatchOperation {
    /**
     * The value.
     */
    @JsonProperty(value = "value")
    private Object value;

    /**
     * The target location.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * The operation.
     */
    @JsonProperty(value = "op")
    private String op;

    /**
     * The source location.
     */
    @JsonProperty(value = "from")
    private String from;

    /**
     * Get the value.
     *
     * @return the value value
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value.
     *
     * @param value the value value to set
     * @return the JsonPatchOperation object itself.
     */
    public JsonPatchOperation withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the target location.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the target location.
     *
     * @param path the path value to set
     * @return the JsonPatchOperation object itself.
     */
    public JsonPatchOperation withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the operation.
     *
     * @return the op value
     */
    public String op() {
        return this.op;
    }

    /**
     * Set the operation.
     *
     * @param op the op value to set
     * @return the JsonPatchOperation object itself.
     */
    public JsonPatchOperation withOp(String op) {
        this.op = op;
        return this;
    }

    /**
     * Get the source location.
     *
     * @return the from value
     */
    public String from() {
        return this.from;
    }

    /**
     * Set the source location.
     *
     * @param from the from value to set
     * @return the JsonPatchOperation object itself.
     */
    public JsonPatchOperation withFrom(String from) {
        this.from = from;
        return this;
    }

}
