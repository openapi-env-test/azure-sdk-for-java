// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerAutomaticTuningInner;
import com.azure.resourcemanager.sql.generated.models.AutomaticTuningOptionModeDesired;
import com.azure.resourcemanager.sql.generated.models.AutomaticTuningServerMode;
import com.azure.resourcemanager.sql.generated.models.AutomaticTuningServerOptions;
import java.util.HashMap;
import java.util.Map;

/** Samples for ServerAutomaticTuning Update. */
public final class ServerAutomaticTuningUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ServerAutomaticTuningUpdateMax.json
     */
    /**
     * Sample code: Updates server automatic tuning settings with all properties.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void updatesServerAutomaticTuningSettingsWithAllProperties(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .serverAutomaticTunings()
            .updateWithResponse(
                "default-sql-onebox",
                "testsvr11",
                new ServerAutomaticTuningInner()
                    .withDesiredState(AutomaticTuningServerMode.AUTO)
                    .withOptions(
                        mapOf(
                            "createIndex",
                            new AutomaticTuningServerOptions().withDesiredState(AutomaticTuningOptionModeDesired.OFF),
                            "dropIndex",
                            new AutomaticTuningServerOptions().withDesiredState(AutomaticTuningOptionModeDesired.ON),
                            "forceLastGoodPlan",
                            new AutomaticTuningServerOptions()
                                .withDesiredState(AutomaticTuningOptionModeDesired.DEFAULT))),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ServerAutomaticTuningUpdateMin.json
     */
    /**
     * Sample code: Updates server automatic tuning settings with minimal properties.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void updatesServerAutomaticTuningSettingsWithMinimalProperties(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .serverAutomaticTunings()
            .updateWithResponse(
                "default-sql-onebox",
                "testsvr11",
                new ServerAutomaticTuningInner().withDesiredState(AutomaticTuningServerMode.AUTO),
                Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
