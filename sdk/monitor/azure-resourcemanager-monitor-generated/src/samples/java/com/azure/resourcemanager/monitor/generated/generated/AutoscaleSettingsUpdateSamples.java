// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.models.AutoscaleNotification;
import com.azure.resourcemanager.monitor.generated.models.AutoscaleProfile;
import com.azure.resourcemanager.monitor.generated.models.AutoscaleSettingResource;
import com.azure.resourcemanager.monitor.generated.models.ComparisonOperationType;
import com.azure.resourcemanager.monitor.generated.models.EmailNotification;
import com.azure.resourcemanager.monitor.generated.models.MetricStatisticType;
import com.azure.resourcemanager.monitor.generated.models.MetricTrigger;
import com.azure.resourcemanager.monitor.generated.models.PredictiveAutoscalePolicy;
import com.azure.resourcemanager.monitor.generated.models.PredictiveAutoscalePolicyScaleMode;
import com.azure.resourcemanager.monitor.generated.models.Recurrence;
import com.azure.resourcemanager.monitor.generated.models.RecurrenceFrequency;
import com.azure.resourcemanager.monitor.generated.models.RecurrentSchedule;
import com.azure.resourcemanager.monitor.generated.models.ScaleAction;
import com.azure.resourcemanager.monitor.generated.models.ScaleCapacity;
import com.azure.resourcemanager.monitor.generated.models.ScaleDirection;
import com.azure.resourcemanager.monitor.generated.models.ScaleRule;
import com.azure.resourcemanager.monitor.generated.models.ScaleType;
import com.azure.resourcemanager.monitor.generated.models.TimeAggregationType;
import com.azure.resourcemanager.monitor.generated.models.TimeWindow;
import com.azure.resourcemanager.monitor.generated.models.WebhookNotification;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for AutoscaleSettings Update. */
public final class AutoscaleSettingsUpdateSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2022-10-01/examples/patchAutoscaleSetting.json
     */
    /**
     * Sample code: Patch an autoscale setting.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void patchAnAutoscaleSetting(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        AutoscaleSettingResource resource =
            manager
                .autoscaleSettings()
                .getByResourceGroupWithResponse("TestingMetricsScaleSet", "MySetting", Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key1", "value1"))
            .withProfiles(
                Arrays
                    .asList(
                        new AutoscaleProfile()
                            .withName("adios")
                            .withCapacity(
                                new ScaleCapacity().withMinimum("1").withMaximum("10").withDefaultProperty("1"))
                            .withRules(
                                Arrays
                                    .asList(
                                        new ScaleRule()
                                            .withMetricTrigger(
                                                new MetricTrigger()
                                                    .withMetricName("Percentage CPU")
                                                    .withMetricResourceUri(
                                                        "/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/Microsoft.Compute/virtualMachineScaleSets/testingsc")
                                                    .withTimeGrain(Duration.parse("PT1M"))
                                                    .withStatistic(MetricStatisticType.AVERAGE)
                                                    .withTimeWindow(Duration.parse("PT5M"))
                                                    .withTimeAggregation(TimeAggregationType.AVERAGE)
                                                    .withOperator(ComparisonOperationType.GREATER_THAN)
                                                    .withThreshold(10.0)
                                                    .withDividePerInstance(false))
                                            .withScaleAction(
                                                new ScaleAction()
                                                    .withDirection(ScaleDirection.INCREASE)
                                                    .withType(ScaleType.CHANGE_COUNT)
                                                    .withValue("1")
                                                    .withCooldown(Duration.parse("PT5M"))),
                                        new ScaleRule()
                                            .withMetricTrigger(
                                                new MetricTrigger()
                                                    .withMetricName("Percentage CPU")
                                                    .withMetricResourceUri(
                                                        "/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/Microsoft.Compute/virtualMachineScaleSets/testingsc")
                                                    .withTimeGrain(Duration.parse("PT2M"))
                                                    .withStatistic(MetricStatisticType.AVERAGE)
                                                    .withTimeWindow(Duration.parse("PT5M"))
                                                    .withTimeAggregation(TimeAggregationType.AVERAGE)
                                                    .withOperator(ComparisonOperationType.GREATER_THAN)
                                                    .withThreshold(15.0)
                                                    .withDividePerInstance(false))
                                            .withScaleAction(
                                                new ScaleAction()
                                                    .withDirection(ScaleDirection.DECREASE)
                                                    .withType(ScaleType.CHANGE_COUNT)
                                                    .withValue("2")
                                                    .withCooldown(Duration.parse("PT6M")))))
                            .withFixedDate(
                                new TimeWindow()
                                    .withTimeZone("UTC")
                                    .withStart(OffsetDateTime.parse("2015-03-05T14:00:00Z"))
                                    .withEnd(OffsetDateTime.parse("2015-03-05T14:30:00Z"))),
                        new AutoscaleProfile()
                            .withName("saludos")
                            .withCapacity(
                                new ScaleCapacity().withMinimum("1").withMaximum("10").withDefaultProperty("1"))
                            .withRules(
                                Arrays
                                    .asList(
                                        new ScaleRule()
                                            .withMetricTrigger(
                                                new MetricTrigger()
                                                    .withMetricName("Percentage CPU")
                                                    .withMetricResourceUri(
                                                        "/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/Microsoft.Compute/virtualMachineScaleSets/testingsc")
                                                    .withTimeGrain(Duration.parse("PT1M"))
                                                    .withStatistic(MetricStatisticType.AVERAGE)
                                                    .withTimeWindow(Duration.parse("PT5M"))
                                                    .withTimeAggregation(TimeAggregationType.AVERAGE)
                                                    .withOperator(ComparisonOperationType.GREATER_THAN)
                                                    .withThreshold(10.0)
                                                    .withDividePerInstance(false))
                                            .withScaleAction(
                                                new ScaleAction()
                                                    .withDirection(ScaleDirection.INCREASE)
                                                    .withType(ScaleType.CHANGE_COUNT)
                                                    .withValue("1")
                                                    .withCooldown(Duration.parse("PT5M"))),
                                        new ScaleRule()
                                            .withMetricTrigger(
                                                new MetricTrigger()
                                                    .withMetricName("Percentage CPU")
                                                    .withMetricResourceUri(
                                                        "/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/Microsoft.Compute/virtualMachineScaleSets/testingsc")
                                                    .withTimeGrain(Duration.parse("PT2M"))
                                                    .withStatistic(MetricStatisticType.AVERAGE)
                                                    .withTimeWindow(Duration.parse("PT5M"))
                                                    .withTimeAggregation(TimeAggregationType.AVERAGE)
                                                    .withOperator(ComparisonOperationType.GREATER_THAN)
                                                    .withThreshold(15.0)
                                                    .withDividePerInstance(false))
                                            .withScaleAction(
                                                new ScaleAction()
                                                    .withDirection(ScaleDirection.DECREASE)
                                                    .withType(ScaleType.CHANGE_COUNT)
                                                    .withValue("2")
                                                    .withCooldown(Duration.parse("PT6M")))))
                            .withRecurrence(
                                new Recurrence()
                                    .withFrequency(RecurrenceFrequency.WEEK)
                                    .withSchedule(
                                        new RecurrentSchedule()
                                            .withTimeZone("UTC")
                                            .withDays(Arrays.asList("1"))
                                            .withHours(Arrays.asList(5))
                                            .withMinutes(Arrays.asList(15))))))
            .withNotifications(
                Arrays
                    .asList(
                        new AutoscaleNotification()
                            .withEmail(
                                new EmailNotification()
                                    .withSendToSubscriptionAdministrator(true)
                                    .withSendToSubscriptionCoAdministrators(true)
                                    .withCustomEmails(Arrays.asList("gu@ms.com", "ge@ns.net")))
                            .withWebhooks(
                                Arrays
                                    .asList(
                                        new WebhookNotification()
                                            .withServiceUri("http://myservice.com")
                                            .withProperties(mapOf())))))
            .withEnabled(true)
            .withPredictiveAutoscalePolicy(
                new PredictiveAutoscalePolicy().withScaleMode(PredictiveAutoscalePolicyScaleMode.ENABLED))
            .withTargetResourceUri(
                "/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/Microsoft.Compute/virtualMachineScaleSets/testingsc")
            .apply();
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
