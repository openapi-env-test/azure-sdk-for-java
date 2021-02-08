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
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

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
     * Gets the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the sku property: Gets or sets sku of application gateway resource.
     *
     * @return the sku value.
     */
    ApplicationGatewaySku sku();

    /**
     * Gets the operationalState property: Gets operational state of application gateway resource.
     *
     * @return the operationalState value.
     */
    ApplicationGatewayOperationalState operationalState();

    /**
     * Gets the gatewayIpConfigurations property: Gets or sets subnets of application gateway resource.
     *
     * @return the gatewayIpConfigurations value.
     */
    List<ApplicationGatewayIpConfiguration> gatewayIpConfigurations();

    /**
     * Gets the sslCertificates property: Gets or sets ssl certificates of application gateway resource.
     *
     * @return the sslCertificates value.
     */
    List<ApplicationGatewaySslCertificate> sslCertificates();

    /**
     * Gets the frontendIpConfigurations property: Gets or sets frontend IP addresses of application gateway resource.
     *
     * @return the frontendIpConfigurations value.
     */
    List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations();

    /**
     * Gets the frontendPorts property: Gets or sets frontend ports of application gateway resource.
     *
     * @return the frontendPorts value.
     */
    List<ApplicationGatewayFrontendPort> frontendPorts();

    /**
     * Gets the backendAddressPools property: Gets or sets backend address pool of application gateway resource.
     *
     * @return the backendAddressPools value.
     */
    List<ApplicationGatewayBackendAddressPool> backendAddressPools();

    /**
     * Gets the backendHttpSettingsCollection property: Gets or sets backend http settings of application gateway
     * resource.
     *
     * @return the backendHttpSettingsCollection value.
     */
    List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection();

    /**
     * Gets the httpListeners property: Gets or sets HTTP listeners of application gateway resource.
     *
     * @return the httpListeners value.
     */
    List<ApplicationGatewayHttpListener> httpListeners();

    /**
     * Gets the requestRoutingRules property: Gets or sets request routing rules of application gateway resource.
     *
     * @return the requestRoutingRules value.
     */
    List<ApplicationGatewayRequestRoutingRule> requestRoutingRules();

    /**
     * Gets the resourceGuid property: Gets or sets resource guid property of the ApplicationGateway resource.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: Gets or sets Provisioning state of the ApplicationGateway resource
     * Updating/Deleting/Failed.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

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
                DefinitionStages.WithGatewayIpConfigurations,
                DefinitionStages.WithSslCertificates,
                DefinitionStages.WithFrontendIpConfigurations,
                DefinitionStages.WithFrontendPorts,
                DefinitionStages.WithBackendAddressPools,
                DefinitionStages.WithBackendHttpSettingsCollection,
                DefinitionStages.WithHttpListeners,
                DefinitionStages.WithRequestRoutingRules,
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
             * Specifies the etag property: Gets a unique read-only string that changes whenever the resource is
             * updated.
             *
             * @param etag Gets a unique read-only string that changes whenever the resource is updated.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the ApplicationGateway definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Gets or sets sku of application gateway resource.
             *
             * @param sku Gets or sets sku of application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withSku(ApplicationGatewaySku sku);
        }
        /** The stage of the ApplicationGateway definition allowing to specify gatewayIpConfigurations. */
        interface WithGatewayIpConfigurations {
            /**
             * Specifies the gatewayIpConfigurations property: Gets or sets subnets of application gateway resource.
             *
             * @param gatewayIpConfigurations Gets or sets subnets of application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withGatewayIpConfigurations(List<ApplicationGatewayIpConfiguration> gatewayIpConfigurations);
        }
        /** The stage of the ApplicationGateway definition allowing to specify sslCertificates. */
        interface WithSslCertificates {
            /**
             * Specifies the sslCertificates property: Gets or sets ssl certificates of application gateway resource.
             *
             * @param sslCertificates Gets or sets ssl certificates of application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withSslCertificates(List<ApplicationGatewaySslCertificate> sslCertificates);
        }
        /** The stage of the ApplicationGateway definition allowing to specify frontendIpConfigurations. */
        interface WithFrontendIpConfigurations {
            /**
             * Specifies the frontendIpConfigurations property: Gets or sets frontend IP addresses of application
             * gateway resource.
             *
             * @param frontendIpConfigurations Gets or sets frontend IP addresses of application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withFrontendIpConfigurations(
                List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations);
        }
        /** The stage of the ApplicationGateway definition allowing to specify frontendPorts. */
        interface WithFrontendPorts {
            /**
             * Specifies the frontendPorts property: Gets or sets frontend ports of application gateway resource.
             *
             * @param frontendPorts Gets or sets frontend ports of application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withFrontendPorts(List<ApplicationGatewayFrontendPort> frontendPorts);
        }
        /** The stage of the ApplicationGateway definition allowing to specify backendAddressPools. */
        interface WithBackendAddressPools {
            /**
             * Specifies the backendAddressPools property: Gets or sets backend address pool of application gateway
             * resource.
             *
             * @param backendAddressPools Gets or sets backend address pool of application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withBackendAddressPools(List<ApplicationGatewayBackendAddressPool> backendAddressPools);
        }
        /** The stage of the ApplicationGateway definition allowing to specify backendHttpSettingsCollection. */
        interface WithBackendHttpSettingsCollection {
            /**
             * Specifies the backendHttpSettingsCollection property: Gets or sets backend http settings of application
             * gateway resource.
             *
             * @param backendHttpSettingsCollection Gets or sets backend http settings of application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withBackendHttpSettingsCollection(
                List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection);
        }
        /** The stage of the ApplicationGateway definition allowing to specify httpListeners. */
        interface WithHttpListeners {
            /**
             * Specifies the httpListeners property: Gets or sets HTTP listeners of application gateway resource.
             *
             * @param httpListeners Gets or sets HTTP listeners of application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withHttpListeners(List<ApplicationGatewayHttpListener> httpListeners);
        }
        /** The stage of the ApplicationGateway definition allowing to specify requestRoutingRules. */
        interface WithRequestRoutingRules {
            /**
             * Specifies the requestRoutingRules property: Gets or sets request routing rules of application gateway
             * resource.
             *
             * @param requestRoutingRules Gets or sets request routing rules of application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withRequestRoutingRules(List<ApplicationGatewayRequestRoutingRule> requestRoutingRules);
        }
        /** The stage of the ApplicationGateway definition allowing to specify resourceGuid. */
        interface WithResourceGuid {
            /**
             * Specifies the resourceGuid property: Gets or sets resource guid property of the ApplicationGateway
             * resource.
             *
             * @param resourceGuid Gets or sets resource guid property of the ApplicationGateway resource.
             * @return the next definition stage.
             */
            WithCreate withResourceGuid(String resourceGuid);
        }
        /** The stage of the ApplicationGateway definition allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: Gets or sets Provisioning state of the ApplicationGateway
             * resource Updating/Deleting/Failed.
             *
             * @param provisioningState Gets or sets Provisioning state of the ApplicationGateway resource
             *     Updating/Deleting/Failed.
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
            UpdateStages.WithGatewayIpConfigurations,
            UpdateStages.WithSslCertificates,
            UpdateStages.WithFrontendIpConfigurations,
            UpdateStages.WithFrontendPorts,
            UpdateStages.WithBackendAddressPools,
            UpdateStages.WithBackendHttpSettingsCollection,
            UpdateStages.WithHttpListeners,
            UpdateStages.WithRequestRoutingRules,
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
             * Specifies the etag property: Gets a unique read-only string that changes whenever the resource is
             * updated.
             *
             * @param etag Gets a unique read-only string that changes whenever the resource is updated.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }
        /** The stage of the ApplicationGateway update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Gets or sets sku of application gateway resource.
             *
             * @param sku Gets or sets sku of application gateway resource.
             * @return the next definition stage.
             */
            Update withSku(ApplicationGatewaySku sku);
        }
        /** The stage of the ApplicationGateway update allowing to specify gatewayIpConfigurations. */
        interface WithGatewayIpConfigurations {
            /**
             * Specifies the gatewayIpConfigurations property: Gets or sets subnets of application gateway resource.
             *
             * @param gatewayIpConfigurations Gets or sets subnets of application gateway resource.
             * @return the next definition stage.
             */
            Update withGatewayIpConfigurations(List<ApplicationGatewayIpConfiguration> gatewayIpConfigurations);
        }
        /** The stage of the ApplicationGateway update allowing to specify sslCertificates. */
        interface WithSslCertificates {
            /**
             * Specifies the sslCertificates property: Gets or sets ssl certificates of application gateway resource.
             *
             * @param sslCertificates Gets or sets ssl certificates of application gateway resource.
             * @return the next definition stage.
             */
            Update withSslCertificates(List<ApplicationGatewaySslCertificate> sslCertificates);
        }
        /** The stage of the ApplicationGateway update allowing to specify frontendIpConfigurations. */
        interface WithFrontendIpConfigurations {
            /**
             * Specifies the frontendIpConfigurations property: Gets or sets frontend IP addresses of application
             * gateway resource.
             *
             * @param frontendIpConfigurations Gets or sets frontend IP addresses of application gateway resource.
             * @return the next definition stage.
             */
            Update withFrontendIpConfigurations(
                List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations);
        }
        /** The stage of the ApplicationGateway update allowing to specify frontendPorts. */
        interface WithFrontendPorts {
            /**
             * Specifies the frontendPorts property: Gets or sets frontend ports of application gateway resource.
             *
             * @param frontendPorts Gets or sets frontend ports of application gateway resource.
             * @return the next definition stage.
             */
            Update withFrontendPorts(List<ApplicationGatewayFrontendPort> frontendPorts);
        }
        /** The stage of the ApplicationGateway update allowing to specify backendAddressPools. */
        interface WithBackendAddressPools {
            /**
             * Specifies the backendAddressPools property: Gets or sets backend address pool of application gateway
             * resource.
             *
             * @param backendAddressPools Gets or sets backend address pool of application gateway resource.
             * @return the next definition stage.
             */
            Update withBackendAddressPools(List<ApplicationGatewayBackendAddressPool> backendAddressPools);
        }
        /** The stage of the ApplicationGateway update allowing to specify backendHttpSettingsCollection. */
        interface WithBackendHttpSettingsCollection {
            /**
             * Specifies the backendHttpSettingsCollection property: Gets or sets backend http settings of application
             * gateway resource.
             *
             * @param backendHttpSettingsCollection Gets or sets backend http settings of application gateway resource.
             * @return the next definition stage.
             */
            Update withBackendHttpSettingsCollection(
                List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection);
        }
        /** The stage of the ApplicationGateway update allowing to specify httpListeners. */
        interface WithHttpListeners {
            /**
             * Specifies the httpListeners property: Gets or sets HTTP listeners of application gateway resource.
             *
             * @param httpListeners Gets or sets HTTP listeners of application gateway resource.
             * @return the next definition stage.
             */
            Update withHttpListeners(List<ApplicationGatewayHttpListener> httpListeners);
        }
        /** The stage of the ApplicationGateway update allowing to specify requestRoutingRules. */
        interface WithRequestRoutingRules {
            /**
             * Specifies the requestRoutingRules property: Gets or sets request routing rules of application gateway
             * resource.
             *
             * @param requestRoutingRules Gets or sets request routing rules of application gateway resource.
             * @return the next definition stage.
             */
            Update withRequestRoutingRules(List<ApplicationGatewayRequestRoutingRule> requestRoutingRules);
        }
        /** The stage of the ApplicationGateway update allowing to specify resourceGuid. */
        interface WithResourceGuid {
            /**
             * Specifies the resourceGuid property: Gets or sets resource guid property of the ApplicationGateway
             * resource.
             *
             * @param resourceGuid Gets or sets resource guid property of the ApplicationGateway resource.
             * @return the next definition stage.
             */
            Update withResourceGuid(String resourceGuid);
        }
        /** The stage of the ApplicationGateway update allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: Gets or sets Provisioning state of the ApplicationGateway
             * resource Updating/Deleting/Failed.
             *
             * @param provisioningState Gets or sets Provisioning state of the ApplicationGateway resource
             *     Updating/Deleting/Failed.
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

    /**
     * The Start ApplicationGateway operation starts application gateway in the specified resource group through Network
     * resource provider.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start();

    /**
     * The Start ApplicationGateway operation starts application gateway in the specified resource group through Network
     * resource provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(Context context);

    /**
     * The STOP ApplicationGateway operation stops application gateway in the specified resource group through Network
     * resource provider.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop();

    /**
     * The STOP ApplicationGateway operation stops application gateway in the specified resource group through Network
     * resource provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(Context context);
}
