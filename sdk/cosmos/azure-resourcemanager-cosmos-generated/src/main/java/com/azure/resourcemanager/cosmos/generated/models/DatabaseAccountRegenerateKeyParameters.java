// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters to regenerate the keys within the database account. */
@Fluent
public final class DatabaseAccountRegenerateKeyParameters {
    /*
     * The access key to regenerate.
     */
    @JsonProperty(value = "keyKind", required = true)
    private KeyKind keyKind;

    /**
     * Get the keyKind property: The access key to regenerate.
     *
     * @return the keyKind value.
     */
    public KeyKind keyKind() {
        return this.keyKind;
    }

    /**
     * Set the keyKind property: The access key to regenerate.
     *
     * @param keyKind the keyKind value to set.
     * @return the DatabaseAccountRegenerateKeyParameters object itself.
     */
    public DatabaseAccountRegenerateKeyParameters withKeyKind(KeyKind keyKind) {
        this.keyKind = keyKind;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyKind() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyKind in model DatabaseAccountRegenerateKeyParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatabaseAccountRegenerateKeyParameters.class);
}
