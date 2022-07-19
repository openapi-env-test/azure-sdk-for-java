// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.NetworkWatchersClient;
import com.azure.resourcemanager.network.generated.fluent.models.AvailableProvidersListInner;
import com.azure.resourcemanager.network.generated.fluent.models.AzureReachabilityReportInner;
import com.azure.resourcemanager.network.generated.fluent.models.ConnectivityInformationInner;
import com.azure.resourcemanager.network.generated.fluent.models.FlowLogInformationInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkConfigurationDiagnosticResponseInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkWatcherInner;
import com.azure.resourcemanager.network.generated.fluent.models.NextHopResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.SecurityGroupViewResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.TopologyInner;
import com.azure.resourcemanager.network.generated.fluent.models.TroubleshootingResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.VerificationIpFlowResultInner;
import com.azure.resourcemanager.network.generated.models.AvailableProvidersList;
import com.azure.resourcemanager.network.generated.models.AvailableProvidersListParameters;
import com.azure.resourcemanager.network.generated.models.AzureReachabilityReport;
import com.azure.resourcemanager.network.generated.models.AzureReachabilityReportParameters;
import com.azure.resourcemanager.network.generated.models.ConnectivityInformation;
import com.azure.resourcemanager.network.generated.models.ConnectivityParameters;
import com.azure.resourcemanager.network.generated.models.FlowLogInformation;
import com.azure.resourcemanager.network.generated.models.FlowLogStatusParameters;
import com.azure.resourcemanager.network.generated.models.NetworkConfigurationDiagnosticParameters;
import com.azure.resourcemanager.network.generated.models.NetworkConfigurationDiagnosticResponse;
import com.azure.resourcemanager.network.generated.models.NetworkWatcher;
import com.azure.resourcemanager.network.generated.models.NetworkWatchers;
import com.azure.resourcemanager.network.generated.models.NextHopParameters;
import com.azure.resourcemanager.network.generated.models.NextHopResult;
import com.azure.resourcemanager.network.generated.models.QueryTroubleshootingParameters;
import com.azure.resourcemanager.network.generated.models.SecurityGroupViewParameters;
import com.azure.resourcemanager.network.generated.models.SecurityGroupViewResult;
import com.azure.resourcemanager.network.generated.models.Topology;
import com.azure.resourcemanager.network.generated.models.TopologyParameters;
import com.azure.resourcemanager.network.generated.models.TroubleshootingParameters;
import com.azure.resourcemanager.network.generated.models.TroubleshootingResult;
import com.azure.resourcemanager.network.generated.models.VerificationIpFlowParameters;
import com.azure.resourcemanager.network.generated.models.VerificationIpFlowResult;

public final class NetworkWatchersImpl implements NetworkWatchers {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkWatchersImpl.class);

    private final NetworkWatchersClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public NetworkWatchersImpl(
        NetworkWatchersClient innerClient, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public NetworkWatcher getByResourceGroup(String resourceGroupName, String networkWatcherName) {
        NetworkWatcherInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, networkWatcherName);
        if (inner != null) {
            return new NetworkWatcherImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkWatcher> getByResourceGroupWithResponse(
        String resourceGroupName, String networkWatcherName, Context context) {
        Response<NetworkWatcherInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, networkWatcherName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkWatcherImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String networkWatcherName) {
        this.serviceClient().delete(resourceGroupName, networkWatcherName);
    }

    public void delete(String resourceGroupName, String networkWatcherName, Context context) {
        this.serviceClient().delete(resourceGroupName, networkWatcherName, context);
    }

    public PagedIterable<NetworkWatcher> listByResourceGroup(String resourceGroupName) {
        PagedIterable<NetworkWatcherInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new NetworkWatcherImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkWatcher> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<NetworkWatcherInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new NetworkWatcherImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkWatcher> list() {
        PagedIterable<NetworkWatcherInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new NetworkWatcherImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkWatcher> list(Context context) {
        PagedIterable<NetworkWatcherInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new NetworkWatcherImpl(inner1, this.manager()));
    }

    public Topology getTopology(String resourceGroupName, String networkWatcherName, TopologyParameters parameters) {
        TopologyInner inner = this.serviceClient().getTopology(resourceGroupName, networkWatcherName, parameters);
        if (inner != null) {
            return new TopologyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Topology> getTopologyWithResponse(
        String resourceGroupName, String networkWatcherName, TopologyParameters parameters, Context context) {
        Response<TopologyInner> inner =
            this.serviceClient().getTopologyWithResponse(resourceGroupName, networkWatcherName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TopologyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VerificationIpFlowResult verifyIpFlow(
        String resourceGroupName, String networkWatcherName, VerificationIpFlowParameters parameters) {
        VerificationIpFlowResultInner inner =
            this.serviceClient().verifyIpFlow(resourceGroupName, networkWatcherName, parameters);
        if (inner != null) {
            return new VerificationIpFlowResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VerificationIpFlowResult verifyIpFlow(
        String resourceGroupName, String networkWatcherName, VerificationIpFlowParameters parameters, Context context) {
        VerificationIpFlowResultInner inner =
            this.serviceClient().verifyIpFlow(resourceGroupName, networkWatcherName, parameters, context);
        if (inner != null) {
            return new VerificationIpFlowResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NextHopResult getNextHop(String resourceGroupName, String networkWatcherName, NextHopParameters parameters) {
        NextHopResultInner inner = this.serviceClient().getNextHop(resourceGroupName, networkWatcherName, parameters);
        if (inner != null) {
            return new NextHopResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NextHopResult getNextHop(
        String resourceGroupName, String networkWatcherName, NextHopParameters parameters, Context context) {
        NextHopResultInner inner =
            this.serviceClient().getNextHop(resourceGroupName, networkWatcherName, parameters, context);
        if (inner != null) {
            return new NextHopResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public SecurityGroupViewResult getVMSecurityRules(
        String resourceGroupName, String networkWatcherName, SecurityGroupViewParameters parameters) {
        SecurityGroupViewResultInner inner =
            this.serviceClient().getVMSecurityRules(resourceGroupName, networkWatcherName, parameters);
        if (inner != null) {
            return new SecurityGroupViewResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public SecurityGroupViewResult getVMSecurityRules(
        String resourceGroupName, String networkWatcherName, SecurityGroupViewParameters parameters, Context context) {
        SecurityGroupViewResultInner inner =
            this.serviceClient().getVMSecurityRules(resourceGroupName, networkWatcherName, parameters, context);
        if (inner != null) {
            return new SecurityGroupViewResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TroubleshootingResult getTroubleshooting(
        String resourceGroupName, String networkWatcherName, TroubleshootingParameters parameters) {
        TroubleshootingResultInner inner =
            this.serviceClient().getTroubleshooting(resourceGroupName, networkWatcherName, parameters);
        if (inner != null) {
            return new TroubleshootingResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TroubleshootingResult getTroubleshooting(
        String resourceGroupName, String networkWatcherName, TroubleshootingParameters parameters, Context context) {
        TroubleshootingResultInner inner =
            this.serviceClient().getTroubleshooting(resourceGroupName, networkWatcherName, parameters, context);
        if (inner != null) {
            return new TroubleshootingResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TroubleshootingResult getTroubleshootingResult(
        String resourceGroupName, String networkWatcherName, QueryTroubleshootingParameters parameters) {
        TroubleshootingResultInner inner =
            this.serviceClient().getTroubleshootingResult(resourceGroupName, networkWatcherName, parameters);
        if (inner != null) {
            return new TroubleshootingResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TroubleshootingResult getTroubleshootingResult(
        String resourceGroupName,
        String networkWatcherName,
        QueryTroubleshootingParameters parameters,
        Context context) {
        TroubleshootingResultInner inner =
            this.serviceClient().getTroubleshootingResult(resourceGroupName, networkWatcherName, parameters, context);
        if (inner != null) {
            return new TroubleshootingResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FlowLogInformation setFlowLogConfiguration(
        String resourceGroupName, String networkWatcherName, FlowLogInformationInner parameters) {
        FlowLogInformationInner inner =
            this.serviceClient().setFlowLogConfiguration(resourceGroupName, networkWatcherName, parameters);
        if (inner != null) {
            return new FlowLogInformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FlowLogInformation setFlowLogConfiguration(
        String resourceGroupName, String networkWatcherName, FlowLogInformationInner parameters, Context context) {
        FlowLogInformationInner inner =
            this.serviceClient().setFlowLogConfiguration(resourceGroupName, networkWatcherName, parameters, context);
        if (inner != null) {
            return new FlowLogInformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FlowLogInformation getFlowLogStatus(
        String resourceGroupName, String networkWatcherName, FlowLogStatusParameters parameters) {
        FlowLogInformationInner inner =
            this.serviceClient().getFlowLogStatus(resourceGroupName, networkWatcherName, parameters);
        if (inner != null) {
            return new FlowLogInformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FlowLogInformation getFlowLogStatus(
        String resourceGroupName, String networkWatcherName, FlowLogStatusParameters parameters, Context context) {
        FlowLogInformationInner inner =
            this.serviceClient().getFlowLogStatus(resourceGroupName, networkWatcherName, parameters, context);
        if (inner != null) {
            return new FlowLogInformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ConnectivityInformation checkConnectivity(
        String resourceGroupName, String networkWatcherName, ConnectivityParameters parameters) {
        ConnectivityInformationInner inner =
            this.serviceClient().checkConnectivity(resourceGroupName, networkWatcherName, parameters);
        if (inner != null) {
            return new ConnectivityInformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ConnectivityInformation checkConnectivity(
        String resourceGroupName, String networkWatcherName, ConnectivityParameters parameters, Context context) {
        ConnectivityInformationInner inner =
            this.serviceClient().checkConnectivity(resourceGroupName, networkWatcherName, parameters, context);
        if (inner != null) {
            return new ConnectivityInformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AzureReachabilityReport getAzureReachabilityReport(
        String resourceGroupName, String networkWatcherName, AzureReachabilityReportParameters parameters) {
        AzureReachabilityReportInner inner =
            this.serviceClient().getAzureReachabilityReport(resourceGroupName, networkWatcherName, parameters);
        if (inner != null) {
            return new AzureReachabilityReportImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AzureReachabilityReport getAzureReachabilityReport(
        String resourceGroupName,
        String networkWatcherName,
        AzureReachabilityReportParameters parameters,
        Context context) {
        AzureReachabilityReportInner inner =
            this.serviceClient().getAzureReachabilityReport(resourceGroupName, networkWatcherName, parameters, context);
        if (inner != null) {
            return new AzureReachabilityReportImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AvailableProvidersList listAvailableProviders(
        String resourceGroupName, String networkWatcherName, AvailableProvidersListParameters parameters) {
        AvailableProvidersListInner inner =
            this.serviceClient().listAvailableProviders(resourceGroupName, networkWatcherName, parameters);
        if (inner != null) {
            return new AvailableProvidersListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AvailableProvidersList listAvailableProviders(
        String resourceGroupName,
        String networkWatcherName,
        AvailableProvidersListParameters parameters,
        Context context) {
        AvailableProvidersListInner inner =
            this.serviceClient().listAvailableProviders(resourceGroupName, networkWatcherName, parameters, context);
        if (inner != null) {
            return new AvailableProvidersListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NetworkConfigurationDiagnosticResponse getNetworkConfigurationDiagnostic(
        String resourceGroupName, String networkWatcherName, NetworkConfigurationDiagnosticParameters parameters) {
        NetworkConfigurationDiagnosticResponseInner inner =
            this.serviceClient().getNetworkConfigurationDiagnostic(resourceGroupName, networkWatcherName, parameters);
        if (inner != null) {
            return new NetworkConfigurationDiagnosticResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NetworkConfigurationDiagnosticResponse getNetworkConfigurationDiagnostic(
        String resourceGroupName,
        String networkWatcherName,
        NetworkConfigurationDiagnosticParameters parameters,
        Context context) {
        NetworkConfigurationDiagnosticResponseInner inner =
            this
                .serviceClient()
                .getNetworkConfigurationDiagnostic(resourceGroupName, networkWatcherName, parameters, context);
        if (inner != null) {
            return new NetworkConfigurationDiagnosticResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NetworkWatcher getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkWatcherName = Utils.getValueFromIdByName(id, "networkWatchers");
        if (networkWatcherName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkWatchers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkWatcherName, Context.NONE).getValue();
    }

    public Response<NetworkWatcher> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkWatcherName = Utils.getValueFromIdByName(id, "networkWatchers");
        if (networkWatcherName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkWatchers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkWatcherName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkWatcherName = Utils.getValueFromIdByName(id, "networkWatchers");
        if (networkWatcherName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkWatchers'.", id)));
        }
        this.delete(resourceGroupName, networkWatcherName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkWatcherName = Utils.getValueFromIdByName(id, "networkWatchers");
        if (networkWatcherName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkWatchers'.", id)));
        }
        this.delete(resourceGroupName, networkWatcherName, context);
    }

    private NetworkWatchersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public NetworkWatcherImpl define(String name) {
        return new NetworkWatcherImpl(name, this.manager());
    }
}
