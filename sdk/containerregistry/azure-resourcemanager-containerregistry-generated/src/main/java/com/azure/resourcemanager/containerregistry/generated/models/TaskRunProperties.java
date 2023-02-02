// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.resourcemanager.containerregistry.generated.fluent.models.TaskRunPropertiesInner;

/** An immutable client-side representation of TaskRunProperties. */
public interface TaskRunProperties {
    /**
     * Gets the provisioningState property: The provisioning state of this task run.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the runRequest property: The request (parameters) for the run.
     *
     * @return the runRequest value.
     */
    RunRequest runRequest();

    /**
     * Gets the runResult property: The result of this task run.
     *
     * @return the runResult value.
     */
    Run runResult();

    /**
     * Gets the forceUpdateTag property: How the run should be forced to rerun even if the run request configuration has
     * not changed.
     *
     * @return the forceUpdateTag value.
     */
    String forceUpdateTag();

    /**
     * Gets the inner com.azure.resourcemanager.containerregistry.generated.fluent.models.TaskRunPropertiesInner object.
     *
     * @return the inner object.
     */
    TaskRunPropertiesInner innerModel();
}
