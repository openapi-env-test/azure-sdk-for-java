// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CsmPublishingCredentialsPoliciesEntity resource specific properties. */
@Fluent
public final class CsmPublishingCredentialsPoliciesEntityProperties {
    /*
     * <code>true</code> to allow access to a publishing method; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "allow", required = true)
    private boolean allow;

    /**
     * Get the allow property: &lt;code&gt;true&lt;/code&gt; to allow access to a publishing method; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the allow value.
     */
    public boolean allow() {
        return this.allow;
    }

    /**
     * Set the allow property: &lt;code&gt;true&lt;/code&gt; to allow access to a publishing method; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param allow the allow value to set.
     * @return the CsmPublishingCredentialsPoliciesEntityProperties object itself.
     */
    public CsmPublishingCredentialsPoliciesEntityProperties withAllow(boolean allow) {
        this.allow = allow;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
