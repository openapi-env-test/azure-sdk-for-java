/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ApplicationGatewaySkuName.
 */
public final class ApplicationGatewaySkuName extends ExpandableStringEnum<ApplicationGatewaySkuName> {
    /** Static value Standard_Small for ApplicationGatewaySkuName. */
    public static final ApplicationGatewaySkuName STANDARD_SMALL = fromString("Standard_Small");

    /** Static value Standard_Medium for ApplicationGatewaySkuName. */
    public static final ApplicationGatewaySkuName STANDARD_MEDIUM = fromString("Standard_Medium");

    /** Static value Standard_Large for ApplicationGatewaySkuName. */
    public static final ApplicationGatewaySkuName STANDARD_LARGE = fromString("Standard_Large");

    /** Static value WAF_Medium for ApplicationGatewaySkuName. */
    public static final ApplicationGatewaySkuName WAF_MEDIUM = fromString("WAF_Medium");

    /** Static value WAF_Large for ApplicationGatewaySkuName. */
    public static final ApplicationGatewaySkuName WAF_LARGE = fromString("WAF_Large");

    /** Static value Standard_v2 for ApplicationGatewaySkuName. */
    public static final ApplicationGatewaySkuName STANDARD_V2 = fromString("Standard_v2");

    /** Static value WAF_v2 for ApplicationGatewaySkuName. */
    public static final ApplicationGatewaySkuName WAF_V2 = fromString("WAF_v2");

    /**
     * Creates or finds a ApplicationGatewaySkuName from its string representation.
     * @param name a name to look for
     * @return the corresponding ApplicationGatewaySkuName
     */
    @JsonCreator
    public static ApplicationGatewaySkuName fromString(String name) {
        return fromString(name, ApplicationGatewaySkuName.class);
    }

    /**
     * @return known ApplicationGatewaySkuName values
     */
    public static Collection<ApplicationGatewaySkuName> values() {
        return values(ApplicationGatewaySkuName.class);
    }
}
