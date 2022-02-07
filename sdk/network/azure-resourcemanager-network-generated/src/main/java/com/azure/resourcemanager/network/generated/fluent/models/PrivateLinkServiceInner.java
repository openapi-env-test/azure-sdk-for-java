// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ExtendedLocation;
import com.azure.resourcemanager.network.generated.models.PrivateLinkServicePropertiesAutoApproval;
import com.azure.resourcemanager.network.generated.models.PrivateLinkServicePropertiesVisibility;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Private link service resource. */
@Fluent
public final class PrivateLinkServiceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkServiceInner.class);

    /*
     * The extended location of the load balancer.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * Properties of the private link service.
     */
    @JsonProperty(value = "properties")
    private PrivateLinkServiceProperties innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the extendedLocation property: The extended location of the load balancer.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of the load balancer.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the private link service.
     *
     * @return the innerProperties value.
     */
    private PrivateLinkServiceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateLinkServiceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateLinkServiceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the loadBalancerFrontendIpConfigurations property: An array of references to the load balancer IP
     * configurations.
     *
     * @return the loadBalancerFrontendIpConfigurations value.
     */
    public List<FrontendIpConfigurationInner> loadBalancerFrontendIpConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancerFrontendIpConfigurations();
    }

    /**
     * Set the loadBalancerFrontendIpConfigurations property: An array of references to the load balancer IP
     * configurations.
     *
     * @param loadBalancerFrontendIpConfigurations the loadBalancerFrontendIpConfigurations value to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withLoadBalancerFrontendIpConfigurations(
        List<FrontendIpConfigurationInner> loadBalancerFrontendIpConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkServiceProperties();
        }
        this.innerProperties().withLoadBalancerFrontendIpConfigurations(loadBalancerFrontendIpConfigurations);
        return this;
    }

    /**
     * Get the ipConfigurations property: An array of private link service IP configurations.
     *
     * @return the ipConfigurations value.
     */
    public List<PrivateLinkServiceIpConfigurationInner> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Set the ipConfigurations property: An array of private link service IP configurations.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withIpConfigurations(List<PrivateLinkServiceIpConfigurationInner> ipConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkServiceProperties();
        }
        this.innerProperties().withIpConfigurations(ipConfigurations);
        return this;
    }

    /**
     * Get the networkInterfaces property: An array of references to the network interfaces created for this private
     * link service.
     *
     * @return the networkInterfaces value.
     */
    public List<NetworkInterfaceInner> networkInterfaces() {
        return this.innerProperties() == null ? null : this.innerProperties().networkInterfaces();
    }

    /**
     * Get the provisioningState property: The provisioning state of the private link service resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the privateEndpointConnections property: An array of list about connections to the private endpoint.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Get the visibility property: The visibility list of the private link service.
     *
     * @return the visibility value.
     */
    public PrivateLinkServicePropertiesVisibility visibility() {
        return this.innerProperties() == null ? null : this.innerProperties().visibility();
    }

    /**
     * Set the visibility property: The visibility list of the private link service.
     *
     * @param visibility the visibility value to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withVisibility(PrivateLinkServicePropertiesVisibility visibility) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkServiceProperties();
        }
        this.innerProperties().withVisibility(visibility);
        return this;
    }

    /**
     * Get the autoApproval property: The auto-approval list of the private link service.
     *
     * @return the autoApproval value.
     */
    public PrivateLinkServicePropertiesAutoApproval autoApproval() {
        return this.innerProperties() == null ? null : this.innerProperties().autoApproval();
    }

    /**
     * Set the autoApproval property: The auto-approval list of the private link service.
     *
     * @param autoApproval the autoApproval value to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withAutoApproval(PrivateLinkServicePropertiesAutoApproval autoApproval) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkServiceProperties();
        }
        this.innerProperties().withAutoApproval(autoApproval);
        return this;
    }

    /**
     * Get the fqdns property: The list of Fqdn.
     *
     * @return the fqdns value.
     */
    public List<String> fqdns() {
        return this.innerProperties() == null ? null : this.innerProperties().fqdns();
    }

    /**
     * Set the fqdns property: The list of Fqdn.
     *
     * @param fqdns the fqdns value to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withFqdns(List<String> fqdns) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkServiceProperties();
        }
        this.innerProperties().withFqdns(fqdns);
        return this;
    }

    /**
     * Get the alias property: The alias of the private link service.
     *
     * @return the alias value.
     */
    public String alias() {
        return this.innerProperties() == null ? null : this.innerProperties().alias();
    }

    /**
     * Get the enableProxyProtocol property: Whether the private link service is enabled for proxy protocol or not.
     *
     * @return the enableProxyProtocol value.
     */
    public Boolean enableProxyProtocol() {
        return this.innerProperties() == null ? null : this.innerProperties().enableProxyProtocol();
    }

    /**
     * Set the enableProxyProtocol property: Whether the private link service is enabled for proxy protocol or not.
     *
     * @param enableProxyProtocol the enableProxyProtocol value to set.
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withEnableProxyProtocol(Boolean enableProxyProtocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkServiceProperties();
        }
        this.innerProperties().withEnableProxyProtocol(enableProxyProtocol);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
