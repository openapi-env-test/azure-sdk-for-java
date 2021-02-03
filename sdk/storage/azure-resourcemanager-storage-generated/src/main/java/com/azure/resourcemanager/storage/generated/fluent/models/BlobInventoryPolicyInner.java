// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.models.BlobInventoryPolicySchema;
import com.azure.resourcemanager.storage.generated.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The storage account blob inventory policy. */
@JsonFlatten
@Fluent
public class BlobInventoryPolicyInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlobInventoryPolicyInner.class);

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Returns the last modified date and time of the blob inventory policy.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTime;

    /*
     * The storage account blob inventory policy object. It is composed of
     * policy rules.
     */
    @JsonProperty(value = "properties.policy")
    private BlobInventoryPolicySchema policy;

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the lastModifiedTime property: Returns the last modified date and time of the blob inventory policy.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the policy property: The storage account blob inventory policy object. It is composed of policy rules.
     *
     * @return the policy value.
     */
    public BlobInventoryPolicySchema policy() {
        return this.policy;
    }

    /**
     * Set the policy property: The storage account blob inventory policy object. It is composed of policy rules.
     *
     * @param policy the policy value to set.
     * @return the BlobInventoryPolicyInner object itself.
     */
    public BlobInventoryPolicyInner withPolicy(BlobInventoryPolicySchema policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (systemData() != null) {
            systemData().validate();
        }
        if (policy() != null) {
            policy().validate();
        }
    }
}
