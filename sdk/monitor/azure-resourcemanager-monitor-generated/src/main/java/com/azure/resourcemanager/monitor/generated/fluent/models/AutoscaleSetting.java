// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.models.AutoscaleNotification;
import com.azure.resourcemanager.monitor.generated.models.AutoscaleProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A setting that contains all of the configuration for the automatic scaling of a resource. */
@Fluent
public final class AutoscaleSetting {
    /*
     * the collection of automatic scaling profiles that specify different
     * scaling parameters for different time periods. A maximum of 20 profiles
     * can be specified.
     */
    @JsonProperty(value = "profiles", required = true)
    private List<AutoscaleProfile> profiles;

    /*
     * the collection of notifications.
     */
    @JsonProperty(value = "notifications")
    private List<AutoscaleNotification> notifications;

    /*
     * the enabled flag. Specifies whether automatic scaling is enabled for the
     * resource. The default value is 'true'.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * the name of the autoscale setting.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * the resource identifier of the resource that the autoscale setting
     * should be added to.
     */
    @JsonProperty(value = "targetResourceUri")
    private String targetResourceUri;

    /*
     * the location of the resource that the autoscale setting should be added
     * to.
     */
    @JsonProperty(value = "targetResourceLocation")
    private String targetResourceLocation;

    /**
     * Get the profiles property: the collection of automatic scaling profiles that specify different scaling parameters
     * for different time periods. A maximum of 20 profiles can be specified.
     *
     * @return the profiles value.
     */
    public List<AutoscaleProfile> profiles() {
        return this.profiles;
    }

    /**
     * Set the profiles property: the collection of automatic scaling profiles that specify different scaling parameters
     * for different time periods. A maximum of 20 profiles can be specified.
     *
     * @param profiles the profiles value to set.
     * @return the AutoscaleSetting object itself.
     */
    public AutoscaleSetting withProfiles(List<AutoscaleProfile> profiles) {
        this.profiles = profiles;
        return this;
    }

    /**
     * Get the notifications property: the collection of notifications.
     *
     * @return the notifications value.
     */
    public List<AutoscaleNotification> notifications() {
        return this.notifications;
    }

    /**
     * Set the notifications property: the collection of notifications.
     *
     * @param notifications the notifications value to set.
     * @return the AutoscaleSetting object itself.
     */
    public AutoscaleSetting withNotifications(List<AutoscaleNotification> notifications) {
        this.notifications = notifications;
        return this;
    }

    /**
     * Get the enabled property: the enabled flag. Specifies whether automatic scaling is enabled for the resource. The
     * default value is 'true'.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: the enabled flag. Specifies whether automatic scaling is enabled for the resource. The
     * default value is 'true'.
     *
     * @param enabled the enabled value to set.
     * @return the AutoscaleSetting object itself.
     */
    public AutoscaleSetting withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the name property: the name of the autoscale setting.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: the name of the autoscale setting.
     *
     * @param name the name value to set.
     * @return the AutoscaleSetting object itself.
     */
    public AutoscaleSetting withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the targetResourceUri property: the resource identifier of the resource that the autoscale setting should be
     * added to.
     *
     * @return the targetResourceUri value.
     */
    public String targetResourceUri() {
        return this.targetResourceUri;
    }

    /**
     * Set the targetResourceUri property: the resource identifier of the resource that the autoscale setting should be
     * added to.
     *
     * @param targetResourceUri the targetResourceUri value to set.
     * @return the AutoscaleSetting object itself.
     */
    public AutoscaleSetting withTargetResourceUri(String targetResourceUri) {
        this.targetResourceUri = targetResourceUri;
        return this;
    }

    /**
     * Get the targetResourceLocation property: the location of the resource that the autoscale setting should be added
     * to.
     *
     * @return the targetResourceLocation value.
     */
    public String targetResourceLocation() {
        return this.targetResourceLocation;
    }

    /**
     * Set the targetResourceLocation property: the location of the resource that the autoscale setting should be added
     * to.
     *
     * @param targetResourceLocation the targetResourceLocation value to set.
     * @return the AutoscaleSetting object itself.
     */
    public AutoscaleSetting withTargetResourceLocation(String targetResourceLocation) {
        this.targetResourceLocation = targetResourceLocation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (profiles() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property profiles in model AutoscaleSetting"));
        } else {
            profiles().forEach(e -> e.validate());
        }
        if (notifications() != null) {
            notifications().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AutoscaleSetting.class);
}
