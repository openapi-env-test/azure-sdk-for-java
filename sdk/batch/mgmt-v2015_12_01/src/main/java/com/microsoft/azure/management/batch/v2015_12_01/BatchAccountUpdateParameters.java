/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2015_12_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters supplied to the Update operation.
 */
@JsonFlatten
public class BatchAccountUpdateParameters {
    /**
     * The user specified tags associated with the account.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The properties related to auto storage account.
     */
    @JsonProperty(value = "properties.autoStorage")
    private AutoStorageBaseProperties autoStorage;

    /**
     * Get the user specified tags associated with the account.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the user specified tags associated with the account.
     *
     * @param tags the tags value to set
     * @return the BatchAccountUpdateParameters object itself.
     */
    public BatchAccountUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties related to auto storage account.
     *
     * @return the autoStorage value
     */
    public AutoStorageBaseProperties autoStorage() {
        return this.autoStorage;
    }

    /**
     * Set the properties related to auto storage account.
     *
     * @param autoStorage the autoStorage value to set
     * @return the BatchAccountUpdateParameters object itself.
     */
    public BatchAccountUpdateParameters withAutoStorage(AutoStorageBaseProperties autoStorage) {
        this.autoStorage = autoStorage;
        return this;
    }

}
