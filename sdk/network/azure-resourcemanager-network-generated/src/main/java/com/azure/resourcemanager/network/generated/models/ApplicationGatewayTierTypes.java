// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ApplicationGatewayTierTypes. */
public final class ApplicationGatewayTierTypes extends ExpandableStringEnum<ApplicationGatewayTierTypes> {
    /** Static value Standard for ApplicationGatewayTierTypes. */
    public static final ApplicationGatewayTierTypes STANDARD = fromString("Standard");

    /** Static value WAF for ApplicationGatewayTierTypes. */
    public static final ApplicationGatewayTierTypes WAF = fromString("WAF");

    /** Static value Standard_v2 for ApplicationGatewayTierTypes. */
    public static final ApplicationGatewayTierTypes STANDARD_V2 = fromString("Standard_v2");

    /** Static value WAF_v2 for ApplicationGatewayTierTypes. */
    public static final ApplicationGatewayTierTypes WAF_V2 = fromString("WAF_v2");

    /**
     * Creates a new instance of ApplicationGatewayTierTypes value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ApplicationGatewayTierTypes() {
    }

    /**
     * Creates or finds a ApplicationGatewayTierTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationGatewayTierTypes.
     */
    @JsonCreator
    public static ApplicationGatewayTierTypes fromString(String name) {
        return fromString(name, ApplicationGatewayTierTypes.class);
    }

    /**
     * Gets known ApplicationGatewayTierTypes values.
     *
     * @return known ApplicationGatewayTierTypes values.
     */
    public static Collection<ApplicationGatewayTierTypes> values() {
        return values(ApplicationGatewayTierTypes.class);
    }
}
