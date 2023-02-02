// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;

/** Text settings. */
@Fluent
public final class LogFileSettingsText extends LogFileTextSettings {
    /** Creates an instance of LogFileSettingsText class. */
    public LogFileSettingsText() {
    }

    /** {@inheritDoc} */
    @Override
    public LogFileSettingsText withRecordStartTimestampFormat(
        KnownLogFileTextSettingsRecordStartTimestampFormat recordStartTimestampFormat) {
        super.withRecordStartTimestampFormat(recordStartTimestampFormat);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
