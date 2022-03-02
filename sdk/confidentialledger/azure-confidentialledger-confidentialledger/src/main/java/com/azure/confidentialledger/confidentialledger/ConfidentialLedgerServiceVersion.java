// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.confidentialledger.confidentialledger;

import com.azure.core.util.ServiceVersion;

/** Service version of ConfidentialLedgerClient. */
public enum ConfidentialLedgerServiceVersion implements ServiceVersion {
    /** Enum value 0.1-preview. */
    V0_1_PREVIEW("0.1-preview");

    private final String version;

    ConfidentialLedgerServiceVersion(String version) {
        this.version = version;
    }

    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link ConfidentialLedgerServiceVersion}.
     */
    public static ConfidentialLedgerServiceVersion getLatest() {
        return V0_1_PREVIEW;
    }
}
