// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TransportProtocol;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the inbound NAT rule. */
@Fluent
public final class InboundNatRulePropertiesFormatInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InboundNatRulePropertiesFormatInner.class);

    /*
     * A reference to frontend IP addresses.
     */
    @JsonProperty(value = "frontendIPConfiguration")
    private SubResource frontendIpConfiguration;

    /*
     * A reference to a private IP address defined on a network interface of a
     * VM. Traffic sent to the frontend port of each of the frontend IP
     * configurations is forwarded to the backend IP.
     */
    @JsonProperty(value = "backendIPConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkInterfaceIpConfigurationInner backendIpConfiguration;

    /*
     * The reference to the transport protocol used by the load balancing rule.
     */
    @JsonProperty(value = "protocol")
    private TransportProtocol protocol;

    /*
     * The port for the external endpoint. Port numbers for each rule must be
     * unique within the Load Balancer. Acceptable values range from 1 to
     * 65534.
     */
    @JsonProperty(value = "frontendPort")
    private Integer frontendPort;

    /*
     * The port used for the internal endpoint. Acceptable values range from 1
     * to 65535.
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
     * The port range start for the external endpoint. This property is used
     * together with BackendAddressPool and FrontendPortRangeEnd. Individual
     * inbound NAT rule port mappings will be created for each backend address
     * from BackendAddressPool. Acceptable values range from 1 to 65534.
     */
    @JsonProperty(value = "frontendPortRangeStart")
    private Integer frontendPortRangeStart;

    /*
     * The port range end for the external endpoint. This property is used
     * together with BackendAddressPool and FrontendPortRangeStart. Individual
     * inbound NAT rule port mappings will be created for each backend address
     * from BackendAddressPool. Acceptable values range from 1 to 65534.
     */
    @JsonProperty(value = "frontendPortRangeEnd")
    private Integer frontendPortRangeEnd;

    /*
     * A reference to backendAddressPool resource.
     */
    @JsonProperty(value = "backendAddressPool")
    private SubResource backendAddressPool;

    /*
     * The provisioning state of the inbound NAT rule resource.
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
     * @return the InboundNatRulePropertiesFormatInner object itself.
     */
    public InboundNatRulePropertiesFormatInner withFrontendIpConfiguration(SubResource frontendIpConfiguration) {
        this.frontendIpConfiguration = frontendIpConfiguration;
        return this;
    }

    /**
     * Get the backendIpConfiguration property: A reference to a private IP address defined on a network interface of a
     * VM. Traffic sent to the frontend port of each of the frontend IP configurations is forwarded to the backend IP.
     *
     * @return the backendIpConfiguration value.
     */
    public NetworkInterfaceIpConfigurationInner backendIpConfiguration() {
        return this.backendIpConfiguration;
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
     * @return the InboundNatRulePropertiesFormatInner object itself.
     */
    public InboundNatRulePropertiesFormatInner withProtocol(TransportProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the frontendPort property: The port for the external endpoint. Port numbers for each rule must be unique
     * within the Load Balancer. Acceptable values range from 1 to 65534.
     *
     * @return the frontendPort value.
     */
    public Integer frontendPort() {
        return this.frontendPort;
    }

    /**
     * Set the frontendPort property: The port for the external endpoint. Port numbers for each rule must be unique
     * within the Load Balancer. Acceptable values range from 1 to 65534.
     *
     * @param frontendPort the frontendPort value to set.
     * @return the InboundNatRulePropertiesFormatInner object itself.
     */
    public InboundNatRulePropertiesFormatInner withFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }

    /**
     * Get the backendPort property: The port used for the internal endpoint. Acceptable values range from 1 to 65535.
     *
     * @return the backendPort value.
     */
    public Integer backendPort() {
        return this.backendPort;
    }

    /**
     * Set the backendPort property: The port used for the internal endpoint. Acceptable values range from 1 to 65535.
     *
     * @param backendPort the backendPort value to set.
     * @return the InboundNatRulePropertiesFormatInner object itself.
     */
    public InboundNatRulePropertiesFormatInner withBackendPort(Integer backendPort) {
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
     * @return the InboundNatRulePropertiesFormatInner object itself.
     */
    public InboundNatRulePropertiesFormatInner withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
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
     * @return the InboundNatRulePropertiesFormatInner object itself.
     */
    public InboundNatRulePropertiesFormatInner withEnableFloatingIp(Boolean enableFloatingIp) {
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
     * @return the InboundNatRulePropertiesFormatInner object itself.
     */
    public InboundNatRulePropertiesFormatInner withEnableTcpReset(Boolean enableTcpReset) {
        this.enableTcpReset = enableTcpReset;
        return this;
    }

    /**
     * Get the frontendPortRangeStart property: The port range start for the external endpoint. This property is used
     * together with BackendAddressPool and FrontendPortRangeEnd. Individual inbound NAT rule port mappings will be
     * created for each backend address from BackendAddressPool. Acceptable values range from 1 to 65534.
     *
     * @return the frontendPortRangeStart value.
     */
    public Integer frontendPortRangeStart() {
        return this.frontendPortRangeStart;
    }

    /**
     * Set the frontendPortRangeStart property: The port range start for the external endpoint. This property is used
     * together with BackendAddressPool and FrontendPortRangeEnd. Individual inbound NAT rule port mappings will be
     * created for each backend address from BackendAddressPool. Acceptable values range from 1 to 65534.
     *
     * @param frontendPortRangeStart the frontendPortRangeStart value to set.
     * @return the InboundNatRulePropertiesFormatInner object itself.
     */
    public InboundNatRulePropertiesFormatInner withFrontendPortRangeStart(Integer frontendPortRangeStart) {
        this.frontendPortRangeStart = frontendPortRangeStart;
        return this;
    }

    /**
     * Get the frontendPortRangeEnd property: The port range end for the external endpoint. This property is used
     * together with BackendAddressPool and FrontendPortRangeStart. Individual inbound NAT rule port mappings will be
     * created for each backend address from BackendAddressPool. Acceptable values range from 1 to 65534.
     *
     * @return the frontendPortRangeEnd value.
     */
    public Integer frontendPortRangeEnd() {
        return this.frontendPortRangeEnd;
    }

    /**
     * Set the frontendPortRangeEnd property: The port range end for the external endpoint. This property is used
     * together with BackendAddressPool and FrontendPortRangeStart. Individual inbound NAT rule port mappings will be
     * created for each backend address from BackendAddressPool. Acceptable values range from 1 to 65534.
     *
     * @param frontendPortRangeEnd the frontendPortRangeEnd value to set.
     * @return the InboundNatRulePropertiesFormatInner object itself.
     */
    public InboundNatRulePropertiesFormatInner withFrontendPortRangeEnd(Integer frontendPortRangeEnd) {
        this.frontendPortRangeEnd = frontendPortRangeEnd;
        return this;
    }

    /**
     * Get the backendAddressPool property: A reference to backendAddressPool resource.
     *
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool property: A reference to backendAddressPool resource.
     *
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the InboundNatRulePropertiesFormatInner object itself.
     */
    public InboundNatRulePropertiesFormatInner withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the inbound NAT rule resource.
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
        if (backendIpConfiguration() != null) {
            backendIpConfiguration().validate();
        }
    }
}
