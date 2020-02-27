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
 * Protection profile input.
 */
public class CreatePolicyInput {
    /**
     * Policy creation properties.
     */
    @JsonProperty(value = "properties")
    private CreatePolicyInputProperties properties;

    /**
     * Get policy creation properties.
     *
     * @return the properties value
     */
    public CreatePolicyInputProperties properties() {
        return this.properties;
    }

    /**
     * Set policy creation properties.
     *
     * @param properties the properties value to set
     * @return the CreatePolicyInput object itself.
     */
    public CreatePolicyInput withProperties(CreatePolicyInputProperties properties) {
        this.properties = properties;
        return this;
    }

}
