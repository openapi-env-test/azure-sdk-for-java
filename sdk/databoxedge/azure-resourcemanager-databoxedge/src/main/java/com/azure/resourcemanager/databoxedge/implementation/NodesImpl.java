// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.fluent.NodesClient;
import com.azure.resourcemanager.databoxedge.fluent.models.NodeInner;
import com.azure.resourcemanager.databoxedge.models.Node;
import com.azure.resourcemanager.databoxedge.models.Nodes;

public final class NodesImpl implements Nodes {
    private static final ClientLogger LOGGER = new ClientLogger(NodesImpl.class);

    private final NodesClient innerClient;

    private final com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager;

    public NodesImpl(NodesClient innerClient, com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Node> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        PagedIterable<NodeInner> inner = this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new NodeImpl(inner1, this.manager()));
    }

    public PagedIterable<Node> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName, Context context) {
        PagedIterable<NodeInner> inner =
            this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new NodeImpl(inner1, this.manager()));
    }

    private NodesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
