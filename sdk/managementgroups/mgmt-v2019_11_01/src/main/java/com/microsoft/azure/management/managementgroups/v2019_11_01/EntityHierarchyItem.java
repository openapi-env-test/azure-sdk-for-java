/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2019_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The management group details for the hierarchy view.
 */
@JsonFlatten
public class EntityHierarchyItem extends ProxyResource {
    /**
     * The friendly name of the management group.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Permissions.
     * Possible values include: 'noaccess', 'view', 'edit', 'delete'.
     */
    @JsonProperty(value = "properties.permissions")
    private String permissions;

    /**
     * The list of children.
     */
    @JsonProperty(value = "properties.children")
    private List<EntityHierarchyItem> children;

    /**
     * Get the friendly name of the management group.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the friendly name of the management group.
     *
     * @param displayName the displayName value to set
     * @return the EntityHierarchyItem object itself.
     */
    public EntityHierarchyItem withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get possible values include: 'noaccess', 'view', 'edit', 'delete'.
     *
     * @return the permissions value
     */
    public String permissions() {
        return this.permissions;
    }

    /**
     * Set possible values include: 'noaccess', 'view', 'edit', 'delete'.
     *
     * @param permissions the permissions value to set
     * @return the EntityHierarchyItem object itself.
     */
    public EntityHierarchyItem withPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the list of children.
     *
     * @return the children value
     */
    public List<EntityHierarchyItem> children() {
        return this.children;
    }

    /**
     * Set the list of children.
     *
     * @param children the children value to set
     * @return the EntityHierarchyItem object itself.
     */
    public EntityHierarchyItem withChildren(List<EntityHierarchyItem> children) {
        this.children = children;
        return this;
    }

}
