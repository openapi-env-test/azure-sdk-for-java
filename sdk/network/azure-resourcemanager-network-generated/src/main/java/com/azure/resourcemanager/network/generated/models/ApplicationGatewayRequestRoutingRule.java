// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayRequestRoutingRulePropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request routing rule of an application gateway. */
@Fluent
public final class ApplicationGatewayRequestRoutingRule extends SubResource {
    /*
     * Properties of the application gateway request routing rule.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayRequestRoutingRulePropertiesFormat innerProperties;

    /*
     * Name of the request routing rule that is unique within an Application
     * Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: Properties of the application gateway request routing rule.
     *
     * @return the innerProperties value.
     */
    private ApplicationGatewayRequestRoutingRulePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the request routing rule that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the request routing rule that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewayRequestRoutingRule withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the ruleType property: Rule type.
     *
     * @return the ruleType value.
     */
    public ApplicationGatewayRequestRoutingRuleType ruleType() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleType();
    }

    /**
     * Set the ruleType property: Rule type.
     *
     * @param ruleType the ruleType value to set.
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withRuleType(ApplicationGatewayRequestRoutingRuleType ruleType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayRequestRoutingRulePropertiesFormat();
        }
        this.innerProperties().withRuleType(ruleType);
        return this;
    }

    /**
     * Get the priority property: Priority of the request routing rule.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.innerProperties() == null ? null : this.innerProperties().priority();
    }

    /**
     * Set the priority property: Priority of the request routing rule.
     *
     * @param priority the priority value to set.
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withPriority(Integer priority) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayRequestRoutingRulePropertiesFormat();
        }
        this.innerProperties().withPriority(priority);
        return this;
    }

    /**
     * Get the backendAddressPool property: Backend address pool resource of the application gateway.
     *
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.innerProperties() == null ? null : this.innerProperties().backendAddressPool();
    }

    /**
     * Set the backendAddressPool property: Backend address pool resource of the application gateway.
     *
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withBackendAddressPool(SubResource backendAddressPool) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayRequestRoutingRulePropertiesFormat();
        }
        this.innerProperties().withBackendAddressPool(backendAddressPool);
        return this;
    }

    /**
     * Get the backendHttpSettings property: Backend http settings resource of the application gateway.
     *
     * @return the backendHttpSettings value.
     */
    public SubResource backendHttpSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().backendHttpSettings();
    }

    /**
     * Set the backendHttpSettings property: Backend http settings resource of the application gateway.
     *
     * @param backendHttpSettings the backendHttpSettings value to set.
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withBackendHttpSettings(SubResource backendHttpSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayRequestRoutingRulePropertiesFormat();
        }
        this.innerProperties().withBackendHttpSettings(backendHttpSettings);
        return this;
    }

    /**
     * Get the httpListener property: Http listener resource of the application gateway.
     *
     * @return the httpListener value.
     */
    public SubResource httpListener() {
        return this.innerProperties() == null ? null : this.innerProperties().httpListener();
    }

    /**
     * Set the httpListener property: Http listener resource of the application gateway.
     *
     * @param httpListener the httpListener value to set.
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withHttpListener(SubResource httpListener) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayRequestRoutingRulePropertiesFormat();
        }
        this.innerProperties().withHttpListener(httpListener);
        return this;
    }

    /**
     * Get the urlPathMap property: URL path map resource of the application gateway.
     *
     * @return the urlPathMap value.
     */
    public SubResource urlPathMap() {
        return this.innerProperties() == null ? null : this.innerProperties().urlPathMap();
    }

    /**
     * Set the urlPathMap property: URL path map resource of the application gateway.
     *
     * @param urlPathMap the urlPathMap value to set.
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withUrlPathMap(SubResource urlPathMap) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayRequestRoutingRulePropertiesFormat();
        }
        this.innerProperties().withUrlPathMap(urlPathMap);
        return this;
    }

    /**
     * Get the rewriteRuleSet property: Rewrite Rule Set resource in Basic rule of the application gateway.
     *
     * @return the rewriteRuleSet value.
     */
    public SubResource rewriteRuleSet() {
        return this.innerProperties() == null ? null : this.innerProperties().rewriteRuleSet();
    }

    /**
     * Set the rewriteRuleSet property: Rewrite Rule Set resource in Basic rule of the application gateway.
     *
     * @param rewriteRuleSet the rewriteRuleSet value to set.
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withRewriteRuleSet(SubResource rewriteRuleSet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayRequestRoutingRulePropertiesFormat();
        }
        this.innerProperties().withRewriteRuleSet(rewriteRuleSet);
        return this;
    }

    /**
     * Get the redirectConfiguration property: Redirect configuration resource of the application gateway.
     *
     * @return the redirectConfiguration value.
     */
    public SubResource redirectConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().redirectConfiguration();
    }

    /**
     * Set the redirectConfiguration property: Redirect configuration resource of the application gateway.
     *
     * @param redirectConfiguration the redirectConfiguration value to set.
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withRedirectConfiguration(SubResource redirectConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayRequestRoutingRulePropertiesFormat();
        }
        this.innerProperties().withRedirectConfiguration(redirectConfiguration);
        return this;
    }

    /**
     * Get the loadDistributionPolicy property: Load Distribution Policy resource of the application gateway.
     *
     * @return the loadDistributionPolicy value.
     */
    public SubResource loadDistributionPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().loadDistributionPolicy();
    }

    /**
     * Set the loadDistributionPolicy property: Load Distribution Policy resource of the application gateway.
     *
     * @param loadDistributionPolicy the loadDistributionPolicy value to set.
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withLoadDistributionPolicy(SubResource loadDistributionPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayRequestRoutingRulePropertiesFormat();
        }
        this.innerProperties().withLoadDistributionPolicy(loadDistributionPolicy);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the request routing rule resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
