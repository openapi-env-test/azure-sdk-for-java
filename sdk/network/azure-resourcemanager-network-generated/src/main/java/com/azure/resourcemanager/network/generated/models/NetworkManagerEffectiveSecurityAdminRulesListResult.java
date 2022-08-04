// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerEffectiveSecurityAdminRulesListResultInner;
import java.util.List;

/** An immutable client-side representation of NetworkManagerEffectiveSecurityAdminRulesListResult. */
public interface NetworkManagerEffectiveSecurityAdminRulesListResult {
    /**
     * Gets the value property: Gets a page of NetworkManagerEffectiveSecurityAdminRules.
     *
     * @return the value value.
     */
    List<EffectiveBaseSecurityAdminRule> value();

    /**
     * Gets the skipToken property: When present, the value can be passed to a subsequent query call (together with the
     * same query and scopes used in the current request) to retrieve the next page of data.
     *
     * @return the skipToken value.
     */
    String skipToken();

    /**
     * Gets the inner
     * com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerEffectiveSecurityAdminRulesListResultInner
     * object.
     *
     * @return the inner object.
     */
    NetworkManagerEffectiveSecurityAdminRulesListResultInner innerModel();
}
