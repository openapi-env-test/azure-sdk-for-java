// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.ServerTableAuditingPolicyListResultInner;
import java.util.List;

/** An immutable client-side representation of ServerTableAuditingPolicyListResult. */
public interface ServerTableAuditingPolicyListResult {
    /**
     * Gets the value property: The list of server table auditing policies.
     *
     * @return the value value.
     */
    List<ServerTableAuditingPolicy> value();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.ServerTableAuditingPolicyListResultInner
     * object.
     *
     * @return the inner object.
     */
    ServerTableAuditingPolicyListResultInner innerModel();
}
