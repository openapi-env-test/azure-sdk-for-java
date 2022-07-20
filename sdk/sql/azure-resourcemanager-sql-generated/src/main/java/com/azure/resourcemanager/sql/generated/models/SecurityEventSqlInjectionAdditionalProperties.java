// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of a security event sql injection additional properties. */
@Immutable
public final class SecurityEventSqlInjectionAdditionalProperties {
    /*
     * The threat ID.
     */
    @JsonProperty(value = "threatId", access = JsonProperty.Access.WRITE_ONLY)
    private String threatId;

    /*
     * The statement
     */
    @JsonProperty(value = "statement", access = JsonProperty.Access.WRITE_ONLY)
    private String statement;

    /*
     * The statement highlight offset
     */
    @JsonProperty(value = "statementHighlightOffset", access = JsonProperty.Access.WRITE_ONLY)
    private Integer statementHighlightOffset;

    /*
     * The statement highlight length
     */
    @JsonProperty(value = "statementHighlightLength", access = JsonProperty.Access.WRITE_ONLY)
    private Integer statementHighlightLength;

    /*
     * The sql error code
     */
    @JsonProperty(value = "errorCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer errorCode;

    /*
     * The sql error severity
     */
    @JsonProperty(value = "errorSeverity", access = JsonProperty.Access.WRITE_ONLY)
    private Integer errorSeverity;

    /*
     * The sql error message
     */
    @JsonProperty(value = "errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /**
     * Get the threatId property: The threat ID.
     *
     * @return the threatId value.
     */
    public String threatId() {
        return this.threatId;
    }

    /**
     * Get the statement property: The statement.
     *
     * @return the statement value.
     */
    public String statement() {
        return this.statement;
    }

    /**
     * Get the statementHighlightOffset property: The statement highlight offset.
     *
     * @return the statementHighlightOffset value.
     */
    public Integer statementHighlightOffset() {
        return this.statementHighlightOffset;
    }

    /**
     * Get the statementHighlightLength property: The statement highlight length.
     *
     * @return the statementHighlightLength value.
     */
    public Integer statementHighlightLength() {
        return this.statementHighlightLength;
    }

    /**
     * Get the errorCode property: The sql error code.
     *
     * @return the errorCode value.
     */
    public Integer errorCode() {
        return this.errorCode;
    }

    /**
     * Get the errorSeverity property: The sql error severity.
     *
     * @return the errorSeverity value.
     */
    public Integer errorSeverity() {
        return this.errorSeverity;
    }

    /**
     * Get the errorMessage property: The sql error message.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
