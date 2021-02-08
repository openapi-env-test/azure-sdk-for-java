// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayInner;
import com.azure.resourcemanager.network.generated.models.ApplicationGateway;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayAuthenticationCertificate;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayAutoscaleConfiguration;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayBackendAddressPool;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayBackendHttpSettings;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayCustomError;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayFrontendIpConfiguration;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayFrontendPort;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayHttpListener;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayIpConfiguration;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayOperationalState;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayProbe;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayRedirectConfiguration;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayRequestRoutingRule;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayRewriteRuleSet;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySku;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySslCertificate;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySslPolicy;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayTrustedRootCertificate;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayUrlPathMap;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayWebApplicationFirewallConfiguration;
import com.azure.resourcemanager.network.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ApplicationGatewayImpl
    implements ApplicationGateway, ApplicationGateway.Definition, ApplicationGateway.Update {
    private ApplicationGatewayInner innerObject;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public ApplicationGatewaySku sku() {
        return this.innerModel().sku();
    }

    public ApplicationGatewaySslPolicy sslPolicy() {
        return this.innerModel().sslPolicy();
    }

    public ApplicationGatewayOperationalState operationalState() {
        return this.innerModel().operationalState();
    }

    public List<ApplicationGatewayIpConfiguration> gatewayIpConfigurations() {
        List<ApplicationGatewayIpConfiguration> inner = this.innerModel().gatewayIpConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationGatewayAuthenticationCertificate> authenticationCertificates() {
        List<ApplicationGatewayAuthenticationCertificate> inner = this.innerModel().authenticationCertificates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationGatewayTrustedRootCertificate> trustedRootCertificates() {
        List<ApplicationGatewayTrustedRootCertificate> inner = this.innerModel().trustedRootCertificates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationGatewaySslCertificate> sslCertificates() {
        List<ApplicationGatewaySslCertificate> inner = this.innerModel().sslCertificates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations() {
        List<ApplicationGatewayFrontendIpConfiguration> inner = this.innerModel().frontendIpConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationGatewayFrontendPort> frontendPorts() {
        List<ApplicationGatewayFrontendPort> inner = this.innerModel().frontendPorts();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationGatewayProbe> probes() {
        List<ApplicationGatewayProbe> inner = this.innerModel().probes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationGatewayBackendAddressPool> backendAddressPools() {
        List<ApplicationGatewayBackendAddressPool> inner = this.innerModel().backendAddressPools();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection() {
        List<ApplicationGatewayBackendHttpSettings> inner = this.innerModel().backendHttpSettingsCollection();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationGatewayHttpListener> httpListeners() {
        List<ApplicationGatewayHttpListener> inner = this.innerModel().httpListeners();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationGatewayUrlPathMap> urlPathMaps() {
        List<ApplicationGatewayUrlPathMap> inner = this.innerModel().urlPathMaps();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationGatewayRequestRoutingRule> requestRoutingRules() {
        List<ApplicationGatewayRequestRoutingRule> inner = this.innerModel().requestRoutingRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationGatewayRewriteRuleSet> rewriteRuleSets() {
        List<ApplicationGatewayRewriteRuleSet> inner = this.innerModel().rewriteRuleSets();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationGatewayRedirectConfiguration> redirectConfigurations() {
        List<ApplicationGatewayRedirectConfiguration> inner = this.innerModel().redirectConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration() {
        return this.innerModel().webApplicationFirewallConfiguration();
    }

    public Boolean enableHttp2() {
        return this.innerModel().enableHttp2();
    }

    public Boolean enableFips() {
        return this.innerModel().enableFips();
    }

    public ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration() {
        return this.innerModel().autoscaleConfiguration();
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<ApplicationGatewayCustomError> customErrorConfigurations() {
        List<ApplicationGatewayCustomError> inner = this.innerModel().customErrorConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
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

    public ApplicationGatewayInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String applicationGatewayName;

    private TagsObject updateParameters;

    public ApplicationGatewayImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ApplicationGateway create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplicationGateways()
                .createOrUpdate(resourceGroupName, applicationGatewayName, this.innerModel(), Context.NONE);
        return this;
    }

    public ApplicationGateway create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplicationGateways()
                .createOrUpdate(resourceGroupName, applicationGatewayName, this.innerModel(), context);
        return this;
    }

    ApplicationGatewayImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new ApplicationGatewayInner();
        this.serviceManager = serviceManager;
        this.applicationGatewayName = name;
    }

    public ApplicationGatewayImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public ApplicationGateway apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplicationGateways()
                .updateTags(resourceGroupName, applicationGatewayName, updateParameters, Context.NONE);
        return this;
    }

    public ApplicationGateway apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplicationGateways()
                .updateTags(resourceGroupName, applicationGatewayName, updateParameters, context);
        return this;
    }

    ApplicationGatewayImpl(ApplicationGatewayInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.applicationGatewayName = Utils.getValueFromIdByName(innerObject.id(), "applicationGateways");
    }

    public ApplicationGateway refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplicationGateways()
                .getByResourceGroupWithResponse(resourceGroupName, applicationGatewayName, Context.NONE)
                .getValue();
        return this;
    }

    public ApplicationGateway refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplicationGateways()
                .getByResourceGroupWithResponse(resourceGroupName, applicationGatewayName, context)
                .getValue();
        return this;
    }

    public ApplicationGatewayImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ApplicationGatewayImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ApplicationGatewayImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ApplicationGatewayImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public ApplicationGatewayImpl withZones(List<String> zones) {
        this.innerModel().withZones(zones);
        return this;
    }

    public ApplicationGatewayImpl withIdentity(ManagedServiceIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public ApplicationGatewayImpl withSku(ApplicationGatewaySku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public ApplicationGatewayImpl withSslPolicy(ApplicationGatewaySslPolicy sslPolicy) {
        this.innerModel().withSslPolicy(sslPolicy);
        return this;
    }

    public ApplicationGatewayImpl withGatewayIpConfigurations(
        List<ApplicationGatewayIpConfiguration> gatewayIpConfigurations) {
        this.innerModel().withGatewayIpConfigurations(gatewayIpConfigurations);
        return this;
    }

    public ApplicationGatewayImpl withAuthenticationCertificates(
        List<ApplicationGatewayAuthenticationCertificate> authenticationCertificates) {
        this.innerModel().withAuthenticationCertificates(authenticationCertificates);
        return this;
    }

    public ApplicationGatewayImpl withTrustedRootCertificates(
        List<ApplicationGatewayTrustedRootCertificate> trustedRootCertificates) {
        this.innerModel().withTrustedRootCertificates(trustedRootCertificates);
        return this;
    }

    public ApplicationGatewayImpl withSslCertificates(List<ApplicationGatewaySslCertificate> sslCertificates) {
        this.innerModel().withSslCertificates(sslCertificates);
        return this;
    }

    public ApplicationGatewayImpl withFrontendIpConfigurations(
        List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations) {
        this.innerModel().withFrontendIpConfigurations(frontendIpConfigurations);
        return this;
    }

    public ApplicationGatewayImpl withFrontendPorts(List<ApplicationGatewayFrontendPort> frontendPorts) {
        this.innerModel().withFrontendPorts(frontendPorts);
        return this;
    }

    public ApplicationGatewayImpl withProbes(List<ApplicationGatewayProbe> probes) {
        this.innerModel().withProbes(probes);
        return this;
    }

    public ApplicationGatewayImpl withBackendAddressPools(
        List<ApplicationGatewayBackendAddressPool> backendAddressPools) {
        this.innerModel().withBackendAddressPools(backendAddressPools);
        return this;
    }

    public ApplicationGatewayImpl withBackendHttpSettingsCollection(
        List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection) {
        this.innerModel().withBackendHttpSettingsCollection(backendHttpSettingsCollection);
        return this;
    }

    public ApplicationGatewayImpl withHttpListeners(List<ApplicationGatewayHttpListener> httpListeners) {
        this.innerModel().withHttpListeners(httpListeners);
        return this;
    }

    public ApplicationGatewayImpl withUrlPathMaps(List<ApplicationGatewayUrlPathMap> urlPathMaps) {
        this.innerModel().withUrlPathMaps(urlPathMaps);
        return this;
    }

    public ApplicationGatewayImpl withRequestRoutingRules(
        List<ApplicationGatewayRequestRoutingRule> requestRoutingRules) {
        this.innerModel().withRequestRoutingRules(requestRoutingRules);
        return this;
    }

    public ApplicationGatewayImpl withRewriteRuleSets(List<ApplicationGatewayRewriteRuleSet> rewriteRuleSets) {
        this.innerModel().withRewriteRuleSets(rewriteRuleSets);
        return this;
    }

    public ApplicationGatewayImpl withRedirectConfigurations(
        List<ApplicationGatewayRedirectConfiguration> redirectConfigurations) {
        this.innerModel().withRedirectConfigurations(redirectConfigurations);
        return this;
    }

    public ApplicationGatewayImpl withWebApplicationFirewallConfiguration(
        ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration) {
        this.innerModel().withWebApplicationFirewallConfiguration(webApplicationFirewallConfiguration);
        return this;
    }

    public ApplicationGatewayImpl withEnableHttp2(Boolean enableHttp2) {
        this.innerModel().withEnableHttp2(enableHttp2);
        return this;
    }

    public ApplicationGatewayImpl withEnableFips(Boolean enableFips) {
        this.innerModel().withEnableFips(enableFips);
        return this;
    }

    public ApplicationGatewayImpl withAutoscaleConfiguration(
        ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration) {
        this.innerModel().withAutoscaleConfiguration(autoscaleConfiguration);
        return this;
    }

    public ApplicationGatewayImpl withResourceGuid(String resourceGuid) {
        this.innerModel().withResourceGuid(resourceGuid);
        return this;
    }

    public ApplicationGatewayImpl withProvisioningState(String provisioningState) {
        this.innerModel().withProvisioningState(provisioningState);
        return this;
    }

    public ApplicationGatewayImpl withCustomErrorConfigurations(
        List<ApplicationGatewayCustomError> customErrorConfigurations) {
        this.innerModel().withCustomErrorConfigurations(customErrorConfigurations);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
