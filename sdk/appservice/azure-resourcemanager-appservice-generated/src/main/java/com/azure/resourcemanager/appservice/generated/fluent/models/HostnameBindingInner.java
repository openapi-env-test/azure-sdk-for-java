// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.AzureResourceType;
import com.azure.resourcemanager.appservice.generated.models.CustomHostnameDnsRecordType;
import com.azure.resourcemanager.appservice.generated.models.HostnameType;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.generated.models.SslState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A hostname binding object. */
@Fluent
public final class HostnameBindingInner extends ProxyOnlyResource {
    /*
     * HostNameBinding resource specific properties
     */
    @JsonProperty(value = "properties")
    private HostnameBindingProperties innerProperties;

    /**
     * Get the innerProperties property: HostNameBinding resource specific properties.
     *
     * @return the innerProperties value.
     */
    private HostnameBindingProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public HostnameBindingInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the siteName property: App Service app name.
     *
     * @return the siteName value.
     */
    public String siteName() {
        return this.innerProperties() == null ? null : this.innerProperties().siteName();
    }

    /**
     * Set the siteName property: App Service app name.
     *
     * @param siteName the siteName value to set.
     * @return the HostnameBindingInner object itself.
     */
    public HostnameBindingInner withSiteName(String siteName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostnameBindingProperties();
        }
        this.innerProperties().withSiteName(siteName);
        return this;
    }

    /**
     * Get the domainId property: Fully qualified ARM domain resource URI.
     *
     * @return the domainId value.
     */
    public String domainId() {
        return this.innerProperties() == null ? null : this.innerProperties().domainId();
    }

    /**
     * Set the domainId property: Fully qualified ARM domain resource URI.
     *
     * @param domainId the domainId value to set.
     * @return the HostnameBindingInner object itself.
     */
    public HostnameBindingInner withDomainId(String domainId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostnameBindingProperties();
        }
        this.innerProperties().withDomainId(domainId);
        return this;
    }

    /**
     * Get the azureResourceName property: Azure resource name.
     *
     * @return the azureResourceName value.
     */
    public String azureResourceName() {
        return this.innerProperties() == null ? null : this.innerProperties().azureResourceName();
    }

    /**
     * Set the azureResourceName property: Azure resource name.
     *
     * @param azureResourceName the azureResourceName value to set.
     * @return the HostnameBindingInner object itself.
     */
    public HostnameBindingInner withAzureResourceName(String azureResourceName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostnameBindingProperties();
        }
        this.innerProperties().withAzureResourceName(azureResourceName);
        return this;
    }

    /**
     * Get the azureResourceType property: Azure resource type.
     *
     * @return the azureResourceType value.
     */
    public AzureResourceType azureResourceType() {
        return this.innerProperties() == null ? null : this.innerProperties().azureResourceType();
    }

    /**
     * Set the azureResourceType property: Azure resource type.
     *
     * @param azureResourceType the azureResourceType value to set.
     * @return the HostnameBindingInner object itself.
     */
    public HostnameBindingInner withAzureResourceType(AzureResourceType azureResourceType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostnameBindingProperties();
        }
        this.innerProperties().withAzureResourceType(azureResourceType);
        return this;
    }

    /**
     * Get the customHostnameDnsRecordType property: Custom DNS record type.
     *
     * @return the customHostnameDnsRecordType value.
     */
    public CustomHostnameDnsRecordType customHostnameDnsRecordType() {
        return this.innerProperties() == null ? null : this.innerProperties().customHostnameDnsRecordType();
    }

    /**
     * Set the customHostnameDnsRecordType property: Custom DNS record type.
     *
     * @param customHostnameDnsRecordType the customHostnameDnsRecordType value to set.
     * @return the HostnameBindingInner object itself.
     */
    public HostnameBindingInner withCustomHostnameDnsRecordType(
        CustomHostnameDnsRecordType customHostnameDnsRecordType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostnameBindingProperties();
        }
        this.innerProperties().withCustomHostnameDnsRecordType(customHostnameDnsRecordType);
        return this;
    }

    /**
     * Get the hostnameType property: Hostname type.
     *
     * @return the hostnameType value.
     */
    public HostnameType hostnameType() {
        return this.innerProperties() == null ? null : this.innerProperties().hostnameType();
    }

    /**
     * Set the hostnameType property: Hostname type.
     *
     * @param hostnameType the hostnameType value to set.
     * @return the HostnameBindingInner object itself.
     */
    public HostnameBindingInner withHostnameType(HostnameType hostnameType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostnameBindingProperties();
        }
        this.innerProperties().withHostnameType(hostnameType);
        return this;
    }

    /**
     * Get the sslState property: SSL type.
     *
     * @return the sslState value.
     */
    public SslState sslState() {
        return this.innerProperties() == null ? null : this.innerProperties().sslState();
    }

    /**
     * Set the sslState property: SSL type.
     *
     * @param sslState the sslState value to set.
     * @return the HostnameBindingInner object itself.
     */
    public HostnameBindingInner withSslState(SslState sslState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostnameBindingProperties();
        }
        this.innerProperties().withSslState(sslState);
        return this;
    }

    /**
     * Get the thumbprint property: SSL certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().thumbprint();
    }

    /**
     * Set the thumbprint property: SSL certificate thumbprint.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the HostnameBindingInner object itself.
     */
    public HostnameBindingInner withThumbprint(String thumbprint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostnameBindingProperties();
        }
        this.innerProperties().withThumbprint(thumbprint);
        return this;
    }

    /**
     * Get the virtualIp property: Virtual IP address assigned to the hostname if IP based SSL is enabled.
     *
     * @return the virtualIp value.
     */
    public String virtualIp() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualIp();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
