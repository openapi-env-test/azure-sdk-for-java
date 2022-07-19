// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.FirewallPolicyRuleCollectionGroupsClient;
import com.azure.resourcemanager.network.generated.fluent.models.FirewallPolicyRuleCollectionGroupInner;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyRuleCollectionGroup;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyRuleCollectionGroups;

public final class FirewallPolicyRuleCollectionGroupsImpl implements FirewallPolicyRuleCollectionGroups {
    private static final ClientLogger LOGGER = new ClientLogger(FirewallPolicyRuleCollectionGroupsImpl.class);

    private final FirewallPolicyRuleCollectionGroupsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public FirewallPolicyRuleCollectionGroupsImpl(
        FirewallPolicyRuleCollectionGroupsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String firewallPolicyName, String ruleCollectionGroupName) {
        this.serviceClient().delete(resourceGroupName, firewallPolicyName, ruleCollectionGroupName);
    }

    public void delete(
        String resourceGroupName, String firewallPolicyName, String ruleCollectionGroupName, Context context) {
        this.serviceClient().delete(resourceGroupName, firewallPolicyName, ruleCollectionGroupName, context);
    }

    public FirewallPolicyRuleCollectionGroup get(
        String resourceGroupName, String firewallPolicyName, String ruleCollectionGroupName) {
        FirewallPolicyRuleCollectionGroupInner inner =
            this.serviceClient().get(resourceGroupName, firewallPolicyName, ruleCollectionGroupName);
        if (inner != null) {
            return new FirewallPolicyRuleCollectionGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<FirewallPolicyRuleCollectionGroup> getWithResponse(
        String resourceGroupName, String firewallPolicyName, String ruleCollectionGroupName, Context context) {
        Response<FirewallPolicyRuleCollectionGroupInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, firewallPolicyName, ruleCollectionGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new FirewallPolicyRuleCollectionGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<FirewallPolicyRuleCollectionGroup> list(String resourceGroupName, String firewallPolicyName) {
        PagedIterable<FirewallPolicyRuleCollectionGroupInner> inner =
            this.serviceClient().list(resourceGroupName, firewallPolicyName);
        return Utils.mapPage(inner, inner1 -> new FirewallPolicyRuleCollectionGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<FirewallPolicyRuleCollectionGroup> list(
        String resourceGroupName, String firewallPolicyName, Context context) {
        PagedIterable<FirewallPolicyRuleCollectionGroupInner> inner =
            this.serviceClient().list(resourceGroupName, firewallPolicyName, context);
        return Utils.mapPage(inner, inner1 -> new FirewallPolicyRuleCollectionGroupImpl(inner1, this.manager()));
    }

    public FirewallPolicyRuleCollectionGroup getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String firewallPolicyName = Utils.getValueFromIdByName(id, "firewallPolicies");
        if (firewallPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'firewallPolicies'.", id)));
        }
        String ruleCollectionGroupName = Utils.getValueFromIdByName(id, "ruleCollectionGroups");
        if (ruleCollectionGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'ruleCollectionGroups'.",
                                id)));
        }
        return this
            .getWithResponse(resourceGroupName, firewallPolicyName, ruleCollectionGroupName, Context.NONE)
            .getValue();
    }

    public Response<FirewallPolicyRuleCollectionGroup> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String firewallPolicyName = Utils.getValueFromIdByName(id, "firewallPolicies");
        if (firewallPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'firewallPolicies'.", id)));
        }
        String ruleCollectionGroupName = Utils.getValueFromIdByName(id, "ruleCollectionGroups");
        if (ruleCollectionGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'ruleCollectionGroups'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, firewallPolicyName, ruleCollectionGroupName, context);
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
        String firewallPolicyName = Utils.getValueFromIdByName(id, "firewallPolicies");
        if (firewallPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'firewallPolicies'.", id)));
        }
        String ruleCollectionGroupName = Utils.getValueFromIdByName(id, "ruleCollectionGroups");
        if (ruleCollectionGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'ruleCollectionGroups'.",
                                id)));
        }
        this.delete(resourceGroupName, firewallPolicyName, ruleCollectionGroupName, Context.NONE);
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
        String firewallPolicyName = Utils.getValueFromIdByName(id, "firewallPolicies");
        if (firewallPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'firewallPolicies'.", id)));
        }
        String ruleCollectionGroupName = Utils.getValueFromIdByName(id, "ruleCollectionGroups");
        if (ruleCollectionGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'ruleCollectionGroups'.",
                                id)));
        }
        this.delete(resourceGroupName, firewallPolicyName, ruleCollectionGroupName, context);
    }

    private FirewallPolicyRuleCollectionGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public FirewallPolicyRuleCollectionGroupImpl define(String name) {
        return new FirewallPolicyRuleCollectionGroupImpl(name, this.manager());
    }
}
