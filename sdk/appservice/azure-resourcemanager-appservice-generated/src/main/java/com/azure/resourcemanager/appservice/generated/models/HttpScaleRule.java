// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Container App container Custom scaling rule. */
@Fluent
public final class HttpScaleRule {
    /*
     * Metadata properties to describe http scale rule.
     */
    @JsonProperty(value = "metadata")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> metadata;

    /*
     * Authentication secrets for the custom scale rule.
     */
    @JsonProperty(value = "auth")
    private List<ScaleRuleAuth> auth;

    /**
     * Get the metadata property: Metadata properties to describe http scale rule.
     *
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Metadata properties to describe http scale rule.
     *
     * @param metadata the metadata value to set.
     * @return the HttpScaleRule object itself.
     */
    public HttpScaleRule withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the auth property: Authentication secrets for the custom scale rule.
     *
     * @return the auth value.
     */
    public List<ScaleRuleAuth> auth() {
        return this.auth;
    }

    /**
     * Set the auth property: Authentication secrets for the custom scale rule.
     *
     * @param auth the auth value to set.
     * @return the HttpScaleRule object itself.
     */
    public HttpScaleRule withAuth(List<ScaleRuleAuth> auth) {
        this.auth = auth;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (auth() != null) {
            auth().forEach(e -> e.validate());
        }
    }
}
