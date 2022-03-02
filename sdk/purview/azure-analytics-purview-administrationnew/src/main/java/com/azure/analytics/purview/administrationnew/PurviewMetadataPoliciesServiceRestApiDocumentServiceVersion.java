// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.administrationnew;

import com.azure.core.util.ServiceVersion;

/** Service version of PurviewMetadataPoliciesServiceRestApiDocumentClient. */
public enum PurviewMetadataPoliciesServiceRestApiDocumentServiceVersion implements ServiceVersion {
    /** Enum value 2021-07-01-preview. */
    V2021_07_01_PREVIEW("2021-07-01-preview");

    private final String version;

    PurviewMetadataPoliciesServiceRestApiDocumentServiceVersion(String version) {
        this.version = version;
    }

    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link PurviewMetadataPoliciesServiceRestApiDocumentServiceVersion}.
     */
    public static PurviewMetadataPoliciesServiceRestApiDocumentServiceVersion getLatest() {
        return V2021_07_01_PREVIEW;
    }
}
