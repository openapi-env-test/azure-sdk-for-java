// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.AlertEntity;
import com.azure.resourcemanager.security.models.AlertSeverity;
import com.azure.resourcemanager.security.models.AlertStatus;
import com.azure.resourcemanager.security.models.Intent;
import com.azure.resourcemanager.security.models.ResourceIdentifier;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Security alert. */
@Fluent
public final class AlertInner extends ProxyResource {
    /*
     * describes security alert properties.
     */
    @JsonProperty(value = "properties")
    private AlertProperties innerProperties;

    /**
     * Get the innerProperties property: describes security alert properties.
     *
     * @return the innerProperties value.
     */
    private AlertProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the alertType property: Unique identifier for the detection logic (all alert instances from the same
     * detection logic will have the same alertType).
     *
     * @return the alertType value.
     */
    public String alertType() {
        return this.innerProperties() == null ? null : this.innerProperties().alertType();
    }

    /**
     * Get the systemAlertId property: Unique identifier for the alert.
     *
     * @return the systemAlertId value.
     */
    public String systemAlertId() {
        return this.innerProperties() == null ? null : this.innerProperties().systemAlertId();
    }

    /**
     * Get the productComponentName property: The name of Azure Security Center pricing tier which powering this alert.
     * Learn more: https://docs.microsoft.com/en-us/azure/security-center/security-center-pricing.
     *
     * @return the productComponentName value.
     */
    public String productComponentName() {
        return this.innerProperties() == null ? null : this.innerProperties().productComponentName();
    }

    /**
     * Get the alertDisplayName property: The display name of the alert.
     *
     * @return the alertDisplayName value.
     */
    public String alertDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().alertDisplayName();
    }

    /**
     * Get the description property: Description of the suspicious activity that was detected.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the severity property: The risk level of the threat that was detected. Learn more:
     * https://docs.microsoft.com/en-us/azure/security-center/security-center-alerts-overview#how-are-alerts-classified.
     *
     * @return the severity value.
     */
    public AlertSeverity severity() {
        return this.innerProperties() == null ? null : this.innerProperties().severity();
    }

    /**
     * Get the intent property: The kill chain related intent behind the alert. For list of supported values, and
     * explanations of Azure Security Center's supported kill chain intents.
     *
     * @return the intent value.
     */
    public Intent intent() {
        return this.innerProperties() == null ? null : this.innerProperties().intent();
    }

    /**
     * Get the startTimeUtc property: The UTC time of the first event or activity included in the alert in ISO8601
     * format.
     *
     * @return the startTimeUtc value.
     */
    public OffsetDateTime startTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().startTimeUtc();
    }

    /**
     * Get the endTimeUtc property: The UTC time of the last event or activity included in the alert in ISO8601 format.
     *
     * @return the endTimeUtc value.
     */
    public OffsetDateTime endTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().endTimeUtc();
    }

    /**
     * Get the resourceIdentifiers property: The resource identifiers that can be used to direct the alert to the right
     * product exposure group (tenant, workspace, subscription etc.). There can be multiple identifiers of different
     * type per alert.
     *
     * @return the resourceIdentifiers value.
     */
    public List<ResourceIdentifier> resourceIdentifiers() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceIdentifiers();
    }

    /**
     * Get the remediationSteps property: Manual action items to take to remediate the alert.
     *
     * @return the remediationSteps value.
     */
    public List<String> remediationSteps() {
        return this.innerProperties() == null ? null : this.innerProperties().remediationSteps();
    }

    /**
     * Get the vendorName property: The name of the vendor that raises the alert.
     *
     * @return the vendorName value.
     */
    public String vendorName() {
        return this.innerProperties() == null ? null : this.innerProperties().vendorName();
    }

    /**
     * Get the status property: The life cycle status of the alert.
     *
     * @return the status value.
     */
    public AlertStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the extendedLinks property: Links related to the alert.
     *
     * @return the extendedLinks value.
     */
    public List<Map<String, String>> extendedLinks() {
        return this.innerProperties() == null ? null : this.innerProperties().extendedLinks();
    }

    /**
     * Get the alertUri property: A direct link to the alert page in Azure Portal.
     *
     * @return the alertUri value.
     */
    public String alertUri() {
        return this.innerProperties() == null ? null : this.innerProperties().alertUri();
    }

    /**
     * Get the timeGeneratedUtc property: The UTC time the alert was generated in ISO8601 format.
     *
     * @return the timeGeneratedUtc value.
     */
    public OffsetDateTime timeGeneratedUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().timeGeneratedUtc();
    }

    /**
     * Get the productName property: The name of the product which published this alert (Azure Security Center, Azure
     * ATP, Microsoft Defender ATP, O365 ATP, MCAS, and so on).
     *
     * @return the productName value.
     */
    public String productName() {
        return this.innerProperties() == null ? null : this.innerProperties().productName();
    }

    /**
     * Get the processingEndTimeUtc property: The UTC processing end time of the alert in ISO8601 format.
     *
     * @return the processingEndTimeUtc value.
     */
    public OffsetDateTime processingEndTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().processingEndTimeUtc();
    }

    /**
     * Get the entities property: A list of entities related to the alert.
     *
     * @return the entities value.
     */
    public List<AlertEntity> entities() {
        return this.innerProperties() == null ? null : this.innerProperties().entities();
    }

    /**
     * Get the isIncident property: This field determines whether the alert is an incident (a compound grouping of
     * several alerts) or a single alert.
     *
     * @return the isIncident value.
     */
    public Boolean isIncident() {
        return this.innerProperties() == null ? null : this.innerProperties().isIncident();
    }

    /**
     * Get the correlationKey property: Key for corelating related alerts. Alerts with the same correlation key
     * considered to be related.
     *
     * @return the correlationKey value.
     */
    public String correlationKey() {
        return this.innerProperties() == null ? null : this.innerProperties().correlationKey();
    }

    /**
     * Get the extendedProperties property: Custom properties for the alert.
     *
     * @return the extendedProperties value.
     */
    public Map<String, String> extendedProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().extendedProperties();
    }

    /**
     * Set the extendedProperties property: Custom properties for the alert.
     *
     * @param extendedProperties the extendedProperties value to set.
     * @return the AlertInner object itself.
     */
    public AlertInner withExtendedProperties(Map<String, String> extendedProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AlertProperties();
        }
        this.innerProperties().withExtendedProperties(extendedProperties);
        return this;
    }

    /**
     * Get the compromisedEntity property: The display name of the resource most related to this alert.
     *
     * @return the compromisedEntity value.
     */
    public String compromisedEntity() {
        return this.innerProperties() == null ? null : this.innerProperties().compromisedEntity();
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
