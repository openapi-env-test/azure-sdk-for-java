/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties that define an exchange peering facility.
 */
public class ExchangePeeringFacility {
    /**
     * The name of the exchange peering facility.
     */
    @JsonProperty(value = "exchangeName")
    private String exchangeName;

    /**
     * The bandwidth of the connection between Microsoft and the exchange
     * peering facility.
     */
    @JsonProperty(value = "bandwidthInMbps")
    private Integer bandwidthInMbps;

    /**
     * The IPv4 address of Microsoft at the exchange peering facility.
     */
    @JsonProperty(value = "microsoftIPv4Address")
    private String microsoftIPv4Address;

    /**
     * The IPv6 address of Microsoft at the exchange peering facility.
     */
    @JsonProperty(value = "microsoftIPv6Address")
    private String microsoftIPv6Address;

    /**
     * The IPv4 prefixes associated with the exchange peering facility.
     */
    @JsonProperty(value = "facilityIPv4Prefix")
    private String facilityIPv4Prefix;

    /**
     * The IPv6 prefixes associated with the exchange peering facility.
     */
    @JsonProperty(value = "facilityIPv6Prefix")
    private String facilityIPv6Prefix;

    /**
     * The PeeringDB.com ID of the facility.
     */
    @JsonProperty(value = "peeringDBFacilityId")
    private Integer peeringDBFacilityId;

    /**
     * The PeeringDB.com URL of the facility.
     */
    @JsonProperty(value = "peeringDBFacilityLink")
    private String peeringDBFacilityLink;

    /**
     * Get the name of the exchange peering facility.
     *
     * @return the exchangeName value
     */
    public String exchangeName() {
        return this.exchangeName;
    }

    /**
     * Set the name of the exchange peering facility.
     *
     * @param exchangeName the exchangeName value to set
     * @return the ExchangePeeringFacility object itself.
     */
    public ExchangePeeringFacility withExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
        return this;
    }

    /**
     * Get the bandwidth of the connection between Microsoft and the exchange peering facility.
     *
     * @return the bandwidthInMbps value
     */
    public Integer bandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    /**
     * Set the bandwidth of the connection between Microsoft and the exchange peering facility.
     *
     * @param bandwidthInMbps the bandwidthInMbps value to set
     * @return the ExchangePeeringFacility object itself.
     */
    public ExchangePeeringFacility withBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    /**
     * Get the IPv4 address of Microsoft at the exchange peering facility.
     *
     * @return the microsoftIPv4Address value
     */
    public String microsoftIPv4Address() {
        return this.microsoftIPv4Address;
    }

    /**
     * Set the IPv4 address of Microsoft at the exchange peering facility.
     *
     * @param microsoftIPv4Address the microsoftIPv4Address value to set
     * @return the ExchangePeeringFacility object itself.
     */
    public ExchangePeeringFacility withMicrosoftIPv4Address(String microsoftIPv4Address) {
        this.microsoftIPv4Address = microsoftIPv4Address;
        return this;
    }

    /**
     * Get the IPv6 address of Microsoft at the exchange peering facility.
     *
     * @return the microsoftIPv6Address value
     */
    public String microsoftIPv6Address() {
        return this.microsoftIPv6Address;
    }

    /**
     * Set the IPv6 address of Microsoft at the exchange peering facility.
     *
     * @param microsoftIPv6Address the microsoftIPv6Address value to set
     * @return the ExchangePeeringFacility object itself.
     */
    public ExchangePeeringFacility withMicrosoftIPv6Address(String microsoftIPv6Address) {
        this.microsoftIPv6Address = microsoftIPv6Address;
        return this;
    }

    /**
     * Get the IPv4 prefixes associated with the exchange peering facility.
     *
     * @return the facilityIPv4Prefix value
     */
    public String facilityIPv4Prefix() {
        return this.facilityIPv4Prefix;
    }

    /**
     * Set the IPv4 prefixes associated with the exchange peering facility.
     *
     * @param facilityIPv4Prefix the facilityIPv4Prefix value to set
     * @return the ExchangePeeringFacility object itself.
     */
    public ExchangePeeringFacility withFacilityIPv4Prefix(String facilityIPv4Prefix) {
        this.facilityIPv4Prefix = facilityIPv4Prefix;
        return this;
    }

    /**
     * Get the IPv6 prefixes associated with the exchange peering facility.
     *
     * @return the facilityIPv6Prefix value
     */
    public String facilityIPv6Prefix() {
        return this.facilityIPv6Prefix;
    }

    /**
     * Set the IPv6 prefixes associated with the exchange peering facility.
     *
     * @param facilityIPv6Prefix the facilityIPv6Prefix value to set
     * @return the ExchangePeeringFacility object itself.
     */
    public ExchangePeeringFacility withFacilityIPv6Prefix(String facilityIPv6Prefix) {
        this.facilityIPv6Prefix = facilityIPv6Prefix;
        return this;
    }

    /**
     * Get the PeeringDB.com ID of the facility.
     *
     * @return the peeringDBFacilityId value
     */
    public Integer peeringDBFacilityId() {
        return this.peeringDBFacilityId;
    }

    /**
     * Set the PeeringDB.com ID of the facility.
     *
     * @param peeringDBFacilityId the peeringDBFacilityId value to set
     * @return the ExchangePeeringFacility object itself.
     */
    public ExchangePeeringFacility withPeeringDBFacilityId(Integer peeringDBFacilityId) {
        this.peeringDBFacilityId = peeringDBFacilityId;
        return this;
    }

    /**
     * Get the PeeringDB.com URL of the facility.
     *
     * @return the peeringDBFacilityLink value
     */
    public String peeringDBFacilityLink() {
        return this.peeringDBFacilityLink;
    }

    /**
     * Set the PeeringDB.com URL of the facility.
     *
     * @param peeringDBFacilityLink the peeringDBFacilityLink value to set
     * @return the ExchangePeeringFacility object itself.
     */
    public ExchangePeeringFacility withPeeringDBFacilityLink(String peeringDBFacilityLink) {
        this.peeringDBFacilityLink = peeringDBFacilityLink;
        return this;
    }

}
