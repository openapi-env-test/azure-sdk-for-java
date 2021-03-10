// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.DiagnosticDetectorResponseInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of DiagnosticDetectorResponse. */
public interface DiagnosticDetectorResponse {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the startTime property: Start time of the period.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: End time of the period.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the issueDetected property: Flag representing Issue was detected.
     *
     * @return the issueDetected value.
     */
    Boolean issueDetected();

    /**
     * Gets the detectorDefinition property: Detector's definition.
     *
     * @return the detectorDefinition value.
     */
    DetectorDefinition detectorDefinition();

    /**
     * Gets the metrics property: Metrics provided by the detector.
     *
     * @return the metrics value.
     */
    List<DiagnosticMetricSet> metrics();

    /**
     * Gets the abnormalTimePeriods property: List of Correlated events found by the detector.
     *
     * @return the abnormalTimePeriods value.
     */
    List<DetectorAbnormalTimePeriod> abnormalTimePeriods();

    /**
     * Gets the data property: Additional Data that detector wants to send.
     *
     * @return the data value.
     */
    List<List<NameValuePair>> data();

    /**
     * Gets the responseMetadata property: Meta Data.
     *
     * @return the responseMetadata value.
     */
    ResponseMetadata responseMetadata();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.DiagnosticDetectorResponseInner
     * object.
     *
     * @return the inner object.
     */
    DiagnosticDetectorResponseInner innerModel();
}
