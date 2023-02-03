// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * It is used to set the encryption mode for node-node communication channel (when more than 2 self-hosted integration
 * runtime nodes exist).
 */
public final class IntegrationRuntimeInternalChannelEncryptionMode
    extends ExpandableStringEnum<IntegrationRuntimeInternalChannelEncryptionMode> {
    /** Static value NotSet for IntegrationRuntimeInternalChannelEncryptionMode. */
    public static final IntegrationRuntimeInternalChannelEncryptionMode NOT_SET = fromString("NotSet");

    /** Static value SslEncrypted for IntegrationRuntimeInternalChannelEncryptionMode. */
    public static final IntegrationRuntimeInternalChannelEncryptionMode SSL_ENCRYPTED = fromString("SslEncrypted");

    /** Static value NotEncrypted for IntegrationRuntimeInternalChannelEncryptionMode. */
    public static final IntegrationRuntimeInternalChannelEncryptionMode NOT_ENCRYPTED = fromString("NotEncrypted");

    /**
     * Creates or finds a IntegrationRuntimeInternalChannelEncryptionMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IntegrationRuntimeInternalChannelEncryptionMode.
     */
    @JsonCreator
    public static IntegrationRuntimeInternalChannelEncryptionMode fromString(String name) {
        return fromString(name, IntegrationRuntimeInternalChannelEncryptionMode.class);
    }

    /**
     * Gets known IntegrationRuntimeInternalChannelEncryptionMode values.
     *
     * @return known IntegrationRuntimeInternalChannelEncryptionMode values.
     */
    public static Collection<IntegrationRuntimeInternalChannelEncryptionMode> values() {
        return values(IntegrationRuntimeInternalChannelEncryptionMode.class);
    }
}
