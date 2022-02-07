// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.InboundNatRuleInner;

/** An immutable client-side representation of InboundNatRule. */
public interface InboundNatRule {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within the set of inbound NAT rules used by the
     * load balancer. This name can be used to access the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the type property: Type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the frontendIpConfiguration property: A reference to frontend IP addresses.
     *
     * @return the frontendIpConfiguration value.
     */
    SubResource frontendIpConfiguration();

    /**
     * Gets the backendIpConfiguration property: A reference to a private IP address defined on a network interface of a
     * VM. Traffic sent to the frontend port of each of the frontend IP configurations is forwarded to the backend IP.
     *
     * @return the backendIpConfiguration value.
     */
    NetworkInterfaceIpConfiguration backendIpConfiguration();

    /**
     * Gets the protocol property: The reference to the transport protocol used by the load balancing rule.
     *
     * @return the protocol value.
     */
    TransportProtocol protocol();

    /**
     * Gets the frontendPort property: The port for the external endpoint. Port numbers for each rule must be unique
     * within the Load Balancer. Acceptable values range from 1 to 65534.
     *
     * @return the frontendPort value.
     */
    Integer frontendPort();

    /**
     * Gets the backendPort property: The port used for the internal endpoint. Acceptable values range from 1 to 65535.
     *
     * @return the backendPort value.
     */
    Integer backendPort();

    /**
     * Gets the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @return the idleTimeoutInMinutes value.
     */
    Integer idleTimeoutInMinutes();

    /**
     * Gets the enableFloatingIp property: Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
     * Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @return the enableFloatingIp value.
     */
    Boolean enableFloatingIp();

    /**
     * Gets the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     *
     * @return the enableTcpReset value.
     */
    Boolean enableTcpReset();

    /**
     * Gets the frontendPortRangeStart property: The port range start for the external endpoint. This property is used
     * together with BackendAddressPool and FrontendPortRangeEnd. Individual inbound NAT rule port mappings will be
     * created for each backend address from BackendAddressPool. Acceptable values range from 1 to 65534.
     *
     * @return the frontendPortRangeStart value.
     */
    Integer frontendPortRangeStart();

    /**
     * Gets the frontendPortRangeEnd property: The port range end for the external endpoint. This property is used
     * together with BackendAddressPool and FrontendPortRangeStart. Individual inbound NAT rule port mappings will be
     * created for each backend address from BackendAddressPool. Acceptable values range from 1 to 65534.
     *
     * @return the frontendPortRangeEnd value.
     */
    Integer frontendPortRangeEnd();

    /**
     * Gets the backendAddressPool property: A reference to backendAddressPool resource.
     *
     * @return the backendAddressPool value.
     */
    SubResource backendAddressPool();

    /**
     * Gets the provisioningState property: The provisioning state of the inbound NAT rule resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.InboundNatRuleInner object.
     *
     * @return the inner object.
     */
    InboundNatRuleInner innerModel();

    /** The entirety of the InboundNatRule definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The InboundNatRule definition stages. */
    interface DefinitionStages {
        /** The first stage of the InboundNatRule definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the InboundNatRule definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, loadBalancerName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param loadBalancerName The name of the load balancer.
             * @return the next definition stage.
             */
            WithCreate withExistingLoadBalancer(String resourceGroupName, String loadBalancerName);
        }
        /**
         * The stage of the InboundNatRule definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithName,
                DefinitionStages.WithFrontendIpConfiguration,
                DefinitionStages.WithProtocol,
                DefinitionStages.WithFrontendPort,
                DefinitionStages.WithBackendPort,
                DefinitionStages.WithIdleTimeoutInMinutes,
                DefinitionStages.WithEnableFloatingIp,
                DefinitionStages.WithEnableTcpReset,
                DefinitionStages.WithFrontendPortRangeStart,
                DefinitionStages.WithFrontendPortRangeEnd,
                DefinitionStages.WithBackendAddressPool {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            InboundNatRule create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            InboundNatRule create(Context context);
        }
        /** The stage of the InboundNatRule definition allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within the set of inbound NAT rules
             * used by the load balancer. This name can be used to access the resource..
             *
             * @param name The name of the resource that is unique within the set of inbound NAT rules used by the load
             *     balancer. This name can be used to access the resource.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }
        /** The stage of the InboundNatRule definition allowing to specify frontendIpConfiguration. */
        interface WithFrontendIpConfiguration {
            /**
             * Specifies the frontendIpConfiguration property: A reference to frontend IP addresses..
             *
             * @param frontendIpConfiguration A reference to frontend IP addresses.
             * @return the next definition stage.
             */
            WithCreate withFrontendIpConfiguration(SubResource frontendIpConfiguration);
        }
        /** The stage of the InboundNatRule definition allowing to specify protocol. */
        interface WithProtocol {
            /**
             * Specifies the protocol property: The reference to the transport protocol used by the load balancing
             * rule..
             *
             * @param protocol The reference to the transport protocol used by the load balancing rule.
             * @return the next definition stage.
             */
            WithCreate withProtocol(TransportProtocol protocol);
        }
        /** The stage of the InboundNatRule definition allowing to specify frontendPort. */
        interface WithFrontendPort {
            /**
             * Specifies the frontendPort property: The port for the external endpoint. Port numbers for each rule must
             * be unique within the Load Balancer. Acceptable values range from 1 to 65534..
             *
             * @param frontendPort The port for the external endpoint. Port numbers for each rule must be unique within
             *     the Load Balancer. Acceptable values range from 1 to 65534.
             * @return the next definition stage.
             */
            WithCreate withFrontendPort(Integer frontendPort);
        }
        /** The stage of the InboundNatRule definition allowing to specify backendPort. */
        interface WithBackendPort {
            /**
             * Specifies the backendPort property: The port used for the internal endpoint. Acceptable values range from
             * 1 to 65535..
             *
             * @param backendPort The port used for the internal endpoint. Acceptable values range from 1 to 65535.
             * @return the next definition stage.
             */
            WithCreate withBackendPort(Integer backendPort);
        }
        /** The stage of the InboundNatRule definition allowing to specify idleTimeoutInMinutes. */
        interface WithIdleTimeoutInMinutes {
            /**
             * Specifies the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be
             * set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol
             * is set to TCP..
             *
             * @param idleTimeoutInMinutes The timeout for the TCP idle connection. The value can be set between 4 and
             *     30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to
             *     TCP.
             * @return the next definition stage.
             */
            WithCreate withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes);
        }
        /** The stage of the InboundNatRule definition allowing to specify enableFloatingIp. */
        interface WithEnableFloatingIp {
            /**
             * Specifies the enableFloatingIp property: Configures a virtual machine's endpoint for the floating IP
             * capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using
             * the SQL AlwaysOn Availability Groups in SQL server. This setting can't be changed after you create the
             * endpoint..
             *
             * @param enableFloatingIp Configures a virtual machine's endpoint for the floating IP capability required
             *     to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
             *     Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
             * @return the next definition stage.
             */
            WithCreate withEnableFloatingIp(Boolean enableFloatingIp);
        }
        /** The stage of the InboundNatRule definition allowing to specify enableTcpReset. */
        interface WithEnableTcpReset {
            /**
             * Specifies the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or
             * unexpected connection termination. This element is only used when the protocol is set to TCP..
             *
             * @param enableTcpReset Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection
             *     termination. This element is only used when the protocol is set to TCP.
             * @return the next definition stage.
             */
            WithCreate withEnableTcpReset(Boolean enableTcpReset);
        }
        /** The stage of the InboundNatRule definition allowing to specify frontendPortRangeStart. */
        interface WithFrontendPortRangeStart {
            /**
             * Specifies the frontendPortRangeStart property: The port range start for the external endpoint. This
             * property is used together with BackendAddressPool and FrontendPortRangeEnd. Individual inbound NAT rule
             * port mappings will be created for each backend address from BackendAddressPool. Acceptable values range
             * from 1 to 65534..
             *
             * @param frontendPortRangeStart The port range start for the external endpoint. This property is used
             *     together with BackendAddressPool and FrontendPortRangeEnd. Individual inbound NAT rule port mappings
             *     will be created for each backend address from BackendAddressPool. Acceptable values range from 1 to
             *     65534.
             * @return the next definition stage.
             */
            WithCreate withFrontendPortRangeStart(Integer frontendPortRangeStart);
        }
        /** The stage of the InboundNatRule definition allowing to specify frontendPortRangeEnd. */
        interface WithFrontendPortRangeEnd {
            /**
             * Specifies the frontendPortRangeEnd property: The port range end for the external endpoint. This property
             * is used together with BackendAddressPool and FrontendPortRangeStart. Individual inbound NAT rule port
             * mappings will be created for each backend address from BackendAddressPool. Acceptable values range from 1
             * to 65534..
             *
             * @param frontendPortRangeEnd The port range end for the external endpoint. This property is used together
             *     with BackendAddressPool and FrontendPortRangeStart. Individual inbound NAT rule port mappings will be
             *     created for each backend address from BackendAddressPool. Acceptable values range from 1 to 65534.
             * @return the next definition stage.
             */
            WithCreate withFrontendPortRangeEnd(Integer frontendPortRangeEnd);
        }
        /** The stage of the InboundNatRule definition allowing to specify backendAddressPool. */
        interface WithBackendAddressPool {
            /**
             * Specifies the backendAddressPool property: A reference to backendAddressPool resource..
             *
             * @param backendAddressPool A reference to backendAddressPool resource.
             * @return the next definition stage.
             */
            WithCreate withBackendAddressPool(SubResource backendAddressPool);
        }
    }
    /**
     * Begins update for the InboundNatRule resource.
     *
     * @return the stage of resource update.
     */
    InboundNatRule.Update update();

    /** The template for InboundNatRule update. */
    interface Update
        extends UpdateStages.WithName,
            UpdateStages.WithFrontendIpConfiguration,
            UpdateStages.WithProtocol,
            UpdateStages.WithFrontendPort,
            UpdateStages.WithBackendPort,
            UpdateStages.WithIdleTimeoutInMinutes,
            UpdateStages.WithEnableFloatingIp,
            UpdateStages.WithEnableTcpReset,
            UpdateStages.WithFrontendPortRangeStart,
            UpdateStages.WithFrontendPortRangeEnd,
            UpdateStages.WithBackendAddressPool {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        InboundNatRule apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        InboundNatRule apply(Context context);
    }
    /** The InboundNatRule update stages. */
    interface UpdateStages {
        /** The stage of the InboundNatRule update allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within the set of inbound NAT rules
             * used by the load balancer. This name can be used to access the resource..
             *
             * @param name The name of the resource that is unique within the set of inbound NAT rules used by the load
             *     balancer. This name can be used to access the resource.
             * @return the next definition stage.
             */
            Update withName(String name);
        }
        /** The stage of the InboundNatRule update allowing to specify frontendIpConfiguration. */
        interface WithFrontendIpConfiguration {
            /**
             * Specifies the frontendIpConfiguration property: A reference to frontend IP addresses..
             *
             * @param frontendIpConfiguration A reference to frontend IP addresses.
             * @return the next definition stage.
             */
            Update withFrontendIpConfiguration(SubResource frontendIpConfiguration);
        }
        /** The stage of the InboundNatRule update allowing to specify protocol. */
        interface WithProtocol {
            /**
             * Specifies the protocol property: The reference to the transport protocol used by the load balancing
             * rule..
             *
             * @param protocol The reference to the transport protocol used by the load balancing rule.
             * @return the next definition stage.
             */
            Update withProtocol(TransportProtocol protocol);
        }
        /** The stage of the InboundNatRule update allowing to specify frontendPort. */
        interface WithFrontendPort {
            /**
             * Specifies the frontendPort property: The port for the external endpoint. Port numbers for each rule must
             * be unique within the Load Balancer. Acceptable values range from 1 to 65534..
             *
             * @param frontendPort The port for the external endpoint. Port numbers for each rule must be unique within
             *     the Load Balancer. Acceptable values range from 1 to 65534.
             * @return the next definition stage.
             */
            Update withFrontendPort(Integer frontendPort);
        }
        /** The stage of the InboundNatRule update allowing to specify backendPort. */
        interface WithBackendPort {
            /**
             * Specifies the backendPort property: The port used for the internal endpoint. Acceptable values range from
             * 1 to 65535..
             *
             * @param backendPort The port used for the internal endpoint. Acceptable values range from 1 to 65535.
             * @return the next definition stage.
             */
            Update withBackendPort(Integer backendPort);
        }
        /** The stage of the InboundNatRule update allowing to specify idleTimeoutInMinutes. */
        interface WithIdleTimeoutInMinutes {
            /**
             * Specifies the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be
             * set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol
             * is set to TCP..
             *
             * @param idleTimeoutInMinutes The timeout for the TCP idle connection. The value can be set between 4 and
             *     30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to
             *     TCP.
             * @return the next definition stage.
             */
            Update withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes);
        }
        /** The stage of the InboundNatRule update allowing to specify enableFloatingIp. */
        interface WithEnableFloatingIp {
            /**
             * Specifies the enableFloatingIp property: Configures a virtual machine's endpoint for the floating IP
             * capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using
             * the SQL AlwaysOn Availability Groups in SQL server. This setting can't be changed after you create the
             * endpoint..
             *
             * @param enableFloatingIp Configures a virtual machine's endpoint for the floating IP capability required
             *     to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
             *     Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
             * @return the next definition stage.
             */
            Update withEnableFloatingIp(Boolean enableFloatingIp);
        }
        /** The stage of the InboundNatRule update allowing to specify enableTcpReset. */
        interface WithEnableTcpReset {
            /**
             * Specifies the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or
             * unexpected connection termination. This element is only used when the protocol is set to TCP..
             *
             * @param enableTcpReset Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection
             *     termination. This element is only used when the protocol is set to TCP.
             * @return the next definition stage.
             */
            Update withEnableTcpReset(Boolean enableTcpReset);
        }
        /** The stage of the InboundNatRule update allowing to specify frontendPortRangeStart. */
        interface WithFrontendPortRangeStart {
            /**
             * Specifies the frontendPortRangeStart property: The port range start for the external endpoint. This
             * property is used together with BackendAddressPool and FrontendPortRangeEnd. Individual inbound NAT rule
             * port mappings will be created for each backend address from BackendAddressPool. Acceptable values range
             * from 1 to 65534..
             *
             * @param frontendPortRangeStart The port range start for the external endpoint. This property is used
             *     together with BackendAddressPool and FrontendPortRangeEnd. Individual inbound NAT rule port mappings
             *     will be created for each backend address from BackendAddressPool. Acceptable values range from 1 to
             *     65534.
             * @return the next definition stage.
             */
            Update withFrontendPortRangeStart(Integer frontendPortRangeStart);
        }
        /** The stage of the InboundNatRule update allowing to specify frontendPortRangeEnd. */
        interface WithFrontendPortRangeEnd {
            /**
             * Specifies the frontendPortRangeEnd property: The port range end for the external endpoint. This property
             * is used together with BackendAddressPool and FrontendPortRangeStart. Individual inbound NAT rule port
             * mappings will be created for each backend address from BackendAddressPool. Acceptable values range from 1
             * to 65534..
             *
             * @param frontendPortRangeEnd The port range end for the external endpoint. This property is used together
             *     with BackendAddressPool and FrontendPortRangeStart. Individual inbound NAT rule port mappings will be
             *     created for each backend address from BackendAddressPool. Acceptable values range from 1 to 65534.
             * @return the next definition stage.
             */
            Update withFrontendPortRangeEnd(Integer frontendPortRangeEnd);
        }
        /** The stage of the InboundNatRule update allowing to specify backendAddressPool. */
        interface WithBackendAddressPool {
            /**
             * Specifies the backendAddressPool property: A reference to backendAddressPool resource..
             *
             * @param backendAddressPool A reference to backendAddressPool resource.
             * @return the next definition stage.
             */
            Update withBackendAddressPool(SubResource backendAddressPool);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    InboundNatRule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    InboundNatRule refresh(Context context);
}
