// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.resourcemanager.eventhubs.generated.fluent.models.NetworkSecurityPerimeterConfigurationListInner;
import com.azure.resourcemanager.eventhubs.generated.models.NetworkSecurityPerimeterConfiguration;
import com.azure.resourcemanager.eventhubs.generated.models.NetworkSecurityPerimeterConfigurationList;
import java.util.Collections;
import java.util.List;

public final class NetworkSecurityPerimeterConfigurationListImpl implements NetworkSecurityPerimeterConfigurationList {
    private NetworkSecurityPerimeterConfigurationListInner innerObject;

    private final com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager;

    NetworkSecurityPerimeterConfigurationListImpl(
        NetworkSecurityPerimeterConfigurationListInner innerObject,
        com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<NetworkSecurityPerimeterConfiguration> value() {
        List<NetworkSecurityPerimeterConfiguration> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public NetworkSecurityPerimeterConfigurationListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager() {
        return this.serviceManager;
    }
}
