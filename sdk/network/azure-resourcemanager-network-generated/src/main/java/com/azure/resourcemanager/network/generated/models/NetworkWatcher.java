// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.FlowLogInformationInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkWatcherInner;
import java.util.Map;

/** An immutable client-side representation of NetworkWatcher. */
public interface NetworkWatcher {
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
     * Gets the id property: Resource ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the provisioningState property: The provisioning state of the network watcher resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.NetworkWatcherInner object.
     *
     * @return the inner object.
     */
    NetworkWatcherInner innerModel();

    /** The entirety of the NetworkWatcher definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The NetworkWatcher definition stages. */
    interface DefinitionStages {
        /** The first stage of the NetworkWatcher definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the NetworkWatcher definition allowing to specify location. */
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
        /** The stage of the NetworkWatcher definition allowing to specify parent resource. */
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
         * The stage of the NetworkWatcher definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            NetworkWatcher create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NetworkWatcher create(Context context);
        }
        /** The stage of the NetworkWatcher definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
    }
    /**
     * Begins update for the NetworkWatcher resource.
     *
     * @return the stage of resource update.
     */
    NetworkWatcher.Update update();

    /** The template for NetworkWatcher update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        NetworkWatcher apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NetworkWatcher apply(Context context);
    }
    /** The NetworkWatcher update stages. */
    interface UpdateStages {
        /** The stage of the NetworkWatcher update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    NetworkWatcher refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NetworkWatcher refresh(Context context);

    /**
     * Gets the current network topology by resource group.
     *
     * @param parameters Parameters that define the representation of topology.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current network topology by resource group.
     */
    Topology getTopology(TopologyParameters parameters);

    /**
     * Gets the current network topology by resource group.
     *
     * @param parameters Parameters that define the representation of topology.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current network topology by resource group.
     */
    Response<Topology> getTopologyWithResponse(TopologyParameters parameters, Context context);

    /**
     * Verify IP flow from the specified VM to a location given the currently configured NSG rules.
     *
     * @param parameters Parameters that define the IP flow to be verified.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of IP flow verification on the target resource.
     */
    VerificationIpFlowResult verifyIpFlow(VerificationIpFlowParameters parameters);

    /**
     * Verify IP flow from the specified VM to a location given the currently configured NSG rules.
     *
     * @param parameters Parameters that define the IP flow to be verified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of IP flow verification on the target resource.
     */
    VerificationIpFlowResult verifyIpFlow(VerificationIpFlowParameters parameters, Context context);

    /**
     * Gets the next hop from the specified VM.
     *
     * @param parameters Parameters that define the source and destination endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the next hop from the specified VM.
     */
    NextHopResult getNextHop(NextHopParameters parameters);

    /**
     * Gets the next hop from the specified VM.
     *
     * @param parameters Parameters that define the source and destination endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the next hop from the specified VM.
     */
    NextHopResult getNextHop(NextHopParameters parameters, Context context);

    /**
     * Gets the configured and effective security group rules on the specified VM.
     *
     * @param parameters Parameters that define the VM to check security groups for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configured and effective security group rules on the specified VM.
     */
    SecurityGroupViewResult getVMSecurityRules(SecurityGroupViewParameters parameters);

    /**
     * Gets the configured and effective security group rules on the specified VM.
     *
     * @param parameters Parameters that define the VM to check security groups for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configured and effective security group rules on the specified VM.
     */
    SecurityGroupViewResult getVMSecurityRules(SecurityGroupViewParameters parameters, Context context);

    /**
     * Initiate troubleshooting on a specified resource.
     *
     * @param parameters Parameters that define the resource to troubleshoot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return troubleshooting information gained from specified resource.
     */
    TroubleshootingResult getTroubleshooting(TroubleshootingParameters parameters);

    /**
     * Initiate troubleshooting on a specified resource.
     *
     * @param parameters Parameters that define the resource to troubleshoot.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return troubleshooting information gained from specified resource.
     */
    TroubleshootingResult getTroubleshooting(TroubleshootingParameters parameters, Context context);

    /**
     * Get the last completed troubleshooting result on a specified resource.
     *
     * @param parameters Parameters that define the resource to query the troubleshooting result.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the last completed troubleshooting result on a specified resource.
     */
    TroubleshootingResult getTroubleshootingResult(QueryTroubleshootingParameters parameters);

    /**
     * Get the last completed troubleshooting result on a specified resource.
     *
     * @param parameters Parameters that define the resource to query the troubleshooting result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the last completed troubleshooting result on a specified resource.
     */
    TroubleshootingResult getTroubleshootingResult(QueryTroubleshootingParameters parameters, Context context);

    /**
     * Configures flow log and traffic analytics (optional) on a specified resource.
     *
     * @param parameters Parameters that define the configuration of flow log.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information on the configuration of flow log and traffic analytics (optional).
     */
    FlowLogInformation setFlowLogConfiguration(FlowLogInformationInner parameters);

    /**
     * Configures flow log and traffic analytics (optional) on a specified resource.
     *
     * @param parameters Parameters that define the configuration of flow log.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information on the configuration of flow log and traffic analytics (optional).
     */
    FlowLogInformation setFlowLogConfiguration(FlowLogInformationInner parameters, Context context);

    /**
     * Queries status of flow log and traffic analytics (optional) on a specified resource.
     *
     * @param parameters Parameters that define a resource to query flow log and traffic analytics (optional) status.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information on the configuration of flow log and traffic analytics (optional).
     */
    FlowLogInformation getFlowLogStatus(FlowLogStatusParameters parameters);

    /**
     * Queries status of flow log and traffic analytics (optional) on a specified resource.
     *
     * @param parameters Parameters that define a resource to query flow log and traffic analytics (optional) status.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information on the configuration of flow log and traffic analytics (optional).
     */
    FlowLogInformation getFlowLogStatus(FlowLogStatusParameters parameters, Context context);

    /**
     * Verifies the possibility of establishing a direct TCP connection from a virtual machine to a given endpoint
     * including another VM or an arbitrary remote server.
     *
     * @param parameters Parameters that determine how the connectivity check will be performed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information on the connectivity status.
     */
    ConnectivityInformation checkConnectivity(ConnectivityParameters parameters);

    /**
     * Verifies the possibility of establishing a direct TCP connection from a virtual machine to a given endpoint
     * including another VM or an arbitrary remote server.
     *
     * @param parameters Parameters that determine how the connectivity check will be performed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information on the connectivity status.
     */
    ConnectivityInformation checkConnectivity(ConnectivityParameters parameters, Context context);

    /**
     * NOTE: This feature is currently in preview and still being tested for stability. Gets the relative latency score
     * for internet service providers from a specified location to Azure regions.
     *
     * @param parameters Parameters that determine Azure reachability report configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure reachability report details.
     */
    AzureReachabilityReport getAzureReachabilityReport(AzureReachabilityReportParameters parameters);

    /**
     * NOTE: This feature is currently in preview and still being tested for stability. Gets the relative latency score
     * for internet service providers from a specified location to Azure regions.
     *
     * @param parameters Parameters that determine Azure reachability report configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure reachability report details.
     */
    AzureReachabilityReport getAzureReachabilityReport(AzureReachabilityReportParameters parameters, Context context);

    /**
     * NOTE: This feature is currently in preview and still being tested for stability. Lists all available internet
     * service providers for a specified Azure region.
     *
     * @param parameters Parameters that scope the list of available providers.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of available countries with details.
     */
    AvailableProvidersList listAvailableProviders(AvailableProvidersListParameters parameters);

    /**
     * NOTE: This feature is currently in preview and still being tested for stability. Lists all available internet
     * service providers for a specified Azure region.
     *
     * @param parameters Parameters that scope the list of available providers.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of available countries with details.
     */
    AvailableProvidersList listAvailableProviders(AvailableProvidersListParameters parameters, Context context);

    /**
     * Gets Network Configuration Diagnostic data to help customers understand and debug network behavior. It provides
     * detailed information on what security rules were applied to a specified traffic flow and the result of evaluating
     * these rules. Customers must provide details of a flow like source, destination, protocol, etc. The API returns
     * whether traffic was allowed or denied, the rules evaluated for the specified flow and the evaluation results.
     *
     * @param parameters Parameters to get network configuration diagnostic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Configuration Diagnostic data to help customers understand and debug network behavior.
     */
    NetworkConfigurationDiagnosticResponse getNetworkConfigurationDiagnostic(
        NetworkConfigurationDiagnosticParameters parameters);

    /**
     * Gets Network Configuration Diagnostic data to help customers understand and debug network behavior. It provides
     * detailed information on what security rules were applied to a specified traffic flow and the result of evaluating
     * these rules. Customers must provide details of a flow like source, destination, protocol, etc. The API returns
     * whether traffic was allowed or denied, the rules evaluated for the specified flow and the evaluation results.
     *
     * @param parameters Parameters to get network configuration diagnostic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Configuration Diagnostic data to help customers understand and debug network behavior.
     */
    NetworkConfigurationDiagnosticResponse getNetworkConfigurationDiagnostic(
        NetworkConfigurationDiagnosticParameters parameters, Context context);
}
