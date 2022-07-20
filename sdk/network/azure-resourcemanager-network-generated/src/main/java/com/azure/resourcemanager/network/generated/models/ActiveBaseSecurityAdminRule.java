// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** Network base admin rule. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = ActiveBaseSecurityAdminRule.class)
@JsonTypeName("ActiveBaseSecurityAdminRule")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Custom", value = ActiveSecurityAdminRule.class),
    @JsonSubTypes.Type(name = "Default", value = ActiveDefaultSecurityAdminRule.class)
})
@Fluent
public class ActiveBaseSecurityAdminRule {
    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Deployment time string.
     */
    @JsonProperty(value = "commitTime")
    private OffsetDateTime commitTime;

    /*
     * Deployment region.
     */
    @JsonProperty(value = "region")
    private String region;

    /*
     * A description of the security admin configuration.
     */
    @JsonProperty(value = "configurationDescription")
    private String configurationDescription;

    /*
     * A description of the rule collection.
     */
    @JsonProperty(value = "ruleCollectionDescription")
    private String ruleCollectionDescription;

    /*
     * Groups for rule collection
     */
    @JsonProperty(value = "ruleCollectionAppliesToGroups")
    private List<NetworkManagerSecurityGroupItem> ruleCollectionAppliesToGroups;

    /*
     * Effective configuration groups.
     */
    @JsonProperty(value = "ruleGroups")
    private List<ConfigurationGroup> ruleGroups;

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the ActiveBaseSecurityAdminRule object itself.
     */
    public ActiveBaseSecurityAdminRule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the commitTime property: Deployment time string.
     *
     * @return the commitTime value.
     */
    public OffsetDateTime commitTime() {
        return this.commitTime;
    }

    /**
     * Set the commitTime property: Deployment time string.
     *
     * @param commitTime the commitTime value to set.
     * @return the ActiveBaseSecurityAdminRule object itself.
     */
    public ActiveBaseSecurityAdminRule withCommitTime(OffsetDateTime commitTime) {
        this.commitTime = commitTime;
        return this;
    }

    /**
     * Get the region property: Deployment region.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: Deployment region.
     *
     * @param region the region value to set.
     * @return the ActiveBaseSecurityAdminRule object itself.
     */
    public ActiveBaseSecurityAdminRule withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the configurationDescription property: A description of the security admin configuration.
     *
     * @return the configurationDescription value.
     */
    public String configurationDescription() {
        return this.configurationDescription;
    }

    /**
     * Set the configurationDescription property: A description of the security admin configuration.
     *
     * @param configurationDescription the configurationDescription value to set.
     * @return the ActiveBaseSecurityAdminRule object itself.
     */
    public ActiveBaseSecurityAdminRule withConfigurationDescription(String configurationDescription) {
        this.configurationDescription = configurationDescription;
        return this;
    }

    /**
     * Get the ruleCollectionDescription property: A description of the rule collection.
     *
     * @return the ruleCollectionDescription value.
     */
    public String ruleCollectionDescription() {
        return this.ruleCollectionDescription;
    }

    /**
     * Set the ruleCollectionDescription property: A description of the rule collection.
     *
     * @param ruleCollectionDescription the ruleCollectionDescription value to set.
     * @return the ActiveBaseSecurityAdminRule object itself.
     */
    public ActiveBaseSecurityAdminRule withRuleCollectionDescription(String ruleCollectionDescription) {
        this.ruleCollectionDescription = ruleCollectionDescription;
        return this;
    }

    /**
     * Get the ruleCollectionAppliesToGroups property: Groups for rule collection.
     *
     * @return the ruleCollectionAppliesToGroups value.
     */
    public List<NetworkManagerSecurityGroupItem> ruleCollectionAppliesToGroups() {
        return this.ruleCollectionAppliesToGroups;
    }

    /**
     * Set the ruleCollectionAppliesToGroups property: Groups for rule collection.
     *
     * @param ruleCollectionAppliesToGroups the ruleCollectionAppliesToGroups value to set.
     * @return the ActiveBaseSecurityAdminRule object itself.
     */
    public ActiveBaseSecurityAdminRule withRuleCollectionAppliesToGroups(
        List<NetworkManagerSecurityGroupItem> ruleCollectionAppliesToGroups) {
        this.ruleCollectionAppliesToGroups = ruleCollectionAppliesToGroups;
        return this;
    }

    /**
     * Get the ruleGroups property: Effective configuration groups.
     *
     * @return the ruleGroups value.
     */
    public List<ConfigurationGroup> ruleGroups() {
        return this.ruleGroups;
    }

    /**
     * Set the ruleGroups property: Effective configuration groups.
     *
     * @param ruleGroups the ruleGroups value to set.
     * @return the ActiveBaseSecurityAdminRule object itself.
     */
    public ActiveBaseSecurityAdminRule withRuleGroups(List<ConfigurationGroup> ruleGroups) {
        this.ruleGroups = ruleGroups;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleCollectionAppliesToGroups() != null) {
            ruleCollectionAppliesToGroups().forEach(e -> e.validate());
        }
        if (ruleGroups() != null) {
            ruleGroups().forEach(e -> e.validate());
        }
    }
}
