// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.resourcemanager.recoveryservicesbackup.models.AzureFileShareProtectionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureIaaSvmProtectionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureVmWorkloadProtectionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.DailyRetentionSchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.DailySchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.DayOfWeek;
import com.azure.resourcemanager.recoveryservicesbackup.models.HourlySchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.IaasvmPolicyType;
import com.azure.resourcemanager.recoveryservicesbackup.models.LogSchedulePolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.LongTermRetentionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.MonthOfYear;
import com.azure.resourcemanager.recoveryservicesbackup.models.MonthlyRetentionSchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.PolicyType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDuration;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDurationType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionScheduleFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.ScheduleRunType;
import com.azure.resourcemanager.recoveryservicesbackup.models.Settings;
import com.azure.resourcemanager.recoveryservicesbackup.models.SimpleRetentionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.SimpleSchedulePolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.SimpleSchedulePolicyV2;
import com.azure.resourcemanager.recoveryservicesbackup.models.SubProtectionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeekOfMonth;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeeklyRetentionFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeeklyRetentionSchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.WorkloadType;
import com.azure.resourcemanager.recoveryservicesbackup.models.YearlyRetentionSchedule;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for ProtectionPolicies CreateOrUpdate. */
public final class ProtectionPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/preview/2022-06-01-preview/examples/AzureWorkload/ProtectionPolicies_CreateOrUpdate_Complex.json
     */
    /**
     * Sample code: Create or Update Full Azure Workload Protection Policy.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void createOrUpdateFullAzureWorkloadProtectionPolicy(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .protectionPolicies()
            .define("testPolicy1")
            .withRegion((String) null)
            .withExistingVault("NetSDKTestRsVault", "SwaggerTestRg")
            .withProperties(
                new AzureVmWorkloadProtectionPolicy()
                    .withWorkLoadType(WorkloadType.SQLDATA_BASE)
                    .withSettings(new Settings().withTimeZone("Pacific Standard Time").withIssqlcompression(false))
                    .withSubProtectionPolicy(
                        Arrays
                            .asList(
                                new SubProtectionPolicy()
                                    .withPolicyType(PolicyType.FULL)
                                    .withSchedulePolicy(
                                        new SimpleSchedulePolicy()
                                            .withScheduleRunFrequency(ScheduleRunType.WEEKLY)
                                            .withScheduleRunDays(Arrays.asList(DayOfWeek.SUNDAY, DayOfWeek.TUESDAY))
                                            .withScheduleRunTimes(
                                                Arrays.asList(OffsetDateTime.parse("2018-01-24T10:00:00Z"))))
                                    .withRetentionPolicy(
                                        new LongTermRetentionPolicy()
                                            .withWeeklySchedule(
                                                new WeeklyRetentionSchedule()
                                                    .withDaysOfTheWeek(
                                                        Arrays.asList(DayOfWeek.SUNDAY, DayOfWeek.TUESDAY))
                                                    .withRetentionTimes(
                                                        Arrays.asList(OffsetDateTime.parse("2018-01-24T10:00:00Z")))
                                                    .withRetentionDuration(
                                                        new RetentionDuration()
                                                            .withCount(2)
                                                            .withDurationType(RetentionDurationType.WEEKS)))
                                            .withMonthlySchedule(
                                                new MonthlyRetentionSchedule()
                                                    .withRetentionScheduleFormatType(RetentionScheduleFormat.WEEKLY)
                                                    .withRetentionScheduleWeekly(
                                                        new WeeklyRetentionFormat()
                                                            .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                                            .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.SECOND)))
                                                    .withRetentionTimes(
                                                        Arrays.asList(OffsetDateTime.parse("2018-01-24T10:00:00Z")))
                                                    .withRetentionDuration(
                                                        new RetentionDuration()
                                                            .withCount(1)
                                                            .withDurationType(RetentionDurationType.MONTHS)))
                                            .withYearlySchedule(
                                                new YearlyRetentionSchedule()
                                                    .withRetentionScheduleFormatType(RetentionScheduleFormat.WEEKLY)
                                                    .withMonthsOfYear(
                                                        Arrays
                                                            .asList(
                                                                MonthOfYear.JANUARY,
                                                                MonthOfYear.JUNE,
                                                                MonthOfYear.DECEMBER))
                                                    .withRetentionScheduleWeekly(
                                                        new WeeklyRetentionFormat()
                                                            .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                                            .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.LAST)))
                                                    .withRetentionTimes(
                                                        Arrays.asList(OffsetDateTime.parse("2018-01-24T10:00:00Z")))
                                                    .withRetentionDuration(
                                                        new RetentionDuration()
                                                            .withCount(1)
                                                            .withDurationType(RetentionDurationType.YEARS)))),
                                new SubProtectionPolicy()
                                    .withPolicyType(PolicyType.DIFFERENTIAL)
                                    .withSchedulePolicy(
                                        new SimpleSchedulePolicy()
                                            .withScheduleRunFrequency(ScheduleRunType.WEEKLY)
                                            .withScheduleRunDays(Arrays.asList(DayOfWeek.FRIDAY))
                                            .withScheduleRunTimes(
                                                Arrays.asList(OffsetDateTime.parse("2018-01-24T10:00:00Z"))))
                                    .withRetentionPolicy(
                                        new SimpleRetentionPolicy()
                                            .withRetentionDuration(
                                                new RetentionDuration()
                                                    .withCount(8)
                                                    .withDurationType(RetentionDurationType.DAYS))),
                                new SubProtectionPolicy()
                                    .withPolicyType(PolicyType.LOG)
                                    .withSchedulePolicy(new LogSchedulePolicy().withScheduleFrequencyInMins(60))
                                    .withRetentionPolicy(
                                        new SimpleRetentionPolicy()
                                            .withRetentionDuration(
                                                new RetentionDuration()
                                                    .withCount(7)
                                                    .withDurationType(RetentionDurationType.DAYS))))))
            .create();
    }

    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/preview/2022-06-01-preview/examples/AzureIaasVm/ProtectionPolicies_CreateOrUpdate_Simple.json
     */
    /**
     * Sample code: Create or Update Simple Azure Vm Protection Policy.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void createOrUpdateSimpleAzureVmProtectionPolicy(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .protectionPolicies()
            .define("testPolicy1")
            .withRegion((String) null)
            .withExistingVault("NetSDKTestRsVault", "SwaggerTestRg")
            .withProperties(
                new AzureIaaSvmProtectionPolicy()
                    .withSchedulePolicy(
                        new SimpleSchedulePolicy()
                            .withScheduleRunFrequency(ScheduleRunType.DAILY)
                            .withScheduleRunTimes(Arrays.asList(OffsetDateTime.parse("2018-01-24T02:00:00Z"))))
                    .withRetentionPolicy(
                        new LongTermRetentionPolicy()
                            .withDailySchedule(
                                new DailyRetentionSchedule()
                                    .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2018-01-24T02:00:00Z")))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(1)
                                            .withDurationType(RetentionDurationType.DAYS))))
                    .withTimeZone("Pacific Standard Time"))
            .create();
    }

    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/preview/2022-06-01-preview/examples/AzureStorage/ProtectionPolicies_CreateOrUpdate_Daily.json
     */
    /**
     * Sample code: Create or Update Daily Azure Storage Protection Policy.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void createOrUpdateDailyAzureStorageProtectionPolicy(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .protectionPolicies()
            .define("dailyPolicy2")
            .withRegion((String) null)
            .withExistingVault("swaggertestvault", "SwaggerTestRg")
            .withProperties(
                new AzureFileShareProtectionPolicy()
                    .withWorkLoadType(WorkloadType.AZURE_FILE_SHARE)
                    .withSchedulePolicy(
                        new SimpleSchedulePolicy()
                            .withScheduleRunFrequency(ScheduleRunType.DAILY)
                            .withScheduleRunTimes(Arrays.asList(OffsetDateTime.parse("2021-09-29T08:00:00.000Z"))))
                    .withRetentionPolicy(
                        new LongTermRetentionPolicy()
                            .withDailySchedule(
                                new DailyRetentionSchedule()
                                    .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2021-09-29T08:00:00.000Z")))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(5)
                                            .withDurationType(RetentionDurationType.DAYS)))
                            .withWeeklySchedule(
                                new WeeklyRetentionSchedule()
                                    .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                    .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2021-09-29T08:00:00.000Z")))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(12)
                                            .withDurationType(RetentionDurationType.WEEKS)))
                            .withMonthlySchedule(
                                new MonthlyRetentionSchedule()
                                    .withRetentionScheduleFormatType(RetentionScheduleFormat.WEEKLY)
                                    .withRetentionScheduleWeekly(
                                        new WeeklyRetentionFormat()
                                            .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                            .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.FIRST)))
                                    .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2021-09-29T08:00:00.000Z")))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(60)
                                            .withDurationType(RetentionDurationType.MONTHS)))
                            .withYearlySchedule(
                                new YearlyRetentionSchedule()
                                    .withRetentionScheduleFormatType(RetentionScheduleFormat.WEEKLY)
                                    .withMonthsOfYear(Arrays.asList(MonthOfYear.JANUARY))
                                    .withRetentionScheduleWeekly(
                                        new WeeklyRetentionFormat()
                                            .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                            .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.FIRST)))
                                    .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2021-09-29T08:00:00.000Z")))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(10)
                                            .withDurationType(RetentionDurationType.YEARS))))
                    .withTimeZone("UTC"))
            .create();
    }

    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/preview/2022-06-01-preview/examples/AzureStorage/ProtectionPolicies_CreateOrUpdate_Hourly.json
     */
    /**
     * Sample code: Create or Update Hourly Azure Storage Protection Policy.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void createOrUpdateHourlyAzureStorageProtectionPolicy(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .protectionPolicies()
            .define("newPolicy2")
            .withRegion((String) null)
            .withExistingVault("swaggertestvault", "SwaggerTestRg")
            .withProperties(
                new AzureFileShareProtectionPolicy()
                    .withWorkLoadType(WorkloadType.AZURE_FILE_SHARE)
                    .withSchedulePolicy(
                        new SimpleSchedulePolicy()
                            .withScheduleRunFrequency(ScheduleRunType.HOURLY)
                            .withHourlySchedule(
                                new HourlySchedule()
                                    .withInterval(4)
                                    .withScheduleWindowStartTime(OffsetDateTime.parse("2021-09-29T08:00:00.000Z"))
                                    .withScheduleWindowDuration(12)))
                    .withRetentionPolicy(
                        new LongTermRetentionPolicy()
                            .withDailySchedule(
                                new DailyRetentionSchedule()
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(5)
                                            .withDurationType(RetentionDurationType.DAYS)))
                            .withWeeklySchedule(
                                new WeeklyRetentionSchedule()
                                    .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(12)
                                            .withDurationType(RetentionDurationType.WEEKS)))
                            .withMonthlySchedule(
                                new MonthlyRetentionSchedule()
                                    .withRetentionScheduleFormatType(RetentionScheduleFormat.WEEKLY)
                                    .withRetentionScheduleWeekly(
                                        new WeeklyRetentionFormat()
                                            .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                            .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.FIRST)))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(60)
                                            .withDurationType(RetentionDurationType.MONTHS)))
                            .withYearlySchedule(
                                new YearlyRetentionSchedule()
                                    .withRetentionScheduleFormatType(RetentionScheduleFormat.WEEKLY)
                                    .withMonthsOfYear(Arrays.asList(MonthOfYear.JANUARY))
                                    .withRetentionScheduleWeekly(
                                        new WeeklyRetentionFormat()
                                            .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                            .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.FIRST)))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(10)
                                            .withDurationType(RetentionDurationType.YEARS))))
                    .withTimeZone("UTC"))
            .create();
    }

    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/preview/2022-06-01-preview/examples/AzureIaasVm/ProtectionPolicies_CreateOrUpdate_Complex.json
     */
    /**
     * Sample code: Create or Update Full Azure Vm Protection Policy.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void createOrUpdateFullAzureVmProtectionPolicy(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .protectionPolicies()
            .define("testPolicy1")
            .withRegion((String) null)
            .withExistingVault("NetSDKTestRsVault", "SwaggerTestRg")
            .withProperties(
                new AzureIaaSvmProtectionPolicy()
                    .withSchedulePolicy(
                        new SimpleSchedulePolicy()
                            .withScheduleRunFrequency(ScheduleRunType.WEEKLY)
                            .withScheduleRunDays(
                                Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY))
                            .withScheduleRunTimes(Arrays.asList(OffsetDateTime.parse("2018-01-24T10:00:00Z"))))
                    .withRetentionPolicy(
                        new LongTermRetentionPolicy()
                            .withWeeklySchedule(
                                new WeeklyRetentionSchedule()
                                    .withDaysOfTheWeek(
                                        Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY))
                                    .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2018-01-24T10:00:00Z")))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(1)
                                            .withDurationType(RetentionDurationType.WEEKS)))
                            .withMonthlySchedule(
                                new MonthlyRetentionSchedule()
                                    .withRetentionScheduleFormatType(RetentionScheduleFormat.WEEKLY)
                                    .withRetentionScheduleWeekly(
                                        new WeeklyRetentionFormat()
                                            .withDaysOfTheWeek(Arrays.asList(DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY))
                                            .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.FIRST, WeekOfMonth.THIRD)))
                                    .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2018-01-24T10:00:00Z")))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(2)
                                            .withDurationType(RetentionDurationType.MONTHS)))
                            .withYearlySchedule(
                                new YearlyRetentionSchedule()
                                    .withRetentionScheduleFormatType(RetentionScheduleFormat.WEEKLY)
                                    .withMonthsOfYear(Arrays.asList(MonthOfYear.FEBRUARY, MonthOfYear.NOVEMBER))
                                    .withRetentionScheduleWeekly(
                                        new WeeklyRetentionFormat()
                                            .withDaysOfTheWeek(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.THURSDAY))
                                            .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.FOURTH)))
                                    .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2018-01-24T10:00:00Z")))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(4)
                                            .withDurationType(RetentionDurationType.YEARS))))
                    .withTimeZone("Pacific Standard Time"))
            .create();
    }

    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/preview/2022-06-01-preview/examples/AzureIaasVm/V2Policy/IaaS_v2_hourly.json
     */
    /**
     * Sample code: Create or Update Enhanced Azure Vm Protection Policy with Hourly backup.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void createOrUpdateEnhancedAzureVmProtectionPolicyWithHourlyBackup(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .protectionPolicies()
            .define("v2-daily-sample")
            .withRegion((String) null)
            .withExistingVault("NetSDKTestRsVault", "SwaggerTestRg")
            .withProperties(
                new AzureIaaSvmProtectionPolicy()
                    .withSchedulePolicy(
                        new SimpleSchedulePolicyV2()
                            .withScheduleRunFrequency(ScheduleRunType.HOURLY)
                            .withHourlySchedule(
                                new HourlySchedule()
                                    .withInterval(4)
                                    .withScheduleWindowStartTime(OffsetDateTime.parse("2021-12-17T08:00:00Z"))
                                    .withScheduleWindowDuration(16)))
                    .withRetentionPolicy(
                        new LongTermRetentionPolicy()
                            .withDailySchedule(
                                new DailyRetentionSchedule()
                                    .withRetentionTimes(
                                        Arrays.asList(OffsetDateTime.parse("2021-12-17T08:00:00+00:00")))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(180)
                                            .withDurationType(RetentionDurationType.DAYS)))
                            .withWeeklySchedule(
                                new WeeklyRetentionSchedule()
                                    .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                    .withRetentionTimes(
                                        Arrays.asList(OffsetDateTime.parse("2021-12-17T08:00:00+00:00")))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(12)
                                            .withDurationType(RetentionDurationType.WEEKS)))
                            .withMonthlySchedule(
                                new MonthlyRetentionSchedule()
                                    .withRetentionScheduleFormatType(RetentionScheduleFormat.WEEKLY)
                                    .withRetentionScheduleWeekly(
                                        new WeeklyRetentionFormat()
                                            .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                            .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.FIRST)))
                                    .withRetentionTimes(
                                        Arrays.asList(OffsetDateTime.parse("2021-12-17T08:00:00+00:00")))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(60)
                                            .withDurationType(RetentionDurationType.MONTHS)))
                            .withYearlySchedule(
                                new YearlyRetentionSchedule()
                                    .withRetentionScheduleFormatType(RetentionScheduleFormat.WEEKLY)
                                    .withMonthsOfYear(Arrays.asList(MonthOfYear.JANUARY))
                                    .withRetentionScheduleWeekly(
                                        new WeeklyRetentionFormat()
                                            .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                            .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.FIRST)))
                                    .withRetentionTimes(
                                        Arrays.asList(OffsetDateTime.parse("2021-12-17T08:00:00+00:00")))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(10)
                                            .withDurationType(RetentionDurationType.YEARS))))
                    .withInstantRpRetentionRangeInDays(30)
                    .withTimeZone("India Standard Time")
                    .withPolicyType(IaasvmPolicyType.V2))
            .create();
    }

    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/preview/2022-06-01-preview/examples/AzureIaasVm/V2Policy/IaaS_v2_daily.json
     */
    /**
     * Sample code: Create or Update Enhanced Azure Vm Protection Policy with daily backup.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void createOrUpdateEnhancedAzureVmProtectionPolicyWithDailyBackup(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .protectionPolicies()
            .define("v2-daily-sample")
            .withRegion((String) null)
            .withExistingVault("NetSDKTestRsVault", "SwaggerTestRg")
            .withProperties(
                new AzureIaaSvmProtectionPolicy()
                    .withSchedulePolicy(
                        new SimpleSchedulePolicyV2()
                            .withScheduleRunFrequency(ScheduleRunType.DAILY)
                            .withDailySchedule(
                                new DailySchedule()
                                    .withScheduleRunTimes(Arrays.asList(OffsetDateTime.parse("2018-01-24T10:00:00Z")))))
                    .withRetentionPolicy(
                        new LongTermRetentionPolicy()
                            .withDailySchedule(
                                new DailyRetentionSchedule()
                                    .withRetentionTimes(
                                        Arrays.asList(OffsetDateTime.parse("2021-12-17T08:00:00+00:00")))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(180)
                                            .withDurationType(RetentionDurationType.DAYS)))
                            .withWeeklySchedule(
                                new WeeklyRetentionSchedule()
                                    .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                    .withRetentionTimes(
                                        Arrays.asList(OffsetDateTime.parse("2021-12-17T08:00:00+00:00")))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(12)
                                            .withDurationType(RetentionDurationType.WEEKS)))
                            .withMonthlySchedule(
                                new MonthlyRetentionSchedule()
                                    .withRetentionScheduleFormatType(RetentionScheduleFormat.WEEKLY)
                                    .withRetentionScheduleWeekly(
                                        new WeeklyRetentionFormat()
                                            .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                            .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.FIRST)))
                                    .withRetentionTimes(
                                        Arrays.asList(OffsetDateTime.parse("2021-12-17T08:00:00+00:00")))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(60)
                                            .withDurationType(RetentionDurationType.MONTHS)))
                            .withYearlySchedule(
                                new YearlyRetentionSchedule()
                                    .withRetentionScheduleFormatType(RetentionScheduleFormat.WEEKLY)
                                    .withMonthsOfYear(Arrays.asList(MonthOfYear.JANUARY))
                                    .withRetentionScheduleWeekly(
                                        new WeeklyRetentionFormat()
                                            .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                            .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.FIRST)))
                                    .withRetentionTimes(
                                        Arrays.asList(OffsetDateTime.parse("2021-12-17T08:00:00+00:00")))
                                    .withRetentionDuration(
                                        new RetentionDuration()
                                            .withCount(10)
                                            .withDurationType(RetentionDurationType.YEARS))))
                    .withInstantRpRetentionRangeInDays(30)
                    .withTimeZone("India Standard Time")
                    .withPolicyType(IaasvmPolicyType.V2))
            .create();
    }
}
