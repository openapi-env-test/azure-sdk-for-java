// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.advisor.models.Category;
import com.azure.resourcemanager.advisor.models.Impact;
import com.azure.resourcemanager.advisor.models.ResourceMetadata;
import com.azure.resourcemanager.advisor.models.Risk;
import com.azure.resourcemanager.advisor.models.ShortDescription;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** Advisor Recommendation. */
@Fluent
public final class ResourceRecommendationBaseInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceRecommendationBaseInner.class);

    /*
     * The properties of the recommendation.
     */
    @JsonProperty(value = "properties")
    private RecommendationProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of the recommendation.
     *
     * @return the innerProperties value.
     */
    private RecommendationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the category property: The category of the recommendation.
     *
     * @return the category value.
     */
    public Category category() {
        return this.innerProperties() == null ? null : this.innerProperties().category();
    }

    /**
     * Set the category property: The category of the recommendation.
     *
     * @param category the category value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withCategory(Category category) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withCategory(category);
        return this;
    }

    /**
     * Get the impact property: The business impact of the recommendation.
     *
     * @return the impact value.
     */
    public Impact impact() {
        return this.innerProperties() == null ? null : this.innerProperties().impact();
    }

    /**
     * Set the impact property: The business impact of the recommendation.
     *
     * @param impact the impact value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withImpact(Impact impact) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withImpact(impact);
        return this;
    }

    /**
     * Get the impactedField property: The resource type identified by Advisor.
     *
     * @return the impactedField value.
     */
    public String impactedField() {
        return this.innerProperties() == null ? null : this.innerProperties().impactedField();
    }

    /**
     * Set the impactedField property: The resource type identified by Advisor.
     *
     * @param impactedField the impactedField value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withImpactedField(String impactedField) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withImpactedField(impactedField);
        return this;
    }

    /**
     * Get the impactedValue property: The resource identified by Advisor.
     *
     * @return the impactedValue value.
     */
    public String impactedValue() {
        return this.innerProperties() == null ? null : this.innerProperties().impactedValue();
    }

    /**
     * Set the impactedValue property: The resource identified by Advisor.
     *
     * @param impactedValue the impactedValue value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withImpactedValue(String impactedValue) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withImpactedValue(impactedValue);
        return this;
    }

    /**
     * Get the lastUpdated property: The most recent time that Advisor checked the validity of the recommendation.
     *
     * @return the lastUpdated value.
     */
    public OffsetDateTime lastUpdated() {
        return this.innerProperties() == null ? null : this.innerProperties().lastUpdated();
    }

    /**
     * Set the lastUpdated property: The most recent time that Advisor checked the validity of the recommendation.
     *
     * @param lastUpdated the lastUpdated value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withLastUpdated(OffsetDateTime lastUpdated) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withLastUpdated(lastUpdated);
        return this;
    }

    /**
     * Get the metadata property: The recommendation metadata.
     *
     * @return the metadata value.
     */
    public Map<String, Object> metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
    }

    /**
     * Set the metadata property: The recommendation metadata.
     *
     * @param metadata the metadata value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withMetadata(Map<String, Object> metadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Get the recommendationTypeId property: The recommendation-type GUID.
     *
     * @return the recommendationTypeId value.
     */
    public String recommendationTypeId() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendationTypeId();
    }

    /**
     * Set the recommendationTypeId property: The recommendation-type GUID.
     *
     * @param recommendationTypeId the recommendationTypeId value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withRecommendationTypeId(String recommendationTypeId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withRecommendationTypeId(recommendationTypeId);
        return this;
    }

    /**
     * Get the risk property: The potential risk of not implementing the recommendation.
     *
     * @return the risk value.
     */
    public Risk risk() {
        return this.innerProperties() == null ? null : this.innerProperties().risk();
    }

    /**
     * Set the risk property: The potential risk of not implementing the recommendation.
     *
     * @param risk the risk value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withRisk(Risk risk) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withRisk(risk);
        return this;
    }

    /**
     * Get the shortDescription property: A summary of the recommendation.
     *
     * @return the shortDescription value.
     */
    public ShortDescription shortDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().shortDescription();
    }

    /**
     * Set the shortDescription property: A summary of the recommendation.
     *
     * @param shortDescription the shortDescription value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withShortDescription(ShortDescription shortDescription) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withShortDescription(shortDescription);
        return this;
    }

    /**
     * Get the suppressionIds property: The list of snoozed and dismissed rules for the recommendation.
     *
     * @return the suppressionIds value.
     */
    public List<UUID> suppressionIds() {
        return this.innerProperties() == null ? null : this.innerProperties().suppressionIds();
    }

    /**
     * Set the suppressionIds property: The list of snoozed and dismissed rules for the recommendation.
     *
     * @param suppressionIds the suppressionIds value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withSuppressionIds(List<UUID> suppressionIds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withSuppressionIds(suppressionIds);
        return this;
    }

    /**
     * Get the extendedProperties property: Extended properties.
     *
     * @return the extendedProperties value.
     */
    public Map<String, String> extendedProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().extendedProperties();
    }

    /**
     * Set the extendedProperties property: Extended properties.
     *
     * @param extendedProperties the extendedProperties value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withExtendedProperties(Map<String, String> extendedProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withExtendedProperties(extendedProperties);
        return this;
    }

    /**
     * Get the resourceMetadata property: Metadata of resource that was assessed.
     *
     * @return the resourceMetadata value.
     */
    public ResourceMetadata resourceMetadata() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceMetadata();
    }

    /**
     * Set the resourceMetadata property: Metadata of resource that was assessed.
     *
     * @param resourceMetadata the resourceMetadata value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withResourceMetadata(ResourceMetadata resourceMetadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withResourceMetadata(resourceMetadata);
        return this;
    }

    /**
     * Get the description property: The detailed description of recommendation.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The detailed description of recommendation.
     *
     * @param description the description value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the label property: The label of recommendation.
     *
     * @return the label value.
     */
    public String label() {
        return this.innerProperties() == null ? null : this.innerProperties().label();
    }

    /**
     * Set the label property: The label of recommendation.
     *
     * @param label the label value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withLabel(String label) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withLabel(label);
        return this;
    }

    /**
     * Get the learnMoreLink property: The link to learn more about recommendation and generation logic.
     *
     * @return the learnMoreLink value.
     */
    public String learnMoreLink() {
        return this.innerProperties() == null ? null : this.innerProperties().learnMoreLink();
    }

    /**
     * Set the learnMoreLink property: The link to learn more about recommendation and generation logic.
     *
     * @param learnMoreLink the learnMoreLink value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withLearnMoreLink(String learnMoreLink) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withLearnMoreLink(learnMoreLink);
        return this;
    }

    /**
     * Get the potentialBenefits property: The potential benefit of implementing recommendation.
     *
     * @return the potentialBenefits value.
     */
    public String potentialBenefits() {
        return this.innerProperties() == null ? null : this.innerProperties().potentialBenefits();
    }

    /**
     * Set the potentialBenefits property: The potential benefit of implementing recommendation.
     *
     * @param potentialBenefits the potentialBenefits value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withPotentialBenefits(String potentialBenefits) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withPotentialBenefits(potentialBenefits);
        return this;
    }

    /**
     * Get the actions property: The list of recommended actions to implement recommendation.
     *
     * @return the actions value.
     */
    public List<Map<String, Object>> actions() {
        return this.innerProperties() == null ? null : this.innerProperties().actions();
    }

    /**
     * Set the actions property: The list of recommended actions to implement recommendation.
     *
     * @param actions the actions value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withActions(List<Map<String, Object>> actions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withActions(actions);
        return this;
    }

    /**
     * Get the remediation property: The automated way to apply recommendation.
     *
     * @return the remediation value.
     */
    public Map<String, Object> remediation() {
        return this.innerProperties() == null ? null : this.innerProperties().remediation();
    }

    /**
     * Set the remediation property: The automated way to apply recommendation.
     *
     * @param remediation the remediation value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withRemediation(Map<String, Object> remediation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withRemediation(remediation);
        return this;
    }

    /**
     * Get the exposedMetadataProperties property: The recommendation metadata properties exposed to customer to provide
     * additional information.
     *
     * @return the exposedMetadataProperties value.
     */
    public Map<String, Object> exposedMetadataProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().exposedMetadataProperties();
    }

    /**
     * Set the exposedMetadataProperties property: The recommendation metadata properties exposed to customer to provide
     * additional information.
     *
     * @param exposedMetadataProperties the exposedMetadataProperties value to set.
     * @return the ResourceRecommendationBaseInner object itself.
     */
    public ResourceRecommendationBaseInner withExposedMetadataProperties(
        Map<String, Object> exposedMetadataProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withExposedMetadataProperties(exposedMetadataProperties);
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
