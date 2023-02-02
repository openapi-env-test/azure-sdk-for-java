// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;

/** The secret management attributes. */
@Fluent
public final class SecretAttributes extends Attributes {
    /** Creates an instance of SecretAttributes class. */
    public SecretAttributes() {
    }

    /** {@inheritDoc} */
    @Override
    public SecretAttributes withEnabled(Boolean enabled) {
        super.withEnabled(enabled);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SecretAttributes withNotBefore(Long notBefore) {
        super.withNotBefore(notBefore);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SecretAttributes withExpires(Long expires) {
        super.withExpires(expires);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
