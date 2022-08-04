// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Kube State Metrics for prometheus addon profile for the container service cluster. */
@Fluent
public final class ManagedClusterAzureMonitorProfileKubeStateMetrics {
    /*
     * Comma-separated list of Kubernetes annotations keys that will be used in
     * the resource's labels metric.
     */
    @JsonProperty(value = "metricLabelsAllowlist")
    private String metricLabelsAllowlist;

    /*
     * Comma-separated list of additional Kubernetes label keys that will be
     * used in the resource's labels metric.
     */
    @JsonProperty(value = "metricAnnotationsAllowList")
    private String metricAnnotationsAllowList;

    /**
     * Get the metricLabelsAllowlist property: Comma-separated list of Kubernetes annotations keys that will be used in
     * the resource's labels metric.
     *
     * @return the metricLabelsAllowlist value.
     */
    public String metricLabelsAllowlist() {
        return this.metricLabelsAllowlist;
    }

    /**
     * Set the metricLabelsAllowlist property: Comma-separated list of Kubernetes annotations keys that will be used in
     * the resource's labels metric.
     *
     * @param metricLabelsAllowlist the metricLabelsAllowlist value to set.
     * @return the ManagedClusterAzureMonitorProfileKubeStateMetrics object itself.
     */
    public ManagedClusterAzureMonitorProfileKubeStateMetrics withMetricLabelsAllowlist(String metricLabelsAllowlist) {
        this.metricLabelsAllowlist = metricLabelsAllowlist;
        return this;
    }

    /**
     * Get the metricAnnotationsAllowList property: Comma-separated list of additional Kubernetes label keys that will
     * be used in the resource's labels metric.
     *
     * @return the metricAnnotationsAllowList value.
     */
    public String metricAnnotationsAllowList() {
        return this.metricAnnotationsAllowList;
    }

    /**
     * Set the metricAnnotationsAllowList property: Comma-separated list of additional Kubernetes label keys that will
     * be used in the resource's labels metric.
     *
     * @param metricAnnotationsAllowList the metricAnnotationsAllowList value to set.
     * @return the ManagedClusterAzureMonitorProfileKubeStateMetrics object itself.
     */
    public ManagedClusterAzureMonitorProfileKubeStateMetrics withMetricAnnotationsAllowList(
        String metricAnnotationsAllowList) {
        this.metricAnnotationsAllowList = metricAnnotationsAllowList;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
