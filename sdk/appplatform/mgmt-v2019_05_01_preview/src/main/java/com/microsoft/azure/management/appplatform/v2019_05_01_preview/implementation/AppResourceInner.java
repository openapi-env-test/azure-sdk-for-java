/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview.implementation;

import com.microsoft.azure.management.appplatform.v2019_05_01_preview.AppResourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * App resource payload.
 */
public class AppResourceInner extends ProxyResource {
    /**
     * Properties of the App resource.
     */
    @JsonProperty(value = "properties")
    private AppResourceProperties properties;

    /**
     * The GEO location of the application, always the same with its parent
     * resource.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get properties of the App resource.
     *
     * @return the properties value
     */
    public AppResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set properties of the App resource.
     *
     * @param properties the properties value to set
     * @return the AppResourceInner object itself.
     */
    public AppResourceInner withProperties(AppResourceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the GEO location of the application, always the same with its parent resource.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the GEO location of the application, always the same with its parent resource.
     *
     * @param location the location value to set
     * @return the AppResourceInner object itself.
     */
    public AppResourceInner withLocation(String location) {
        this.location = location;
        return this;
    }

}
