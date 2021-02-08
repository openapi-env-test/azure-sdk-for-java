// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewaySslPredefinedPolicyInner;
import java.util.List;

/** An immutable client-side representation of ApplicationGatewaySslPredefinedPolicy. */
public interface ApplicationGatewaySslPredefinedPolicy {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Name of Ssl predefined policy.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the cipherSuites property: Ssl cipher suites to be enabled in the specified order for application gateway.
     *
     * @return the cipherSuites value.
     */
    List<ApplicationGatewaySslCipherSuite> cipherSuites();

    /**
     * Gets the minProtocolVersion property: Minimum version of Ssl protocol to be supported on application gateway.
     *
     * @return the minProtocolVersion value.
     */
    ApplicationGatewaySslProtocol minProtocolVersion();

    /**
     * Gets the inner
     * com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewaySslPredefinedPolicyInner object.
     *
     * @return the inner object.
     */
    ApplicationGatewaySslPredefinedPolicyInner innerModel();
}
