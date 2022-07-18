// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MongoDbErrorType. */
public final class MongoDbErrorType extends ExpandableStringEnum<MongoDbErrorType> {
    /** Static value Error for MongoDbErrorType. */
    public static final MongoDbErrorType ERROR = fromString("Error");

    /** Static value ValidationError for MongoDbErrorType. */
    public static final MongoDbErrorType VALIDATION_ERROR = fromString("ValidationError");

    /** Static value Warning for MongoDbErrorType. */
    public static final MongoDbErrorType WARNING = fromString("Warning");

    /**
     * Creates or finds a MongoDbErrorType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MongoDbErrorType.
     */
    @JsonCreator
    public static MongoDbErrorType fromString(String name) {
        return fromString(name, MongoDbErrorType.class);
    }

    /**
     * Gets known MongoDbErrorType values.
     *
     * @return known MongoDbErrorType values.
     */
    public static Collection<MongoDbErrorType> values() {
        return values(MongoDbErrorType.class);
    }
}
