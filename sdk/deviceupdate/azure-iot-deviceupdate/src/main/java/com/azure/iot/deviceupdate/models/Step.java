package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Update install instruction step. */
@Fluent
public final class Step {
    /*
     * Step type.
     */
    @JsonProperty(value = "type")
    private StepType type;

    /*
     * Step description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Identity of handler that will execute this step. Required if step type
     * is inline.
     */
    @JsonProperty(value = "handler")
    private String handler;

    /*
     * Parameters to be passed to handler during execution.
     */
    @JsonProperty(value = "handlerProperties")
    private Object handlerProperties;

    /*
     * Collection of file names to be passed to handler during execution.
     * Required if step type is inline.
     */
    @JsonProperty(value = "files")
    private List<String> files;

    /*
     * Referenced child update identity.  Required if step type is reference.
     */
    @JsonProperty(value = "updateId")
    private UpdateId updateId;

    /**
     * Get the type property: Step type.
     *
     * @return the type value.
     */
    public StepType getType() {
        return this.type;
    }

    /**
     * Set the type property: Step type.
     *
     * @param type the type value to set.
     * @return the Step object itself.
     */
    public Step setType(StepType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the description property: Step description.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Step description.
     *
     * @param description the description value to set.
     * @return the Step object itself.
     */
    public Step setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the handler property: Identity of handler that will execute this step. Required if step type is inline.
     *
     * @return the handler value.
     */
    public String getHandler() {
        return this.handler;
    }

    /**
     * Set the handler property: Identity of handler that will execute this step. Required if step type is inline.
     *
     * @param handler the handler value to set.
     * @return the Step object itself.
     */
    public Step setHandler(String handler) {
        this.handler = handler;
        return this;
    }

    /**
     * Get the handlerProperties property: Parameters to be passed to handler during execution.
     *
     * @return the handlerProperties value.
     */
    public Object getHandlerProperties() {
        return this.handlerProperties;
    }

    /**
     * Set the handlerProperties property: Parameters to be passed to handler during execution.
     *
     * @param handlerProperties the handlerProperties value to set.
     * @return the Step object itself.
     */
    public Step setHandlerProperties(Object handlerProperties) {
        this.handlerProperties = handlerProperties;
        return this;
    }

    /**
     * Get the files property: Collection of file names to be passed to handler during execution. Required if step type
     * is inline.
     *
     * @return the files value.
     */
    public List<String> getFiles() {
        return this.files;
    }

    /**
     * Set the files property: Collection of file names to be passed to handler during execution. Required if step type
     * is inline.
     *
     * @param files the files value to set.
     * @return the Step object itself.
     */
    public Step setFiles(List<String> files) {
        this.files = files;
        return this;
    }

    /**
     * Get the updateId property: Referenced child update identity. Required if step type is reference.
     *
     * @return the updateId value.
     */
    public UpdateId getUpdateId() {
        return this.updateId;
    }

    /**
     * Set the updateId property: Referenced child update identity. Required if step type is reference.
     *
     * @param updateId the updateId value to set.
     * @return the Step object itself.
     */
    public Step setUpdateId(UpdateId updateId) {
        this.updateId = updateId;
        return this;
    }
}
