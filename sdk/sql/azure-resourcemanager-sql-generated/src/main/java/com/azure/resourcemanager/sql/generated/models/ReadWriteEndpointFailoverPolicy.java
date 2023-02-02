// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Failover policy of the read-write endpoint for the failover group. If failoverPolicy is Automatic then
 * failoverWithDataLossGracePeriodMinutes is required.
 */
public final class ReadWriteEndpointFailoverPolicy extends ExpandableStringEnum<ReadWriteEndpointFailoverPolicy> {
    /** Static value Manual for ReadWriteEndpointFailoverPolicy. */
    public static final ReadWriteEndpointFailoverPolicy MANUAL = fromString("Manual");

    /** Static value Automatic for ReadWriteEndpointFailoverPolicy. */
    public static final ReadWriteEndpointFailoverPolicy AUTOMATIC = fromString("Automatic");

    /**
     * Creates or finds a ReadWriteEndpointFailoverPolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReadWriteEndpointFailoverPolicy.
     */
    @JsonCreator
    public static ReadWriteEndpointFailoverPolicy fromString(String name) {
        return fromString(name, ReadWriteEndpointFailoverPolicy.class);
    }

    /**
     * Gets known ReadWriteEndpointFailoverPolicy values.
     *
     * @return known ReadWriteEndpointFailoverPolicy values.
     */
    public static Collection<ReadWriteEndpointFailoverPolicy> values() {
        return values(ReadWriteEndpointFailoverPolicy.class);
    }
}
