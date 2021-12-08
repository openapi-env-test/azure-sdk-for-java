// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Nat Gateway properties. */
@Fluent
public final class NatGatewayPropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NatGatewayPropertiesFormat.class);

    /*
     * The idle timeout of the nat gateway.
     */
    @JsonProperty(value = "idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /*
     * An array of public ip addresses associated with the nat gateway
     * resource.
     */
    @JsonProperty(value = "publicIpAddresses")
    private List<SubResource> publicIpAddresses;

    /*
     * An array of public ip prefixes associated with the nat gateway resource.
     */
    @JsonProperty(value = "publicIpPrefixes")
    private List<SubResource> publicIpPrefixes;

    /*
     * An array of references to the subnets using this nat gateway resource.
     */
    @JsonProperty(value = "subnets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> subnets;

    /*
     * The resource GUID property of the NAT gateway resource.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the NAT gateway resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the idleTimeoutInMinutes property: The idle timeout of the nat gateway.
     *
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: The idle timeout of the nat gateway.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the NatGatewayPropertiesFormat object itself.
     */
    public NatGatewayPropertiesFormat withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the publicIpAddresses property: An array of public ip addresses associated with the nat gateway resource.
     *
     * @return the publicIpAddresses value.
     */
    public List<SubResource> publicIpAddresses() {
        return this.publicIpAddresses;
    }

    /**
     * Set the publicIpAddresses property: An array of public ip addresses associated with the nat gateway resource.
     *
     * @param publicIpAddresses the publicIpAddresses value to set.
     * @return the NatGatewayPropertiesFormat object itself.
     */
    public NatGatewayPropertiesFormat withPublicIpAddresses(List<SubResource> publicIpAddresses) {
        this.publicIpAddresses = publicIpAddresses;
        return this;
    }

    /**
     * Get the publicIpPrefixes property: An array of public ip prefixes associated with the nat gateway resource.
     *
     * @return the publicIpPrefixes value.
     */
    public List<SubResource> publicIpPrefixes() {
        return this.publicIpPrefixes;
    }

    /**
     * Set the publicIpPrefixes property: An array of public ip prefixes associated with the nat gateway resource.
     *
     * @param publicIpPrefixes the publicIpPrefixes value to set.
     * @return the NatGatewayPropertiesFormat object itself.
     */
    public NatGatewayPropertiesFormat withPublicIpPrefixes(List<SubResource> publicIpPrefixes) {
        this.publicIpPrefixes = publicIpPrefixes;
        return this;
    }

    /**
     * Get the subnets property: An array of references to the subnets using this nat gateway resource.
     *
     * @return the subnets value.
     */
    public List<SubResource> subnets() {
        return this.subnets;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the NAT gateway resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the NAT gateway resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
