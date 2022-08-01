// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.relay.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.relay.models.ConnectionState;
import com.azure.resourcemanager.relay.models.EndPointProvisioningState;
import com.azure.resourcemanager.relay.models.PrivateEndpoint;
import com.azure.resourcemanager.relay.models.PrivateEndpointConnection;

public final class PrivateEndpointConnectionImpl
    implements PrivateEndpointConnection, PrivateEndpointConnection.Definition, PrivateEndpointConnection.Update {
    private PrivateEndpointConnectionInner innerObject;

    private final com.azure.resourcemanager.relay.RelayManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String location() {
        return this.innerModel().location();
    }

    public PrivateEndpoint privateEndpoint() {
        return this.innerModel().privateEndpoint();
    }

    public ConnectionState privateLinkServiceConnectionState() {
        return this.innerModel().privateLinkServiceConnectionState();
    }

    public EndPointProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public PrivateEndpointConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.relay.RelayManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String privateEndpointConnectionName;

    public PrivateEndpointConnectionImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public PrivateEndpointConnection create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, privateEndpointConnectionName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpointConnection create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, privateEndpointConnectionName, this.innerModel(), context)
                .getValue();
        return this;
    }

    PrivateEndpointConnectionImpl(String name, com.azure.resourcemanager.relay.RelayManager serviceManager) {
        this.innerObject = new PrivateEndpointConnectionInner();
        this.serviceManager = serviceManager;
        this.privateEndpointConnectionName = name;
    }

    public PrivateEndpointConnectionImpl update() {
        return this;
    }

    public PrivateEndpointConnection apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, privateEndpointConnectionName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpointConnection apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, privateEndpointConnectionName, this.innerModel(), context)
                .getValue();
        return this;
    }

    PrivateEndpointConnectionImpl(
        PrivateEndpointConnectionInner innerObject, com.azure.resourcemanager.relay.RelayManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.privateEndpointConnectionName = Utils.getValueFromIdByName(innerObject.id(), "privateEndpointConnections");
    }

    public PrivateEndpointConnection refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .getWithResponse(resourceGroupName, namespaceName, privateEndpointConnectionName, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpointConnection refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .getWithResponse(resourceGroupName, namespaceName, privateEndpointConnectionName, context)
                .getValue();
        return this;
    }

    public PrivateEndpointConnectionImpl withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.innerModel().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    public PrivateEndpointConnectionImpl withPrivateLinkServiceConnectionState(
        ConnectionState privateLinkServiceConnectionState) {
        this.innerModel().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    public PrivateEndpointConnectionImpl withProvisioningState(EndPointProvisioningState provisioningState) {
        this.innerModel().withProvisioningState(provisioningState);
        return this;
    }
}
