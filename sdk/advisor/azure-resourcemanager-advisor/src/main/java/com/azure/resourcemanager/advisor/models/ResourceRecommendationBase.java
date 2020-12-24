// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.models;

import com.azure.resourcemanager.advisor.fluent.models.ResourceRecommendationBaseInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** An immutable client-side representation of ResourceRecommendationBase. */
public interface ResourceRecommendationBase {
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
     * Gets the category property: The category of the recommendation.
     *
     * @return the category value.
     */
    Category category();

    /**
     * Gets the impact property: The business impact of the recommendation.
     *
     * @return the impact value.
     */
    Impact impact();

    /**
     * Gets the impactedField property: The resource type identified by Advisor.
     *
     * @return the impactedField value.
     */
    String impactedField();

    /**
     * Gets the impactedValue property: The resource identified by Advisor.
     *
     * @return the impactedValue value.
     */
    String impactedValue();

    /**
     * Gets the lastUpdated property: The most recent time that Advisor checked the validity of the recommendation.
     *
     * @return the lastUpdated value.
     */
    OffsetDateTime lastUpdated();

    /**
     * Gets the metadata property: The recommendation metadata.
     *
     * @return the metadata value.
     */
    Map<String, Object> metadata();

    /**
     * Gets the recommendationTypeId property: The recommendation-type GUID.
     *
     * @return the recommendationTypeId value.
     */
    String recommendationTypeId();

    /**
     * Gets the risk property: The potential risk of not implementing the recommendation.
     *
     * @return the risk value.
     */
    Risk risk();

    /**
     * Gets the shortDescription property: A summary of the recommendation.
     *
     * @return the shortDescription value.
     */
    ShortDescription shortDescription();

    /**
     * Gets the suppressionIds property: The list of snoozed and dismissed rules for the recommendation.
     *
     * @return the suppressionIds value.
     */
    List<UUID> suppressionIds();

    /**
     * Gets the extendedProperties property: Extended properties.
     *
     * @return the extendedProperties value.
     */
    Map<String, String> extendedProperties();

    /**
     * Gets the resourceMetadata property: Metadata of resource that was assessed.
     *
     * @return the resourceMetadata value.
     */
    ResourceMetadata resourceMetadata();

    /**
     * Gets the inner com.azure.resourcemanager.advisor.fluent.models.ResourceRecommendationBaseInner object.
     *
     * @return the inner object.
     */
    ResourceRecommendationBaseInner innerModel();
}
