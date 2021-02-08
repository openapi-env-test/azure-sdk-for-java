// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.RouteFilterRuleInner;
import java.util.List;

/** An immutable client-side representation of RouteFilterRule. */
public interface RouteFilterRule {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the location property: Resource location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the access property: The access type of the rule.
     *
     * @return the access value.
     */
    Access access();

    /**
     * Gets the routeFilterRuleType property: The rule type of the rule.
     *
     * @return the routeFilterRuleType value.
     */
    RouteFilterRuleType routeFilterRuleType();

    /**
     * Gets the communities property: The collection for bgp community values to filter on. e.g.
     * ['12076:5010','12076:5020'].
     *
     * @return the communities value.
     */
    List<String> communities();

    /**
     * Gets the provisioningState property: The provisioning state of the resource. Possible values are: 'Updating',
     * 'Deleting', 'Succeeded' and 'Failed'.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.RouteFilterRuleInner object.
     *
     * @return the inner object.
     */
    RouteFilterRuleInner innerModel();
}
