// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Deployment slot parameters. */
@Fluent
public final class CsmSlotEntity {
    /*
     * Destination deployment slot during swap operation.
     */
    @JsonProperty(value = "targetSlot", required = true)
    private String targetSlot;

    /*
     * <code>true</code> to preserve Virtual Network to the slot during swap;
     * otherwise, <code>false</code>.
     */
    @JsonProperty(value = "preserveVnet", required = true)
    private boolean preserveVnet;

    /**
     * Get the targetSlot property: Destination deployment slot during swap operation.
     *
     * @return the targetSlot value.
     */
    public String targetSlot() {
        return this.targetSlot;
    }

    /**
     * Set the targetSlot property: Destination deployment slot during swap operation.
     *
     * @param targetSlot the targetSlot value to set.
     * @return the CsmSlotEntity object itself.
     */
    public CsmSlotEntity withTargetSlot(String targetSlot) {
        this.targetSlot = targetSlot;
        return this;
    }

    /**
     * Get the preserveVnet property: &lt;code&gt;true&lt;/code&gt; to preserve Virtual Network to the slot during swap;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the preserveVnet value.
     */
    public boolean preserveVnet() {
        return this.preserveVnet;
    }

    /**
     * Set the preserveVnet property: &lt;code&gt;true&lt;/code&gt; to preserve Virtual Network to the slot during swap;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param preserveVnet the preserveVnet value to set.
     * @return the CsmSlotEntity object itself.
     */
    public CsmSlotEntity withPreserveVnet(boolean preserveVnet) {
        this.preserveVnet = preserveVnet;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetSlot() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property targetSlot in model CsmSlotEntity"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CsmSlotEntity.class);
}
