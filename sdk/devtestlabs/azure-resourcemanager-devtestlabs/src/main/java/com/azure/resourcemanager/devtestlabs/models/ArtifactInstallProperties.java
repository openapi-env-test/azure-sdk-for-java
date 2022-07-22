// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Properties of an artifact. */
@Fluent
public final class ArtifactInstallProperties {
    /*
     * The artifact's identifier.
     */
    @JsonProperty(value = "artifactId")
    private String artifactId;

    /*
     * The artifact's title.
     */
    @JsonProperty(value = "artifactTitle")
    private String artifactTitle;

    /*
     * The parameters of the artifact.
     */
    @JsonProperty(value = "parameters")
    private List<ArtifactParameterProperties> parameters;

    /*
     * The status of the artifact.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The status message from the deployment.
     */
    @JsonProperty(value = "deploymentStatusMessage")
    private String deploymentStatusMessage;

    /*
     * The status message from the virtual machine extension.
     */
    @JsonProperty(value = "vmExtensionStatusMessage")
    private String vmExtensionStatusMessage;

    /*
     * The time that the artifact starts to install on the virtual machine.
     */
    @JsonProperty(value = "installTime")
    private OffsetDateTime installTime;

    /**
     * Get the artifactId property: The artifact's identifier.
     *
     * @return the artifactId value.
     */
    public String artifactId() {
        return this.artifactId;
    }

    /**
     * Set the artifactId property: The artifact's identifier.
     *
     * @param artifactId the artifactId value to set.
     * @return the ArtifactInstallProperties object itself.
     */
    public ArtifactInstallProperties withArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }

    /**
     * Get the artifactTitle property: The artifact's title.
     *
     * @return the artifactTitle value.
     */
    public String artifactTitle() {
        return this.artifactTitle;
    }

    /**
     * Set the artifactTitle property: The artifact's title.
     *
     * @param artifactTitle the artifactTitle value to set.
     * @return the ArtifactInstallProperties object itself.
     */
    public ArtifactInstallProperties withArtifactTitle(String artifactTitle) {
        this.artifactTitle = artifactTitle;
        return this;
    }

    /**
     * Get the parameters property: The parameters of the artifact.
     *
     * @return the parameters value.
     */
    public List<ArtifactParameterProperties> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters of the artifact.
     *
     * @param parameters the parameters value to set.
     * @return the ArtifactInstallProperties object itself.
     */
    public ArtifactInstallProperties withParameters(List<ArtifactParameterProperties> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the status property: The status of the artifact.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the artifact.
     *
     * @param status the status value to set.
     * @return the ArtifactInstallProperties object itself.
     */
    public ArtifactInstallProperties withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the deploymentStatusMessage property: The status message from the deployment.
     *
     * @return the deploymentStatusMessage value.
     */
    public String deploymentStatusMessage() {
        return this.deploymentStatusMessage;
    }

    /**
     * Set the deploymentStatusMessage property: The status message from the deployment.
     *
     * @param deploymentStatusMessage the deploymentStatusMessage value to set.
     * @return the ArtifactInstallProperties object itself.
     */
    public ArtifactInstallProperties withDeploymentStatusMessage(String deploymentStatusMessage) {
        this.deploymentStatusMessage = deploymentStatusMessage;
        return this;
    }

    /**
     * Get the vmExtensionStatusMessage property: The status message from the virtual machine extension.
     *
     * @return the vmExtensionStatusMessage value.
     */
    public String vmExtensionStatusMessage() {
        return this.vmExtensionStatusMessage;
    }

    /**
     * Set the vmExtensionStatusMessage property: The status message from the virtual machine extension.
     *
     * @param vmExtensionStatusMessage the vmExtensionStatusMessage value to set.
     * @return the ArtifactInstallProperties object itself.
     */
    public ArtifactInstallProperties withVmExtensionStatusMessage(String vmExtensionStatusMessage) {
        this.vmExtensionStatusMessage = vmExtensionStatusMessage;
        return this;
    }

    /**
     * Get the installTime property: The time that the artifact starts to install on the virtual machine.
     *
     * @return the installTime value.
     */
    public OffsetDateTime installTime() {
        return this.installTime;
    }

    /**
     * Set the installTime property: The time that the artifact starts to install on the virtual machine.
     *
     * @param installTime the installTime value to set.
     * @return the ArtifactInstallProperties object itself.
     */
    public ArtifactInstallProperties withInstallTime(OffsetDateTime installTime) {
        this.installTime = installTime;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parameters() != null) {
            parameters().forEach(e -> e.validate());
        }
    }
}
