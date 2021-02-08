// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.InboundNatRulesClient;
import com.azure.resourcemanager.network.generated.fluent.models.InboundNatRuleInner;
import com.azure.resourcemanager.network.generated.models.InboundNatRule;
import com.azure.resourcemanager.network.generated.models.InboundNatRules;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class InboundNatRulesImpl implements InboundNatRules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InboundNatRulesImpl.class);

    private final InboundNatRulesClient innerClient;

    private final NetworkManager serviceManager;

    public InboundNatRulesImpl(InboundNatRulesClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<InboundNatRule> list(String resourceGroupName, String loadBalancerName) {
        PagedIterable<InboundNatRuleInner> inner = this.serviceClient().list(resourceGroupName, loadBalancerName);
        return inner.mapPage(inner1 -> new InboundNatRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<InboundNatRule> list(String resourceGroupName, String loadBalancerName, Context context) {
        PagedIterable<InboundNatRuleInner> inner =
            this.serviceClient().list(resourceGroupName, loadBalancerName, context);
        return inner.mapPage(inner1 -> new InboundNatRuleImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String loadBalancerName, String inboundNatRuleName) {
        this.serviceClient().delete(resourceGroupName, loadBalancerName, inboundNatRuleName);
    }

    public void delete(String resourceGroupName, String loadBalancerName, String inboundNatRuleName, Context context) {
        this.serviceClient().delete(resourceGroupName, loadBalancerName, inboundNatRuleName, context);
    }

    public InboundNatRule get(String resourceGroupName, String loadBalancerName, String inboundNatRuleName) {
        InboundNatRuleInner inner = this.serviceClient().get(resourceGroupName, loadBalancerName, inboundNatRuleName);
        if (inner != null) {
            return new InboundNatRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<InboundNatRule> getWithResponse(
        String resourceGroupName, String loadBalancerName, String inboundNatRuleName, String expand, Context context) {
        Response<InboundNatRuleInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, loadBalancerName, inboundNatRuleName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new InboundNatRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public InboundNatRule createOrUpdate(
        String resourceGroupName,
        String loadBalancerName,
        String inboundNatRuleName,
        InboundNatRuleInner inboundNatRuleParameters) {
        InboundNatRuleInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, loadBalancerName, inboundNatRuleName, inboundNatRuleParameters);
        if (inner != null) {
            return new InboundNatRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public InboundNatRule createOrUpdate(
        String resourceGroupName,
        String loadBalancerName,
        String inboundNatRuleName,
        InboundNatRuleInner inboundNatRuleParameters,
        Context context) {
        InboundNatRuleInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName, loadBalancerName, inboundNatRuleName, inboundNatRuleParameters, context);
        if (inner != null) {
            return new InboundNatRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private InboundNatRulesClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
