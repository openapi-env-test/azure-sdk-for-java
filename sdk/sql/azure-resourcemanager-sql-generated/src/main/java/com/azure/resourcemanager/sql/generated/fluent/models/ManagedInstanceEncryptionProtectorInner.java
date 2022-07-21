// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.generated.models.ServerKeyType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The managed instance encryption protector. */
@Fluent
public final class ManagedInstanceEncryptionProtectorInner extends ProxyResource {
    /*
     * Kind of encryption protector. This is metadata used for the Azure portal
     * experience.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private ManagedInstanceEncryptionProtectorProperties innerProperties;

    /**
     * Get the kind property: Kind of encryption protector. This is metadata used for the Azure portal experience.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private ManagedInstanceEncryptionProtectorProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the serverKeyName property: The name of the managed instance key.
     *
     * @return the serverKeyName value.
     */
    public String serverKeyName() {
        return this.innerProperties() == null ? null : this.innerProperties().serverKeyName();
    }

    /**
     * Set the serverKeyName property: The name of the managed instance key.
     *
     * @param serverKeyName the serverKeyName value to set.
     * @return the ManagedInstanceEncryptionProtectorInner object itself.
     */
    public ManagedInstanceEncryptionProtectorInner withServerKeyName(String serverKeyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedInstanceEncryptionProtectorProperties();
        }
        this.innerProperties().withServerKeyName(serverKeyName);
        return this;
    }

    /**
     * Get the serverKeyType property: The encryption protector type like 'ServiceManaged', 'AzureKeyVault'.
     *
     * @return the serverKeyType value.
     */
    public ServerKeyType serverKeyType() {
        return this.innerProperties() == null ? null : this.innerProperties().serverKeyType();
    }

    /**
     * Set the serverKeyType property: The encryption protector type like 'ServiceManaged', 'AzureKeyVault'.
     *
     * @param serverKeyType the serverKeyType value to set.
     * @return the ManagedInstanceEncryptionProtectorInner object itself.
     */
    public ManagedInstanceEncryptionProtectorInner withServerKeyType(ServerKeyType serverKeyType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedInstanceEncryptionProtectorProperties();
        }
        this.innerProperties().withServerKeyType(serverKeyType);
        return this;
    }

    /**
     * Get the uri property: The URI of the server key.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.innerProperties() == null ? null : this.innerProperties().uri();
    }

    /**
     * Get the thumbprint property: Thumbprint of the server key.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().thumbprint();
    }

    /**
     * Get the autoRotationEnabled property: Key auto rotation opt-in flag. Either true or false.
     *
     * @return the autoRotationEnabled value.
     */
    public Boolean autoRotationEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().autoRotationEnabled();
    }

    /**
     * Set the autoRotationEnabled property: Key auto rotation opt-in flag. Either true or false.
     *
     * @param autoRotationEnabled the autoRotationEnabled value to set.
     * @return the ManagedInstanceEncryptionProtectorInner object itself.
     */
    public ManagedInstanceEncryptionProtectorInner withAutoRotationEnabled(Boolean autoRotationEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedInstanceEncryptionProtectorProperties();
        }
        this.innerProperties().withAutoRotationEnabled(autoRotationEnabled);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
