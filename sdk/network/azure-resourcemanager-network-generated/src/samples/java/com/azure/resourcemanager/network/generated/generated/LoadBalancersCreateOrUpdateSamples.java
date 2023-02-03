// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.BackendAddressPoolInner;
import com.azure.resourcemanager.network.generated.fluent.models.FrontendIpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.InboundNatRuleInner;
import com.azure.resourcemanager.network.generated.fluent.models.LoadBalancingRuleInner;
import com.azure.resourcemanager.network.generated.fluent.models.OutboundRuleInner;
import com.azure.resourcemanager.network.generated.fluent.models.ProbeInner;
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpAddressInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.models.GatewayLoadBalancerTunnelInterface;
import com.azure.resourcemanager.network.generated.models.GatewayLoadBalancerTunnelInterfaceType;
import com.azure.resourcemanager.network.generated.models.GatewayLoadBalancerTunnelProtocol;
import com.azure.resourcemanager.network.generated.models.InboundNatPool;
import com.azure.resourcemanager.network.generated.models.IpAllocationMethod;
import com.azure.resourcemanager.network.generated.models.LoadBalancerBackendAddress;
import com.azure.resourcemanager.network.generated.models.LoadBalancerOutboundRuleProtocol;
import com.azure.resourcemanager.network.generated.models.LoadBalancerSku;
import com.azure.resourcemanager.network.generated.models.LoadBalancerSkuName;
import com.azure.resourcemanager.network.generated.models.LoadBalancerSkuTier;
import com.azure.resourcemanager.network.generated.models.LoadDistribution;
import com.azure.resourcemanager.network.generated.models.ProbeProtocol;
import com.azure.resourcemanager.network.generated.models.TransportProtocol;
import java.util.Arrays;

/** Samples for LoadBalancers CreateOrUpdate. */
public final class LoadBalancersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/LoadBalancerCreateGatewayLoadBalancerProviderWithTwoBackendPool.json
     */
    /**
     * Sample code: Create load balancer with Gateway Load Balancer Provider configured with two Backend Pool.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createLoadBalancerWithGatewayLoadBalancerProviderConfiguredWithTwoBackendPool(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .loadBalancers()
            .define("lb")
            .withRegion("eastus")
            .withExistingResourceGroup("rg1")
            .withSku(new LoadBalancerSku().withName(LoadBalancerSkuName.fromString("Premium")))
            .withFrontendIpConfigurations(
                Arrays
                    .asList(
                        new FrontendIpConfigurationInner()
                            .withName("fe-lb")
                            .withSubnet(
                                new SubnetInner()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnetlb/subnets/subnetlb"))))
            .withBackendAddressPools(
                Arrays
                    .asList(
                        new BackendAddressPoolInner().withName("be-lb1"),
                        new BackendAddressPoolInner().withName("be-lb2")))
            .withLoadBalancingRules(
                Arrays
                    .asList(
                        new LoadBalancingRuleInner()
                            .withName("rulelb")
                            .withFrontendIpConfiguration(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb"))
                            .withBackendAddressPool(new SubResource())
                            .withBackendAddressPools(
                                Arrays
                                    .asList(
                                        new SubResource()
                                            .withId(
                                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/be-lb1"),
                                        new SubResource()
                                            .withId(
                                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/be-lb2")))
                            .withProbe(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/probes/probe-lb"))
                            .withProtocol(TransportProtocol.ALL)
                            .withLoadDistribution(LoadDistribution.DEFAULT)
                            .withFrontendPort(0)
                            .withBackendPort(0)
                            .withIdleTimeoutInMinutes(15)
                            .withEnableFloatingIp(true)))
            .withProbes(
                Arrays
                    .asList(
                        new ProbeInner()
                            .withName("probe-lb")
                            .withProtocol(ProbeProtocol.HTTP)
                            .withPort(80)
                            .withIntervalInSeconds(15)
                            .withNumberOfProbes(2)
                            .withProbeThreshold(1)
                            .withRequestPath("healthcheck.aspx")))
            .withInboundNatPools(Arrays.asList())
            .withOutboundRules(Arrays.asList())
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/LoadBalancerCreateWithInboundNatPool.json
     */
    /**
     * Sample code: Create load balancer with inbound nat pool.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createLoadBalancerWithInboundNatPool(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .loadBalancers()
            .define("lb")
            .withRegion("eastus")
            .withExistingResourceGroup("rg1")
            .withSku(new LoadBalancerSku().withName(LoadBalancerSkuName.STANDARD))
            .withFrontendIpConfigurations(
                Arrays
                    .asList(
                        new FrontendIpConfigurationInner()
                            .withId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/test")
                            .withName("test")
                            .withZones(Arrays.asList())
                            .withPrivateIpAllocationMethod(IpAllocationMethod.DYNAMIC)
                            .withSubnet(
                                new SubnetInner()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/lbvnet/subnets/lbsubnet"))))
            .withBackendAddressPools(Arrays.asList())
            .withLoadBalancingRules(Arrays.asList())
            .withProbes(Arrays.asList())
            .withInboundNatRules(Arrays.asList())
            .withInboundNatPools(
                Arrays
                    .asList(
                        new InboundNatPool()
                            .withId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/inboundNatPools/test")
                            .withName("test")
                            .withFrontendIpConfiguration(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/test"))
                            .withProtocol(TransportProtocol.TCP)
                            .withFrontendPortRangeStart(8080)
                            .withFrontendPortRangeEnd(8085)
                            .withBackendPort(8888)
                            .withIdleTimeoutInMinutes(10)
                            .withEnableFloatingIp(true)
                            .withEnableTcpReset(true)))
            .withOutboundRules(Arrays.asList())
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/LoadBalancerCreateWithZones.json
     */
    /**
     * Sample code: Create load balancer with Frontend IP in Zone 1.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createLoadBalancerWithFrontendIPInZone1(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .loadBalancers()
            .define("lb")
            .withRegion("eastus")
            .withExistingResourceGroup("rg1")
            .withSku(new LoadBalancerSku().withName(LoadBalancerSkuName.STANDARD))
            .withFrontendIpConfigurations(
                Arrays
                    .asList(
                        new FrontendIpConfigurationInner()
                            .withName("fe-lb")
                            .withZones(Arrays.asList("1"))
                            .withSubnet(
                                new SubnetInner()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnetlb/subnets/subnetlb"))))
            .withBackendAddressPools(Arrays.asList(new BackendAddressPoolInner().withName("be-lb")))
            .withLoadBalancingRules(
                Arrays
                    .asList(
                        new LoadBalancingRuleInner()
                            .withName("rulelb")
                            .withFrontendIpConfiguration(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb"))
                            .withBackendAddressPool(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/be-lb"))
                            .withProbe(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/probes/probe-lb"))
                            .withProtocol(TransportProtocol.TCP)
                            .withLoadDistribution(LoadDistribution.DEFAULT)
                            .withFrontendPort(80)
                            .withBackendPort(80)
                            .withIdleTimeoutInMinutes(15)
                            .withEnableFloatingIp(true)))
            .withProbes(
                Arrays
                    .asList(
                        new ProbeInner()
                            .withName("probe-lb")
                            .withProtocol(ProbeProtocol.HTTP)
                            .withPort(80)
                            .withIntervalInSeconds(15)
                            .withNumberOfProbes(2)
                            .withProbeThreshold(1)
                            .withRequestPath("healthcheck.aspx")))
            .withInboundNatRules(
                Arrays
                    .asList(
                        new InboundNatRuleInner()
                            .withName("in-nat-rule")
                            .withFrontendIpConfiguration(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb"))
                            .withProtocol(TransportProtocol.TCP)
                            .withFrontendPort(3389)
                            .withBackendPort(3389)
                            .withIdleTimeoutInMinutes(15)
                            .withEnableFloatingIp(true)))
            .withInboundNatPools(Arrays.asList())
            .withOutboundRules(Arrays.asList())
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/LoadBalancerCreateWithOutboundRules.json
     */
    /**
     * Sample code: Create load balancer with outbound rules.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createLoadBalancerWithOutboundRules(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .loadBalancers()
            .define("lb")
            .withRegion("eastus")
            .withExistingResourceGroup("rg1")
            .withSku(new LoadBalancerSku().withName(LoadBalancerSkuName.STANDARD))
            .withFrontendIpConfigurations(
                Arrays
                    .asList(
                        new FrontendIpConfigurationInner()
                            .withName("fe-lb")
                            .withPublicIpAddress(
                                new PublicIpAddressInner()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPAddresses/pip"))))
            .withBackendAddressPools(Arrays.asList(new BackendAddressPoolInner().withName("be-lb")))
            .withLoadBalancingRules(
                Arrays
                    .asList(
                        new LoadBalancingRuleInner()
                            .withName("rulelb")
                            .withFrontendIpConfiguration(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb"))
                            .withBackendAddressPool(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/be-lb"))
                            .withProbe(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/probes/probe-lb"))
                            .withProtocol(TransportProtocol.TCP)
                            .withLoadDistribution(LoadDistribution.DEFAULT)
                            .withFrontendPort(80)
                            .withBackendPort(80)
                            .withIdleTimeoutInMinutes(15)
                            .withEnableFloatingIp(true)
                            .withDisableOutboundSnat(true)))
            .withProbes(
                Arrays
                    .asList(
                        new ProbeInner()
                            .withName("probe-lb")
                            .withProtocol(ProbeProtocol.HTTP)
                            .withPort(80)
                            .withIntervalInSeconds(15)
                            .withNumberOfProbes(2)
                            .withProbeThreshold(1)
                            .withRequestPath("healthcheck.aspx")))
            .withInboundNatRules(
                Arrays
                    .asList(
                        new InboundNatRuleInner()
                            .withName("in-nat-rule")
                            .withFrontendIpConfiguration(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb"))
                            .withProtocol(TransportProtocol.TCP)
                            .withFrontendPort(3389)
                            .withBackendPort(3389)
                            .withIdleTimeoutInMinutes(15)
                            .withEnableFloatingIp(true)))
            .withInboundNatPools(Arrays.asList())
            .withOutboundRules(
                Arrays
                    .asList(
                        new OutboundRuleInner()
                            .withName("rule1")
                            .withFrontendIpConfigurations(
                                Arrays
                                    .asList(
                                        new SubResource()
                                            .withId(
                                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb")))
                            .withBackendAddressPool(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/be-lb"))
                            .withProtocol(LoadBalancerOutboundRuleProtocol.ALL)))
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/LoadBalancerCreateGatewayLoadBalancerProviderWithOneBackendPool.json
     */
    /**
     * Sample code: Create load balancer with Gateway Load Balancer Provider configured with one Backend Pool.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createLoadBalancerWithGatewayLoadBalancerProviderConfiguredWithOneBackendPool(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .loadBalancers()
            .define("lb")
            .withRegion("eastus")
            .withExistingResourceGroup("rg1")
            .withSku(new LoadBalancerSku().withName(LoadBalancerSkuName.fromString("Premium")))
            .withFrontendIpConfigurations(
                Arrays
                    .asList(
                        new FrontendIpConfigurationInner()
                            .withName("fe-lb")
                            .withSubnet(
                                new SubnetInner()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnetlb/subnets/subnetlb"))))
            .withBackendAddressPools(
                Arrays
                    .asList(
                        new BackendAddressPoolInner()
                            .withName("be-lb")
                            .withTunnelInterfaces(
                                Arrays
                                    .asList(
                                        new GatewayLoadBalancerTunnelInterface()
                                            .withPort(15000)
                                            .withIdentifier(900)
                                            .withProtocol(GatewayLoadBalancerTunnelProtocol.VXLAN)
                                            .withType(GatewayLoadBalancerTunnelInterfaceType.INTERNAL),
                                        new GatewayLoadBalancerTunnelInterface()
                                            .withPort(15001)
                                            .withIdentifier(901)
                                            .withProtocol(GatewayLoadBalancerTunnelProtocol.VXLAN)
                                            .withType(GatewayLoadBalancerTunnelInterfaceType.INTERNAL)))))
            .withLoadBalancingRules(
                Arrays
                    .asList(
                        new LoadBalancingRuleInner()
                            .withName("rulelb")
                            .withFrontendIpConfiguration(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb"))
                            .withBackendAddressPools(
                                Arrays
                                    .asList(
                                        new SubResource()
                                            .withId(
                                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/be-lb")))
                            .withProbe(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/probes/probe-lb"))
                            .withProtocol(TransportProtocol.ALL)
                            .withLoadDistribution(LoadDistribution.DEFAULT)
                            .withFrontendPort(0)
                            .withBackendPort(0)
                            .withIdleTimeoutInMinutes(15)
                            .withEnableFloatingIp(true)))
            .withProbes(
                Arrays
                    .asList(
                        new ProbeInner()
                            .withName("probe-lb")
                            .withProtocol(ProbeProtocol.HTTP)
                            .withPort(80)
                            .withIntervalInSeconds(15)
                            .withNumberOfProbes(2)
                            .withProbeThreshold(1)
                            .withRequestPath("healthcheck.aspx")))
            .withInboundNatPools(Arrays.asList())
            .withOutboundRules(Arrays.asList())
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/LoadBalancerCreate.json
     */
    /**
     * Sample code: Create load balancer.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createLoadBalancer(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .loadBalancers()
            .define("lb")
            .withRegion("eastus")
            .withExistingResourceGroup("rg1")
            .withFrontendIpConfigurations(
                Arrays
                    .asList(
                        new FrontendIpConfigurationInner()
                            .withName("fe-lb")
                            .withSubnet(
                                new SubnetInner()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnetlb/subnets/subnetlb"))))
            .withBackendAddressPools(Arrays.asList(new BackendAddressPoolInner().withName("be-lb")))
            .withLoadBalancingRules(
                Arrays
                    .asList(
                        new LoadBalancingRuleInner()
                            .withName("rulelb")
                            .withFrontendIpConfiguration(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb"))
                            .withBackendAddressPool(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/be-lb"))
                            .withProbe(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/probes/probe-lb"))
                            .withProtocol(TransportProtocol.TCP)
                            .withLoadDistribution(LoadDistribution.DEFAULT)
                            .withFrontendPort(80)
                            .withBackendPort(80)
                            .withIdleTimeoutInMinutes(15)
                            .withEnableFloatingIp(true)
                            .withEnableTcpReset(false)))
            .withProbes(
                Arrays
                    .asList(
                        new ProbeInner()
                            .withName("probe-lb")
                            .withProtocol(ProbeProtocol.HTTP)
                            .withPort(80)
                            .withIntervalInSeconds(15)
                            .withNumberOfProbes(2)
                            .withProbeThreshold(1)
                            .withRequestPath("healthcheck.aspx")))
            .withInboundNatRules(
                Arrays
                    .asList(
                        new InboundNatRuleInner()
                            .withName("in-nat-rule")
                            .withFrontendIpConfiguration(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb"))
                            .withProtocol(TransportProtocol.TCP)
                            .withFrontendPort(3389)
                            .withBackendPort(3389)
                            .withIdleTimeoutInMinutes(15)
                            .withEnableFloatingIp(true)
                            .withEnableTcpReset(false)))
            .withInboundNatPools(Arrays.asList())
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/LoadBalancerCreateGlobalTier.json
     */
    /**
     * Sample code: Create load balancer with Global Tier and one regional load balancer in its backend pool.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createLoadBalancerWithGlobalTierAndOneRegionalLoadBalancerInItsBackendPool(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .loadBalancers()
            .define("lb")
            .withRegion("eastus")
            .withExistingResourceGroup("rg1")
            .withSku(new LoadBalancerSku().withName(LoadBalancerSkuName.STANDARD).withTier(LoadBalancerSkuTier.GLOBAL))
            .withFrontendIpConfigurations(
                Arrays
                    .asList(
                        new FrontendIpConfigurationInner()
                            .withName("fe-lb")
                            .withSubnet(
                                new SubnetInner()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnetlb/subnets/subnetlb"))))
            .withBackendAddressPools(
                Arrays
                    .asList(
                        new BackendAddressPoolInner()
                            .withName("be-lb")
                            .withLoadBalancerBackendAddresses(
                                Arrays
                                    .asList(
                                        new LoadBalancerBackendAddress()
                                            .withName("regional-lb1-address")
                                            .withLoadBalancerFrontendIpConfiguration(
                                                new SubResource()
                                                    .withId(
                                                        "/subscriptions/subid/resourceGroups/regional-lb-rg1/providers/Microsoft.Network/loadBalancers/regional-lb/frontendIPConfigurations/fe-rlb"))))))
            .withLoadBalancingRules(
                Arrays
                    .asList(
                        new LoadBalancingRuleInner()
                            .withName("rulelb")
                            .withFrontendIpConfiguration(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb"))
                            .withBackendAddressPool(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/be-lb"))
                            .withProbe(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/probes/probe-lb"))
                            .withProtocol(TransportProtocol.TCP)
                            .withLoadDistribution(LoadDistribution.DEFAULT)
                            .withFrontendPort(80)
                            .withBackendPort(80)
                            .withIdleTimeoutInMinutes(15)
                            .withEnableFloatingIp(false)))
            .withProbes(
                Arrays
                    .asList(
                        new ProbeInner()
                            .withName("probe-lb")
                            .withProtocol(ProbeProtocol.HTTP)
                            .withPort(80)
                            .withIntervalInSeconds(15)
                            .withNumberOfProbes(2)
                            .withProbeThreshold(1)
                            .withRequestPath("healthcheck.aspx")))
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/LoadBalancerCreateGatewayLoadBalancerConsumer.json
     */
    /**
     * Sample code: Create load balancer with Gateway Load Balancer Consumer configured.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createLoadBalancerWithGatewayLoadBalancerConsumerConfigured(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .loadBalancers()
            .define("lb")
            .withRegion("eastus")
            .withExistingResourceGroup("rg1")
            .withSku(new LoadBalancerSku().withName(LoadBalancerSkuName.STANDARD))
            .withFrontendIpConfigurations(
                Arrays
                    .asList(
                        new FrontendIpConfigurationInner()
                            .withName("fe-lb")
                            .withSubnet(
                                new SubnetInner()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnetlb/subnets/subnetlb"))
                            .withGatewayLoadBalancer(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb-provider"))))
            .withBackendAddressPools(Arrays.asList(new BackendAddressPoolInner().withName("be-lb")))
            .withLoadBalancingRules(
                Arrays
                    .asList(
                        new LoadBalancingRuleInner()
                            .withName("rulelb")
                            .withFrontendIpConfiguration(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb"))
                            .withBackendAddressPool(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/be-lb"))
                            .withProbe(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/probes/probe-lb"))
                            .withProtocol(TransportProtocol.TCP)
                            .withLoadDistribution(LoadDistribution.DEFAULT)
                            .withFrontendPort(80)
                            .withBackendPort(80)
                            .withIdleTimeoutInMinutes(15)
                            .withEnableFloatingIp(true)))
            .withProbes(
                Arrays
                    .asList(
                        new ProbeInner()
                            .withName("probe-lb")
                            .withProtocol(ProbeProtocol.HTTP)
                            .withPort(80)
                            .withIntervalInSeconds(15)
                            .withNumberOfProbes(2)
                            .withProbeThreshold(1)
                            .withRequestPath("healthcheck.aspx")))
            .withInboundNatRules(
                Arrays
                    .asList(
                        new InboundNatRuleInner()
                            .withName("in-nat-rule")
                            .withFrontendIpConfiguration(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb"))
                            .withProtocol(TransportProtocol.TCP)
                            .withFrontendPort(3389)
                            .withBackendPort(3389)
                            .withIdleTimeoutInMinutes(15)
                            .withEnableFloatingIp(true)))
            .withInboundNatPools(Arrays.asList())
            .withOutboundRules(Arrays.asList())
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/LoadBalancerCreateStandardSku.json
     */
    /**
     * Sample code: Create load balancer with Standard SKU.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createLoadBalancerWithStandardSKU(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .loadBalancers()
            .define("lb")
            .withRegion("eastus")
            .withExistingResourceGroup("rg1")
            .withSku(new LoadBalancerSku().withName(LoadBalancerSkuName.STANDARD))
            .withFrontendIpConfigurations(
                Arrays
                    .asList(
                        new FrontendIpConfigurationInner()
                            .withName("fe-lb")
                            .withSubnet(
                                new SubnetInner()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnetlb/subnets/subnetlb"))))
            .withBackendAddressPools(Arrays.asList(new BackendAddressPoolInner().withName("be-lb")))
            .withLoadBalancingRules(
                Arrays
                    .asList(
                        new LoadBalancingRuleInner()
                            .withName("rulelb")
                            .withFrontendIpConfiguration(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb"))
                            .withBackendAddressPool(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/backendAddressPools/be-lb"))
                            .withProbe(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/probes/probe-lb"))
                            .withProtocol(TransportProtocol.TCP)
                            .withLoadDistribution(LoadDistribution.DEFAULT)
                            .withFrontendPort(80)
                            .withBackendPort(80)
                            .withIdleTimeoutInMinutes(15)
                            .withEnableFloatingIp(true)))
            .withProbes(
                Arrays
                    .asList(
                        new ProbeInner()
                            .withName("probe-lb")
                            .withProtocol(ProbeProtocol.HTTP)
                            .withPort(80)
                            .withIntervalInSeconds(15)
                            .withNumberOfProbes(2)
                            .withProbeThreshold(1)
                            .withRequestPath("healthcheck.aspx")))
            .withInboundNatRules(
                Arrays
                    .asList(
                        new InboundNatRuleInner()
                            .withName("in-nat-rule")
                            .withFrontendIpConfiguration(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb"))
                            .withProtocol(TransportProtocol.TCP)
                            .withFrontendPort(3389)
                            .withBackendPort(3389)
                            .withIdleTimeoutInMinutes(15)
                            .withEnableFloatingIp(true)))
            .withInboundNatPools(Arrays.asList())
            .withOutboundRules(Arrays.asList())
            .create();
    }
}
