// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayRequestRoutingRuleType;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of request routing rule of the application gateway. */
@Fluent
public final class ApplicationGatewayRequestRoutingRulePropertiesFormat {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ApplicationGatewayRequestRoutingRulePropertiesFormat.class);

    /*
     * Rule type.
     */
    @JsonProperty(value = "ruleType")
    private ApplicationGatewayRequestRoutingRuleType ruleType;

    /*
     * Priority of the request routing rule.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * Backend address pool resource of the application gateway.
     */
    @JsonProperty(value = "backendAddressPool")
    private SubResource backendAddressPool;

    /*
     * Backend http settings resource of the application gateway.
     */
    @JsonProperty(value = "backendHttpSettings")
    private SubResource backendHttpSettings;

    /*
     * Http listener resource of the application gateway.
     */
    @JsonProperty(value = "httpListener")
    private SubResource httpListener;

    /*
     * URL path map resource of the application gateway.
     */
    @JsonProperty(value = "urlPathMap")
    private SubResource urlPathMap;

    /*
     * Rewrite Rule Set resource in Basic rule of the application gateway.
     */
    @JsonProperty(value = "rewriteRuleSet")
    private SubResource rewriteRuleSet;

    /*
     * Redirect configuration resource of the application gateway.
     */
    @JsonProperty(value = "redirectConfiguration")
    private SubResource redirectConfiguration;

    /*
     * Load Distribution Policy resource of the application gateway.
     */
    @JsonProperty(value = "loadDistributionPolicy")
    private SubResource loadDistributionPolicy;

    /*
     * The provisioning state of the request routing rule resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the ruleType property: Rule type.
     *
     * @return the ruleType value.
     */
    public ApplicationGatewayRequestRoutingRuleType ruleType() {
        return this.ruleType;
    }

    /**
     * Set the ruleType property: Rule type.
     *
     * @param ruleType the ruleType value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat withRuleType(
        ApplicationGatewayRequestRoutingRuleType ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Get the priority property: Priority of the request routing rule.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the request routing rule.
     *
     * @param priority the priority value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the backendAddressPool property: Backend address pool resource of the application gateway.
     *
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool property: Backend address pool resource of the application gateway.
     *
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the backendHttpSettings property: Backend http settings resource of the application gateway.
     *
     * @return the backendHttpSettings value.
     */
    public SubResource backendHttpSettings() {
        return this.backendHttpSettings;
    }

    /**
     * Set the backendHttpSettings property: Backend http settings resource of the application gateway.
     *
     * @param backendHttpSettings the backendHttpSettings value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat withBackendHttpSettings(
        SubResource backendHttpSettings) {
        this.backendHttpSettings = backendHttpSettings;
        return this;
    }

    /**
     * Get the httpListener property: Http listener resource of the application gateway.
     *
     * @return the httpListener value.
     */
    public SubResource httpListener() {
        return this.httpListener;
    }

    /**
     * Set the httpListener property: Http listener resource of the application gateway.
     *
     * @param httpListener the httpListener value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat withHttpListener(SubResource httpListener) {
        this.httpListener = httpListener;
        return this;
    }

    /**
     * Get the urlPathMap property: URL path map resource of the application gateway.
     *
     * @return the urlPathMap value.
     */
    public SubResource urlPathMap() {
        return this.urlPathMap;
    }

    /**
     * Set the urlPathMap property: URL path map resource of the application gateway.
     *
     * @param urlPathMap the urlPathMap value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat withUrlPathMap(SubResource urlPathMap) {
        this.urlPathMap = urlPathMap;
        return this;
    }

    /**
     * Get the rewriteRuleSet property: Rewrite Rule Set resource in Basic rule of the application gateway.
     *
     * @return the rewriteRuleSet value.
     */
    public SubResource rewriteRuleSet() {
        return this.rewriteRuleSet;
    }

    /**
     * Set the rewriteRuleSet property: Rewrite Rule Set resource in Basic rule of the application gateway.
     *
     * @param rewriteRuleSet the rewriteRuleSet value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat withRewriteRuleSet(SubResource rewriteRuleSet) {
        this.rewriteRuleSet = rewriteRuleSet;
        return this;
    }

    /**
     * Get the redirectConfiguration property: Redirect configuration resource of the application gateway.
     *
     * @return the redirectConfiguration value.
     */
    public SubResource redirectConfiguration() {
        return this.redirectConfiguration;
    }

    /**
     * Set the redirectConfiguration property: Redirect configuration resource of the application gateway.
     *
     * @param redirectConfiguration the redirectConfiguration value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat withRedirectConfiguration(
        SubResource redirectConfiguration) {
        this.redirectConfiguration = redirectConfiguration;
        return this;
    }

    /**
     * Get the loadDistributionPolicy property: Load Distribution Policy resource of the application gateway.
     *
     * @return the loadDistributionPolicy value.
     */
    public SubResource loadDistributionPolicy() {
        return this.loadDistributionPolicy;
    }

    /**
     * Set the loadDistributionPolicy property: Load Distribution Policy resource of the application gateway.
     *
     * @param loadDistributionPolicy the loadDistributionPolicy value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat withLoadDistributionPolicy(
        SubResource loadDistributionPolicy) {
        this.loadDistributionPolicy = loadDistributionPolicy;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the request routing rule resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
