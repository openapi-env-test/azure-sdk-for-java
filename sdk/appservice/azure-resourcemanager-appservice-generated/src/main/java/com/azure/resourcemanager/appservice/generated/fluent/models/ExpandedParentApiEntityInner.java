// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** expanded parent object for expansion. */
@JsonFlatten
@Fluent
public class ExpandedParentApiEntityInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpandedParentApiEntityInner.class);

    /*
     * Id of connection provider
     */
    @JsonProperty(value = "properties.id")
    private String idPropertiesId;

    /*
     * Id of connection provider
     */
    @JsonProperty(value = "properties.entity")
    private ResponseMessageEnvelopeApiEntityInner entity;

    /*
     * Kind of resource
     */
    @JsonProperty(value = "kind")
    private String kind;

    /*
     * Resource Id
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Resource Name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Resource type
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the idPropertiesId property: Id of connection provider.
     *
     * @return the idPropertiesId value.
     */
    public String idPropertiesId() {
        return this.idPropertiesId;
    }

    /**
     * Set the idPropertiesId property: Id of connection provider.
     *
     * @param idPropertiesId the idPropertiesId value to set.
     * @return the ExpandedParentApiEntityInner object itself.
     */
    public ExpandedParentApiEntityInner withIdPropertiesId(String idPropertiesId) {
        this.idPropertiesId = idPropertiesId;
        return this;
    }

    /**
     * Get the entity property: Id of connection provider.
     *
     * @return the entity value.
     */
    public ResponseMessageEnvelopeApiEntityInner entity() {
        return this.entity;
    }

    /**
     * Set the entity property: Id of connection provider.
     *
     * @param entity the entity value to set.
     * @return the ExpandedParentApiEntityInner object itself.
     */
    public ExpandedParentApiEntityInner withEntity(ResponseMessageEnvelopeApiEntityInner entity) {
        this.entity = entity;
        return this;
    }

    /**
     * Get the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     *
     * @param kind the kind value to set.
     * @return the ExpandedParentApiEntityInner object itself.
     */
    public ExpandedParentApiEntityInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the id property: Resource Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource Id.
     *
     * @param id the id value to set.
     * @return the ExpandedParentApiEntityInner object itself.
     */
    public ExpandedParentApiEntityInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Resource Name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource Name.
     *
     * @param name the name value to set.
     * @return the ExpandedParentApiEntityInner object itself.
     */
    public ExpandedParentApiEntityInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type.
     *
     * @param type the type value to set.
     * @return the ExpandedParentApiEntityInner object itself.
     */
    public ExpandedParentApiEntityInner withType(String type) {
        this.type = type;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExpandedParentApiEntityInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExpandedParentApiEntityInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (entity() != null) {
            entity().validate();
        }
    }
}
