/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01.implementation;

import com.microsoft.azure.management.logic.v2019_05_01.WorkflowProvisioningState;
import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v2019_05_01.WorkflowState;
import com.microsoft.azure.management.logic.v2019_05_01.FlowEndpointsConfiguration;
import com.microsoft.azure.management.logic.v2019_05_01.FlowAccessControlConfiguration;
import com.microsoft.azure.management.logic.v2019_05_01.Sku;
import com.microsoft.azure.management.logic.v2019_05_01.ResourceReference;
import java.util.Map;
import com.microsoft.azure.management.logic.v2019_05_01.WorkflowParameter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The workflow type.
 */
@JsonFlatten
@SkipParentValidation
public class WorkflowInner extends Resource {
    /**
     * Gets the provisioning state. Possible values include: 'NotSpecified',
     * 'Accepted', 'Running', 'Ready', 'Creating', 'Created', 'Deleting',
     * 'Deleted', 'Canceled', 'Failed', 'Succeeded', 'Moving', 'Updating',
     * 'Registering', 'Registered', 'Unregistering', 'Unregistered',
     * 'Completed', 'Renewing', 'Pending', 'Waiting', 'InProgress'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowProvisioningState provisioningState;

    /**
     * Gets the created time.
     */
    @JsonProperty(value = "properties.createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdTime;

    /**
     * Gets the changed time.
     */
    @JsonProperty(value = "properties.changedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime changedTime;

    /**
     * The state. Possible values include: 'NotSpecified', 'Completed',
     * 'Enabled', 'Disabled', 'Deleted', 'Suspended'.
     */
    @JsonProperty(value = "properties.state")
    private WorkflowState state;

    /**
     * Gets the version.
     */
    @JsonProperty(value = "properties.version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /**
     * Gets the access endpoint.
     */
    @JsonProperty(value = "properties.accessEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String accessEndpoint;

    /**
     * The endpoints configuration.
     */
    @JsonProperty(value = "properties.endpointsConfiguration")
    private FlowEndpointsConfiguration endpointsConfiguration;

    /**
     * The access control configuration.
     */
    @JsonProperty(value = "properties.accessControl")
    private FlowAccessControlConfiguration accessControl;

    /**
     * The sku.
     */
    @JsonProperty(value = "properties.sku", access = JsonProperty.Access.WRITE_ONLY)
    private Sku sku;

    /**
     * The integration account.
     */
    @JsonProperty(value = "properties.integrationAccount")
    private ResourceReference integrationAccount;

    /**
     * The integration service environment.
     */
    @JsonProperty(value = "properties.integrationServiceEnvironment")
    private ResourceReference integrationServiceEnvironment;

    /**
     * The definition.
     */
    @JsonProperty(value = "properties.definition")
    private Object definition;

    /**
     * The parameters.
     */
    @JsonProperty(value = "properties.parameters")
    private Map<String, WorkflowParameter> parameters;

    /**
     * Get gets the provisioning state. Possible values include: 'NotSpecified', 'Accepted', 'Running', 'Ready', 'Creating', 'Created', 'Deleting', 'Deleted', 'Canceled', 'Failed', 'Succeeded', 'Moving', 'Updating', 'Registering', 'Registered', 'Unregistering', 'Unregistered', 'Completed', 'Renewing', 'Pending', 'Waiting', 'InProgress'.
     *
     * @return the provisioningState value
     */
    public WorkflowProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get gets the created time.
     *
     * @return the createdTime value
     */
    public DateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get gets the changed time.
     *
     * @return the changedTime value
     */
    public DateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Get the state. Possible values include: 'NotSpecified', 'Completed', 'Enabled', 'Disabled', 'Deleted', 'Suspended'.
     *
     * @return the state value
     */
    public WorkflowState state() {
        return this.state;
    }

    /**
     * Set the state. Possible values include: 'NotSpecified', 'Completed', 'Enabled', 'Disabled', 'Deleted', 'Suspended'.
     *
     * @param state the state value to set
     * @return the WorkflowInner object itself.
     */
    public WorkflowInner withState(WorkflowState state) {
        this.state = state;
        return this;
    }

    /**
     * Get gets the version.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Get gets the access endpoint.
     *
     * @return the accessEndpoint value
     */
    public String accessEndpoint() {
        return this.accessEndpoint;
    }

    /**
     * Get the endpoints configuration.
     *
     * @return the endpointsConfiguration value
     */
    public FlowEndpointsConfiguration endpointsConfiguration() {
        return this.endpointsConfiguration;
    }

    /**
     * Set the endpoints configuration.
     *
     * @param endpointsConfiguration the endpointsConfiguration value to set
     * @return the WorkflowInner object itself.
     */
    public WorkflowInner withEndpointsConfiguration(FlowEndpointsConfiguration endpointsConfiguration) {
        this.endpointsConfiguration = endpointsConfiguration;
        return this;
    }

    /**
     * Get the access control configuration.
     *
     * @return the accessControl value
     */
    public FlowAccessControlConfiguration accessControl() {
        return this.accessControl;
    }

    /**
     * Set the access control configuration.
     *
     * @param accessControl the accessControl value to set
     * @return the WorkflowInner object itself.
     */
    public WorkflowInner withAccessControl(FlowAccessControlConfiguration accessControl) {
        this.accessControl = accessControl;
        return this;
    }

    /**
     * Get the sku.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Get the integration account.
     *
     * @return the integrationAccount value
     */
    public ResourceReference integrationAccount() {
        return this.integrationAccount;
    }

    /**
     * Set the integration account.
     *
     * @param integrationAccount the integrationAccount value to set
     * @return the WorkflowInner object itself.
     */
    public WorkflowInner withIntegrationAccount(ResourceReference integrationAccount) {
        this.integrationAccount = integrationAccount;
        return this;
    }

    /**
     * Get the integration service environment.
     *
     * @return the integrationServiceEnvironment value
     */
    public ResourceReference integrationServiceEnvironment() {
        return this.integrationServiceEnvironment;
    }

    /**
     * Set the integration service environment.
     *
     * @param integrationServiceEnvironment the integrationServiceEnvironment value to set
     * @return the WorkflowInner object itself.
     */
    public WorkflowInner withIntegrationServiceEnvironment(ResourceReference integrationServiceEnvironment) {
        this.integrationServiceEnvironment = integrationServiceEnvironment;
        return this;
    }

    /**
     * Get the definition.
     *
     * @return the definition value
     */
    public Object definition() {
        return this.definition;
    }

    /**
     * Set the definition.
     *
     * @param definition the definition value to set
     * @return the WorkflowInner object itself.
     */
    public WorkflowInner withDefinition(Object definition) {
        this.definition = definition;
        return this;
    }

    /**
     * Get the parameters.
     *
     * @return the parameters value
     */
    public Map<String, WorkflowParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters.
     *
     * @param parameters the parameters value to set
     * @return the WorkflowInner object itself.
     */
    public WorkflowInner withParameters(Map<String, WorkflowParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

}
