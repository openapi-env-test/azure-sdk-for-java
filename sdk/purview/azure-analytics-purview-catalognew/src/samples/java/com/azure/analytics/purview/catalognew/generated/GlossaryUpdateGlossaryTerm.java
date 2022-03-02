// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalognew.generated;

import com.azure.analytics.purview.catalognew.GlossaryClient;
import com.azure.analytics.purview.catalognew.GlossaryClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

public class GlossaryUpdateGlossaryTerm {
    public static void main(String[] args) {
        GlossaryClient client = new GlossaryClientBuilder().endpoint("{Endpoint}").buildClient();
        BinaryData glossaryTerm =
                BinaryData.fromString(
                        "{\"name\":\"ExampleTerm1\",\"abbreviation\":\"T1\",\"anchor\":{\"glossaryGuid\":\"c018ddaf-7c21-4b37-a838-dae5f110c3d8\",\"relationGuid\":\"7b6a8149-a928-476a-a068-dce58653cfa0\"},\"guid\":\"54688d39-b298-4104-9e80-f2a16f44aaea\",\"lastModifiedTS\":\"1\",\"qualifiedName\":\"ExampleTerm1@Glossary\",\"resources\":[{\"displayName\":\"Example Display Name\",\"url\":\"Example Url\"}],\"seeAlso\":[{\"termGuid\":\"952c7ba4-4c89-42d8-a05a-7d2161be7008\"},{\"termGuid\":\"821beef0-ced9-47ba-8f7f-c4f3459f4d18\"}],\"shortDescription\":\"Example Short Description\",\"status\":\"Approved\",\"synonyms\":[{\"termGuid\":\"952c7ba4-4c89-42d8-a05a-7d2161be7008\"},{\"termGuid\":\"821beef0-ced9-47ba-8f7f-c4f3459f4d18\"}]}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                client.updateGlossaryTermWithResponse(
                        "54688d39-b298-4104-9e80-f2a16f44aaea", glossaryTerm, requestOptions);
    }
}
