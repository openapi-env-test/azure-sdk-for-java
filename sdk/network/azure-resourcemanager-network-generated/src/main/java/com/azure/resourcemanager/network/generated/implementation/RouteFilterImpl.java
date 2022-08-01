// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitPeeringInner;
import com.azure.resourcemanager.network.generated.fluent.models.RouteFilterInner;
import com.azure.resourcemanager.network.generated.fluent.models.RouteFilterRuleInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitPeering;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.RouteFilter;
import com.azure.resourcemanager.network.generated.models.RouteFilterRule;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class RouteFilterImpl implements RouteFilter, RouteFilter.Definition, RouteFilter.Update {
    private RouteFilterInner innerObject;

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

    public List<RouteFilterRule> rules() {
        List<RouteFilterRuleInner> inner = this.innerModel().rules();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new RouteFilterRuleImpl(inner1, this.manager()))
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

    public List<ExpressRouteCircuitPeering> ipv6Peerings() {
        List<ExpressRouteCircuitPeeringInner> inner = this.innerModel().ipv6Peerings();
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

    public ProvisioningState provisioningState() {
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

    public RouteFilterInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String routeFilterName;

    private TagsObject updateParameters;

    public RouteFilterImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public RouteFilter create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRouteFilters()
                .createOrUpdate(resourceGroupName, routeFilterName, this.innerModel(), Context.NONE);
        return this;
    }

    public RouteFilter create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRouteFilters()
                .createOrUpdate(resourceGroupName, routeFilterName, this.innerModel(), context);
        return this;
    }

    RouteFilterImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new RouteFilterInner();
        this.serviceManager = serviceManager;
        this.routeFilterName = name;
    }

    public RouteFilterImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public RouteFilter apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRouteFilters()
                .updateTagsWithResponse(resourceGroupName, routeFilterName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public RouteFilter apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRouteFilters()
                .updateTagsWithResponse(resourceGroupName, routeFilterName, updateParameters, context)
                .getValue();
        return this;
    }

    RouteFilterImpl(
        RouteFilterInner innerObject, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.routeFilterName = Utils.getValueFromIdByName(innerObject.id(), "routeFilters");
    }

    public RouteFilter refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRouteFilters()
                .getByResourceGroupWithResponse(resourceGroupName, routeFilterName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public RouteFilter refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRouteFilters()
                .getByResourceGroupWithResponse(resourceGroupName, routeFilterName, localExpand, context)
                .getValue();
        return this;
    }

    public RouteFilterImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public RouteFilterImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public RouteFilterImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public RouteFilterImpl withRules(List<RouteFilterRuleInner> rules) {
        this.innerModel().withRules(rules);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
