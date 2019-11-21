/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Details about app recovery operation.
 */
@JsonFlatten
public class SnapshotRecoveryRequest extends ProxyOnlyResource {
    /**
     * Point in time in which the app recovery should be attempted, formatted
     * as a DateTime string.
     */
    @JsonProperty(value = "properties.snapshotTime")
    private String snapshotTime;

    /**
     * Specifies the web app that snapshot contents will be written to.
     */
    @JsonProperty(value = "properties.recoveryTarget")
    private SnapshotRecoveryTarget recoveryTarget;

    /**
     * If &lt;code&gt;true&lt;/code&gt; the recovery operation can overwrite
     * source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.overwrite", required = true)
    private boolean overwrite;

    /**
     * If true, site configuration, in addition to content, will be reverted.
     */
    @JsonProperty(value = "properties.recoverConfiguration")
    private Boolean recoverConfiguration;

    /**
     * If true, custom hostname conflicts will be ignored when recovering to a
     * target web app.
     * This setting is only necessary when RecoverConfiguration is enabled.
     */
    @JsonProperty(value = "properties.ignoreConflictingHostNames")
    private Boolean ignoreConflictingHostNames;

    /**
     * Get point in time in which the app recovery should be attempted, formatted as a DateTime string.
     *
     * @return the snapshotTime value
     */
    public String snapshotTime() {
        return this.snapshotTime;
    }

    /**
     * Set point in time in which the app recovery should be attempted, formatted as a DateTime string.
     *
     * @param snapshotTime the snapshotTime value to set
     * @return the SnapshotRecoveryRequest object itself.
     */
    public SnapshotRecoveryRequest withSnapshotTime(String snapshotTime) {
        this.snapshotTime = snapshotTime;
        return this;
    }

    /**
     * Get specifies the web app that snapshot contents will be written to.
     *
     * @return the recoveryTarget value
     */
    public SnapshotRecoveryTarget recoveryTarget() {
        return this.recoveryTarget;
    }

    /**
     * Set specifies the web app that snapshot contents will be written to.
     *
     * @param recoveryTarget the recoveryTarget value to set
     * @return the SnapshotRecoveryRequest object itself.
     */
    public SnapshotRecoveryRequest withRecoveryTarget(SnapshotRecoveryTarget recoveryTarget) {
        this.recoveryTarget = recoveryTarget;
        return this;
    }

    /**
     * Get if &lt;code&gt;true&lt;/code&gt; the recovery operation can overwrite source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the overwrite value
     */
    public boolean overwrite() {
        return this.overwrite;
    }

    /**
     * Set if &lt;code&gt;true&lt;/code&gt; the recovery operation can overwrite source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param overwrite the overwrite value to set
     * @return the SnapshotRecoveryRequest object itself.
     */
    public SnapshotRecoveryRequest withOverwrite(boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    /**
     * Get if true, site configuration, in addition to content, will be reverted.
     *
     * @return the recoverConfiguration value
     */
    public Boolean recoverConfiguration() {
        return this.recoverConfiguration;
    }

    /**
     * Set if true, site configuration, in addition to content, will be reverted.
     *
     * @param recoverConfiguration the recoverConfiguration value to set
     * @return the SnapshotRecoveryRequest object itself.
     */
    public SnapshotRecoveryRequest withRecoverConfiguration(Boolean recoverConfiguration) {
        this.recoverConfiguration = recoverConfiguration;
        return this;
    }

    /**
     * Get if true, custom hostname conflicts will be ignored when recovering to a target web app.
     This setting is only necessary when RecoverConfiguration is enabled.
     *
     * @return the ignoreConflictingHostNames value
     */
    public Boolean ignoreConflictingHostNames() {
        return this.ignoreConflictingHostNames;
    }

    /**
     * Set if true, custom hostname conflicts will be ignored when recovering to a target web app.
     This setting is only necessary when RecoverConfiguration is enabled.
     *
     * @param ignoreConflictingHostNames the ignoreConflictingHostNames value to set
     * @return the SnapshotRecoveryRequest object itself.
     */
    public SnapshotRecoveryRequest withIgnoreConflictingHostNames(Boolean ignoreConflictingHostNames) {
        this.ignoreConflictingHostNames = ignoreConflictingHostNames;
        return this;
    }

}
