// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CloudName. */
public final class CloudName extends ExpandableStringEnum<CloudName> {
    /** Static value Azure for CloudName. */
    public static final CloudName AZURE = fromString("Azure");

    /** Static value AWS for CloudName. */
    public static final CloudName AWS = fromString("AWS");

    /** Static value GCP for CloudName. */
    public static final CloudName GCP = fromString("GCP");

    /** Static value Github for CloudName. */
    public static final CloudName GITHUB = fromString("Github");

    /** Static value AzureDevOps for CloudName. */
    public static final CloudName AZURE_DEV_OPS = fromString("AzureDevOps");

    /**
     * Creates or finds a CloudName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CloudName.
     */
    @JsonCreator
    public static CloudName fromString(String name) {
        return fromString(name, CloudName.class);
    }

    /**
     * Gets known CloudName values.
     *
     * @return known CloudName values.
     */
    public static Collection<CloudName> values() {
        return values(CloudName.class);
    }
}
