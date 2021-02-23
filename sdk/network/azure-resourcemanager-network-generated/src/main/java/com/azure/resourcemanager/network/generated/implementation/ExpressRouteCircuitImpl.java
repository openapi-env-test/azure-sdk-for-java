// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitAuthorizationInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitPeeringInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuit;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitAuthorization;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitPeering;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitServiceProviderProperties;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitSku;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.ServiceProviderProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class ExpressRouteCircuitImpl
    implements ExpressRouteCircuit, ExpressRouteCircuit.Definition, ExpressRouteCircuit.Update {
    private ExpressRouteCircuitInner innerObject;

    private final NetworkManager serviceManager;

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

    public ExpressRouteCircuitSku sku() {
        return this.innerModel().sku();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Boolean allowClassicOperations() {
        return this.innerModel().allowClassicOperations();
    }

    public String circuitProvisioningState() {
        return this.innerModel().circuitProvisioningState();
    }

    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return this.innerModel().serviceProviderProvisioningState();
    }

    public List<ExpressRouteCircuitAuthorization> authorizations() {
        List<ExpressRouteCircuitAuthorizationInner> inner = this.innerModel().authorizations();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ExpressRouteCircuitAuthorizationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<ExpressRouteCircuitPeering> peerings() {
        List<ExpressRouteCircuitPeeringInner> inner = this.innerModel().peerings();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ExpressRouteCircuitPeeringImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String serviceKey() {
        return this.innerModel().serviceKey();
    }

    public String serviceProviderNotes() {
        return this.innerModel().serviceProviderNotes();
    }

    public ExpressRouteCircuitServiceProviderProperties serviceProviderProperties() {
        return this.innerModel().serviceProviderProperties();
    }

    public SubResource expressRoutePort() {
        return this.innerModel().expressRoutePort();
    }

    public Float bandwidthInGbps() {
        return this.innerModel().bandwidthInGbps();
    }

    public Integer stag() {
        return this.innerModel().stag();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String gatewayManagerEtag() {
        return this.innerModel().gatewayManagerEtag();
    }

    public Boolean globalReachEnabled() {
        return this.innerModel().globalReachEnabled();
    }

    public String id() {
        return this.innerModel().id();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ExpressRouteCircuitInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String circuitName;

    private TagsObject updateParameters;

    public ExpressRouteCircuitImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ExpressRouteCircuit create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCircuits()
                .createOrUpdate(resourceGroupName, circuitName, this.innerModel(), Context.NONE);
        return this;
    }

    public ExpressRouteCircuit create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCircuits()
                .createOrUpdate(resourceGroupName, circuitName, this.innerModel(), context);
        return this;
    }

    ExpressRouteCircuitImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new ExpressRouteCircuitInner();
        this.serviceManager = serviceManager;
        this.circuitName = name;
    }

    public ExpressRouteCircuitImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public ExpressRouteCircuit apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCircuits()
                .updateTagsWithResponse(resourceGroupName, circuitName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public ExpressRouteCircuit apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCircuits()
                .updateTagsWithResponse(resourceGroupName, circuitName, updateParameters, context)
                .getValue();
        return this;
    }

    ExpressRouteCircuitImpl(ExpressRouteCircuitInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.circuitName = Utils.getValueFromIdByName(innerObject.id(), "expressRouteCircuits");
    }

    public ExpressRouteCircuit refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCircuits()
                .getByResourceGroupWithResponse(resourceGroupName, circuitName, Context.NONE)
                .getValue();
        return this;
    }

    public ExpressRouteCircuit refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCircuits()
                .getByResourceGroupWithResponse(resourceGroupName, circuitName, context)
                .getValue();
        return this;
    }

    public ExpressRouteCircuitImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ExpressRouteCircuitImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ExpressRouteCircuitImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ExpressRouteCircuitImpl withSku(ExpressRouteCircuitSku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public ExpressRouteCircuitImpl withAllowClassicOperations(Boolean allowClassicOperations) {
        this.innerModel().withAllowClassicOperations(allowClassicOperations);
        return this;
    }

    public ExpressRouteCircuitImpl withCircuitProvisioningState(String circuitProvisioningState) {
        this.innerModel().withCircuitProvisioningState(circuitProvisioningState);
        return this;
    }

    public ExpressRouteCircuitImpl withServiceProviderProvisioningState(
        ServiceProviderProvisioningState serviceProviderProvisioningState) {
        this.innerModel().withServiceProviderProvisioningState(serviceProviderProvisioningState);
        return this;
    }

    public ExpressRouteCircuitImpl withAuthorizations(List<ExpressRouteCircuitAuthorizationInner> authorizations) {
        this.innerModel().withAuthorizations(authorizations);
        return this;
    }

    public ExpressRouteCircuitImpl withPeerings(List<ExpressRouteCircuitPeeringInner> peerings) {
        this.innerModel().withPeerings(peerings);
        return this;
    }

    public ExpressRouteCircuitImpl withServiceKey(String serviceKey) {
        this.innerModel().withServiceKey(serviceKey);
        return this;
    }

    public ExpressRouteCircuitImpl withServiceProviderNotes(String serviceProviderNotes) {
        this.innerModel().withServiceProviderNotes(serviceProviderNotes);
        return this;
    }

    public ExpressRouteCircuitImpl withServiceProviderProperties(
        ExpressRouteCircuitServiceProviderProperties serviceProviderProperties) {
        this.innerModel().withServiceProviderProperties(serviceProviderProperties);
        return this;
    }

    public ExpressRouteCircuitImpl withExpressRoutePort(SubResource expressRoutePort) {
        this.innerModel().withExpressRoutePort(expressRoutePort);
        return this;
    }

    public ExpressRouteCircuitImpl withBandwidthInGbps(Float bandwidthInGbps) {
        this.innerModel().withBandwidthInGbps(bandwidthInGbps);
        return this;
    }

    public ExpressRouteCircuitImpl withGatewayManagerEtag(String gatewayManagerEtag) {
        this.innerModel().withGatewayManagerEtag(gatewayManagerEtag);
        return this;
    }

    public ExpressRouteCircuitImpl withGlobalReachEnabled(Boolean globalReachEnabled) {
        this.innerModel().withGlobalReachEnabled(globalReachEnabled);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
