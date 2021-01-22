// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** App resource properties payload. */
@Fluent
public final class AppResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppResourceProperties.class);

    /*
     * Indicates whether the App exposes public endpoint
     */
    @JsonProperty(value = "public")
    private Boolean publicProperty;

    /*
     * URL of the App
     */
    @JsonProperty(value = "url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /*
     * Provisioning state of the App
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AppResourceProvisioningState provisioningState;

    /*
     * Name of the active deployment of the App
     */
    @JsonProperty(value = "activeDeploymentName")
    private String activeDeploymentName;

    /*
     * Fully qualified dns Name.
     */
    @JsonProperty(value = "fqdn")
    private String fqdn;

    /*
     * Indicate if only https is allowed.
     */
    @JsonProperty(value = "httpsOnly")
    private Boolean httpsOnly;

    /*
     * Date time when the resource is created
     */
    @JsonProperty(value = "createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTime;

    /*
     * Temporary disk settings
     */
    @JsonProperty(value = "temporaryDisk")
    private TemporaryDisk temporaryDisk;

    /*
     * Persistent disk settings
     */
    @JsonProperty(value = "persistentDisk")
    private PersistentDisk persistentDisk;

    /**
     * Get the publicProperty property: Indicates whether the App exposes public endpoint.
     *
     * @return the publicProperty value.
     */
    public Boolean publicProperty() {
        return this.publicProperty;
    }

    /**
     * Set the publicProperty property: Indicates whether the App exposes public endpoint.
     *
     * @param publicProperty the publicProperty value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withPublicProperty(Boolean publicProperty) {
        this.publicProperty = publicProperty;
        return this;
    }

    /**
     * Get the url property: URL of the App.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Get the provisioningState property: Provisioning state of the App.
     *
     * @return the provisioningState value.
     */
    public AppResourceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the activeDeploymentName property: Name of the active deployment of the App.
     *
     * @return the activeDeploymentName value.
     */
    public String activeDeploymentName() {
        return this.activeDeploymentName;
    }

    /**
     * Set the activeDeploymentName property: Name of the active deployment of the App.
     *
     * @param activeDeploymentName the activeDeploymentName value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withActiveDeploymentName(String activeDeploymentName) {
        this.activeDeploymentName = activeDeploymentName;
        return this;
    }

    /**
     * Get the fqdn property: Fully qualified dns Name.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set the fqdn property: Fully qualified dns Name.
     *
     * @param fqdn the fqdn value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the httpsOnly property: Indicate if only https is allowed.
     *
     * @return the httpsOnly value.
     */
    public Boolean httpsOnly() {
        return this.httpsOnly;
    }

    /**
     * Set the httpsOnly property: Indicate if only https is allowed.
     *
     * @param httpsOnly the httpsOnly value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withHttpsOnly(Boolean httpsOnly) {
        this.httpsOnly = httpsOnly;
        return this;
    }

    /**
     * Get the createdTime property: Date time when the resource is created.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the temporaryDisk property: Temporary disk settings.
     *
     * @return the temporaryDisk value.
     */
    public TemporaryDisk temporaryDisk() {
        return this.temporaryDisk;
    }

    /**
     * Set the temporaryDisk property: Temporary disk settings.
     *
     * @param temporaryDisk the temporaryDisk value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withTemporaryDisk(TemporaryDisk temporaryDisk) {
        this.temporaryDisk = temporaryDisk;
        return this;
    }

    /**
     * Get the persistentDisk property: Persistent disk settings.
     *
     * @return the persistentDisk value.
     */
    public PersistentDisk persistentDisk() {
        return this.persistentDisk;
    }

    /**
     * Set the persistentDisk property: Persistent disk settings.
     *
     * @param persistentDisk the persistentDisk value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withPersistentDisk(PersistentDisk persistentDisk) {
        this.persistentDisk = persistentDisk;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (temporaryDisk() != null) {
            temporaryDisk().validate();
        }
        if (persistentDisk() != null) {
            persistentDisk().validate();
        }
    }
}
