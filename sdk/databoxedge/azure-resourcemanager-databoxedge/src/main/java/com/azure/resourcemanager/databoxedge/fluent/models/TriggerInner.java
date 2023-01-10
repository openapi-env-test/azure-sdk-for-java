// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.databoxedge.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.models.FileEventTrigger;
import com.azure.resourcemanager.databoxedge.models.PeriodicTimerEventTrigger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Trigger details. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = TriggerInner.class)
@JsonTypeName("Trigger")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "FileEvent", value = FileEventTrigger.class),
    @JsonSubTypes.Type(name = "PeriodicTimerEvent", value = PeriodicTimerEventTrigger.class)
})
@Immutable
public class TriggerInner extends ArmBaseModel {
    /*
     * Metadata pertaining to creation and last modification of Trigger
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of TriggerInner class. */
    public TriggerInner() {
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of Trigger.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
