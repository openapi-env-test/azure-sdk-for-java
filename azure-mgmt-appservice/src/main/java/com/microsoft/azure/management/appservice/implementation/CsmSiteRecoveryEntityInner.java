/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import org.joda.time.DateTime;

/**
 * Details about app recovery operation.
 */
public class CsmSiteRecoveryEntityInner {
    /**
     * Point in time in which the app recovery should be attempted.
     */
    private DateTime snapshotTime;

    /**
     * If &lt;code&gt;true&lt;/code&gt;, then the app's configuration will be
     * reverted to its state at &lt;code&gt;SnapshotTime&lt;/code&gt;.
     */
    private Boolean recoverConfig;

    /**
     * [Optional] Destination app name into which app should be recovered. This
     * is case when new app should be created instead.
     */
    private String siteName;

    /**
     * [Optional] Destination app slot name into which app should be recovered.
     */
    private String slotName;

    /**
     * Get the snapshotTime value.
     *
     * @return the snapshotTime value
     */
    public DateTime snapshotTime() {
        return this.snapshotTime;
    }

    /**
     * Set the snapshotTime value.
     *
     * @param snapshotTime the snapshotTime value to set
     * @return the CsmSiteRecoveryEntityInner object itself.
     */
    public CsmSiteRecoveryEntityInner withSnapshotTime(DateTime snapshotTime) {
        this.snapshotTime = snapshotTime;
        return this;
    }

    /**
     * Get the recoverConfig value.
     *
     * @return the recoverConfig value
     */
    public Boolean recoverConfig() {
        return this.recoverConfig;
    }

    /**
     * Set the recoverConfig value.
     *
     * @param recoverConfig the recoverConfig value to set
     * @return the CsmSiteRecoveryEntityInner object itself.
     */
    public CsmSiteRecoveryEntityInner withRecoverConfig(Boolean recoverConfig) {
        this.recoverConfig = recoverConfig;
        return this;
    }

    /**
     * Get the siteName value.
     *
     * @return the siteName value
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * Set the siteName value.
     *
     * @param siteName the siteName value to set
     * @return the CsmSiteRecoveryEntityInner object itself.
     */
    public CsmSiteRecoveryEntityInner withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * Get the slotName value.
     *
     * @return the slotName value
     */
    public String slotName() {
        return this.slotName;
    }

    /**
     * Set the slotName value.
     *
     * @param slotName the slotName value to set
     * @return the CsmSiteRecoveryEntityInner object itself.
     */
    public CsmSiteRecoveryEntityInner withSlotName(String slotName) {
        this.slotName = slotName;
        return this;
    }

}
