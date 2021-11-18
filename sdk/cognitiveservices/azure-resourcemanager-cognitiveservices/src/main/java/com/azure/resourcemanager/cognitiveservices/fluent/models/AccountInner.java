// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cognitiveservices.models.AccountProperties;
import com.azure.resourcemanager.cognitiveservices.models.AzureEntityResource;
import com.azure.resourcemanager.cognitiveservices.models.Identity;
import com.azure.resourcemanager.cognitiveservices.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Cognitive Services account is an Azure resource representing the provisioned account, it's type, location and SKU.
 */
@Fluent
public final class AccountInner extends AzureEntityResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AccountInner.class);

    /*
     * The Kind of the resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /*
     * The resource model definition representing SKU
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Identity for the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Properties of Cognitive Services account.
     */
    @JsonProperty(value = "properties")
    private AccountProperties properties;

    /**
     * Get the kind property: The Kind of the resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The Kind of the resource.
     *
     * @param kind the kind value to set.
     * @return the AccountInner object itself.
     */
    public AccountInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the sku property: The resource model definition representing SKU.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The resource model definition representing SKU.
     *
     * @param sku the sku value to set.
     * @return the AccountInner object itself.
     */
    public AccountInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity for the resource.
     *
     * @param identity the identity value to set.
     * @return the AccountInner object itself.
     */
    public AccountInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the AccountInner object itself.
     */
    public AccountInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The geo-location where the resource lives.
     *
     * @param location the location value to set.
     * @return the AccountInner object itself.
     */
    public AccountInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the properties property: Properties of Cognitive Services account.
     *
     * @return the properties value.
     */
    public AccountProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of Cognitive Services account.
     *
     * @param properties the properties value to set.
     * @return the AccountInner object itself.
     */
    public AccountInner withProperties(AccountProperties properties) {
        this.properties = properties;
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
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}
