// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the parameters for the Url Signing action. */
@Fluent
public final class UrlSigningActionParameters {
    /*
     * The typeName property.
     */
    @JsonProperty(value = "typeName", required = true)
    private String typeName = "DeliveryRuleUrlSigningActionParameters";

    /*
     * Algorithm to use for URL signing
     */
    @JsonProperty(value = "algorithm")
    private Algorithm algorithm;

    /*
     * Defines which query string parameters in the url to be considered for
     * expires, key id etc.
     */
    @JsonProperty(value = "parameterNameOverride")
    private List<UrlSigningParamIdentifier> parameterNameOverride;

    /** Creates an instance of UrlSigningActionParameters class. */
    public UrlSigningActionParameters() {
        typeName = "DeliveryRuleUrlSigningActionParameters";
    }

    /**
     * Get the typeName property: The typeName property.
     *
     * @return the typeName value.
     */
    public String typeName() {
        return this.typeName;
    }

    /**
     * Set the typeName property: The typeName property.
     *
     * @param typeName the typeName value to set.
     * @return the UrlSigningActionParameters object itself.
     */
    public UrlSigningActionParameters withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get the algorithm property: Algorithm to use for URL signing.
     *
     * @return the algorithm value.
     */
    public Algorithm algorithm() {
        return this.algorithm;
    }

    /**
     * Set the algorithm property: Algorithm to use for URL signing.
     *
     * @param algorithm the algorithm value to set.
     * @return the UrlSigningActionParameters object itself.
     */
    public UrlSigningActionParameters withAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Get the parameterNameOverride property: Defines which query string parameters in the url to be considered for
     * expires, key id etc.
     *
     * @return the parameterNameOverride value.
     */
    public List<UrlSigningParamIdentifier> parameterNameOverride() {
        return this.parameterNameOverride;
    }

    /**
     * Set the parameterNameOverride property: Defines which query string parameters in the url to be considered for
     * expires, key id etc.
     *
     * @param parameterNameOverride the parameterNameOverride value to set.
     * @return the UrlSigningActionParameters object itself.
     */
    public UrlSigningActionParameters withParameterNameOverride(List<UrlSigningParamIdentifier> parameterNameOverride) {
        this.parameterNameOverride = parameterNameOverride;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parameterNameOverride() != null) {
            parameterNameOverride().forEach(e -> e.validate());
        }
    }
}
