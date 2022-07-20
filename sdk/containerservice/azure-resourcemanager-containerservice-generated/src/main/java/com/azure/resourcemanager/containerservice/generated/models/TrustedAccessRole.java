// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.resourcemanager.containerservice.generated.fluent.models.TrustedAccessRoleInner;
import java.util.List;

/** An immutable client-side representation of TrustedAccessRole. */
public interface TrustedAccessRole {
    /**
     * Gets the sourceResourceType property: Resource type of Azure resource.
     *
     * @return the sourceResourceType value.
     */
    String sourceResourceType();

    /**
     * Gets the name property: Name of role, name is unique under a source resource type.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the rules property: List of rules for the role. This maps to 'rules' property of [Kubernetes Cluster
     * Role](https://kubernetes.io/docs/reference/kubernetes-api/authorization-resources/cluster-role-v1/#ClusterRole).
     *
     * @return the rules value.
     */
    List<TrustedAccessRoleRule> rules();

    /**
     * Gets the inner com.azure.resourcemanager.containerservice.generated.fluent.models.TrustedAccessRoleInner object.
     *
     * @return the inner object.
     */
    TrustedAccessRoleInner innerModel();
}
