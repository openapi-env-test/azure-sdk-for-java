// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AzureActiveDirectoryLogin model. */
@JsonFlatten
@Fluent
public class AzureActiveDirectoryLogin extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureActiveDirectoryLogin.class);

    /*
     * The disableWWWAuthenticate property.
     */
    @JsonProperty(value = "properties.disableWWWAuthenticate")
    private Boolean disableWwwAuthenticate;

    /*
     * The loginParameters property.
     */
    @JsonProperty(value = "properties.loginParameters")
    private List<String> loginParameters;

    /**
     * Get the disableWwwAuthenticate property: The disableWWWAuthenticate property.
     *
     * @return the disableWwwAuthenticate value.
     */
    public Boolean disableWwwAuthenticate() {
        return this.disableWwwAuthenticate;
    }

    /**
     * Set the disableWwwAuthenticate property: The disableWWWAuthenticate property.
     *
     * @param disableWwwAuthenticate the disableWwwAuthenticate value to set.
     * @return the AzureActiveDirectoryLogin object itself.
     */
    public AzureActiveDirectoryLogin withDisableWwwAuthenticate(Boolean disableWwwAuthenticate) {
        this.disableWwwAuthenticate = disableWwwAuthenticate;
        return this;
    }

    /**
     * Get the loginParameters property: The loginParameters property.
     *
     * @return the loginParameters value.
     */
    public List<String> loginParameters() {
        return this.loginParameters;
    }

    /**
     * Set the loginParameters property: The loginParameters property.
     *
     * @param loginParameters the loginParameters value to set.
     * @return the AzureActiveDirectoryLogin object itself.
     */
    public AzureActiveDirectoryLogin withLoginParameters(List<String> loginParameters) {
        this.loginParameters = loginParameters;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureActiveDirectoryLogin withKind(String kind) {
        super.withKind(kind);
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
