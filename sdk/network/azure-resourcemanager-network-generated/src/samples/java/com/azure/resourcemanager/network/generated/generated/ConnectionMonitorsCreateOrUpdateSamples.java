// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.ConnectionMonitorEndpoint;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorEndpointFilter;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorEndpointFilterItem;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorEndpointFilterItemType;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorEndpointFilterType;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorTcpConfiguration;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorTestConfiguration;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorTestConfigurationProtocol;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorTestGroup;
import java.util.Arrays;

/** Samples for ConnectionMonitors CreateOrUpdate. */
public final class ConnectionMonitorsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NetworkWatcherConnectionMonitorCreate.json
     */
    /**
     * Sample code: Create connection monitor V1.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createConnectionMonitorV1(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .connectionMonitors()
            .define("cm1")
            .withExistingNetworkWatcher("rg1", "nw1")
            .withRegion("eastus")
            .withEndpoints(
                Arrays
                    .asList(
                        new ConnectionMonitorEndpoint()
                            .withName("source")
                            .withResourceId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Compute/virtualMachines/ct1"),
                        new ConnectionMonitorEndpoint().withName("destination").withAddress("bing.com")))
            .withTestConfigurations(
                Arrays
                    .asList(
                        new ConnectionMonitorTestConfiguration()
                            .withName("tcp")
                            .withTestFrequencySec(60)
                            .withProtocol(ConnectionMonitorTestConfigurationProtocol.TCP)
                            .withTcpConfiguration(new ConnectionMonitorTcpConfiguration().withPort(80))))
            .withTestGroups(
                Arrays
                    .asList(
                        new ConnectionMonitorTestGroup()
                            .withName("tg")
                            .withTestConfigurations(Arrays.asList("tcp"))
                            .withSources(Arrays.asList("source"))
                            .withDestinations(Arrays.asList("destination"))))
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NetworkWatcherConnectionMonitorV2Create.json
     */
    /**
     * Sample code: Create connection monitor V2.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createConnectionMonitorV2(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .connectionMonitors()
            .define("cm1")
            .withExistingNetworkWatcher("rg1", "nw1")
            .withEndpoints(
                Arrays
                    .asList(
                        new ConnectionMonitorEndpoint()
                            .withName("vm1")
                            .withResourceId(
                                "/subscriptions/96e68903-0a56-4819-9987-8d08ad6a1f99/resourceGroups/NwRgIrinaCentralUSEUAP/providers/Microsoft.Compute/virtualMachines/vm1"),
                        new ConnectionMonitorEndpoint()
                            .withName("CanaryWorkspaceVamshi")
                            .withResourceId(
                                "/subscriptions/96e68903-0a56-4819-9987-8d08ad6a1f99/resourceGroups/vasamudrRG/providers/Microsoft.OperationalInsights/workspaces/vasamudrWorkspace")
                            .withFilter(
                                new ConnectionMonitorEndpointFilter()
                                    .withType(ConnectionMonitorEndpointFilterType.INCLUDE)
                                    .withItems(
                                        Arrays
                                            .asList(
                                                new ConnectionMonitorEndpointFilterItem()
                                                    .withType(ConnectionMonitorEndpointFilterItemType.AGENT_ADDRESS)
                                                    .withAddress("npmuser")))),
                        new ConnectionMonitorEndpoint().withName("bing").withAddress("bing.com"),
                        new ConnectionMonitorEndpoint().withName("google").withAddress("google.com")))
            .withTestConfigurations(
                Arrays
                    .asList(
                        new ConnectionMonitorTestConfiguration()
                            .withName("testConfig1")
                            .withTestFrequencySec(60)
                            .withProtocol(ConnectionMonitorTestConfigurationProtocol.TCP)
                            .withTcpConfiguration(
                                new ConnectionMonitorTcpConfiguration().withPort(80).withDisableTraceRoute(false))))
            .withTestGroups(
                Arrays
                    .asList(
                        new ConnectionMonitorTestGroup()
                            .withName("test1")
                            .withDisable(false)
                            .withTestConfigurations(Arrays.asList("testConfig1"))
                            .withSources(Arrays.asList("vm1", "CanaryWorkspaceVamshi"))
                            .withDestinations(Arrays.asList("bing", "google"))))
            .withOutputs(Arrays.asList())
            .create();
    }
}
