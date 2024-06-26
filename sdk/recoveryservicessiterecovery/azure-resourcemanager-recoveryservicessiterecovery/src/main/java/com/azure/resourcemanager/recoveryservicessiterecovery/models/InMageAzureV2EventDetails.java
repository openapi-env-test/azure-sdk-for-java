// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Model class for event details of a VMwareAzureV2 event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageAzureV2")
@Fluent
public final class InMageAzureV2EventDetails extends EventProviderSpecificDetails {
    /*
     * InMage Event type. Takes one of the values of InMageDataContract.InMageMonitoringEventType.
     */
    @JsonProperty(value = "eventType")
    private String eventType;

    /*
     * InMage Event Category.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * InMage Event Component.
     */
    @JsonProperty(value = "component")
    private String component;

    /*
     * Corrective Action string for the event.
     */
    @JsonProperty(value = "correctiveAction")
    private String correctiveAction;

    /*
     * InMage Event Details.
     */
    @JsonProperty(value = "details")
    private String details;

    /*
     * InMage Event Summary.
     */
    @JsonProperty(value = "summary")
    private String summary;

    /*
     * VMware Site name.
     */
    @JsonProperty(value = "siteName")
    private String siteName;

    /** Creates an instance of InMageAzureV2EventDetails class. */
    public InMageAzureV2EventDetails() {
    }

    /**
     * Get the eventType property: InMage Event type. Takes one of the values of
     * InMageDataContract.InMageMonitoringEventType.
     *
     * @return the eventType value.
     */
    public String eventType() {
        return this.eventType;
    }

    /**
     * Set the eventType property: InMage Event type. Takes one of the values of
     * InMageDataContract.InMageMonitoringEventType.
     *
     * @param eventType the eventType value to set.
     * @return the InMageAzureV2EventDetails object itself.
     */
    public InMageAzureV2EventDetails withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Get the category property: InMage Event Category.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: InMage Event Category.
     *
     * @param category the category value to set.
     * @return the InMageAzureV2EventDetails object itself.
     */
    public InMageAzureV2EventDetails withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the component property: InMage Event Component.
     *
     * @return the component value.
     */
    public String component() {
        return this.component;
    }

    /**
     * Set the component property: InMage Event Component.
     *
     * @param component the component value to set.
     * @return the InMageAzureV2EventDetails object itself.
     */
    public InMageAzureV2EventDetails withComponent(String component) {
        this.component = component;
        return this;
    }

    /**
     * Get the correctiveAction property: Corrective Action string for the event.
     *
     * @return the correctiveAction value.
     */
    public String correctiveAction() {
        return this.correctiveAction;
    }

    /**
     * Set the correctiveAction property: Corrective Action string for the event.
     *
     * @param correctiveAction the correctiveAction value to set.
     * @return the InMageAzureV2EventDetails object itself.
     */
    public InMageAzureV2EventDetails withCorrectiveAction(String correctiveAction) {
        this.correctiveAction = correctiveAction;
        return this;
    }

    /**
     * Get the details property: InMage Event Details.
     *
     * @return the details value.
     */
    public String details() {
        return this.details;
    }

    /**
     * Set the details property: InMage Event Details.
     *
     * @param details the details value to set.
     * @return the InMageAzureV2EventDetails object itself.
     */
    public InMageAzureV2EventDetails withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
     * Get the summary property: InMage Event Summary.
     *
     * @return the summary value.
     */
    public String summary() {
        return this.summary;
    }

    /**
     * Set the summary property: InMage Event Summary.
     *
     * @param summary the summary value to set.
     * @return the InMageAzureV2EventDetails object itself.
     */
    public InMageAzureV2EventDetails withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get the siteName property: VMware Site name.
     *
     * @return the siteName value.
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * Set the siteName property: VMware Site name.
     *
     * @param siteName the siteName value to set.
     * @return the InMageAzureV2EventDetails object itself.
     */
    public InMageAzureV2EventDetails withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
