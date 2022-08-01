// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionPeeringInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitReference;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCrossConnection;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCrossConnectionPeering;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.ServiceProviderProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class ExpressRouteCrossConnectionImpl
    implements ExpressRouteCrossConnection, ExpressRouteCrossConnection.Definition, ExpressRouteCrossConnection.Update {
    private ExpressRouteCrossConnectionInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String primaryAzurePort() {
        return this.innerModel().primaryAzurePort();
    }

    public String secondaryAzurePort() {
        return this.innerModel().secondaryAzurePort();
    }

    public Integer stag() {
        return this.innerModel().stag();
    }

    public String peeringLocation() {
        return this.innerModel().peeringLocation();
    }

    public Integer bandwidthInMbps() {
        return this.innerModel().bandwidthInMbps();
    }

    public ExpressRouteCircuitReference expressRouteCircuit() {
        return this.innerModel().expressRouteCircuit();
    }

    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return this.innerModel().serviceProviderProvisioningState();
    }

    public String serviceProviderNotes() {
        return this.innerModel().serviceProviderNotes();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<ExpressRouteCrossConnectionPeering> peerings() {
        List<ExpressRouteCrossConnectionPeeringInner> inner = this.innerModel().peerings();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ExpressRouteCrossConnectionPeeringImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
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

    public ExpressRouteCrossConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String crossConnectionName;

    private TagsObject updateCrossConnectionParameters;

    public ExpressRouteCrossConnectionImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ExpressRouteCrossConnection create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCrossConnections()
                .createOrUpdate(resourceGroupName, crossConnectionName, this.innerModel(), Context.NONE);
        return this;
    }

    public ExpressRouteCrossConnection create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCrossConnections()
                .createOrUpdate(resourceGroupName, crossConnectionName, this.innerModel(), context);
        return this;
    }

    ExpressRouteCrossConnectionImpl(
        String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new ExpressRouteCrossConnectionInner();
        this.serviceManager = serviceManager;
        this.crossConnectionName = name;
    }

    public ExpressRouteCrossConnectionImpl update() {
        this.updateCrossConnectionParameters = new TagsObject();
        return this;
    }

    public ExpressRouteCrossConnection apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCrossConnections()
                .updateTagsWithResponse(
                    resourceGroupName, crossConnectionName, updateCrossConnectionParameters, Context.NONE)
                .getValue();
        return this;
    }

    public ExpressRouteCrossConnection apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCrossConnections()
                .updateTagsWithResponse(
                    resourceGroupName, crossConnectionName, updateCrossConnectionParameters, context)
                .getValue();
        return this;
    }

    ExpressRouteCrossConnectionImpl(
        ExpressRouteCrossConnectionInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.crossConnectionName = Utils.getValueFromIdByName(innerObject.id(), "expressRouteCrossConnections");
    }

    public ExpressRouteCrossConnection refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCrossConnections()
                .getByResourceGroupWithResponse(resourceGroupName, crossConnectionName, Context.NONE)
                .getValue();
        return this;
    }

    public ExpressRouteCrossConnection refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCrossConnections()
                .getByResourceGroupWithResponse(resourceGroupName, crossConnectionName, context)
                .getValue();
        return this;
    }

    public ExpressRouteCrossConnectionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ExpressRouteCrossConnectionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ExpressRouteCrossConnectionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateCrossConnectionParameters.withTags(tags);
            return this;
        }
    }

    public ExpressRouteCrossConnectionImpl withExpressRouteCircuit(ExpressRouteCircuitReference expressRouteCircuit) {
        this.innerModel().withExpressRouteCircuit(expressRouteCircuit);
        return this;
    }

    public ExpressRouteCrossConnectionImpl withServiceProviderProvisioningState(
        ServiceProviderProvisioningState serviceProviderProvisioningState) {
        this.innerModel().withServiceProviderProvisioningState(serviceProviderProvisioningState);
        return this;
    }

    public ExpressRouteCrossConnectionImpl withServiceProviderNotes(String serviceProviderNotes) {
        this.innerModel().withServiceProviderNotes(serviceProviderNotes);
        return this;
    }

    public ExpressRouteCrossConnectionImpl withPeerings(List<ExpressRouteCrossConnectionPeeringInner> peerings) {
        this.innerModel().withPeerings(peerings);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
