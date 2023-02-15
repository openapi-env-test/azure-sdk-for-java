// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Ssl protocol enums. */
public final class ApplicationGatewaySslProtocol extends ExpandableStringEnum<ApplicationGatewaySslProtocol> {
    /** Static value TLSv1_0 for ApplicationGatewaySslProtocol. */
    public static final ApplicationGatewaySslProtocol TLSV1_0 = fromString("TLSv1_0");

    /** Static value TLSv1_1 for ApplicationGatewaySslProtocol. */
    public static final ApplicationGatewaySslProtocol TLSV1_1 = fromString("TLSv1_1");

    /** Static value TLSv1_2 for ApplicationGatewaySslProtocol. */
    public static final ApplicationGatewaySslProtocol TLSV1_2 = fromString("TLSv1_2");

    /** Static value TLSv1_3 for ApplicationGatewaySslProtocol. */
    public static final ApplicationGatewaySslProtocol TLSV1_3 = fromString("TLSv1_3");

    /**
     * Creates a new instance of ApplicationGatewaySslProtocol value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ApplicationGatewaySslProtocol() {
    }

    /**
     * Creates or finds a ApplicationGatewaySslProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationGatewaySslProtocol.
     */
    @JsonCreator
    public static ApplicationGatewaySslProtocol fromString(String name) {
        return fromString(name, ApplicationGatewaySslProtocol.class);
    }

    /**
     * Gets known ApplicationGatewaySslProtocol values.
     *
     * @return known ApplicationGatewaySslProtocol values.
     */
    public static Collection<ApplicationGatewaySslProtocol> values() {
        return values(ApplicationGatewaySslProtocol.class);
    }
}
