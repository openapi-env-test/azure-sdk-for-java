// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vi.models;

import com.azure.resourcemanager.vi.fluent.models.AccessTokenInner;

/** An immutable client-side representation of AccessToken. */
public interface AccessToken {
    /**
     * Gets the accessToken property: The access token.
     *
     * @return the accessToken value.
     */
    String accessToken();

    /**
     * Gets the inner com.azure.resourcemanager.vi.fluent.models.AccessTokenInner object.
     *
     * @return the inner object.
     */
    AccessTokenInner innerModel();
}
