// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.LoadDistribution;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TransportProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the load balancer. */
@Fluent
public final class LoadBalancingRulePropertiesFormat {
    /*
     * A reference to frontend IP addresses.
     */
    @JsonProperty(value = "frontendIPConfiguration")
    private SubResource frontendIpConfiguration;

    /*
     * A reference to a pool of DIPs. Inbound traffic is randomly load balanced
     * across IPs in the backend IPs.
     */
    @JsonProperty(value = "backendAddressPool")
    private SubResource backendAddressPool;

    /*
     * An array of references to pool of DIPs.
     */
    @JsonProperty(value = "backendAddressPools")
    private List<SubResource> backendAddressPools;

    /*
     * The reference to the load balancer probe used by the load balancing
     * rule.
     */
    @JsonProperty(value = "probe")
    private SubResource probe;

    /*
     * The reference to the transport protocol used by the load balancing rule.
     */
    @JsonProperty(value = "protocol", required = true)
    private TransportProtocol protocol;

    /*
     * The load distribution policy for this rule.
     */
    @JsonProperty(value = "loadDistribution")
    private LoadDistribution loadDistribution;

    /*
     * The port for the external endpoint. Port numbers for each rule must be
     * unique within the Load Balancer. Acceptable values are between 0 and
     * 65534. Note that value 0 enables "Any Port".
     */
    @JsonProperty(value = "frontendPort", required = true)
    private int frontendPort;

    /*
     * The port used for internal connections on the endpoint. Acceptable
     * values are between 0 and 65535. Note that value 0 enables "Any Port".
     */
    @JsonProperty(value = "backendPort")
    private Integer backendPort;

    /*
     * The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only
     * used when the protocol is set to TCP.
     */
    @JsonProperty(value = "idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /*
     * Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is
     * required when using the SQL AlwaysOn Availability Groups in SQL server.
     * This setting can't be changed after you create the endpoint.
     */
    @JsonProperty(value = "enableFloatingIP")
    private Boolean enableFloatingIp;

    /*
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is
     * set to TCP.
     */
    @JsonProperty(value = "enableTcpReset")
    private Boolean enableTcpReset;

    /*
     * Configures SNAT for the VMs in the backend pool to use the publicIP
     * address specified in the frontend of the load balancing rule.
     */
    @JsonProperty(value = "disableOutboundSnat")
    private Boolean disableOutboundSnat;

    /*
     * The provisioning state of the load balancing rule resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the frontendIpConfiguration property: A reference to frontend IP addresses.
     *
     * @return the frontendIpConfiguration value.
     */
    public SubResource frontendIpConfiguration() {
        return this.frontendIpConfiguration;
    }

    /**
     * Set the frontendIpConfiguration property: A reference to frontend IP addresses.
     *
     * @param frontendIpConfiguration the frontendIpConfiguration value to set.
     * @return the LoadBalancingRulePropertiesFormat object itself.
     */
    public LoadBalancingRulePropertiesFormat withFrontendIpConfiguration(SubResource frontendIpConfiguration) {
        this.frontendIpConfiguration = frontendIpConfiguration;
        return this;
    }

    /**
     * Get the backendAddressPool property: A reference to a pool of DIPs. Inbound traffic is randomly load balanced
     * across IPs in the backend IPs.
     *
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool property: A reference to a pool of DIPs. Inbound traffic is randomly load balanced
     * across IPs in the backend IPs.
     *
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the LoadBalancingRulePropertiesFormat object itself.
     */
    public LoadBalancingRulePropertiesFormat withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the backendAddressPools property: An array of references to pool of DIPs.
     *
     * @return the backendAddressPools value.
     */
    public List<SubResource> backendAddressPools() {
        return this.backendAddressPools;
    }

    /**
     * Set the backendAddressPools property: An array of references to pool of DIPs.
     *
     * @param backendAddressPools the backendAddressPools value to set.
     * @return the LoadBalancingRulePropertiesFormat object itself.
     */
    public LoadBalancingRulePropertiesFormat withBackendAddressPools(List<SubResource> backendAddressPools) {
        this.backendAddressPools = backendAddressPools;
        return this;
    }

    /**
     * Get the probe property: The reference to the load balancer probe used by the load balancing rule.
     *
     * @return the probe value.
     */
    public SubResource probe() {
        return this.probe;
    }

    /**
     * Set the probe property: The reference to the load balancer probe used by the load balancing rule.
     *
     * @param probe the probe value to set.
     * @return the LoadBalancingRulePropertiesFormat object itself.
     */
    public LoadBalancingRulePropertiesFormat withProbe(SubResource probe) {
        this.probe = probe;
        return this;
    }

    /**
     * Get the protocol property: The reference to the transport protocol used by the load balancing rule.
     *
     * @return the protocol value.
     */
    public TransportProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The reference to the transport protocol used by the load balancing rule.
     *
     * @param protocol the protocol value to set.
     * @return the LoadBalancingRulePropertiesFormat object itself.
     */
    public LoadBalancingRulePropertiesFormat withProtocol(TransportProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the loadDistribution property: The load distribution policy for this rule.
     *
     * @return the loadDistribution value.
     */
    public LoadDistribution loadDistribution() {
        return this.loadDistribution;
    }

    /**
     * Set the loadDistribution property: The load distribution policy for this rule.
     *
     * @param loadDistribution the loadDistribution value to set.
     * @return the LoadBalancingRulePropertiesFormat object itself.
     */
    public LoadBalancingRulePropertiesFormat withLoadDistribution(LoadDistribution loadDistribution) {
        this.loadDistribution = loadDistribution;
        return this;
    }

    /**
     * Get the frontendPort property: The port for the external endpoint. Port numbers for each rule must be unique
     * within the Load Balancer. Acceptable values are between 0 and 65534. Note that value 0 enables "Any Port".
     *
     * @return the frontendPort value.
     */
    public int frontendPort() {
        return this.frontendPort;
    }

    /**
     * Set the frontendPort property: The port for the external endpoint. Port numbers for each rule must be unique
     * within the Load Balancer. Acceptable values are between 0 and 65534. Note that value 0 enables "Any Port".
     *
     * @param frontendPort the frontendPort value to set.
     * @return the LoadBalancingRulePropertiesFormat object itself.
     */
    public LoadBalancingRulePropertiesFormat withFrontendPort(int frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }

    /**
     * Get the backendPort property: The port used for internal connections on the endpoint. Acceptable values are
     * between 0 and 65535. Note that value 0 enables "Any Port".
     *
     * @return the backendPort value.
     */
    public Integer backendPort() {
        return this.backendPort;
    }

    /**
     * Set the backendPort property: The port used for internal connections on the endpoint. Acceptable values are
     * between 0 and 65535. Note that value 0 enables "Any Port".
     *
     * @param backendPort the backendPort value to set.
     * @return the LoadBalancingRulePropertiesFormat object itself.
     */
    public LoadBalancingRulePropertiesFormat withBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the LoadBalancingRulePropertiesFormat object itself.
     */
    public LoadBalancingRulePropertiesFormat withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the enableFloatingIp property: Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
     * Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @return the enableFloatingIp value.
     */
    public Boolean enableFloatingIp() {
        return this.enableFloatingIp;
    }

    /**
     * Set the enableFloatingIp property: Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
     * Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @param enableFloatingIp the enableFloatingIp value to set.
     * @return the LoadBalancingRulePropertiesFormat object itself.
     */
    public LoadBalancingRulePropertiesFormat withEnableFloatingIp(Boolean enableFloatingIp) {
        this.enableFloatingIp = enableFloatingIp;
        return this;
    }

    /**
     * Get the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     *
     * @return the enableTcpReset value.
     */
    public Boolean enableTcpReset() {
        return this.enableTcpReset;
    }

    /**
     * Set the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     *
     * @param enableTcpReset the enableTcpReset value to set.
     * @return the LoadBalancingRulePropertiesFormat object itself.
     */
    public LoadBalancingRulePropertiesFormat withEnableTcpReset(Boolean enableTcpReset) {
        this.enableTcpReset = enableTcpReset;
        return this;
    }

    /**
     * Get the disableOutboundSnat property: Configures SNAT for the VMs in the backend pool to use the publicIP address
     * specified in the frontend of the load balancing rule.
     *
     * @return the disableOutboundSnat value.
     */
    public Boolean disableOutboundSnat() {
        return this.disableOutboundSnat;
    }

    /**
     * Set the disableOutboundSnat property: Configures SNAT for the VMs in the backend pool to use the publicIP address
     * specified in the frontend of the load balancing rule.
     *
     * @param disableOutboundSnat the disableOutboundSnat value to set.
     * @return the LoadBalancingRulePropertiesFormat object itself.
     */
    public LoadBalancingRulePropertiesFormat withDisableOutboundSnat(Boolean disableOutboundSnat) {
        this.disableOutboundSnat = disableOutboundSnat;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the load balancing rule resource.
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
        if (protocol() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property protocol in model LoadBalancingRulePropertiesFormat"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LoadBalancingRulePropertiesFormat.class);
}
