package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Error details. */
@Fluent
public final class Error {
    /*
     * Server defined error code.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * A human-readable representation of the error.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * The target of the error.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * An array of errors that led to the reported error.
     */
    @JsonProperty(value = "details")
    private List<Error> details;

    /*
     * An object containing more specific information than the current object
     * about the error.
     */
    @JsonProperty(value = "innererror")
    private InnerError innererror;

    /*
     * Date and time in UTC when the error occurred.
     */
    @JsonProperty(value = "occurredDateTime")
    private OffsetDateTime occurredDateTime;

    /**
     * Get the code property: Server defined error code.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: Server defined error code.
     *
     * @param code the code value to set.
     * @return the Error object itself.
     */
    public Error setCode(String code) {
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
     * @return the Error object itself.
     */
    public Error setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target property: The target of the error.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target property: The target of the error.
     *
     * @param target the target value to set.
     * @return the Error object itself.
     */
    public Error setTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the details property: An array of errors that led to the reported error.
     *
     * @return the details value.
     */
    public List<Error> getDetails() {
        return this.details;
    }

    /**
     * Set the details property: An array of errors that led to the reported error.
     *
     * @param details the details value to set.
     * @return the Error object itself.
     */
    public Error setDetails(List<Error> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the innererror property: An object containing more specific information than the current object about the
     * error.
     *
     * @return the innererror value.
     */
    public InnerError getInnererror() {
        return this.innererror;
    }

    /**
     * Set the innererror property: An object containing more specific information than the current object about the
     * error.
     *
     * @param innererror the innererror value to set.
     * @return the Error object itself.
     */
    public Error setInnererror(InnerError innererror) {
        this.innererror = innererror;
        return this;
    }

    /**
     * Get the occurredDateTime property: Date and time in UTC when the error occurred.
     *
     * @return the occurredDateTime value.
     */
    public OffsetDateTime getOccurredDateTime() {
        return this.occurredDateTime;
    }

    /**
     * Set the occurredDateTime property: Date and time in UTC when the error occurred.
     *
     * @param occurredDateTime the occurredDateTime value to set.
     * @return the Error object itself.
     */
    public Error setOccurredDateTime(OffsetDateTime occurredDateTime) {
        this.occurredDateTime = occurredDateTime;
        return this;
    }
}
