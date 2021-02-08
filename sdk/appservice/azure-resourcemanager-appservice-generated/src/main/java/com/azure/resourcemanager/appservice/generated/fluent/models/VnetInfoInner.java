// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** VNETInfo contract. This contract is public and is a stripped down version of VNETInfoInternal. */
@JsonFlatten
@Fluent
public class VnetInfoInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VnetInfoInner.class);

    /*
     * The vnet resource id
     */
    @JsonProperty(value = "properties.vnetResourceId")
    private String vnetResourceId;

    /*
     * The client certificate thumbprint
     */
    @JsonProperty(value = "properties.certThumbprint")
    private String certThumbprint;

    /*
     * A certificate file (.cer) blob containing the public key of the private
     * key used to authenticate a
     * Point-To-Site VPN connection.
     */
    @JsonProperty(value = "properties.certBlob")
    private String certBlob;

    /*
     * The routes that this virtual network connection uses.
     */
    @JsonProperty(value = "properties.routes")
    private List<VnetRouteInner> routes;

    /*
     * Flag to determine if a resync is required
     */
    @JsonProperty(value = "properties.resyncRequired")
    private Boolean resyncRequired;

    /*
     * Dns servers to be used by this VNET. This should be a comma-separated
     * list of IP addresses.
     */
    @JsonProperty(value = "properties.dnsServers")
    private String dnsServers;

    /*
     * Kind of resource
     */
    @JsonProperty(value = "kind")
    private String kind;

    /*
     * Resource Id
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Resource Name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Resource type
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the vnetResourceId property: The vnet resource id.
     *
     * @return the vnetResourceId value.
     */
    public String vnetResourceId() {
        return this.vnetResourceId;
    }

    /**
     * Set the vnetResourceId property: The vnet resource id.
     *
     * @param vnetResourceId the vnetResourceId value to set.
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withVnetResourceId(String vnetResourceId) {
        this.vnetResourceId = vnetResourceId;
        return this;
    }

    /**
     * Get the certThumbprint property: The client certificate thumbprint.
     *
     * @return the certThumbprint value.
     */
    public String certThumbprint() {
        return this.certThumbprint;
    }

    /**
     * Set the certThumbprint property: The client certificate thumbprint.
     *
     * @param certThumbprint the certThumbprint value to set.
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withCertThumbprint(String certThumbprint) {
        this.certThumbprint = certThumbprint;
        return this;
    }

    /**
     * Get the certBlob property: A certificate file (.cer) blob containing the public key of the private key used to
     * authenticate a Point-To-Site VPN connection.
     *
     * @return the certBlob value.
     */
    public String certBlob() {
        return this.certBlob;
    }

    /**
     * Set the certBlob property: A certificate file (.cer) blob containing the public key of the private key used to
     * authenticate a Point-To-Site VPN connection.
     *
     * @param certBlob the certBlob value to set.
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withCertBlob(String certBlob) {
        this.certBlob = certBlob;
        return this;
    }

    /**
     * Get the routes property: The routes that this virtual network connection uses.
     *
     * @return the routes value.
     */
    public List<VnetRouteInner> routes() {
        return this.routes;
    }

    /**
     * Set the routes property: The routes that this virtual network connection uses.
     *
     * @param routes the routes value to set.
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withRoutes(List<VnetRouteInner> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get the resyncRequired property: Flag to determine if a resync is required.
     *
     * @return the resyncRequired value.
     */
    public Boolean resyncRequired() {
        return this.resyncRequired;
    }

    /**
     * Set the resyncRequired property: Flag to determine if a resync is required.
     *
     * @param resyncRequired the resyncRequired value to set.
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withResyncRequired(Boolean resyncRequired) {
        this.resyncRequired = resyncRequired;
        return this;
    }

    /**
     * Get the dnsServers property: Dns servers to be used by this VNET. This should be a comma-separated list of IP
     * addresses.
     *
     * @return the dnsServers value.
     */
    public String dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set the dnsServers property: Dns servers to be used by this VNET. This should be a comma-separated list of IP
     * addresses.
     *
     * @param dnsServers the dnsServers value to set.
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withDnsServers(String dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * Get the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     *
     * @param kind the kind value to set.
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the id property: Resource Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource Id.
     *
     * @param id the id value to set.
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Resource Name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource Name.
     *
     * @param name the name value to set.
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type.
     *
     * @param type the type value to set.
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withType(String type) {
        this.type = type;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VnetInfoInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VnetInfoInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (routes() != null) {
            routes().forEach(e -> e.validate());
        }
    }
}
