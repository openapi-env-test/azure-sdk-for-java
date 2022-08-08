// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Definition of which performance counters will be collected and how they will be collected by this data collection
 * rule. Collected from both Windows and Linux machines where the counter is present.
 */
@Fluent
public final class PerfCounterDataSource {
    /*
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually
     * what table in Log Analytics the data will be sent to.
     */
    @JsonProperty(value = "streams")
    private List<KnownPerfCounterDataSourceStreams> streams;

    /*
     * The number of seconds between consecutive counter measurements
     * (samples).
     */
    @JsonProperty(value = "samplingFrequencyInSeconds")
    private Integer samplingFrequencyInSeconds;

    /*
     * A list of specifier names of the performance counters you want to
     * collect.
     * Use a wildcard (*) to collect a counter for all instances.
     * To get a list of performance counters on Windows, run the command
     * 'typeperf'.
     */
    @JsonProperty(value = "counterSpecifiers")
    private List<String> counterSpecifiers;

    /*
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type)
     * within the data collection rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the streams property: List of streams that this data source will be sent to. A stream indicates what schema
     * will be used for this data and usually what table in Log Analytics the data will be sent to.
     *
     * @return the streams value.
     */
    public List<KnownPerfCounterDataSourceStreams> streams() {
        return this.streams;
    }

    /**
     * Set the streams property: List of streams that this data source will be sent to. A stream indicates what schema
     * will be used for this data and usually what table in Log Analytics the data will be sent to.
     *
     * @param streams the streams value to set.
     * @return the PerfCounterDataSource object itself.
     */
    public PerfCounterDataSource withStreams(List<KnownPerfCounterDataSourceStreams> streams) {
        this.streams = streams;
        return this;
    }

    /**
     * Get the samplingFrequencyInSeconds property: The number of seconds between consecutive counter measurements
     * (samples).
     *
     * @return the samplingFrequencyInSeconds value.
     */
    public Integer samplingFrequencyInSeconds() {
        return this.samplingFrequencyInSeconds;
    }

    /**
     * Set the samplingFrequencyInSeconds property: The number of seconds between consecutive counter measurements
     * (samples).
     *
     * @param samplingFrequencyInSeconds the samplingFrequencyInSeconds value to set.
     * @return the PerfCounterDataSource object itself.
     */
    public PerfCounterDataSource withSamplingFrequencyInSeconds(Integer samplingFrequencyInSeconds) {
        this.samplingFrequencyInSeconds = samplingFrequencyInSeconds;
        return this;
    }

    /**
     * Get the counterSpecifiers property: A list of specifier names of the performance counters you want to collect.
     * Use a wildcard (*) to collect a counter for all instances. To get a list of performance counters on Windows, run
     * the command 'typeperf'.
     *
     * @return the counterSpecifiers value.
     */
    public List<String> counterSpecifiers() {
        return this.counterSpecifiers;
    }

    /**
     * Set the counterSpecifiers property: A list of specifier names of the performance counters you want to collect.
     * Use a wildcard (*) to collect a counter for all instances. To get a list of performance counters on Windows, run
     * the command 'typeperf'.
     *
     * @param counterSpecifiers the counterSpecifiers value to set.
     * @return the PerfCounterDataSource object itself.
     */
    public PerfCounterDataSource withCounterSpecifiers(List<String> counterSpecifiers) {
        this.counterSpecifiers = counterSpecifiers;
        return this;
    }

    /**
     * Get the name property: A friendly name for the data source. This name should be unique across all data sources
     * (regardless of type) within the data collection rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: A friendly name for the data source. This name should be unique across all data sources
     * (regardless of type) within the data collection rule.
     *
     * @param name the name value to set.
     * @return the PerfCounterDataSource object itself.
     */
    public PerfCounterDataSource withName(String name) {
        this.name = name;
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
