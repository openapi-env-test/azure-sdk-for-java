/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.imagebuilder.v2019_02_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Runs the specified PowerShell on the VM (Windows). Corresponds to Packer
 * powershell provisioner.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("PowerShell")
public class ImageTemplatePowerShellCustomizer extends ImageTemplateCustomizer {
    /**
     * The PowerShell script to be run for customizing. It can be a github
     * link, SAS URI for Azure Storage, etc.
     */
    @JsonProperty(value = "script")
    private String script;

    /**
     * The validExitCodes property.
     */
    @JsonProperty(value = "validExitCodes")
    private List<Integer> validExitCodes;

    /**
     * Get the PowerShell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc.
     *
     * @return the script value
     */
    public String script() {
        return this.script;
    }

    /**
     * Set the PowerShell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc.
     *
     * @param script the script value to set
     * @return the ImageTemplatePowerShellCustomizer object itself.
     */
    public ImageTemplatePowerShellCustomizer withScript(String script) {
        this.script = script;
        return this;
    }

    /**
     * Get the validExitCodes value.
     *
     * @return the validExitCodes value
     */
    public List<Integer> validExitCodes() {
        return this.validExitCodes;
    }

    /**
     * Set the validExitCodes value.
     *
     * @param validExitCodes the validExitCodes value to set
     * @return the ImageTemplatePowerShellCustomizer object itself.
     */
    public ImageTemplatePowerShellCustomizer withValidExitCodes(List<Integer> validExitCodes) {
        this.validExitCodes = validExitCodes;
        return this;
    }

}
