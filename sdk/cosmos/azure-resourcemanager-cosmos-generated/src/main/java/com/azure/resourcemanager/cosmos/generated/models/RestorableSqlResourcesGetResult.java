// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.resourcemanager.cosmos.generated.fluent.models.RestorableSqlResourcesGetResultInner;
import java.util.List;

/** An immutable client-side representation of RestorableSqlResourcesGetResult. */
public interface RestorableSqlResourcesGetResult {
    /**
     * Gets the id property: The unique resource identifier of the ARM resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the ARM resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of Azure resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the databaseName property: The name of the database available for restore.
     *
     * @return the databaseName value.
     */
    String databaseName();

    /**
     * Gets the collectionNames property: The names of the collections available for restore.
     *
     * @return the collectionNames value.
     */
    List<String> collectionNames();

    /**
     * Gets the inner com.azure.resourcemanager.cosmos.generated.fluent.models.RestorableSqlResourcesGetResultInner
     * object.
     *
     * @return the inner object.
     */
    RestorableSqlResourcesGetResultInner innerModel();
}
