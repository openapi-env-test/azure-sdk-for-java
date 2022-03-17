// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.databox.models.AddressType;
import com.azure.resourcemanager.databox.models.ShippingAddress;
import com.azure.resourcemanager.databox.models.SkuName;
import com.azure.resourcemanager.databox.models.ValidateAddress;

/** Samples for Service ValidateAddress. */
public final class ServiceValidateAddressSamples {
    /*
     * x-ms-original-file: specification/databox/resource-manager/Microsoft.DataBox/stable/2021-12-01/examples/ValidateAddressPost.json
     */
    /**
     * Sample code: ValidateAddressPost.
     *
     * @param manager Entry point to DataBoxManager.
     */
    public static void validateAddressPost(com.azure.resourcemanager.databox.DataBoxManager manager) {
        manager
            .services()
            .validateAddressWithResponse(
                "westus",
                new ValidateAddress()
                    .withShippingAddress(
                        new ShippingAddress()
                            .withStreetAddress1("16 TOWNSEND ST")
                            .withStreetAddress2("Unit 1")
                            .withCity("San Francisco")
                            .withStateOrProvince("CA")
                            .withCountry("US")
                            .withPostalCode("94107")
                            .withCompanyName("Microsoft")
                            .withAddressType(AddressType.COMMERCIAL))
                    .withDeviceType(SkuName.DATA_BOX),
                Context.NONE);
    }
}
