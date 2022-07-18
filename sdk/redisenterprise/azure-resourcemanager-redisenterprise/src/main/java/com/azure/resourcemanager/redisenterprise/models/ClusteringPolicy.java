// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ClusteringPolicy. */
public final class ClusteringPolicy extends ExpandableStringEnum<ClusteringPolicy> {
    /** Static value EnterpriseCluster for ClusteringPolicy. */
    public static final ClusteringPolicy ENTERPRISE_CLUSTER = fromString("EnterpriseCluster");

    /** Static value OSSCluster for ClusteringPolicy. */
    public static final ClusteringPolicy OSSCLUSTER = fromString("OSSCluster");

    /**
     * Creates or finds a ClusteringPolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ClusteringPolicy.
     */
    @JsonCreator
    public static ClusteringPolicy fromString(String name) {
        return fromString(name, ClusteringPolicy.class);
    }

    /**
     * Gets known ClusteringPolicy values.
     *
     * @return known ClusteringPolicy values.
     */
    public static Collection<ClusteringPolicy> values() {
        return values(ClusteringPolicy.class);
    }
}
