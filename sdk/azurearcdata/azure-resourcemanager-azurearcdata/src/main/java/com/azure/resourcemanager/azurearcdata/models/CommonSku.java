// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource model definition representing SKU for ARM resources. */
@Fluent
public class CommonSku {
    /*
     * The name of the SKU.  It is typically a letter+number code
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Whether dev/test is enabled. When the dev field is set to true, the
     * resource is used for dev/test purpose.
     */
    @JsonProperty(value = "dev")
    private Boolean dev;

    /*
     * The SKU size. When the name field is the combination of tier and some
     * other value, this would be the standalone code.
     */
    @JsonProperty(value = "size")
    private String size;

    /*
     * If the service has different generations of hardware, for the same SKU,
     * then that can be captured here.
     */
    @JsonProperty(value = "family")
    private String family;

    /*
     * If the SKU supports scale out/in then the capacity integer should be
     * included. If scale out/in is not possible for the resource this may be
     * omitted.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get the name property: The name of the SKU. It is typically a letter+number code.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the SKU. It is typically a letter+number code.
     *
     * @param name the name value to set.
     * @return the CommonSku object itself.
     */
    public CommonSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the dev property: Whether dev/test is enabled. When the dev field is set to true, the resource is used for
     * dev/test purpose.
     *
     * @return the dev value.
     */
    public Boolean dev() {
        return this.dev;
    }

    /**
     * Set the dev property: Whether dev/test is enabled. When the dev field is set to true, the resource is used for
     * dev/test purpose.
     *
     * @param dev the dev value to set.
     * @return the CommonSku object itself.
     */
    public CommonSku withDev(Boolean dev) {
        this.dev = dev;
        return this;
    }

    /**
     * Get the size property: The SKU size. When the name field is the combination of tier and some other value, this
     * would be the standalone code.
     *
     * @return the size value.
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size property: The SKU size. When the name field is the combination of tier and some other value, this
     * would be the standalone code.
     *
     * @param size the size value to set.
     * @return the CommonSku object itself.
     */
    public CommonSku withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the family property: If the service has different generations of hardware, for the same SKU, then that can be
     * captured here.
     *
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family property: If the service has different generations of hardware, for the same SKU, then that can be
     * captured here.
     *
     * @param family the family value to set.
     * @return the CommonSku object itself.
     */
    public CommonSku withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get the capacity property: If the SKU supports scale out/in then the capacity integer should be included. If
     * scale out/in is not possible for the resource this may be omitted.
     *
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: If the SKU supports scale out/in then the capacity integer should be included. If
     * scale out/in is not possible for the resource this may be omitted.
     *
     * @param capacity the capacity value to set.
     * @return the CommonSku object itself.
     */
    public CommonSku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model CommonSku"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CommonSku.class);
}
