// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of the spark config properties file. */
public final class ConfigurationType extends ExpandableStringEnum<ConfigurationType> {
    /** Static value File for ConfigurationType. */
    public static final ConfigurationType FILE = fromString("File");

    /** Static value Artifact for ConfigurationType. */
    public static final ConfigurationType ARTIFACT = fromString("Artifact");

    /**
     * Creates or finds a ConfigurationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConfigurationType.
     */
    @JsonCreator
    public static ConfigurationType fromString(String name) {
        return fromString(name, ConfigurationType.class);
    }

    /**
     * Gets known ConfigurationType values.
     *
     * @return known ConfigurationType values.
     */
    public static Collection<ConfigurationType> values() {
        return values(ConfigurationType.class);
    }
}
