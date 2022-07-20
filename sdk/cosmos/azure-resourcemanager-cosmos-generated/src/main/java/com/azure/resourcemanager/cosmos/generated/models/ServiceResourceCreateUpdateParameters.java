// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.generated.fluent.models.ServiceResourceCreateUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters for Create or Update Request for ServiceResource. */
@Fluent
public final class ServiceResourceCreateUpdateParameters {
    /*
     * Properties in ServiceResourceCreateUpdateParameters.
     */
    @JsonProperty(value = "properties")
    private ServiceResourceCreateUpdateProperties innerProperties;

    /**
     * Get the innerProperties property: Properties in ServiceResourceCreateUpdateParameters.
     *
     * @return the innerProperties value.
     */
    private ServiceResourceCreateUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the instanceSize property: Instance type for the service.
     *
     * @return the instanceSize value.
     */
    public ServiceSize instanceSize() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceSize();
    }

    /**
     * Set the instanceSize property: Instance type for the service.
     *
     * @param instanceSize the instanceSize value to set.
     * @return the ServiceResourceCreateUpdateParameters object itself.
     */
    public ServiceResourceCreateUpdateParameters withInstanceSize(ServiceSize instanceSize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceResourceCreateUpdateProperties();
        }
        this.innerProperties().withInstanceSize(instanceSize);
        return this;
    }

    /**
     * Get the instanceCount property: Instance count for the service.
     *
     * @return the instanceCount value.
     */
    public Integer instanceCount() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceCount();
    }

    /**
     * Set the instanceCount property: Instance count for the service.
     *
     * @param instanceCount the instanceCount value to set.
     * @return the ServiceResourceCreateUpdateParameters object itself.
     */
    public ServiceResourceCreateUpdateParameters withInstanceCount(Integer instanceCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceResourceCreateUpdateProperties();
        }
        this.innerProperties().withInstanceCount(instanceCount);
        return this;
    }

    /**
     * Get the serviceType property: ServiceType for the service.
     *
     * @return the serviceType value.
     */
    public ServiceType serviceType() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceType();
    }

    /**
     * Set the serviceType property: ServiceType for the service.
     *
     * @param serviceType the serviceType value to set.
     * @return the ServiceResourceCreateUpdateParameters object itself.
     */
    public ServiceResourceCreateUpdateParameters withServiceType(ServiceType serviceType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceResourceCreateUpdateProperties();
        }
        this.innerProperties().withServiceType(serviceType);
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
