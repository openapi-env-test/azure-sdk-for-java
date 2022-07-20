// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.generated;

import com.azure.resourcemanager.redis.generated.models.DayOfWeek;
import com.azure.resourcemanager.redis.generated.models.DefaultName;
import com.azure.resourcemanager.redis.generated.models.ScheduleEntry;
import java.time.Duration;
import java.util.Arrays;

/** Samples for PatchSchedules CreateOrUpdate. */
public final class PatchSchedulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2021-06-01/examples/RedisCachePatchSchedulesCreateOrUpdate.json
     */
    /**
     * Sample code: RedisCachePatchSchedulesCreateOrUpdate.
     *
     * @param manager Entry point to RedisManager.
     */
    public static void redisCachePatchSchedulesCreateOrUpdate(
        com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager
            .patchSchedules()
            .define(DefaultName.DEFAULT)
            .withExistingRedi("rg1", "cache1")
            .withScheduleEntries(
                Arrays
                    .asList(
                        new ScheduleEntry()
                            .withDayOfWeek(DayOfWeek.MONDAY)
                            .withStartHourUtc(12)
                            .withMaintenanceWindow(Duration.parse("PT5H")),
                        new ScheduleEntry().withDayOfWeek(DayOfWeek.TUESDAY).withStartHourUtc(12)))
            .create();
    }
}
