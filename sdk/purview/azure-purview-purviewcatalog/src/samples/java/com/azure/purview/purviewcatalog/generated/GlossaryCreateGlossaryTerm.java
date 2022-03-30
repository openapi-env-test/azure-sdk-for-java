// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.purview.purviewcatalog.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.purview.purviewcatalog.GlossaryClient;
import com.azure.purview.purviewcatalog.GlossaryClientBuilder;

public class GlossaryCreateGlossaryTerm {
    public static void main(String[] args) {
        GlossaryClient glossaryClient = new GlossaryClientBuilder().endpoint("{Endpoint}").buildClient();
        // BEGIN:com.azure.purview.purviewcatalog.generated.glossarycreateglossaryterm.glossarycreateglossaryterm
        BinaryData glossaryTerm =
                BinaryData.fromString(
                        "{\"name\":\"ExampleTerm1\",\"abbreviation\":\"T1\",\"anchor\":{\"glossaryGuid\":\"c018ddaf-7c21-4b37-a838-dae5f110c3d8\"},\"contacts\":{\"Expert\":[{\"info\":\"Example Expert Info\",\"id\":\"30435ff9-9b96-44af-a5a9-e05c8b1ae2df\"}],\"Steward\":[{\"info\":\"Example Steward info\",\"id\":\"30435ff9-9b96-44af-a5a9-e05c8b1ae2df\"}]},\"longDescription\":\"Example Long Description\",\"resources\":[{\"displayName\":\"Example Display Name\",\"url\":\"Example Url\"}],\"shortDescription\":\"Example Short Description\",\"status\":\"Approved\"}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = glossaryClient.createGlossaryTermWithResponse(glossaryTerm, requestOptions);
        // END:com.azure.purview.purviewcatalog.generated.glossarycreateglossaryterm.glossarycreateglossaryterm
    }
}
