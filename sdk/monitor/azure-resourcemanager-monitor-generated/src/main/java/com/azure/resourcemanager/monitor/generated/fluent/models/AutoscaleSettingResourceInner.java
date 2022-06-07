// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.models.AutoscaleNotification;
import com.azure.resourcemanager.monitor.generated.models.AutoscaleProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The autoscale setting resource. */
@Fluent
public final class AutoscaleSettingResourceInner extends Resource {
    /*
     * The autoscale setting of the resource.
     */
    @JsonProperty(value = "properties", required = true)
    private AutoscaleSetting innerProperties = new AutoscaleSetting();

    /**
     * Get the innerProperties property: The autoscale setting of the resource.
     *
     * @return the innerProperties value.
     */
    private AutoscaleSetting innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AutoscaleSettingResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AutoscaleSettingResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the profiles property: the collection of automatic scaling profiles that specify different scaling parameters
     * for different time periods. A maximum of 20 profiles can be specified.
     *
     * @return the profiles value.
     */
    public List<AutoscaleProfile> profiles() {
        return this.innerProperties() == null ? null : this.innerProperties().profiles();
    }

    /**
     * Set the profiles property: the collection of automatic scaling profiles that specify different scaling parameters
     * for different time periods. A maximum of 20 profiles can be specified.
     *
     * @param profiles the profiles value to set.
     * @return the AutoscaleSettingResourceInner object itself.
     */
    public AutoscaleSettingResourceInner withProfiles(List<AutoscaleProfile> profiles) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutoscaleSetting();
        }
        this.innerProperties().withProfiles(profiles);
        return this;
    }

    /**
     * Get the notifications property: the collection of notifications.
     *
     * @return the notifications value.
     */
    public List<AutoscaleNotification> notifications() {
        return this.innerProperties() == null ? null : this.innerProperties().notifications();
    }

    /**
     * Set the notifications property: the collection of notifications.
     *
     * @param notifications the notifications value to set.
     * @return the AutoscaleSettingResourceInner object itself.
     */
    public AutoscaleSettingResourceInner withNotifications(List<AutoscaleNotification> notifications) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutoscaleSetting();
        }
        this.innerProperties().withNotifications(notifications);
        return this;
    }

    /**
     * Get the enabled property: the enabled flag. Specifies whether automatic scaling is enabled for the resource. The
     * default value is 'true'.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: the enabled flag. Specifies whether automatic scaling is enabled for the resource. The
     * default value is 'true'.
     *
     * @param enabled the enabled value to set.
     * @return the AutoscaleSettingResourceInner object itself.
     */
    public AutoscaleSettingResourceInner withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutoscaleSetting();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the name property: the name of the autoscale setting.
     *
     * @return the name value.
     */
    public String namePropertiesName() {
        return this.innerProperties() == null ? null : this.innerProperties().name();
    }

    /**
     * Set the name property: the name of the autoscale setting.
     *
     * @param name the name value to set.
     * @return the AutoscaleSettingResourceInner object itself.
     */
    public AutoscaleSettingResourceInner withNamePropertiesName(String name) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutoscaleSetting();
        }
        this.innerProperties().withName(name);
        return this;
    }

    /**
     * Get the targetResourceUri property: the resource identifier of the resource that the autoscale setting should be
     * added to.
     *
     * @return the targetResourceUri value.
     */
    public String targetResourceUri() {
        return this.innerProperties() == null ? null : this.innerProperties().targetResourceUri();
    }

    /**
     * Set the targetResourceUri property: the resource identifier of the resource that the autoscale setting should be
     * added to.
     *
     * @param targetResourceUri the targetResourceUri value to set.
     * @return the AutoscaleSettingResourceInner object itself.
     */
    public AutoscaleSettingResourceInner withTargetResourceUri(String targetResourceUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutoscaleSetting();
        }
        this.innerProperties().withTargetResourceUri(targetResourceUri);
        return this;
    }

    /**
     * Get the targetResourceLocation property: the location of the resource that the autoscale setting should be added
     * to.
     *
     * @return the targetResourceLocation value.
     */
    public String targetResourceLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().targetResourceLocation();
    }

    /**
     * Set the targetResourceLocation property: the location of the resource that the autoscale setting should be added
     * to.
     *
     * @param targetResourceLocation the targetResourceLocation value to set.
     * @return the AutoscaleSettingResourceInner object itself.
     */
    public AutoscaleSettingResourceInner withTargetResourceLocation(String targetResourceLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutoscaleSetting();
        }
        this.innerProperties().withTargetResourceLocation(targetResourceLocation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model AutoscaleSettingResourceInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AutoscaleSettingResourceInner.class);
}
