// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Represents the correlation filter expression. */
@Fluent
public final class CorrelationFilter {
    /*
     * dictionary object for custom filters
     */
    @JsonProperty(value = "properties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> properties;

    /*
     * Identifier of the correlation.
     */
    @JsonProperty(value = "correlationId")
    private String correlationId;

    /*
     * Identifier of the message.
     */
    @JsonProperty(value = "messageId")
    private String messageId;

    /*
     * Address to send to.
     */
    @JsonProperty(value = "to")
    private String to;

    /*
     * Address of the queue to reply to.
     */
    @JsonProperty(value = "replyTo")
    private String replyTo;

    /*
     * Application specific label.
     */
    @JsonProperty(value = "label")
    private String label;

    /*
     * Session identifier.
     */
    @JsonProperty(value = "sessionId")
    private String sessionId;

    /*
     * Session identifier to reply to.
     */
    @JsonProperty(value = "replyToSessionId")
    private String replyToSessionId;

    /*
     * Content type of the message.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /*
     * Value that indicates whether the rule action requires preprocessing.
     */
    @JsonProperty(value = "requiresPreprocessing")
    private Boolean requiresPreprocessing;

    /**
     * Get the properties property: dictionary object for custom filters.
     *
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: dictionary object for custom filters.
     *
     * @param properties the properties value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the correlationId property: Identifier of the correlation.
     *
     * @return the correlationId value.
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId property: Identifier of the correlation.
     *
     * @param correlationId the correlationId value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get the messageId property: Identifier of the message.
     *
     * @return the messageId value.
     */
    public String messageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: Identifier of the message.
     *
     * @param messageId the messageId value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the to property: Address to send to.
     *
     * @return the to value.
     */
    public String to() {
        return this.to;
    }

    /**
     * Set the to property: Address to send to.
     *
     * @param to the to value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Get the replyTo property: Address of the queue to reply to.
     *
     * @return the replyTo value.
     */
    public String replyTo() {
        return this.replyTo;
    }

    /**
     * Set the replyTo property: Address of the queue to reply to.
     *
     * @param replyTo the replyTo value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withReplyTo(String replyTo) {
        this.replyTo = replyTo;
        return this;
    }

    /**
     * Get the label property: Application specific label.
     *
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label property: Application specific label.
     *
     * @param label the label value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the sessionId property: Session identifier.
     *
     * @return the sessionId value.
     */
    public String sessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: Session identifier.
     *
     * @param sessionId the sessionId value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the replyToSessionId property: Session identifier to reply to.
     *
     * @return the replyToSessionId value.
     */
    public String replyToSessionId() {
        return this.replyToSessionId;
    }

    /**
     * Set the replyToSessionId property: Session identifier to reply to.
     *
     * @param replyToSessionId the replyToSessionId value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withReplyToSessionId(String replyToSessionId) {
        this.replyToSessionId = replyToSessionId;
        return this;
    }

    /**
     * Get the contentType property: Content type of the message.
     *
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: Content type of the message.
     *
     * @param contentType the contentType value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the requiresPreprocessing property: Value that indicates whether the rule action requires preprocessing.
     *
     * @return the requiresPreprocessing value.
     */
    public Boolean requiresPreprocessing() {
        return this.requiresPreprocessing;
    }

    /**
     * Set the requiresPreprocessing property: Value that indicates whether the rule action requires preprocessing.
     *
     * @param requiresPreprocessing the requiresPreprocessing value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withRequiresPreprocessing(Boolean requiresPreprocessing) {
        this.requiresPreprocessing = requiresPreprocessing;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
