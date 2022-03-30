// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.EntityClient;
import com.azure.purview.purviewcatalog.EntityClientBuilder;

public class EntityUpdateClassifications {
    public static void main(String[] args) {
        EntityClient entityClient = new EntityClientBuilder().endpoint("{Endpoint}").buildClient();
        // BEGIN:com.azure.purview.purviewcatalog.generated.entityupdateclassifications.entityupdateclassifications
        BinaryData classifications =
                BinaryData.fromString(
                        "[{\"entityGuid\":\"45dd4404-e897-b7e2-ca3c-f6e6b11b4f24\",\"typeName\":\"MICROSOFT.FINANCIAL.CREDIT_CARD_NUMBER\"},{\"entityGuid\":\"45dd4404-e897-b7e2-ca3c-f6e6b11b4f24\",\"typeName\":\"MICROSOFT.FINANCIAL.US_BANK_ACCOUNT_NUMBER\"}]");
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response =
                entityClient.updateClassificationsWithResponse(
                        "45dd4404-e897-b7e2-ca3c-f6e6b11b4f24", classifications, requestOptions);
        // END:com.azure.purview.purviewcatalog.generated.entityupdateclassifications.entityupdateclassifications
    }
}
