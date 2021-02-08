// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SSL certificates of application gateway. */
@JsonFlatten
@Fluent
public class ApplicationGatewaySslCertificate extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewaySslCertificate.class);

    /*
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Gets or sets the certificate data
     */
    @JsonProperty(value = "properties.data")
    private String data;

    /*
     * Gets or sets the certificate password
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /*
     * Gets or sets the certificate public data
     */
    @JsonProperty(value = "properties.publicCertData")
    private String publicCertData;

    /*
     * Gets or sets Provisioning state of the ssl certificate resource
     * Updating/Deleting/Failed
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the name property: Gets name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the data property: Gets or sets the certificate data.
     *
     * @return the data value.
     */
    public String data() {
        return this.data;
    }

    /**
     * Set the data property: Gets or sets the certificate data.
     *
     * @param data the data value to set.
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get the password property: Gets or sets the certificate password.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Gets or sets the certificate password.
     *
     * @param password the password value to set.
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the publicCertData property: Gets or sets the certificate public data.
     *
     * @return the publicCertData value.
     */
    public String publicCertData() {
        return this.publicCertData;
    }

    /**
     * Set the publicCertData property: Gets or sets the certificate public data.
     *
     * @param publicCertData the publicCertData value to set.
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate withPublicCertData(String publicCertData) {
        this.publicCertData = publicCertData;
        return this;
    }

    /**
     * Get the provisioningState property: Gets or sets Provisioning state of the ssl certificate resource
     * Updating/Deleting/Failed.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Gets or sets Provisioning state of the ssl certificate resource
     * Updating/Deleting/Failed.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewaySslCertificate withId(String id) {
        super.withId(id);
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
