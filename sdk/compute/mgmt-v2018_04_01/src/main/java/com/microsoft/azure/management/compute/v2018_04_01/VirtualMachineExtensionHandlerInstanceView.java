/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2018_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The instance view of a virtual machine extension handler.
 */
public class VirtualMachineExtensionHandlerInstanceView {
    /**
     * Specifies the type of the extension; an example is
     * "CustomScriptExtension".
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Specifies the version of the script handler.
     */
    @JsonProperty(value = "typeHandlerVersion")
    private String typeHandlerVersion;

    /**
     * The extension handler status.
     */
    @JsonProperty(value = "status")
    private InstanceViewStatus status;

    /**
     * Get specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @param type the type value to set
     * @return the VirtualMachineExtensionHandlerInstanceView object itself.
     */
    public VirtualMachineExtensionHandlerInstanceView withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get specifies the version of the script handler.
     *
     * @return the typeHandlerVersion value
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set specifies the version of the script handler.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set
     * @return the VirtualMachineExtensionHandlerInstanceView object itself.
     */
    public VirtualMachineExtensionHandlerInstanceView withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get the extension handler status.
     *
     * @return the status value
     */
    public InstanceViewStatus status() {
        return this.status;
    }

    /**
     * Set the extension handler status.
     *
     * @param status the status value to set
     * @return the VirtualMachineExtensionHandlerInstanceView object itself.
     */
    public VirtualMachineExtensionHandlerInstanceView withStatus(InstanceViewStatus status) {
        this.status = status;
        return this;
    }

}
