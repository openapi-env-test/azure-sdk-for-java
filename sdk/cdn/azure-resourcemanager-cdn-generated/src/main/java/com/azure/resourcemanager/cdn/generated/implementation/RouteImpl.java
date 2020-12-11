// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.generated.CdnManager;
import com.azure.resourcemanager.cdn.generated.fluent.models.RouteInner;
import com.azure.resourcemanager.cdn.generated.models.AfdEndpointProtocols;
import com.azure.resourcemanager.cdn.generated.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.generated.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.generated.models.EnabledState;
import com.azure.resourcemanager.cdn.generated.models.ForwardingProtocol;
import com.azure.resourcemanager.cdn.generated.models.HttpsRedirect;
import com.azure.resourcemanager.cdn.generated.models.LinkToDefaultDomain;
import com.azure.resourcemanager.cdn.generated.models.OptimizationType;
import com.azure.resourcemanager.cdn.generated.models.QueryStringCachingBehavior;
import com.azure.resourcemanager.cdn.generated.models.ResourceReference;
import com.azure.resourcemanager.cdn.generated.models.Route;
import com.azure.resourcemanager.cdn.generated.models.RouteUpdateParameters;
import com.azure.resourcemanager.cdn.generated.models.SystemData;
import java.util.Collections;
import java.util.List;

public final class RouteImpl implements Route, Route.Definition, Route.Update {
    private RouteInner innerObject;

    private final CdnManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public List<ResourceReference> customDomains() {
        List<ResourceReference> inner = this.innerModel().customDomains();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ResourceReference originGroup() {
        return this.innerModel().originGroup();
    }

    public String originPath() {
        return this.innerModel().originPath();
    }

    public List<ResourceReference> ruleSets() {
        List<ResourceReference> inner = this.innerModel().ruleSets();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<AfdEndpointProtocols> supportedProtocols() {
        List<AfdEndpointProtocols> inner = this.innerModel().supportedProtocols();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> patternsToMatch() {
        List<String> inner = this.innerModel().patternsToMatch();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Object compressionSettings() {
        return this.innerModel().compressionSettings();
    }

    public QueryStringCachingBehavior queryStringCachingBehavior() {
        return this.innerModel().queryStringCachingBehavior();
    }

    public OptimizationType optimizationType() {
        return this.innerModel().optimizationType();
    }

    public ForwardingProtocol forwardingProtocol() {
        return this.innerModel().forwardingProtocol();
    }

    public LinkToDefaultDomain linkToDefaultDomain() {
        return this.innerModel().linkToDefaultDomain();
    }

    public HttpsRedirect httpsRedirect() {
        return this.innerModel().httpsRedirect();
    }

    public EnabledState enabledState() {
        return this.innerModel().enabledState();
    }

    public AfdProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public DeploymentStatus deploymentStatus() {
        return this.innerModel().deploymentStatus();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public RouteInner innerModel() {
        return this.innerObject;
    }

    private CdnManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String profileName;

    private String endpointName;

    private String routeName;

    private RouteUpdateParameters updateRouteUpdateProperties;

    public RouteImpl withExistingAfdEndpoint(String resourceGroupName, String profileName, String endpointName) {
        this.resourceGroupName = resourceGroupName;
        this.profileName = profileName;
        this.endpointName = endpointName;
        return this;
    }

    public Route create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoutes()
                .create(resourceGroupName, profileName, endpointName, routeName, this.innerModel(), Context.NONE);
        return this;
    }

    public Route create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoutes()
                .create(resourceGroupName, profileName, endpointName, routeName, this.innerModel(), context);
        return this;
    }

    public RouteImpl(String name, CdnManager serviceManager) {
        this.innerObject = new RouteInner();
        this.serviceManager = serviceManager;
        this.routeName = name;
    }

    public RouteImpl update() {
        this.updateRouteUpdateProperties = new RouteUpdateParameters();
        return this;
    }

    public Route apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoutes()
                .update(
                    resourceGroupName, profileName, endpointName, routeName, updateRouteUpdateProperties, Context.NONE);
        return this;
    }

    public Route apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoutes()
                .update(resourceGroupName, profileName, endpointName, routeName, updateRouteUpdateProperties, context);
        return this;
    }

    public RouteImpl(RouteInner innerObject, CdnManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.profileName = Utils.getValueFromIdByName(innerObject.id(), "profiles");
        this.endpointName = Utils.getValueFromIdByName(innerObject.id(), "afdEndpoints");
        this.routeName = Utils.getValueFromIdByName(innerObject.id(), "routes");
    }

    public Route refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoutes()
                .getWithResponse(resourceGroupName, profileName, endpointName, routeName, Context.NONE)
                .getValue();
        return this;
    }

    public Route refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoutes()
                .getWithResponse(resourceGroupName, profileName, endpointName, routeName, context)
                .getValue();
        return this;
    }

    public RouteImpl withCustomDomains(List<ResourceReference> customDomains) {
        if (isInCreateMode()) {
            this.innerModel().withCustomDomains(customDomains);
            return this;
        } else {
            this.updateRouteUpdateProperties.withCustomDomains(customDomains);
            return this;
        }
    }

    public RouteImpl withOriginGroup(ResourceReference originGroup) {
        if (isInCreateMode()) {
            this.innerModel().withOriginGroup(originGroup);
            return this;
        } else {
            this.updateRouteUpdateProperties.withOriginGroup(originGroup);
            return this;
        }
    }

    public RouteImpl withOriginPath(String originPath) {
        if (isInCreateMode()) {
            this.innerModel().withOriginPath(originPath);
            return this;
        } else {
            this.updateRouteUpdateProperties.withOriginPath(originPath);
            return this;
        }
    }

    public RouteImpl withRuleSets(List<ResourceReference> ruleSets) {
        if (isInCreateMode()) {
            this.innerModel().withRuleSets(ruleSets);
            return this;
        } else {
            this.updateRouteUpdateProperties.withRuleSets(ruleSets);
            return this;
        }
    }

    public RouteImpl withSupportedProtocols(List<AfdEndpointProtocols> supportedProtocols) {
        if (isInCreateMode()) {
            this.innerModel().withSupportedProtocols(supportedProtocols);
            return this;
        } else {
            this.updateRouteUpdateProperties.withSupportedProtocols(supportedProtocols);
            return this;
        }
    }

    public RouteImpl withPatternsToMatch(List<String> patternsToMatch) {
        if (isInCreateMode()) {
            this.innerModel().withPatternsToMatch(patternsToMatch);
            return this;
        } else {
            this.updateRouteUpdateProperties.withPatternsToMatch(patternsToMatch);
            return this;
        }
    }

    public RouteImpl withCompressionSettings(Object compressionSettings) {
        if (isInCreateMode()) {
            this.innerModel().withCompressionSettings(compressionSettings);
            return this;
        } else {
            this.updateRouteUpdateProperties.withCompressionSettings(compressionSettings);
            return this;
        }
    }

    public RouteImpl withQueryStringCachingBehavior(QueryStringCachingBehavior queryStringCachingBehavior) {
        if (isInCreateMode()) {
            this.innerModel().withQueryStringCachingBehavior(queryStringCachingBehavior);
            return this;
        } else {
            this.updateRouteUpdateProperties.withQueryStringCachingBehavior(queryStringCachingBehavior);
            return this;
        }
    }

    public RouteImpl withOptimizationType(OptimizationType optimizationType) {
        if (isInCreateMode()) {
            this.innerModel().withOptimizationType(optimizationType);
            return this;
        } else {
            this.updateRouteUpdateProperties.withOptimizationType(optimizationType);
            return this;
        }
    }

    public RouteImpl withForwardingProtocol(ForwardingProtocol forwardingProtocol) {
        if (isInCreateMode()) {
            this.innerModel().withForwardingProtocol(forwardingProtocol);
            return this;
        } else {
            this.updateRouteUpdateProperties.withForwardingProtocol(forwardingProtocol);
            return this;
        }
    }

    public RouteImpl withLinkToDefaultDomain(LinkToDefaultDomain linkToDefaultDomain) {
        if (isInCreateMode()) {
            this.innerModel().withLinkToDefaultDomain(linkToDefaultDomain);
            return this;
        } else {
            this.updateRouteUpdateProperties.withLinkToDefaultDomain(linkToDefaultDomain);
            return this;
        }
    }

    public RouteImpl withHttpsRedirect(HttpsRedirect httpsRedirect) {
        if (isInCreateMode()) {
            this.innerModel().withHttpsRedirect(httpsRedirect);
            return this;
        } else {
            this.updateRouteUpdateProperties.withHttpsRedirect(httpsRedirect);
            return this;
        }
    }

    public RouteImpl withEnabledState(EnabledState enabledState) {
        if (isInCreateMode()) {
            this.innerModel().withEnabledState(enabledState);
            return this;
        } else {
            this.updateRouteUpdateProperties.withEnabledState(enabledState);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
