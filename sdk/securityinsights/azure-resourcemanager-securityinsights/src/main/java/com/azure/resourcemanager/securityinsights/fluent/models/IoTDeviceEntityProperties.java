// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.securityinsights.models.DeviceImportance;
import com.azure.resourcemanager.securityinsights.models.EntityCommonProperties;
import com.azure.resourcemanager.securityinsights.models.ThreatIntelligence;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** IoTDevice entity property bag. */
@Fluent
public final class IoTDeviceEntityProperties extends EntityCommonProperties {
    /*
     * The ID of the IoT Device in the IoT Hub
     */
    @JsonProperty(value = "deviceId", access = JsonProperty.Access.WRITE_ONLY)
    private String deviceId;

    /*
     * The friendly name of the device
     */
    @JsonProperty(value = "deviceName", access = JsonProperty.Access.WRITE_ONLY)
    private String deviceName;

    /*
     * The source of the device
     */
    @JsonProperty(value = "source", access = JsonProperty.Access.WRITE_ONLY)
    private String source;

    /*
     * The ID of the security agent running on the device
     */
    @JsonProperty(value = "iotSecurityAgentId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID iotSecurityAgentId;

    /*
     * The type of the device
     */
    @JsonProperty(value = "deviceType", access = JsonProperty.Access.WRITE_ONLY)
    private String deviceType;

    /*
     * The vendor of the device
     */
    @JsonProperty(value = "vendor", access = JsonProperty.Access.WRITE_ONLY)
    private String vendor;

    /*
     * The ID of the edge device
     */
    @JsonProperty(value = "edgeId", access = JsonProperty.Access.WRITE_ONLY)
    private String edgeId;

    /*
     * The MAC address of the device
     */
    @JsonProperty(value = "macAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String macAddress;

    /*
     * The model of the device
     */
    @JsonProperty(value = "model", access = JsonProperty.Access.WRITE_ONLY)
    private String model;

    /*
     * The serial number of the device
     */
    @JsonProperty(value = "serialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String serialNumber;

    /*
     * The firmware version of the device
     */
    @JsonProperty(value = "firmwareVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String firmwareVersion;

    /*
     * The operating system of the device
     */
    @JsonProperty(value = "operatingSystem", access = JsonProperty.Access.WRITE_ONLY)
    private String operatingSystem;

    /*
     * The AzureResource entity id of the IoT Hub
     */
    @JsonProperty(value = "iotHubEntityId", access = JsonProperty.Access.WRITE_ONLY)
    private String iotHubEntityId;

    /*
     * The Host entity id of this device
     */
    @JsonProperty(value = "hostEntityId", access = JsonProperty.Access.WRITE_ONLY)
    private String hostEntityId;

    /*
     * The IP entity if of this device
     */
    @JsonProperty(value = "ipAddressEntityId", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddressEntityId;

    /*
     * A list of TI contexts attached to the IoTDevice entity.
     */
    @JsonProperty(value = "threatIntelligence", access = JsonProperty.Access.WRITE_ONLY)
    private List<ThreatIntelligence> threatIntelligence;

    /*
     * A list of protocols of the IoTDevice entity.
     */
    @JsonProperty(value = "protocols", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> protocols;

    /*
     * A list of owners of the IoTDevice entity.
     */
    @JsonProperty(value = "owners", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> owners;

    /*
     * A list of Nic entity ids of the IoTDevice entity.
     */
    @JsonProperty(value = "nicEntityIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> nicEntityIds;

    /*
     * The site of the device
     */
    @JsonProperty(value = "site", access = JsonProperty.Access.WRITE_ONLY)
    private String site;

    /*
     * The zone location of the device within a site
     */
    @JsonProperty(value = "zone", access = JsonProperty.Access.WRITE_ONLY)
    private String zone;

    /*
     * The sensor the device is monitored by
     */
    @JsonProperty(value = "sensor", access = JsonProperty.Access.WRITE_ONLY)
    private String sensor;

    /*
     * The subType of the device ('PLC', 'HMI', 'EWS', etc.)
     */
    @JsonProperty(value = "deviceSubType", access = JsonProperty.Access.WRITE_ONLY)
    private String deviceSubType;

    /*
     * Device importance, determines if the device classified as 'crown jewel'
     */
    @JsonProperty(value = "importance")
    private DeviceImportance importance;

    /*
     * The Purdue Layer of the device
     */
    @JsonProperty(value = "purdueLayer", access = JsonProperty.Access.WRITE_ONLY)
    private String purdueLayer;

    /*
     * Determines whether the device classified as authorized device
     */
    @JsonProperty(value = "isAuthorized", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isAuthorized;

    /*
     * Determines whether the device classified as programming device
     */
    @JsonProperty(value = "isProgramming", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isProgramming;

    /*
     * Is the device classified as a scanner device
     */
    @JsonProperty(value = "isScanner", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isScanner;

    /**
     * Get the deviceId property: The ID of the IoT Device in the IoT Hub.
     *
     * @return the deviceId value.
     */
    public String deviceId() {
        return this.deviceId;
    }

    /**
     * Get the deviceName property: The friendly name of the device.
     *
     * @return the deviceName value.
     */
    public String deviceName() {
        return this.deviceName;
    }

    /**
     * Get the source property: The source of the device.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Get the iotSecurityAgentId property: The ID of the security agent running on the device.
     *
     * @return the iotSecurityAgentId value.
     */
    public UUID iotSecurityAgentId() {
        return this.iotSecurityAgentId;
    }

    /**
     * Get the deviceType property: The type of the device.
     *
     * @return the deviceType value.
     */
    public String deviceType() {
        return this.deviceType;
    }

    /**
     * Get the vendor property: The vendor of the device.
     *
     * @return the vendor value.
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Get the edgeId property: The ID of the edge device.
     *
     * @return the edgeId value.
     */
    public String edgeId() {
        return this.edgeId;
    }

    /**
     * Get the macAddress property: The MAC address of the device.
     *
     * @return the macAddress value.
     */
    public String macAddress() {
        return this.macAddress;
    }

    /**
     * Get the model property: The model of the device.
     *
     * @return the model value.
     */
    public String model() {
        return this.model;
    }

    /**
     * Get the serialNumber property: The serial number of the device.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Get the firmwareVersion property: The firmware version of the device.
     *
     * @return the firmwareVersion value.
     */
    public String firmwareVersion() {
        return this.firmwareVersion;
    }

    /**
     * Get the operatingSystem property: The operating system of the device.
     *
     * @return the operatingSystem value.
     */
    public String operatingSystem() {
        return this.operatingSystem;
    }

    /**
     * Get the iotHubEntityId property: The AzureResource entity id of the IoT Hub.
     *
     * @return the iotHubEntityId value.
     */
    public String iotHubEntityId() {
        return this.iotHubEntityId;
    }

    /**
     * Get the hostEntityId property: The Host entity id of this device.
     *
     * @return the hostEntityId value.
     */
    public String hostEntityId() {
        return this.hostEntityId;
    }

    /**
     * Get the ipAddressEntityId property: The IP entity if of this device.
     *
     * @return the ipAddressEntityId value.
     */
    public String ipAddressEntityId() {
        return this.ipAddressEntityId;
    }

    /**
     * Get the threatIntelligence property: A list of TI contexts attached to the IoTDevice entity.
     *
     * @return the threatIntelligence value.
     */
    public List<ThreatIntelligence> threatIntelligence() {
        return this.threatIntelligence;
    }

    /**
     * Get the protocols property: A list of protocols of the IoTDevice entity.
     *
     * @return the protocols value.
     */
    public List<String> protocols() {
        return this.protocols;
    }

    /**
     * Get the owners property: A list of owners of the IoTDevice entity.
     *
     * @return the owners value.
     */
    public List<String> owners() {
        return this.owners;
    }

    /**
     * Get the nicEntityIds property: A list of Nic entity ids of the IoTDevice entity.
     *
     * @return the nicEntityIds value.
     */
    public List<String> nicEntityIds() {
        return this.nicEntityIds;
    }

    /**
     * Get the site property: The site of the device.
     *
     * @return the site value.
     */
    public String site() {
        return this.site;
    }

    /**
     * Get the zone property: The zone location of the device within a site.
     *
     * @return the zone value.
     */
    public String zone() {
        return this.zone;
    }

    /**
     * Get the sensor property: The sensor the device is monitored by.
     *
     * @return the sensor value.
     */
    public String sensor() {
        return this.sensor;
    }

    /**
     * Get the deviceSubType property: The subType of the device ('PLC', 'HMI', 'EWS', etc.).
     *
     * @return the deviceSubType value.
     */
    public String deviceSubType() {
        return this.deviceSubType;
    }

    /**
     * Get the importance property: Device importance, determines if the device classified as 'crown jewel'.
     *
     * @return the importance value.
     */
    public DeviceImportance importance() {
        return this.importance;
    }

    /**
     * Set the importance property: Device importance, determines if the device classified as 'crown jewel'.
     *
     * @param importance the importance value to set.
     * @return the IoTDeviceEntityProperties object itself.
     */
    public IoTDeviceEntityProperties withImportance(DeviceImportance importance) {
        this.importance = importance;
        return this;
    }

    /**
     * Get the purdueLayer property: The Purdue Layer of the device.
     *
     * @return the purdueLayer value.
     */
    public String purdueLayer() {
        return this.purdueLayer;
    }

    /**
     * Get the isAuthorized property: Determines whether the device classified as authorized device.
     *
     * @return the isAuthorized value.
     */
    public Boolean isAuthorized() {
        return this.isAuthorized;
    }

    /**
     * Get the isProgramming property: Determines whether the device classified as programming device.
     *
     * @return the isProgramming value.
     */
    public Boolean isProgramming() {
        return this.isProgramming;
    }

    /**
     * Get the isScanner property: Is the device classified as a scanner device.
     *
     * @return the isScanner value.
     */
    public Boolean isScanner() {
        return this.isScanner;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (threatIntelligence() != null) {
            threatIntelligence().forEach(e -> e.validate());
        }
    }
}
