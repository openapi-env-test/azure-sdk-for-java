// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.devtestlabs.fluent.models.ArtifactInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of Artifact. */
public interface Artifact {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the title property: The artifact's title.
     *
     * @return the title value.
     */
    String title();

    /**
     * Gets the description property: The artifact's description.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the publisher property: The artifact's publisher.
     *
     * @return the publisher value.
     */
    String publisher();

    /**
     * Gets the filePath property: The file path to the artifact.
     *
     * @return the filePath value.
     */
    String filePath();

    /**
     * Gets the icon property: The URI to the artifact icon.
     *
     * @return the icon value.
     */
    String icon();

    /**
     * Gets the targetOsType property: The artifact's target OS.
     *
     * @return the targetOsType value.
     */
    String targetOsType();

    /**
     * Gets the parameters property: The artifact's parameters.
     *
     * @return the parameters value.
     */
    Object parameters();

    /**
     * Gets the createdDate property: The artifact's creation date.
     *
     * @return the createdDate value.
     */
    OffsetDateTime createdDate();

    /**
     * Gets the inner com.azure.resourcemanager.devtestlabs.fluent.models.ArtifactInner object.
     *
     * @return the inner object.
     */
    ArtifactInner innerModel();
}
