// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.IoTSecurityAggregatedRecommendationInner;
import com.azure.resourcemanager.security.models.IoTSecurityAggregatedRecommendation;
import com.azure.resourcemanager.security.models.ReportedSeverity;
import java.util.Collections;
import java.util.Map;

public final class IoTSecurityAggregatedRecommendationImpl implements IoTSecurityAggregatedRecommendation {
    private IoTSecurityAggregatedRecommendationInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    IoTSecurityAggregatedRecommendationImpl(
        IoTSecurityAggregatedRecommendationInner innerObject,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String recommendationName() {
        return this.innerModel().recommendationName();
    }

    public String recommendationDisplayName() {
        return this.innerModel().recommendationDisplayName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String recommendationTypeId() {
        return this.innerModel().recommendationTypeId();
    }

    public String detectedBy() {
        return this.innerModel().detectedBy();
    }

    public String remediationSteps() {
        return this.innerModel().remediationSteps();
    }

    public ReportedSeverity reportedSeverity() {
        return this.innerModel().reportedSeverity();
    }

    public Long healthyDevices() {
        return this.innerModel().healthyDevices();
    }

    public Long unhealthyDeviceCount() {
        return this.innerModel().unhealthyDeviceCount();
    }

    public String logAnalyticsQuery() {
        return this.innerModel().logAnalyticsQuery();
    }

    public IoTSecurityAggregatedRecommendationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
