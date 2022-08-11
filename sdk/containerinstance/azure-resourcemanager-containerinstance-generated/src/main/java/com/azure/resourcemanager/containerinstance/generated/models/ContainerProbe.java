// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The container probe, for liveness or readiness. */
@Fluent
public final class ContainerProbe {
    /*
     * The execution command to probe
     */
    @JsonProperty(value = "exec")
    private ContainerExec exec;

    /*
     * The Http Get settings to probe
     */
    @JsonProperty(value = "httpGet")
    private ContainerHttpGet httpGet;

    /*
     * The initial delay seconds.
     */
    @JsonProperty(value = "initialDelaySeconds")
    private Integer initialDelaySeconds;

    /*
     * The period seconds.
     */
    @JsonProperty(value = "periodSeconds")
    private Integer periodSeconds;

    /*
     * The failure threshold.
     */
    @JsonProperty(value = "failureThreshold")
    private Integer failureThreshold;

    /*
     * The success threshold.
     */
    @JsonProperty(value = "successThreshold")
    private Integer successThreshold;

    /*
     * The timeout seconds.
     */
    @JsonProperty(value = "timeoutSeconds")
    private Integer timeoutSeconds;

    /**
     * Get the exec property: The execution command to probe.
     *
     * @return the exec value.
     */
    public ContainerExec exec() {
        return this.exec;
    }

    /**
     * Set the exec property: The execution command to probe.
     *
     * @param exec the exec value to set.
     * @return the ContainerProbe object itself.
     */
    public ContainerProbe withExec(ContainerExec exec) {
        this.exec = exec;
        return this;
    }

    /**
     * Get the httpGet property: The Http Get settings to probe.
     *
     * @return the httpGet value.
     */
    public ContainerHttpGet httpGet() {
        return this.httpGet;
    }

    /**
     * Set the httpGet property: The Http Get settings to probe.
     *
     * @param httpGet the httpGet value to set.
     * @return the ContainerProbe object itself.
     */
    public ContainerProbe withHttpGet(ContainerHttpGet httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    /**
     * Get the initialDelaySeconds property: The initial delay seconds.
     *
     * @return the initialDelaySeconds value.
     */
    public Integer initialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    /**
     * Set the initialDelaySeconds property: The initial delay seconds.
     *
     * @param initialDelaySeconds the initialDelaySeconds value to set.
     * @return the ContainerProbe object itself.
     */
    public ContainerProbe withInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    /**
     * Get the periodSeconds property: The period seconds.
     *
     * @return the periodSeconds value.
     */
    public Integer periodSeconds() {
        return this.periodSeconds;
    }

    /**
     * Set the periodSeconds property: The period seconds.
     *
     * @param periodSeconds the periodSeconds value to set.
     * @return the ContainerProbe object itself.
     */
    public ContainerProbe withPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    /**
     * Get the failureThreshold property: The failure threshold.
     *
     * @return the failureThreshold value.
     */
    public Integer failureThreshold() {
        return this.failureThreshold;
    }

    /**
     * Set the failureThreshold property: The failure threshold.
     *
     * @param failureThreshold the failureThreshold value to set.
     * @return the ContainerProbe object itself.
     */
    public ContainerProbe withFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    /**
     * Get the successThreshold property: The success threshold.
     *
     * @return the successThreshold value.
     */
    public Integer successThreshold() {
        return this.successThreshold;
    }

    /**
     * Set the successThreshold property: The success threshold.
     *
     * @param successThreshold the successThreshold value to set.
     * @return the ContainerProbe object itself.
     */
    public ContainerProbe withSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }

    /**
     * Get the timeoutSeconds property: The timeout seconds.
     *
     * @return the timeoutSeconds value.
     */
    public Integer timeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * Set the timeoutSeconds property: The timeout seconds.
     *
     * @param timeoutSeconds the timeoutSeconds value to set.
     * @return the ContainerProbe object itself.
     */
    public ContainerProbe withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (exec() != null) {
            exec().validate();
        }
        if (httpGet() != null) {
            httpGet().validate();
        }
    }
}
