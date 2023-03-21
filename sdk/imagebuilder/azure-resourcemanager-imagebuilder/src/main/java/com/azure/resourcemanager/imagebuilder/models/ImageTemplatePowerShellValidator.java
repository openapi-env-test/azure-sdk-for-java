// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Runs the specified PowerShell script during the validation phase (Windows). Corresponds to Packer powershell
 * provisioner. Exactly one of 'scriptUri' or 'inline' can be specified.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("PowerShell")
@Fluent
public final class ImageTemplatePowerShellValidator extends ImageTemplateInVMValidator {
    /*
     * URI of the PowerShell script to be run for validation. It can be a github link, Azure Storage URI, etc
     */
    @JsonProperty(value = "scriptUri")
    private String scriptUri;

    /*
     * SHA256 checksum of the power shell script provided in the scriptUri field above
     */
    @JsonProperty(value = "sha256Checksum")
    private String sha256Checksum;

    /*
     * Array of PowerShell commands to execute
     */
    @JsonProperty(value = "inline")
    private List<String> inline;

    /*
     * If specified, the PowerShell script will be run with elevated privileges
     */
    @JsonProperty(value = "runElevated")
    private Boolean runElevated;

    /*
     * If specified, the PowerShell script will be run with elevated privileges using the Local System user. Can only
     * be true when the runElevated field above is set to true.
     */
    @JsonProperty(value = "runAsSystem")
    private Boolean runAsSystem;

    /*
     * Valid exit codes for the PowerShell script. [Default: 0]
     */
    @JsonProperty(value = "validExitCodes")
    private List<Integer> validExitCodes;

    /** Creates an instance of ImageTemplatePowerShellValidator class. */
    public ImageTemplatePowerShellValidator() {
    }

    /**
     * Get the scriptUri property: URI of the PowerShell script to be run for validation. It can be a github link, Azure
     * Storage URI, etc.
     *
     * @return the scriptUri value.
     */
    public String scriptUri() {
        return this.scriptUri;
    }

    /**
     * Set the scriptUri property: URI of the PowerShell script to be run for validation. It can be a github link, Azure
     * Storage URI, etc.
     *
     * @param scriptUri the scriptUri value to set.
     * @return the ImageTemplatePowerShellValidator object itself.
     */
    public ImageTemplatePowerShellValidator withScriptUri(String scriptUri) {
        this.scriptUri = scriptUri;
        return this;
    }

    /**
     * Get the sha256Checksum property: SHA256 checksum of the power shell script provided in the scriptUri field above.
     *
     * @return the sha256Checksum value.
     */
    public String sha256Checksum() {
        return this.sha256Checksum;
    }

    /**
     * Set the sha256Checksum property: SHA256 checksum of the power shell script provided in the scriptUri field above.
     *
     * @param sha256Checksum the sha256Checksum value to set.
     * @return the ImageTemplatePowerShellValidator object itself.
     */
    public ImageTemplatePowerShellValidator withSha256Checksum(String sha256Checksum) {
        this.sha256Checksum = sha256Checksum;
        return this;
    }

    /**
     * Get the inline property: Array of PowerShell commands to execute.
     *
     * @return the inline value.
     */
    public List<String> inline() {
        return this.inline;
    }

    /**
     * Set the inline property: Array of PowerShell commands to execute.
     *
     * @param inline the inline value to set.
     * @return the ImageTemplatePowerShellValidator object itself.
     */
    public ImageTemplatePowerShellValidator withInline(List<String> inline) {
        this.inline = inline;
        return this;
    }

    /**
     * Get the runElevated property: If specified, the PowerShell script will be run with elevated privileges.
     *
     * @return the runElevated value.
     */
    public Boolean runElevated() {
        return this.runElevated;
    }

    /**
     * Set the runElevated property: If specified, the PowerShell script will be run with elevated privileges.
     *
     * @param runElevated the runElevated value to set.
     * @return the ImageTemplatePowerShellValidator object itself.
     */
    public ImageTemplatePowerShellValidator withRunElevated(Boolean runElevated) {
        this.runElevated = runElevated;
        return this;
    }

    /**
     * Get the runAsSystem property: If specified, the PowerShell script will be run with elevated privileges using the
     * Local System user. Can only be true when the runElevated field above is set to true.
     *
     * @return the runAsSystem value.
     */
    public Boolean runAsSystem() {
        return this.runAsSystem;
    }

    /**
     * Set the runAsSystem property: If specified, the PowerShell script will be run with elevated privileges using the
     * Local System user. Can only be true when the runElevated field above is set to true.
     *
     * @param runAsSystem the runAsSystem value to set.
     * @return the ImageTemplatePowerShellValidator object itself.
     */
    public ImageTemplatePowerShellValidator withRunAsSystem(Boolean runAsSystem) {
        this.runAsSystem = runAsSystem;
        return this;
    }

    /**
     * Get the validExitCodes property: Valid exit codes for the PowerShell script. [Default: 0].
     *
     * @return the validExitCodes value.
     */
    public List<Integer> validExitCodes() {
        return this.validExitCodes;
    }

    /**
     * Set the validExitCodes property: Valid exit codes for the PowerShell script. [Default: 0].
     *
     * @param validExitCodes the validExitCodes value to set.
     * @return the ImageTemplatePowerShellValidator object itself.
     */
    public ImageTemplatePowerShellValidator withValidExitCodes(List<Integer> validExitCodes) {
        this.validExitCodes = validExitCodes;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageTemplatePowerShellValidator withName(String name) {
        super.withName(name);
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
