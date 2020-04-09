/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_03_01.TableGetPropertiesResource;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.TableGetPropertiesOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.ARMResourceProperties;

/**
 * An Azure Cosmos DB Table.
 */
@JsonFlatten
public class TableGetResultsInner extends ARMResourceProperties {
    /**
     * The resource property.
     */
    @JsonProperty(value = "properties.resource")
    private TableGetPropertiesResource resource;

    /**
     * The options property.
     */
    @JsonProperty(value = "properties.options")
    private TableGetPropertiesOptions options;

    /**
     * Get the resource value.
     *
     * @return the resource value
     */
    public TableGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource value.
     *
     * @param resource the resource value to set
     * @return the TableGetResultsInner object itself.
     */
    public TableGetResultsInner withResource(TableGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options value.
     *
     * @return the options value
     */
    public TableGetPropertiesOptions options() {
        return this.options;
    }

    /**
     * Set the options value.
     *
     * @param options the options value to set
     * @return the TableGetResultsInner object itself.
     */
    public TableGetResultsInner withOptions(TableGetPropertiesOptions options) {
        this.options = options;
        return this;
    }

}
