// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CIDR Ip address. */
@Fluent
public final class CidrIpAddress {
    /*
     * Ip address itself.
     */
    @JsonProperty(value = "baseIpAddress")
    private String baseIpAddress;

    /*
     * The length of the prefix of the ip address.
     */
    @JsonProperty(value = "prefixLength")
    private Integer prefixLength;

    /**
     * Get the baseIpAddress property: Ip address itself.
     *
     * @return the baseIpAddress value.
     */
    public String baseIpAddress() {
        return this.baseIpAddress;
    }

    /**
     * Set the baseIpAddress property: Ip address itself.
     *
     * @param baseIpAddress the baseIpAddress value to set.
     * @return the CidrIpAddress object itself.
     */
    public CidrIpAddress withBaseIpAddress(String baseIpAddress) {
        this.baseIpAddress = baseIpAddress;
        return this;
    }

    /**
     * Get the prefixLength property: The length of the prefix of the ip address.
     *
     * @return the prefixLength value.
     */
    public Integer prefixLength() {
        return this.prefixLength;
    }

    /**
     * Set the prefixLength property: The length of the prefix of the ip address.
     *
     * @param prefixLength the prefixLength value to set.
     * @return the CidrIpAddress object itself.
     */
    public CidrIpAddress withPrefixLength(Integer prefixLength) {
        this.prefixLength = prefixLength;
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
