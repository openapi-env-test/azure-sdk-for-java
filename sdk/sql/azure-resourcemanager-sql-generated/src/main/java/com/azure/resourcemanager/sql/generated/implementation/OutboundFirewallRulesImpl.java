// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.OutboundFirewallRulesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.OutboundFirewallRuleInner;
import com.azure.resourcemanager.sql.generated.models.OutboundFirewallRule;
import com.azure.resourcemanager.sql.generated.models.OutboundFirewallRules;

public final class OutboundFirewallRulesImpl implements OutboundFirewallRules {
    private static final ClientLogger LOGGER = new ClientLogger(OutboundFirewallRulesImpl.class);

    private final OutboundFirewallRulesClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public OutboundFirewallRulesImpl(
        OutboundFirewallRulesClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OutboundFirewallRule get(String resourceGroupName, String serverName, String outboundRuleFqdn) {
        OutboundFirewallRuleInner inner = this.serviceClient().get(resourceGroupName, serverName, outboundRuleFqdn);
        if (inner != null) {
            return new OutboundFirewallRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OutboundFirewallRule> getWithResponse(
        String resourceGroupName, String serverName, String outboundRuleFqdn, Context context) {
        Response<OutboundFirewallRuleInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, outboundRuleFqdn, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OutboundFirewallRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serverName, String outboundRuleFqdn) {
        this.serviceClient().delete(resourceGroupName, serverName, outboundRuleFqdn);
    }

    public void delete(String resourceGroupName, String serverName, String outboundRuleFqdn, Context context) {
        this.serviceClient().delete(resourceGroupName, serverName, outboundRuleFqdn, context);
    }

    public PagedIterable<OutboundFirewallRule> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<OutboundFirewallRuleInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new OutboundFirewallRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<OutboundFirewallRule> listByServer(
        String resourceGroupName, String serverName, Context context) {
        PagedIterable<OutboundFirewallRuleInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new OutboundFirewallRuleImpl(inner1, this.manager()));
    }

    public OutboundFirewallRule getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String outboundRuleFqdn = Utils.getValueFromIdByName(id, "outboundFirewallRules");
        if (outboundRuleFqdn == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'outboundFirewallRules'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, outboundRuleFqdn, Context.NONE).getValue();
    }

    public Response<OutboundFirewallRule> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String outboundRuleFqdn = Utils.getValueFromIdByName(id, "outboundFirewallRules");
        if (outboundRuleFqdn == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'outboundFirewallRules'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, outboundRuleFqdn, context);
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
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String outboundRuleFqdn = Utils.getValueFromIdByName(id, "outboundFirewallRules");
        if (outboundRuleFqdn == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'outboundFirewallRules'.",
                                id)));
        }
        this.delete(resourceGroupName, serverName, outboundRuleFqdn, Context.NONE);
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
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String outboundRuleFqdn = Utils.getValueFromIdByName(id, "outboundFirewallRules");
        if (outboundRuleFqdn == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'outboundFirewallRules'.",
                                id)));
        }
        this.delete(resourceGroupName, serverName, outboundRuleFqdn, context);
    }

    private OutboundFirewallRulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public OutboundFirewallRuleImpl define(String name) {
        return new OutboundFirewallRuleImpl(name, this.manager());
    }
}
