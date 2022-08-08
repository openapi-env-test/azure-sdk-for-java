// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vi.models;

import com.azure.resourcemanager.vi.fluent.models.ClassicAccountSlimInner;

/** An immutable client-side representation of ClassicAccountSlim. */
public interface ClassicAccountSlim {
    /**
     * Gets the name property: The account's name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the location property: The account's location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the id property: The account's id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the inner com.azure.resourcemanager.vi.fluent.models.ClassicAccountSlimInner object.
     *
     * @return the inner object.
     */
    ClassicAccountSlimInner innerModel();
}
