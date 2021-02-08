// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ApplicationGateway. */
public interface ApplicationGateway {
    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the sku property: SKU of the application gateway resource.
     *
     * @return the sku value.
     */
    ApplicationGatewaySku sku();

    /**
     * Gets the sslPolicy property: SSL policy of the application gateway resource.
     *
     * @return the sslPolicy value.
     */
    ApplicationGatewaySslPolicy sslPolicy();

    /**
     * Gets the operationalState property: Operational state of the application gateway resource.
     *
     * @return the operationalState value.
     */
    ApplicationGatewayOperationalState operationalState();

    /**
     * Gets the gatewayIpConfigurations property: Subnets of application the gateway resource.
     *
     * @return the gatewayIpConfigurations value.
     */
    List<ApplicationGatewayIpConfiguration> gatewayIpConfigurations();

    /**
     * Gets the authenticationCertificates property: Authentication certificates of the application gateway resource.
     *
     * @return the authenticationCertificates value.
     */
    List<ApplicationGatewayAuthenticationCertificate> authenticationCertificates();

    /**
     * Gets the sslCertificates property: SSL certificates of the application gateway resource.
     *
     * @return the sslCertificates value.
     */
    List<ApplicationGatewaySslCertificate> sslCertificates();

    /**
     * Gets the frontendIpConfigurations property: Frontend IP addresses of the application gateway resource.
     *
     * @return the frontendIpConfigurations value.
     */
    List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations();

    /**
     * Gets the frontendPorts property: Frontend ports of the application gateway resource.
     *
     * @return the frontendPorts value.
     */
    List<ApplicationGatewayFrontendPort> frontendPorts();

    /**
     * Gets the probes property: Probes of the application gateway resource.
     *
     * @return the probes value.
     */
    List<ApplicationGatewayProbe> probes();

    /**
     * Gets the backendAddressPools property: Backend address pool of the application gateway resource.
     *
     * @return the backendAddressPools value.
     */
    List<ApplicationGatewayBackendAddressPool> backendAddressPools();

    /**
     * Gets the backendHttpSettingsCollection property: Backend http settings of the application gateway resource.
     *
     * @return the backendHttpSettingsCollection value.
     */
    List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection();

    /**
     * Gets the httpListeners property: Http listeners of the application gateway resource.
     *
     * @return the httpListeners value.
     */
    List<ApplicationGatewayHttpListener> httpListeners();

    /**
     * Gets the urlPathMaps property: URL path map of the application gateway resource.
     *
     * @return the urlPathMaps value.
     */
    List<ApplicationGatewayUrlPathMap> urlPathMaps();

    /**
     * Gets the requestRoutingRules property: Request routing rules of the application gateway resource.
     *
     * @return the requestRoutingRules value.
     */
    List<ApplicationGatewayRequestRoutingRule> requestRoutingRules();

    /**
     * Gets the redirectConfigurations property: Redirect configurations of the application gateway resource.
     *
     * @return the redirectConfigurations value.
     */
    List<ApplicationGatewayRedirectConfiguration> redirectConfigurations();

    /**
     * Gets the webApplicationFirewallConfiguration property: Web application firewall configuration.
     *
     * @return the webApplicationFirewallConfiguration value.
     */
    ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration();

    /**
     * Gets the resourceGuid property: Resource GUID property of the application gateway resource.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: Provisioning state of the application gateway resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the id property: Resource ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayInner object.
     *
     * @return the inner object.
     */
    ApplicationGatewayInner innerModel();

    /** The entirety of the ApplicationGateway definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The ApplicationGateway definition stages. */
    interface DefinitionStages {
        /** The first stage of the ApplicationGateway definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ApplicationGateway definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the ApplicationGateway definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the ApplicationGateway definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithEtag,
                DefinitionStages.WithSku,
                DefinitionStages.WithSslPolicy,
                DefinitionStages.WithGatewayIpConfigurations,
                DefinitionStages.WithAuthenticationCertificates,
                DefinitionStages.WithSslCertificates,
                DefinitionStages.WithFrontendIpConfigurations,
                DefinitionStages.WithFrontendPorts,
                DefinitionStages.WithProbes,
                DefinitionStages.WithBackendAddressPools,
                DefinitionStages.WithBackendHttpSettingsCollection,
                DefinitionStages.WithHttpListeners,
                DefinitionStages.WithUrlPathMaps,
                DefinitionStages.WithRequestRoutingRules,
                DefinitionStages.WithRedirectConfigurations,
                DefinitionStages.WithWebApplicationFirewallConfiguration,
                DefinitionStages.WithResourceGuid,
                DefinitionStages.WithProvisioningState {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ApplicationGateway create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ApplicationGateway create(Context context);
        }
        /** The stage of the ApplicationGateway definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ApplicationGateway definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: A unique read-only string that changes whenever the resource is updated..
             *
             * @param etag A unique read-only string that changes whenever the resource is updated.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the ApplicationGateway definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: SKU of the application gateway resource..
             *
             * @param sku SKU of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withSku(ApplicationGatewaySku sku);
        }
        /** The stage of the ApplicationGateway definition allowing to specify sslPolicy. */
        interface WithSslPolicy {
            /**
             * Specifies the sslPolicy property: SSL policy of the application gateway resource..
             *
             * @param sslPolicy SSL policy of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withSslPolicy(ApplicationGatewaySslPolicy sslPolicy);
        }
        /** The stage of the ApplicationGateway definition allowing to specify gatewayIpConfigurations. */
        interface WithGatewayIpConfigurations {
            /**
             * Specifies the gatewayIpConfigurations property: Subnets of application the gateway resource..
             *
             * @param gatewayIpConfigurations Subnets of application the gateway resource.
             * @return the next definition stage.
             */
            WithCreate withGatewayIpConfigurations(List<ApplicationGatewayIpConfiguration> gatewayIpConfigurations);
        }
        /** The stage of the ApplicationGateway definition allowing to specify authenticationCertificates. */
        interface WithAuthenticationCertificates {
            /**
             * Specifies the authenticationCertificates property: Authentication certificates of the application gateway
             * resource..
             *
             * @param authenticationCertificates Authentication certificates of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withAuthenticationCertificates(
                List<ApplicationGatewayAuthenticationCertificate> authenticationCertificates);
        }
        /** The stage of the ApplicationGateway definition allowing to specify sslCertificates. */
        interface WithSslCertificates {
            /**
             * Specifies the sslCertificates property: SSL certificates of the application gateway resource..
             *
             * @param sslCertificates SSL certificates of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withSslCertificates(List<ApplicationGatewaySslCertificate> sslCertificates);
        }
        /** The stage of the ApplicationGateway definition allowing to specify frontendIpConfigurations. */
        interface WithFrontendIpConfigurations {
            /**
             * Specifies the frontendIpConfigurations property: Frontend IP addresses of the application gateway
             * resource..
             *
             * @param frontendIpConfigurations Frontend IP addresses of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withFrontendIpConfigurations(
                List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations);
        }
        /** The stage of the ApplicationGateway definition allowing to specify frontendPorts. */
        interface WithFrontendPorts {
            /**
             * Specifies the frontendPorts property: Frontend ports of the application gateway resource..
             *
             * @param frontendPorts Frontend ports of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withFrontendPorts(List<ApplicationGatewayFrontendPort> frontendPorts);
        }
        /** The stage of the ApplicationGateway definition allowing to specify probes. */
        interface WithProbes {
            /**
             * Specifies the probes property: Probes of the application gateway resource..
             *
             * @param probes Probes of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withProbes(List<ApplicationGatewayProbe> probes);
        }
        /** The stage of the ApplicationGateway definition allowing to specify backendAddressPools. */
        interface WithBackendAddressPools {
            /**
             * Specifies the backendAddressPools property: Backend address pool of the application gateway resource..
             *
             * @param backendAddressPools Backend address pool of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withBackendAddressPools(List<ApplicationGatewayBackendAddressPool> backendAddressPools);
        }
        /** The stage of the ApplicationGateway definition allowing to specify backendHttpSettingsCollection. */
        interface WithBackendHttpSettingsCollection {
            /**
             * Specifies the backendHttpSettingsCollection property: Backend http settings of the application gateway
             * resource..
             *
             * @param backendHttpSettingsCollection Backend http settings of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withBackendHttpSettingsCollection(
                List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection);
        }
        /** The stage of the ApplicationGateway definition allowing to specify httpListeners. */
        interface WithHttpListeners {
            /**
             * Specifies the httpListeners property: Http listeners of the application gateway resource..
             *
             * @param httpListeners Http listeners of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withHttpListeners(List<ApplicationGatewayHttpListener> httpListeners);
        }
        /** The stage of the ApplicationGateway definition allowing to specify urlPathMaps. */
        interface WithUrlPathMaps {
            /**
             * Specifies the urlPathMaps property: URL path map of the application gateway resource..
             *
             * @param urlPathMaps URL path map of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withUrlPathMaps(List<ApplicationGatewayUrlPathMap> urlPathMaps);
        }
        /** The stage of the ApplicationGateway definition allowing to specify requestRoutingRules. */
        interface WithRequestRoutingRules {
            /**
             * Specifies the requestRoutingRules property: Request routing rules of the application gateway resource..
             *
             * @param requestRoutingRules Request routing rules of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withRequestRoutingRules(List<ApplicationGatewayRequestRoutingRule> requestRoutingRules);
        }
        /** The stage of the ApplicationGateway definition allowing to specify redirectConfigurations. */
        interface WithRedirectConfigurations {
            /**
             * Specifies the redirectConfigurations property: Redirect configurations of the application gateway
             * resource..
             *
             * @param redirectConfigurations Redirect configurations of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withRedirectConfigurations(List<ApplicationGatewayRedirectConfiguration> redirectConfigurations);
        }
        /** The stage of the ApplicationGateway definition allowing to specify webApplicationFirewallConfiguration. */
        interface WithWebApplicationFirewallConfiguration {
            /**
             * Specifies the webApplicationFirewallConfiguration property: Web application firewall configuration..
             *
             * @param webApplicationFirewallConfiguration Web application firewall configuration.
             * @return the next definition stage.
             */
            WithCreate withWebApplicationFirewallConfiguration(
                ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration);
        }
        /** The stage of the ApplicationGateway definition allowing to specify resourceGuid. */
        interface WithResourceGuid {
            /**
             * Specifies the resourceGuid property: Resource GUID property of the application gateway resource..
             *
             * @param resourceGuid Resource GUID property of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withResourceGuid(String resourceGuid);
        }
        /** The stage of the ApplicationGateway definition allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: Provisioning state of the application gateway resource.
             * Possible values are: 'Updating', 'Deleting', and 'Failed'..
             *
             * @param provisioningState Provisioning state of the application gateway resource. Possible values are:
             *     'Updating', 'Deleting', and 'Failed'.
             * @return the next definition stage.
             */
            WithCreate withProvisioningState(String provisioningState);
        }
    }
    /**
     * Begins update for the ApplicationGateway resource.
     *
     * @return the stage of resource update.
     */
    ApplicationGateway.Update update();

    /** The template for ApplicationGateway update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithEtag,
            UpdateStages.WithSku,
            UpdateStages.WithSslPolicy,
            UpdateStages.WithGatewayIpConfigurations,
            UpdateStages.WithAuthenticationCertificates,
            UpdateStages.WithSslCertificates,
            UpdateStages.WithFrontendIpConfigurations,
            UpdateStages.WithFrontendPorts,
            UpdateStages.WithProbes,
            UpdateStages.WithBackendAddressPools,
            UpdateStages.WithBackendHttpSettingsCollection,
            UpdateStages.WithHttpListeners,
            UpdateStages.WithUrlPathMaps,
            UpdateStages.WithRequestRoutingRules,
            UpdateStages.WithRedirectConfigurations,
            UpdateStages.WithWebApplicationFirewallConfiguration,
            UpdateStages.WithResourceGuid,
            UpdateStages.WithProvisioningState {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ApplicationGateway apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ApplicationGateway apply(Context context);
    }
    /** The ApplicationGateway update stages. */
    interface UpdateStages {
        /** The stage of the ApplicationGateway update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ApplicationGateway update allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: A unique read-only string that changes whenever the resource is updated..
             *
             * @param etag A unique read-only string that changes whenever the resource is updated.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }
        /** The stage of the ApplicationGateway update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: SKU of the application gateway resource..
             *
             * @param sku SKU of the application gateway resource.
             * @return the next definition stage.
             */
            Update withSku(ApplicationGatewaySku sku);
        }
        /** The stage of the ApplicationGateway update allowing to specify sslPolicy. */
        interface WithSslPolicy {
            /**
             * Specifies the sslPolicy property: SSL policy of the application gateway resource..
             *
             * @param sslPolicy SSL policy of the application gateway resource.
             * @return the next definition stage.
             */
            Update withSslPolicy(ApplicationGatewaySslPolicy sslPolicy);
        }
        /** The stage of the ApplicationGateway update allowing to specify gatewayIpConfigurations. */
        interface WithGatewayIpConfigurations {
            /**
             * Specifies the gatewayIpConfigurations property: Subnets of application the gateway resource..
             *
             * @param gatewayIpConfigurations Subnets of application the gateway resource.
             * @return the next definition stage.
             */
            Update withGatewayIpConfigurations(List<ApplicationGatewayIpConfiguration> gatewayIpConfigurations);
        }
        /** The stage of the ApplicationGateway update allowing to specify authenticationCertificates. */
        interface WithAuthenticationCertificates {
            /**
             * Specifies the authenticationCertificates property: Authentication certificates of the application gateway
             * resource..
             *
             * @param authenticationCertificates Authentication certificates of the application gateway resource.
             * @return the next definition stage.
             */
            Update withAuthenticationCertificates(
                List<ApplicationGatewayAuthenticationCertificate> authenticationCertificates);
        }
        /** The stage of the ApplicationGateway update allowing to specify sslCertificates. */
        interface WithSslCertificates {
            /**
             * Specifies the sslCertificates property: SSL certificates of the application gateway resource..
             *
             * @param sslCertificates SSL certificates of the application gateway resource.
             * @return the next definition stage.
             */
            Update withSslCertificates(List<ApplicationGatewaySslCertificate> sslCertificates);
        }
        /** The stage of the ApplicationGateway update allowing to specify frontendIpConfigurations. */
        interface WithFrontendIpConfigurations {
            /**
             * Specifies the frontendIpConfigurations property: Frontend IP addresses of the application gateway
             * resource..
             *
             * @param frontendIpConfigurations Frontend IP addresses of the application gateway resource.
             * @return the next definition stage.
             */
            Update withFrontendIpConfigurations(
                List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations);
        }
        /** The stage of the ApplicationGateway update allowing to specify frontendPorts. */
        interface WithFrontendPorts {
            /**
             * Specifies the frontendPorts property: Frontend ports of the application gateway resource..
             *
             * @param frontendPorts Frontend ports of the application gateway resource.
             * @return the next definition stage.
             */
            Update withFrontendPorts(List<ApplicationGatewayFrontendPort> frontendPorts);
        }
        /** The stage of the ApplicationGateway update allowing to specify probes. */
        interface WithProbes {
            /**
             * Specifies the probes property: Probes of the application gateway resource..
             *
             * @param probes Probes of the application gateway resource.
             * @return the next definition stage.
             */
            Update withProbes(List<ApplicationGatewayProbe> probes);
        }
        /** The stage of the ApplicationGateway update allowing to specify backendAddressPools. */
        interface WithBackendAddressPools {
            /**
             * Specifies the backendAddressPools property: Backend address pool of the application gateway resource..
             *
             * @param backendAddressPools Backend address pool of the application gateway resource.
             * @return the next definition stage.
             */
            Update withBackendAddressPools(List<ApplicationGatewayBackendAddressPool> backendAddressPools);
        }
        /** The stage of the ApplicationGateway update allowing to specify backendHttpSettingsCollection. */
        interface WithBackendHttpSettingsCollection {
            /**
             * Specifies the backendHttpSettingsCollection property: Backend http settings of the application gateway
             * resource..
             *
             * @param backendHttpSettingsCollection Backend http settings of the application gateway resource.
             * @return the next definition stage.
             */
            Update withBackendHttpSettingsCollection(
                List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection);
        }
        /** The stage of the ApplicationGateway update allowing to specify httpListeners. */
        interface WithHttpListeners {
            /**
             * Specifies the httpListeners property: Http listeners of the application gateway resource..
             *
             * @param httpListeners Http listeners of the application gateway resource.
             * @return the next definition stage.
             */
            Update withHttpListeners(List<ApplicationGatewayHttpListener> httpListeners);
        }
        /** The stage of the ApplicationGateway update allowing to specify urlPathMaps. */
        interface WithUrlPathMaps {
            /**
             * Specifies the urlPathMaps property: URL path map of the application gateway resource..
             *
             * @param urlPathMaps URL path map of the application gateway resource.
             * @return the next definition stage.
             */
            Update withUrlPathMaps(List<ApplicationGatewayUrlPathMap> urlPathMaps);
        }
        /** The stage of the ApplicationGateway update allowing to specify requestRoutingRules. */
        interface WithRequestRoutingRules {
            /**
             * Specifies the requestRoutingRules property: Request routing rules of the application gateway resource..
             *
             * @param requestRoutingRules Request routing rules of the application gateway resource.
             * @return the next definition stage.
             */
            Update withRequestRoutingRules(List<ApplicationGatewayRequestRoutingRule> requestRoutingRules);
        }
        /** The stage of the ApplicationGateway update allowing to specify redirectConfigurations. */
        interface WithRedirectConfigurations {
            /**
             * Specifies the redirectConfigurations property: Redirect configurations of the application gateway
             * resource..
             *
             * @param redirectConfigurations Redirect configurations of the application gateway resource.
             * @return the next definition stage.
             */
            Update withRedirectConfigurations(List<ApplicationGatewayRedirectConfiguration> redirectConfigurations);
        }
        /** The stage of the ApplicationGateway update allowing to specify webApplicationFirewallConfiguration. */
        interface WithWebApplicationFirewallConfiguration {
            /**
             * Specifies the webApplicationFirewallConfiguration property: Web application firewall configuration..
             *
             * @param webApplicationFirewallConfiguration Web application firewall configuration.
             * @return the next definition stage.
             */
            Update withWebApplicationFirewallConfiguration(
                ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration);
        }
        /** The stage of the ApplicationGateway update allowing to specify resourceGuid. */
        interface WithResourceGuid {
            /**
             * Specifies the resourceGuid property: Resource GUID property of the application gateway resource..
             *
             * @param resourceGuid Resource GUID property of the application gateway resource.
             * @return the next definition stage.
             */
            Update withResourceGuid(String resourceGuid);
        }
        /** The stage of the ApplicationGateway update allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: Provisioning state of the application gateway resource.
             * Possible values are: 'Updating', 'Deleting', and 'Failed'..
             *
             * @param provisioningState Provisioning state of the application gateway resource. Possible values are:
             *     'Updating', 'Deleting', and 'Failed'.
             * @return the next definition stage.
             */
            Update withProvisioningState(String provisioningState);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ApplicationGateway refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ApplicationGateway refresh(Context context);
}
