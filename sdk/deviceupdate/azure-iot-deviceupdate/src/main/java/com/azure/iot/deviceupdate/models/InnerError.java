package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An object containing more specific information than the current object about the error. */
@Fluent
public final class InnerError {
    /*
     * A more specific error code than what was provided by the containing
     * error.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * A human-readable representation of the error.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The internal error or exception message.
     */
    @JsonProperty(value = "errorDetail")
    private String errorDetail;

    /*
     * An object containing more specific information than the current object
     * about the error.
     */
    @JsonProperty(value = "innerError")
    private InnerError innerError;

    /**
     * Get the code property: A more specific error code than what was provided by the containing error.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: A more specific error code than what was provided by the containing error.
     *
     * @param code the code value to set.
     * @return the InnerError object itself.
     */
    public InnerError setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: A human-readable representation of the error.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: A human-readable representation of the error.
     *
     * @param message the message value to set.
     * @return the InnerError object itself.
     */
    public InnerError setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the errorDetail property: The internal error or exception message.
     *
     * @return the errorDetail value.
     */
    public String getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * Set the errorDetail property: The internal error or exception message.
     *
     * @param errorDetail the errorDetail value to set.
     * @return the InnerError object itself.
     */
    public InnerError setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }

    /**
     * Get the innerError property: An object containing more specific information than the current object about the
     * error.
     *
     * @return the innerError value.
     */
    public InnerError getInnerError() {
        return this.innerError;
    }

    /**
     * Set the innerError property: An object containing more specific information than the current object about the
     * error.
     *
     * @param innerError the innerError value to set.
     * @return the InnerError object itself.
     */
    public InnerError setInnerError(InnerError innerError) {
        this.innerError = innerError;
        return this;
    }
}
