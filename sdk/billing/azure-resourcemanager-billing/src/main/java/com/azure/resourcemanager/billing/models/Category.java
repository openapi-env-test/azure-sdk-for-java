// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Category. */
public final class Category extends ExpandableStringEnum<Category> {
    /** Static value MicrosoftCustomerAgreement for Category. */
    public static final Category MICROSOFT_CUSTOMER_AGREEMENT = fromString("MicrosoftCustomerAgreement");

    /** Static value AffiliatePurchaseTerms for Category. */
    public static final Category AFFILIATE_PURCHASE_TERMS = fromString("AffiliatePurchaseTerms");

    /** Static value Other for Category. */
    public static final Category OTHER = fromString("Other");

    /**
     * Creates or finds a Category from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Category.
     */
    @JsonCreator
    public static Category fromString(String name) {
        return fromString(name, Category.class);
    }

    /**
     * Gets known Category values.
     *
     * @return known Category values.
     */
    public static Collection<Category> values() {
        return values(Category.class);
    }
}
