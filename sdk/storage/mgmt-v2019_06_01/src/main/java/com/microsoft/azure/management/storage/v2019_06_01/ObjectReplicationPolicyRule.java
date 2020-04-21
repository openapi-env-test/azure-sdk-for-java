/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The replication policy rule between two containers.
 */
public class ObjectReplicationPolicyRule {
    /**
     * Rule Id is auto-generated for each new rule on destination account. It
     * is required for put policy on source account.
     */
    @JsonProperty(value = "ruleId")
    private String ruleId;

    /**
     * Required. Source container name.
     */
    @JsonProperty(value = "sourceContainer", required = true)
    private String sourceContainer;

    /**
     * Required. Destination container name.
     */
    @JsonProperty(value = "destinationContainer", required = true)
    private String destinationContainer;

    /**
     * Optional. An object that defines the filter set.
     */
    @JsonProperty(value = "filters")
    private ObjectReplicationPolicyFilter filters;

    /**
     * Get rule Id is auto-generated for each new rule on destination account. It is required for put policy on source account.
     *
     * @return the ruleId value
     */
    public String ruleId() {
        return this.ruleId;
    }

    /**
     * Set rule Id is auto-generated for each new rule on destination account. It is required for put policy on source account.
     *
     * @param ruleId the ruleId value to set
     * @return the ObjectReplicationPolicyRule object itself.
     */
    public ObjectReplicationPolicyRule withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * Get required. Source container name.
     *
     * @return the sourceContainer value
     */
    public String sourceContainer() {
        return this.sourceContainer;
    }

    /**
     * Set required. Source container name.
     *
     * @param sourceContainer the sourceContainer value to set
     * @return the ObjectReplicationPolicyRule object itself.
     */
    public ObjectReplicationPolicyRule withSourceContainer(String sourceContainer) {
        this.sourceContainer = sourceContainer;
        return this;
    }

    /**
     * Get required. Destination container name.
     *
     * @return the destinationContainer value
     */
    public String destinationContainer() {
        return this.destinationContainer;
    }

    /**
     * Set required. Destination container name.
     *
     * @param destinationContainer the destinationContainer value to set
     * @return the ObjectReplicationPolicyRule object itself.
     */
    public ObjectReplicationPolicyRule withDestinationContainer(String destinationContainer) {
        this.destinationContainer = destinationContainer;
        return this;
    }

    /**
     * Get optional. An object that defines the filter set.
     *
     * @return the filters value
     */
    public ObjectReplicationPolicyFilter filters() {
        return this.filters;
    }

    /**
     * Set optional. An object that defines the filter set.
     *
     * @param filters the filters value to set
     * @return the ObjectReplicationPolicyRule object itself.
     */
    public ObjectReplicationPolicyRule withFilters(ObjectReplicationPolicyFilter filters) {
        this.filters = filters;
        return this;
    }

}
