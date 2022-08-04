// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TransportProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of Inbound NAT pool. */
@Fluent
public final class InboundNatPoolPropertiesFormat {
    /*
     * A reference to frontend IP addresses.
     */
    @JsonProperty(value = "frontendIPConfiguration")
    private SubResource frontendIpConfiguration;

    /*
     * The reference to the transport protocol used by the inbound NAT pool.
     */
    @JsonProperty(value = "protocol", required = true)
    private TransportProtocol protocol;

    /*
     * The first port number in the range of external ports that will be used
     * to provide Inbound Nat to NICs associated with a load balancer.
     * Acceptable values range between 1 and 65534.
     */
    @JsonProperty(value = "frontendPortRangeStart", required = true)
    private int frontendPortRangeStart;

    /*
     * The last port number in the range of external ports that will be used to
     * provide Inbound Nat to NICs associated with a load balancer. Acceptable
     * values range between 1 and 65535.
     */
    @JsonProperty(value = "frontendPortRangeEnd", required = true)
    private int frontendPortRangeEnd;

    /*
     * The port used for internal connections on the endpoint. Acceptable
     * values are between 1 and 65535.
     */
    @JsonProperty(value = "backendPort", required = true)
    private int backendPort;

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
     * The provisioning state of the inbound NAT pool resource.
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
     * @return the InboundNatPoolPropertiesFormat object itself.
     */
    public InboundNatPoolPropertiesFormat withFrontendIpConfiguration(SubResource frontendIpConfiguration) {
        this.frontendIpConfiguration = frontendIpConfiguration;
        return this;
    }

    /**
     * Get the protocol property: The reference to the transport protocol used by the inbound NAT pool.
     *
     * @return the protocol value.
     */
    public TransportProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The reference to the transport protocol used by the inbound NAT pool.
     *
     * @param protocol the protocol value to set.
     * @return the InboundNatPoolPropertiesFormat object itself.
     */
    public InboundNatPoolPropertiesFormat withProtocol(TransportProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the frontendPortRangeStart property: The first port number in the range of external ports that will be used
     * to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65534.
     *
     * @return the frontendPortRangeStart value.
     */
    public int frontendPortRangeStart() {
        return this.frontendPortRangeStart;
    }

    /**
     * Set the frontendPortRangeStart property: The first port number in the range of external ports that will be used
     * to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65534.
     *
     * @param frontendPortRangeStart the frontendPortRangeStart value to set.
     * @return the InboundNatPoolPropertiesFormat object itself.
     */
    public InboundNatPoolPropertiesFormat withFrontendPortRangeStart(int frontendPortRangeStart) {
        this.frontendPortRangeStart = frontendPortRangeStart;
        return this;
    }

    /**
     * Get the frontendPortRangeEnd property: The last port number in the range of external ports that will be used to
     * provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65535.
     *
     * @return the frontendPortRangeEnd value.
     */
    public int frontendPortRangeEnd() {
        return this.frontendPortRangeEnd;
    }

    /**
     * Set the frontendPortRangeEnd property: The last port number in the range of external ports that will be used to
     * provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65535.
     *
     * @param frontendPortRangeEnd the frontendPortRangeEnd value to set.
     * @return the InboundNatPoolPropertiesFormat object itself.
     */
    public InboundNatPoolPropertiesFormat withFrontendPortRangeEnd(int frontendPortRangeEnd) {
        this.frontendPortRangeEnd = frontendPortRangeEnd;
        return this;
    }

    /**
     * Get the backendPort property: The port used for internal connections on the endpoint. Acceptable values are
     * between 1 and 65535.
     *
     * @return the backendPort value.
     */
    public int backendPort() {
        return this.backendPort;
    }

    /**
     * Set the backendPort property: The port used for internal connections on the endpoint. Acceptable values are
     * between 1 and 65535.
     *
     * @param backendPort the backendPort value to set.
     * @return the InboundNatPoolPropertiesFormat object itself.
     */
    public InboundNatPoolPropertiesFormat withBackendPort(int backendPort) {
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
     * @return the InboundNatPoolPropertiesFormat object itself.
     */
    public InboundNatPoolPropertiesFormat withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
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
     * @return the InboundNatPoolPropertiesFormat object itself.
     */
    public InboundNatPoolPropertiesFormat withEnableFloatingIp(Boolean enableFloatingIp) {
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
     * @return the InboundNatPoolPropertiesFormat object itself.
     */
    public InboundNatPoolPropertiesFormat withEnableTcpReset(Boolean enableTcpReset) {
        this.enableTcpReset = enableTcpReset;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the inbound NAT pool resource.
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
                        "Missing required property protocol in model InboundNatPoolPropertiesFormat"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(InboundNatPoolPropertiesFormat.class);
}
