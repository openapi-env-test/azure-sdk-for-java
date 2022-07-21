// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The instance view of a virtual machine extension. */
@Fluent
public final class VirtualMachineExtensionInstanceView {
    /*
     * The virtual machine extension name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Specifies the type of the extension; an example is
     * "CustomScriptExtension".
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Specifies the version of the script handler.
     */
    @JsonProperty(value = "typeHandlerVersion")
    private String typeHandlerVersion;

    /*
     * The resource status information.
     */
    @JsonProperty(value = "substatuses")
    private List<InstanceViewStatus> substatuses;

    /*
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatus> statuses;

    /**
     * Get the name property: The virtual machine extension name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The virtual machine extension name.
     *
     * @param name the name value to set.
     * @return the VirtualMachineExtensionInstanceView object itself.
     */
    public VirtualMachineExtensionInstanceView withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @param type the type value to set.
     * @return the VirtualMachineExtensionInstanceView object itself.
     */
    public VirtualMachineExtensionInstanceView withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the typeHandlerVersion property: Specifies the version of the script handler.
     *
     * @return the typeHandlerVersion value.
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion property: Specifies the version of the script handler.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the VirtualMachineExtensionInstanceView object itself.
     */
    public VirtualMachineExtensionInstanceView withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get the substatuses property: The resource status information.
     *
     * @return the substatuses value.
     */
    public List<InstanceViewStatus> substatuses() {
        return this.substatuses;
    }

    /**
     * Set the substatuses property: The resource status information.
     *
     * @param substatuses the substatuses value to set.
     * @return the VirtualMachineExtensionInstanceView object itself.
     */
    public VirtualMachineExtensionInstanceView withSubstatuses(List<InstanceViewStatus> substatuses) {
        this.substatuses = substatuses;
        return this;
    }

    /**
     * Get the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the statuses property: The resource status information.
     *
     * @param statuses the statuses value to set.
     * @return the VirtualMachineExtensionInstanceView object itself.
     */
    public VirtualMachineExtensionInstanceView withStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (substatuses() != null) {
            substatuses().forEach(e -> e.validate());
        }
        if (statuses() != null) {
            statuses().forEach(e -> e.validate());
        }
    }
}
