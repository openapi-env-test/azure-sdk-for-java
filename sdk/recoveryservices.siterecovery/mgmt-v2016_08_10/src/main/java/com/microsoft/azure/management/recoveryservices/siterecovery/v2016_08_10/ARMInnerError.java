/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ARM internal error class for providing additional debug data.
 */
public class ARMInnerError {
    /**
     * Gets complete stack trace of the exception.
     */
    @JsonProperty(value = "trace")
    private String trace;

    /**
     * Gets exception source.
     */
    @JsonProperty(value = "source")
    private String source;

    /**
     * Gets data related to method which threw the exception.
     */
    @JsonProperty(value = "methodStatus")
    private MethodCallStatus methodStatus;

    /**
     * Gets cloud Id in exception.
     */
    @JsonProperty(value = "cloudId")
    private String cloudId;

    /**
     * Gets hyperV host ID.
     */
    @JsonProperty(value = "hVHostId")
    private String hVHostId;

    /**
     * Gets hyperV cluster Id.
     */
    @JsonProperty(value = "hVClusterId")
    private String hVClusterId;

    /**
     * Gets network Id.
     */
    @JsonProperty(value = "networkId")
    private String networkId;

    /**
     * Gets Vm Id.
     */
    @JsonProperty(value = "vmId")
    private String vmId;

    /**
     * Gets Fabric Id.
     */
    @JsonProperty(value = "fabricId")
    private String fabricId;

    /**
     * Gets Live Id of the caller.
     */
    @JsonProperty(value = "liveId")
    private String liveId;

    /**
     * Gets container Id of the caller.
     */
    @JsonProperty(value = "containerId")
    private String containerId;

    /**
     * Gets resource id used in the call.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Gets caller resource name.
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /**
     * Gets subscription Id.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /**
     * Gets serialized SRS log context.
     */
    @JsonProperty(value = "serializedSRSLogContext")
    private String serializedSRSLogContext;

    /**
     * Get gets complete stack trace of the exception.
     *
     * @return the trace value
     */
    public String trace() {
        return this.trace;
    }

    /**
     * Set gets complete stack trace of the exception.
     *
     * @param trace the trace value to set
     * @return the ARMInnerError object itself.
     */
    public ARMInnerError withTrace(String trace) {
        this.trace = trace;
        return this;
    }

    /**
     * Get gets exception source.
     *
     * @return the source value
     */
    public String source() {
        return this.source;
    }

    /**
     * Set gets exception source.
     *
     * @param source the source value to set
     * @return the ARMInnerError object itself.
     */
    public ARMInnerError withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get gets data related to method which threw the exception.
     *
     * @return the methodStatus value
     */
    public MethodCallStatus methodStatus() {
        return this.methodStatus;
    }

    /**
     * Set gets data related to method which threw the exception.
     *
     * @param methodStatus the methodStatus value to set
     * @return the ARMInnerError object itself.
     */
    public ARMInnerError withMethodStatus(MethodCallStatus methodStatus) {
        this.methodStatus = methodStatus;
        return this;
    }

    /**
     * Get gets cloud Id in exception.
     *
     * @return the cloudId value
     */
    public String cloudId() {
        return this.cloudId;
    }

    /**
     * Set gets cloud Id in exception.
     *
     * @param cloudId the cloudId value to set
     * @return the ARMInnerError object itself.
     */
    public ARMInnerError withCloudId(String cloudId) {
        this.cloudId = cloudId;
        return this;
    }

    /**
     * Get gets hyperV host ID.
     *
     * @return the hVHostId value
     */
    public String hVHostId() {
        return this.hVHostId;
    }

    /**
     * Set gets hyperV host ID.
     *
     * @param hVHostId the hVHostId value to set
     * @return the ARMInnerError object itself.
     */
    public ARMInnerError withHVHostId(String hVHostId) {
        this.hVHostId = hVHostId;
        return this;
    }

    /**
     * Get gets hyperV cluster Id.
     *
     * @return the hVClusterId value
     */
    public String hVClusterId() {
        return this.hVClusterId;
    }

    /**
     * Set gets hyperV cluster Id.
     *
     * @param hVClusterId the hVClusterId value to set
     * @return the ARMInnerError object itself.
     */
    public ARMInnerError withHVClusterId(String hVClusterId) {
        this.hVClusterId = hVClusterId;
        return this;
    }

    /**
     * Get gets network Id.
     *
     * @return the networkId value
     */
    public String networkId() {
        return this.networkId;
    }

    /**
     * Set gets network Id.
     *
     * @param networkId the networkId value to set
     * @return the ARMInnerError object itself.
     */
    public ARMInnerError withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * Get gets Vm Id.
     *
     * @return the vmId value
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Set gets Vm Id.
     *
     * @param vmId the vmId value to set
     * @return the ARMInnerError object itself.
     */
    public ARMInnerError withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    /**
     * Get gets Fabric Id.
     *
     * @return the fabricId value
     */
    public String fabricId() {
        return this.fabricId;
    }

    /**
     * Set gets Fabric Id.
     *
     * @param fabricId the fabricId value to set
     * @return the ARMInnerError object itself.
     */
    public ARMInnerError withFabricId(String fabricId) {
        this.fabricId = fabricId;
        return this;
    }

    /**
     * Get gets Live Id of the caller.
     *
     * @return the liveId value
     */
    public String liveId() {
        return this.liveId;
    }

    /**
     * Set gets Live Id of the caller.
     *
     * @param liveId the liveId value to set
     * @return the ARMInnerError object itself.
     */
    public ARMInnerError withLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }

    /**
     * Get gets container Id of the caller.
     *
     * @return the containerId value
     */
    public String containerId() {
        return this.containerId;
    }

    /**
     * Set gets container Id of the caller.
     *
     * @param containerId the containerId value to set
     * @return the ARMInnerError object itself.
     */
    public ARMInnerError withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * Get gets resource id used in the call.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set gets resource id used in the call.
     *
     * @param resourceId the resourceId value to set
     * @return the ARMInnerError object itself.
     */
    public ARMInnerError withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get gets caller resource name.
     *
     * @return the resourceName value
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set gets caller resource name.
     *
     * @param resourceName the resourceName value to set
     * @return the ARMInnerError object itself.
     */
    public ARMInnerError withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Get gets subscription Id.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set gets subscription Id.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the ARMInnerError object itself.
     */
    public ARMInnerError withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get gets serialized SRS log context.
     *
     * @return the serializedSRSLogContext value
     */
    public String serializedSRSLogContext() {
        return this.serializedSRSLogContext;
    }

    /**
     * Set gets serialized SRS log context.
     *
     * @param serializedSRSLogContext the serializedSRSLogContext value to set
     * @return the ARMInnerError object itself.
     */
    public ARMInnerError withSerializedSRSLogContext(String serializedSRSLogContext) {
        this.serializedSRSLogContext = serializedSRSLogContext;
        return this;
    }

}
