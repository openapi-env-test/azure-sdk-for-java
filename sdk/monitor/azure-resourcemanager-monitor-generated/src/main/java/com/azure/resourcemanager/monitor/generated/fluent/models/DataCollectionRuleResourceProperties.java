// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.monitor.generated.models.DataCollectionRule;
import com.azure.resourcemanager.monitor.generated.models.DataCollectionRuleDataSources;
import com.azure.resourcemanager.monitor.generated.models.DataCollectionRuleDestinations;
import com.azure.resourcemanager.monitor.generated.models.DataFlow;
import com.azure.resourcemanager.monitor.generated.models.StreamDeclaration;
import java.util.List;
import java.util.Map;

/** Resource properties. */
@Fluent
public final class DataCollectionRuleResourceProperties extends DataCollectionRule {
    /** Creates an instance of DataCollectionRuleResourceProperties class. */
    public DataCollectionRuleResourceProperties() {
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionRuleResourceProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionRuleResourceProperties withDataCollectionEndpointId(String dataCollectionEndpointId) {
        super.withDataCollectionEndpointId(dataCollectionEndpointId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionRuleResourceProperties withStreamDeclarations(
        Map<String, StreamDeclaration> streamDeclarations) {
        super.withStreamDeclarations(streamDeclarations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionRuleResourceProperties withDataSources(DataCollectionRuleDataSources dataSources) {
        super.withDataSources(dataSources);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionRuleResourceProperties withDestinations(DataCollectionRuleDestinations destinations) {
        super.withDestinations(destinations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionRuleResourceProperties withDataFlows(List<DataFlow> dataFlows) {
        super.withDataFlows(dataFlows);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
