/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filters limit replication to a subset of blobs within the storage account. A
 * logical OR is performed on values in the filter. If multiple filters are
 * defined, a logical AND is performed on all filters.
 */
public class ObjectReplicationPolicyFilter {
    /**
     * Optional. Filters the results to replicate only blobs whose names begin
     * with the specified prefix.
     */
    @JsonProperty(value = "prefixMatch")
    private List<String> prefixMatch;

    /**
     * Blobs created after the time will be replicated to the destination. It
     * must be in datetime format 'yyyy-MM-ddTHH:mm:ssZ'. Example:
     * 2020-02-19T16:05:00Z.
     */
    @JsonProperty(value = "minCreationTime")
    private String minCreationTime;

    /**
     * Get optional. Filters the results to replicate only blobs whose names begin with the specified prefix.
     *
     * @return the prefixMatch value
     */
    public List<String> prefixMatch() {
        return this.prefixMatch;
    }

    /**
     * Set optional. Filters the results to replicate only blobs whose names begin with the specified prefix.
     *
     * @param prefixMatch the prefixMatch value to set
     * @return the ObjectReplicationPolicyFilter object itself.
     */
    public ObjectReplicationPolicyFilter withPrefixMatch(List<String> prefixMatch) {
        this.prefixMatch = prefixMatch;
        return this;
    }

    /**
     * Get blobs created after the time will be replicated to the destination. It must be in datetime format 'yyyy-MM-ddTHH:mm:ssZ'. Example: 2020-02-19T16:05:00Z.
     *
     * @return the minCreationTime value
     */
    public String minCreationTime() {
        return this.minCreationTime;
    }

    /**
     * Set blobs created after the time will be replicated to the destination. It must be in datetime format 'yyyy-MM-ddTHH:mm:ssZ'. Example: 2020-02-19T16:05:00Z.
     *
     * @param minCreationTime the minCreationTime value to set
     * @return the ObjectReplicationPolicyFilter object itself.
     */
    public ObjectReplicationPolicyFilter withMinCreationTime(String minCreationTime) {
        this.minCreationTime = minCreationTime;
        return this;
    }

}
