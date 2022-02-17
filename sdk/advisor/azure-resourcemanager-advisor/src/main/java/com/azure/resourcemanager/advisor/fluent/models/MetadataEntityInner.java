// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.advisor.models.MetadataSupportedValueDetail;
import com.azure.resourcemanager.advisor.models.Scenario;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The metadata entity contract. */
@Fluent
public final class MetadataEntityInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetadataEntityInner.class);

    /*
     * The resource Id of the metadata entity.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The type of the metadata entity.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The name of the metadata entity.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The metadata entity properties.
     */
    @JsonProperty(value = "properties")
    private MetadataEntityProperties innerProperties;

    /**
     * Get the id property: The resource Id of the metadata entity.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The resource Id of the metadata entity.
     *
     * @param id the id value to set.
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: The type of the metadata entity.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the metadata entity.
     *
     * @param type the type value to set.
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: The name of the metadata entity.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the metadata entity.
     *
     * @param name the name value to set.
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: The metadata entity properties.
     *
     * @return the innerProperties value.
     */
    private MetadataEntityProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the displayName property: The display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name.
     *
     * @param displayName the displayName value to set.
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataEntityProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the dependsOn property: The list of keys on which this entity depends on.
     *
     * @return the dependsOn value.
     */
    public List<String> dependsOn() {
        return this.innerProperties() == null ? null : this.innerProperties().dependsOn();
    }

    /**
     * Set the dependsOn property: The list of keys on which this entity depends on.
     *
     * @param dependsOn the dependsOn value to set.
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withDependsOn(List<String> dependsOn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataEntityProperties();
        }
        this.innerProperties().withDependsOn(dependsOn);
        return this;
    }

    /**
     * Get the applicableScenarios property: The list of scenarios applicable to this metadata entity.
     *
     * @return the applicableScenarios value.
     */
    public List<Scenario> applicableScenarios() {
        return this.innerProperties() == null ? null : this.innerProperties().applicableScenarios();
    }

    /**
     * Set the applicableScenarios property: The list of scenarios applicable to this metadata entity.
     *
     * @param applicableScenarios the applicableScenarios value to set.
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withApplicableScenarios(List<Scenario> applicableScenarios) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataEntityProperties();
        }
        this.innerProperties().withApplicableScenarios(applicableScenarios);
        return this;
    }

    /**
     * Get the supportedValues property: The list of supported values.
     *
     * @return the supportedValues value.
     */
    public List<MetadataSupportedValueDetail> supportedValues() {
        return this.innerProperties() == null ? null : this.innerProperties().supportedValues();
    }

    /**
     * Set the supportedValues property: The list of supported values.
     *
     * @param supportedValues the supportedValues value to set.
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withSupportedValues(List<MetadataSupportedValueDetail> supportedValues) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataEntityProperties();
        }
        this.innerProperties().withSupportedValues(supportedValues);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
