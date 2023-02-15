// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Path to match for routing. */
@Fluent
public final class HttpRouteMatchPath {
    /*
     * Uri path to match for request.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /*
     * replacement string for matched part of the Uri.
     */
    @JsonProperty(value = "rewrite")
    private String rewrite;

    /*
     * how to match value in the Uri
     */
    @JsonProperty(value = "type", required = true)
    private PathMatchType type;

    /** Creates an instance of HttpRouteMatchPath class. */
    public HttpRouteMatchPath() {
    }

    /**
     * Get the value property: Uri path to match for request.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Uri path to match for request.
     *
     * @param value the value value to set.
     * @return the HttpRouteMatchPath object itself.
     */
    public HttpRouteMatchPath withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the rewrite property: replacement string for matched part of the Uri.
     *
     * @return the rewrite value.
     */
    public String rewrite() {
        return this.rewrite;
    }

    /**
     * Set the rewrite property: replacement string for matched part of the Uri.
     *
     * @param rewrite the rewrite value to set.
     * @return the HttpRouteMatchPath object itself.
     */
    public HttpRouteMatchPath withRewrite(String rewrite) {
        this.rewrite = rewrite;
        return this;
    }

    /**
     * Get the type property: how to match value in the Uri.
     *
     * @return the type value.
     */
    public PathMatchType type() {
        return this.type;
    }

    /**
     * Set the type property: how to match value in the Uri.
     *
     * @param type the type value to set.
     * @return the HttpRouteMatchPath object itself.
     */
    public HttpRouteMatchPath withType(PathMatchType type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model HttpRouteMatchPath"));
        }
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model HttpRouteMatchPath"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HttpRouteMatchPath.class);
}
