// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.FlowLogInformationInner;

/** Resource collection API of NetworkWatchers. */
public interface NetworkWatchers {
    /**
     * Gets the specified network watcher by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network watcher by resource group.
     */
    NetworkWatcher getByResourceGroup(String resourceGroupName, String networkWatcherName);

    /**
     * Gets the specified network watcher by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network watcher by resource group.
     */
    Response<NetworkWatcher> getByResourceGroupWithResponse(
        String resourceGroupName, String networkWatcherName, Context context);

    /**
     * Deletes the specified network watcher resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String networkWatcherName);

    /**
     * Deletes the specified network watcher resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkWatcherName, Context context);

    /**
     * Gets all network watchers by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network watchers by resource group.
     */
    PagedIterable<NetworkWatcher> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all network watchers by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network watchers by resource group.
     */
    PagedIterable<NetworkWatcher> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all network watchers by subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network watchers by subscription.
     */
    PagedIterable<NetworkWatcher> list();

    /**
     * Gets all network watchers by subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network watchers by subscription.
     */
    PagedIterable<NetworkWatcher> list(Context context);

    /**
     * Gets the current network topology by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param parameters Parameters that define the representation of topology.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current network topology by resource group.
     */
    Topology getTopology(String resourceGroupName, String networkWatcherName, TopologyParameters parameters);

    /**
     * Gets the current network topology by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param parameters Parameters that define the representation of topology.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current network topology by resource group.
     */
    Response<Topology> getTopologyWithResponse(
        String resourceGroupName, String networkWatcherName, TopologyParameters parameters, Context context);

    /**
     * Verify IP flow from the specified VM to a location given the currently configured NSG rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param parameters Parameters that define the IP flow to be verified.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of IP flow verification on the target resource.
     */
    VerificationIpFlowResult verifyIpFlow(
        String resourceGroupName, String networkWatcherName, VerificationIpFlowParameters parameters);

    /**
     * Verify IP flow from the specified VM to a location given the currently configured NSG rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param parameters Parameters that define the IP flow to be verified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of IP flow verification on the target resource.
     */
    VerificationIpFlowResult verifyIpFlow(
        String resourceGroupName, String networkWatcherName, VerificationIpFlowParameters parameters, Context context);

    /**
     * Gets the next hop from the specified VM.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param parameters Parameters that define the source and destination endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the next hop from the specified VM.
     */
    NextHopResult getNextHop(String resourceGroupName, String networkWatcherName, NextHopParameters parameters);

    /**
     * Gets the next hop from the specified VM.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param parameters Parameters that define the source and destination endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the next hop from the specified VM.
     */
    NextHopResult getNextHop(
        String resourceGroupName, String networkWatcherName, NextHopParameters parameters, Context context);

    /**
     * Gets the configured and effective security group rules on the specified VM.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param parameters Parameters that define the VM to check security groups for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configured and effective security group rules on the specified VM.
     */
    SecurityGroupViewResult getVMSecurityRules(
        String resourceGroupName, String networkWatcherName, SecurityGroupViewParameters parameters);

    /**
     * Gets the configured and effective security group rules on the specified VM.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param parameters Parameters that define the VM to check security groups for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configured and effective security group rules on the specified VM.
     */
    SecurityGroupViewResult getVMSecurityRules(
        String resourceGroupName, String networkWatcherName, SecurityGroupViewParameters parameters, Context context);

    /**
     * Initiate troubleshooting on a specified resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that define the resource to troubleshoot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return troubleshooting information gained from specified resource.
     */
    TroubleshootingResult getTroubleshooting(
        String resourceGroupName, String networkWatcherName, TroubleshootingParameters parameters);

    /**
     * Initiate troubleshooting on a specified resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that define the resource to troubleshoot.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return troubleshooting information gained from specified resource.
     */
    TroubleshootingResult getTroubleshooting(
        String resourceGroupName, String networkWatcherName, TroubleshootingParameters parameters, Context context);

    /**
     * Get the last completed troubleshooting result on a specified resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that define the resource to query the troubleshooting result.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the last completed troubleshooting result on a specified resource.
     */
    TroubleshootingResult getTroubleshootingResult(
        String resourceGroupName, String networkWatcherName, QueryTroubleshootingParameters parameters);

    /**
     * Get the last completed troubleshooting result on a specified resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that define the resource to query the troubleshooting result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the last completed troubleshooting result on a specified resource.
     */
    TroubleshootingResult getTroubleshootingResult(
        String resourceGroupName,
        String networkWatcherName,
        QueryTroubleshootingParameters parameters,
        Context context);

    /**
     * Configures flow log and traffic analytics (optional) on a specified resource.
     *
     * @param resourceGroupName The name of the network watcher resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that define the configuration of flow log.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information on the configuration of flow log and traffic analytics (optional).
     */
    FlowLogInformation setFlowLogConfiguration(
        String resourceGroupName, String networkWatcherName, FlowLogInformationInner parameters);

    /**
     * Configures flow log and traffic analytics (optional) on a specified resource.
     *
     * @param resourceGroupName The name of the network watcher resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that define the configuration of flow log.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information on the configuration of flow log and traffic analytics (optional).
     */
    FlowLogInformation setFlowLogConfiguration(
        String resourceGroupName, String networkWatcherName, FlowLogInformationInner parameters, Context context);

    /**
     * Queries status of flow log and traffic analytics (optional) on a specified resource.
     *
     * @param resourceGroupName The name of the network watcher resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that define a resource to query flow log and traffic analytics (optional) status.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information on the configuration of flow log and traffic analytics (optional).
     */
    FlowLogInformation getFlowLogStatus(
        String resourceGroupName, String networkWatcherName, FlowLogStatusParameters parameters);

    /**
     * Queries status of flow log and traffic analytics (optional) on a specified resource.
     *
     * @param resourceGroupName The name of the network watcher resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that define a resource to query flow log and traffic analytics (optional) status.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information on the configuration of flow log and traffic analytics (optional).
     */
    FlowLogInformation getFlowLogStatus(
        String resourceGroupName, String networkWatcherName, FlowLogStatusParameters parameters, Context context);

    /**
     * Verifies the possibility of establishing a direct TCP connection from a virtual machine to a given endpoint
     * including another VM or an arbitrary remote server.
     *
     * @param resourceGroupName The name of the network watcher resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that determine how the connectivity check will be performed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information on the connectivity status.
     */
    ConnectivityInformation checkConnectivity(
        String resourceGroupName, String networkWatcherName, ConnectivityParameters parameters);

    /**
     * Verifies the possibility of establishing a direct TCP connection from a virtual machine to a given endpoint
     * including another VM or an arbitrary remote server.
     *
     * @param resourceGroupName The name of the network watcher resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that determine how the connectivity check will be performed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information on the connectivity status.
     */
    ConnectivityInformation checkConnectivity(
        String resourceGroupName, String networkWatcherName, ConnectivityParameters parameters, Context context);

    /**
     * NOTE: This feature is currently in preview and still being tested for stability. Gets the relative latency score
     * for internet service providers from a specified location to Azure regions.
     *
     * @param resourceGroupName The name of the network watcher resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that determine Azure reachability report configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure reachability report details.
     */
    AzureReachabilityReport getAzureReachabilityReport(
        String resourceGroupName, String networkWatcherName, AzureReachabilityReportParameters parameters);

    /**
     * NOTE: This feature is currently in preview and still being tested for stability. Gets the relative latency score
     * for internet service providers from a specified location to Azure regions.
     *
     * @param resourceGroupName The name of the network watcher resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that determine Azure reachability report configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure reachability report details.
     */
    AzureReachabilityReport getAzureReachabilityReport(
        String resourceGroupName,
        String networkWatcherName,
        AzureReachabilityReportParameters parameters,
        Context context);

    /**
     * NOTE: This feature is currently in preview and still being tested for stability. Lists all available internet
     * service providers for a specified Azure region.
     *
     * @param resourceGroupName The name of the network watcher resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that scope the list of available providers.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of available countries with details.
     */
    AvailableProvidersList listAvailableProviders(
        String resourceGroupName, String networkWatcherName, AvailableProvidersListParameters parameters);

    /**
     * NOTE: This feature is currently in preview and still being tested for stability. Lists all available internet
     * service providers for a specified Azure region.
     *
     * @param resourceGroupName The name of the network watcher resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that scope the list of available providers.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of available countries with details.
     */
    AvailableProvidersList listAvailableProviders(
        String resourceGroupName,
        String networkWatcherName,
        AvailableProvidersListParameters parameters,
        Context context);

    /**
     * Gets Network Configuration Diagnostic data to help customers understand and debug network behavior. It provides
     * detailed information on what security rules were applied to a specified traffic flow and the result of evaluating
     * these rules. Customers must provide details of a flow like source, destination, protocol, etc. The API returns
     * whether traffic was allowed or denied, the rules evaluated for the specified flow and the evaluation results.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param parameters Parameters to get network configuration diagnostic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Configuration Diagnostic data to help customers understand and debug network behavior.
     */
    NetworkConfigurationDiagnosticResponse getNetworkConfigurationDiagnostic(
        String resourceGroupName, String networkWatcherName, NetworkConfigurationDiagnosticParameters parameters);

    /**
     * Gets Network Configuration Diagnostic data to help customers understand and debug network behavior. It provides
     * detailed information on what security rules were applied to a specified traffic flow and the result of evaluating
     * these rules. Customers must provide details of a flow like source, destination, protocol, etc. The API returns
     * whether traffic was allowed or denied, the rules evaluated for the specified flow and the evaluation results.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param parameters Parameters to get network configuration diagnostic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Configuration Diagnostic data to help customers understand and debug network behavior.
     */
    NetworkConfigurationDiagnosticResponse getNetworkConfigurationDiagnostic(
        String resourceGroupName,
        String networkWatcherName,
        NetworkConfigurationDiagnosticParameters parameters,
        Context context);

    /**
     * Gets the specified network watcher by resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network watcher by resource group.
     */
    NetworkWatcher getById(String id);

    /**
     * Gets the specified network watcher by resource group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network watcher by resource group.
     */
    Response<NetworkWatcher> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified network watcher resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified network watcher resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new NetworkWatcher resource.
     *
     * @param name resource name.
     * @return the first stage of the new NetworkWatcher definition.
     */
    NetworkWatcher.DefinitionStages.Blank define(String name);
}
