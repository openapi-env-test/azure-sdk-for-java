// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.sdkreleaseplannertest.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The template for adding updateable properties. */
@Immutable
public final class ResourceCreateOrReplaceModelLedgerEntry {
    /*
     * Contents of the ledger entry.
     */
    @JsonProperty(value = "contents", required = true)
    private String contents;

    /**
     * Creates an instance of ResourceCreateOrReplaceModelLedgerEntry class.
     *
     * @param contents the contents value to set.
     */
    @JsonCreator
    public ResourceCreateOrReplaceModelLedgerEntry(@JsonProperty(value = "contents", required = true) String contents) {
        this.contents = contents;
    }

    /**
     * Get the contents property: Contents of the ledger entry.
     *
     * @return the contents value.
     */
    public String getContents() {
        return this.contents;
    }
}
