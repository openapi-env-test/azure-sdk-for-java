// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.BastionShareableLinkInner;

/** An immutable client-side representation of BastionShareableLink. */
public interface BastionShareableLink {
    /**
     * Gets the vm property: Reference of the virtual machine resource.
     *
     * @return the vm value.
     */
    VM vm();

    /**
     * Gets the bsl property: The unique Bastion Shareable Link to the virtual machine.
     *
     * @return the bsl value.
     */
    String bsl();

    /**
     * Gets the createdAt property: The time when the link was created.
     *
     * @return the createdAt value.
     */
    String createdAt();

    /**
     * Gets the message property: Optional field indicating the warning or error message related to the vm in case of
     * partial failure.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.BastionShareableLinkInner object.
     *
     * @return the inner object.
     */
    BastionShareableLinkInner innerModel();
}
