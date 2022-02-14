// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ServiceTagInformationPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The service tag information. */
@Immutable
public final class ServiceTagInformationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceTagInformationInner.class);

    /*
     * Properties of the service tag information.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private ServiceTagInformationPropertiesFormat properties;

    /*
     * The name of service tag.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The ID of service tag.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The iteration number of service tag object for region.
     */
    @JsonProperty(value = "serviceTagChangeNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceTagChangeNumber;

    /**
     * Get the properties property: Properties of the service tag information.
     *
     * @return the properties value.
     */
    public ServiceTagInformationPropertiesFormat properties() {
        return this.properties;
    }

    /**
     * Get the name property: The name of service tag.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: The ID of service tag.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the serviceTagChangeNumber property: The iteration number of service tag object for region.
     *
     * @return the serviceTagChangeNumber value.
     */
    public String serviceTagChangeNumber() {
        return this.serviceTagChangeNumber;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
