// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.LoadBalancersClient;
import com.azure.resourcemanager.network.generated.fluent.models.BackendAddressInboundNatRulePortMappingsInner;
import com.azure.resourcemanager.network.generated.fluent.models.LoadBalancerInner;
import com.azure.resourcemanager.network.generated.models.BackendAddressInboundNatRulePortMappings;
import com.azure.resourcemanager.network.generated.models.LoadBalancer;
import com.azure.resourcemanager.network.generated.models.LoadBalancerVipSwapRequest;
import com.azure.resourcemanager.network.generated.models.LoadBalancers;
import com.azure.resourcemanager.network.generated.models.QueryInboundNatRulePortMappingRequest;

public final class LoadBalancersImpl implements LoadBalancers {
    private static final ClientLogger LOGGER = new ClientLogger(LoadBalancersImpl.class);

    private final LoadBalancersClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public LoadBalancersImpl(
        LoadBalancersClient innerClient, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String loadBalancerName) {
        this.serviceClient().delete(resourceGroupName, loadBalancerName);
    }

    public void delete(String resourceGroupName, String loadBalancerName, Context context) {
        this.serviceClient().delete(resourceGroupName, loadBalancerName, context);
    }

    public LoadBalancer getByResourceGroup(String resourceGroupName, String loadBalancerName) {
        LoadBalancerInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, loadBalancerName);
        if (inner != null) {
            return new LoadBalancerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LoadBalancer> getByResourceGroupWithResponse(
        String resourceGroupName, String loadBalancerName, String expand, Context context) {
        Response<LoadBalancerInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, loadBalancerName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LoadBalancerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<LoadBalancer> list() {
        PagedIterable<LoadBalancerInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new LoadBalancerImpl(inner1, this.manager()));
    }

    public PagedIterable<LoadBalancer> list(Context context) {
        PagedIterable<LoadBalancerInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new LoadBalancerImpl(inner1, this.manager()));
    }

    public PagedIterable<LoadBalancer> listByResourceGroup(String resourceGroupName) {
        PagedIterable<LoadBalancerInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new LoadBalancerImpl(inner1, this.manager()));
    }

    public PagedIterable<LoadBalancer> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<LoadBalancerInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new LoadBalancerImpl(inner1, this.manager()));
    }

    public void swapPublicIpAddresses(String location, LoadBalancerVipSwapRequest parameters) {
        this.serviceClient().swapPublicIpAddresses(location, parameters);
    }

    public void swapPublicIpAddresses(String location, LoadBalancerVipSwapRequest parameters, Context context) {
        this.serviceClient().swapPublicIpAddresses(location, parameters, context);
    }

    public BackendAddressInboundNatRulePortMappings listInboundNatRulePortMappings(
        String groupName,
        String loadBalancerName,
        String backendPoolName,
        QueryInboundNatRulePortMappingRequest parameters) {
        BackendAddressInboundNatRulePortMappingsInner inner =
            this
                .serviceClient()
                .listInboundNatRulePortMappings(groupName, loadBalancerName, backendPoolName, parameters);
        if (inner != null) {
            return new BackendAddressInboundNatRulePortMappingsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BackendAddressInboundNatRulePortMappings listInboundNatRulePortMappings(
        String groupName,
        String loadBalancerName,
        String backendPoolName,
        QueryInboundNatRulePortMappingRequest parameters,
        Context context) {
        BackendAddressInboundNatRulePortMappingsInner inner =
            this
                .serviceClient()
                .listInboundNatRulePortMappings(groupName, loadBalancerName, backendPoolName, parameters, context);
        if (inner != null) {
            return new BackendAddressInboundNatRulePortMappingsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public LoadBalancer getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String loadBalancerName = Utils.getValueFromIdByName(id, "loadBalancers");
        if (loadBalancerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'loadBalancers'.", id)));
        }
        String localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, loadBalancerName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<LoadBalancer> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String loadBalancerName = Utils.getValueFromIdByName(id, "loadBalancers");
        if (loadBalancerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'loadBalancers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, loadBalancerName, expand, context);
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
        String loadBalancerName = Utils.getValueFromIdByName(id, "loadBalancers");
        if (loadBalancerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'loadBalancers'.", id)));
        }
        this.delete(resourceGroupName, loadBalancerName, Context.NONE);
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
        String loadBalancerName = Utils.getValueFromIdByName(id, "loadBalancers");
        if (loadBalancerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'loadBalancers'.", id)));
        }
        this.delete(resourceGroupName, loadBalancerName, context);
    }

    private LoadBalancersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public LoadBalancerImpl define(String name) {
        return new LoadBalancerImpl(name, this.manager());
    }
}
