// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.RestorableDroppedDatabaseInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of RestorableDroppedDatabase. */
public interface RestorableDroppedDatabase {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the sku property: The name and tier of the SKU.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the databaseName property: The name of the database.
     *
     * @return the databaseName value.
     */
    String databaseName();

    /**
     * Gets the maxSizeBytes property: The max size of the database expressed in bytes.
     *
     * @return the maxSizeBytes value.
     */
    Long maxSizeBytes();

    /**
     * Gets the elasticPoolId property: The resource name of the elastic pool containing this database.
     *
     * @return the elasticPoolId value.
     */
    String elasticPoolId();

    /**
     * Gets the creationDate property: The creation date of the database (ISO8601 format).
     *
     * @return the creationDate value.
     */
    OffsetDateTime creationDate();

    /**
     * Gets the deletionDate property: The deletion date of the database (ISO8601 format).
     *
     * @return the deletionDate value.
     */
    OffsetDateTime deletionDate();

    /**
     * Gets the earliestRestoreDate property: The earliest restore date of the database (ISO8601 format).
     *
     * @return the earliestRestoreDate value.
     */
    OffsetDateTime earliestRestoreDate();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.RestorableDroppedDatabaseInner object.
     *
     * @return the inner object.
     */
    RestorableDroppedDatabaseInner innerModel();
}
