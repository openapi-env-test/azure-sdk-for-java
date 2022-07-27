// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Properties specific to a ManagedOnlineDeployment. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointComputeType")
@JsonTypeName("Managed")
@Fluent
public final class ManagedOnlineDeployment extends OnlineDeploymentProperties {
    /** {@inheritDoc} */
    @Override
    public ManagedOnlineDeployment withAppInsightsEnabled(Boolean appInsightsEnabled) {
        super.withAppInsightsEnabled(appInsightsEnabled);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedOnlineDeployment withEgressPublicNetworkAccess(
        EgressPublicNetworkAccessType egressPublicNetworkAccess) {
        super.withEgressPublicNetworkAccess(egressPublicNetworkAccess);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedOnlineDeployment withInstanceType(String instanceType) {
        super.withInstanceType(instanceType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedOnlineDeployment withLivenessProbe(ProbeSettings livenessProbe) {
        super.withLivenessProbe(livenessProbe);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedOnlineDeployment withModel(String model) {
        super.withModel(model);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedOnlineDeployment withModelMountPath(String modelMountPath) {
        super.withModelMountPath(modelMountPath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedOnlineDeployment withReadinessProbe(ProbeSettings readinessProbe) {
        super.withReadinessProbe(readinessProbe);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedOnlineDeployment withRequestSettings(OnlineRequestSettings requestSettings) {
        super.withRequestSettings(requestSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedOnlineDeployment withScaleSettings(OnlineScaleSettings scaleSettings) {
        super.withScaleSettings(scaleSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedOnlineDeployment withCodeConfiguration(CodeConfiguration codeConfiguration) {
        super.withCodeConfiguration(codeConfiguration);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedOnlineDeployment withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedOnlineDeployment withEnvironmentId(String environmentId) {
        super.withEnvironmentId(environmentId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedOnlineDeployment withEnvironmentVariables(Map<String, String> environmentVariables) {
        super.withEnvironmentVariables(environmentVariables);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedOnlineDeployment withProperties(Map<String, String> properties) {
        super.withProperties(properties);
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
