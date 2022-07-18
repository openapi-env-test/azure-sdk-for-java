// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.datamigration.models.ResourceSkuCapabilities;
import com.azure.resourcemanager.datamigration.models.ResourceSkuCapacity;
import com.azure.resourcemanager.datamigration.models.ResourceSkuCosts;
import com.azure.resourcemanager.datamigration.models.ResourceSkuRestrictions;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes an available DMS SKU. */
@Immutable
public final class ResourceSkuInner {
    /*
     * The type of resource the SKU applies to.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /*
     * The name of SKU.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Specifies the tier of DMS in a scale set.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private String tier;

    /*
     * The Size of the SKU.
     */
    @JsonProperty(value = "size", access = JsonProperty.Access.WRITE_ONLY)
    private String size;

    /*
     * The Family of this particular SKU.
     */
    @JsonProperty(value = "family", access = JsonProperty.Access.WRITE_ONLY)
    private String family;

    /*
     * The Kind of resources that are supported in this SKU.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Not used.
     */
    @JsonProperty(value = "capacity", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceSkuCapacity capacity;

    /*
     * The set of locations that the SKU is available.
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> locations;

    /*
     * The api versions that support this SKU.
     */
    @JsonProperty(value = "apiVersions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> apiVersions;

    /*
     * Metadata for retrieving price info.
     */
    @JsonProperty(value = "costs", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceSkuCosts> costs;

    /*
     * A name value pair to describe the capability.
     */
    @JsonProperty(value = "capabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceSkuCapabilities> capabilities;

    /*
     * The restrictions because of which SKU cannot be used. This is empty if
     * there are no restrictions.
     */
    @JsonProperty(value = "restrictions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceSkuRestrictions> restrictions;

    /**
     * Get the resourceType property: The type of resource the SKU applies to.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the name property: The name of SKU.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the tier property: Specifies the tier of DMS in a scale set.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Get the size property: The Size of the SKU.
     *
     * @return the size value.
     */
    public String size() {
        return this.size;
    }

    /**
     * Get the family property: The Family of this particular SKU.
     *
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Get the kind property: The Kind of resources that are supported in this SKU.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the capacity property: Not used.
     *
     * @return the capacity value.
     */
    public ResourceSkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Get the locations property: The set of locations that the SKU is available.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Get the apiVersions property: The api versions that support this SKU.
     *
     * @return the apiVersions value.
     */
    public List<String> apiVersions() {
        return this.apiVersions;
    }

    /**
     * Get the costs property: Metadata for retrieving price info.
     *
     * @return the costs value.
     */
    public List<ResourceSkuCosts> costs() {
        return this.costs;
    }

    /**
     * Get the capabilities property: A name value pair to describe the capability.
     *
     * @return the capabilities value.
     */
    public List<ResourceSkuCapabilities> capabilities() {
        return this.capabilities;
    }

    /**
     * Get the restrictions property: The restrictions because of which SKU cannot be used. This is empty if there are
     * no restrictions.
     *
     * @return the restrictions value.
     */
    public List<ResourceSkuRestrictions> restrictions() {
        return this.restrictions;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capacity() != null) {
            capacity().validate();
        }
        if (costs() != null) {
            costs().forEach(e -> e.validate());
        }
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
        if (restrictions() != null) {
            restrictions().forEach(e -> e.validate());
        }
    }
}
