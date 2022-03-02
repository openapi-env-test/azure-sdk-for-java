// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalognew.generated;

import com.azure.analytics.purview.catalognew.GlossaryClient;
import com.azure.analytics.purview.catalognew.GlossaryClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

public class GlossaryAssignTermToEntities {
    public static void main(String[] args) {
        GlossaryClient client = new GlossaryClientBuilder().endpoint("{Endpoint}").buildClient();
        BinaryData relatedObjectIds =
                BinaryData.fromString(
                        "[{\"guid\":\"ab9f1920-0b94-436d-aeb4-11a32c270fc0\",\"relationshipAttributes\":{\"attributes\":{\"description\":\"Example Description\",\"confidence\":100,\"expression\":\"Example Expression\",\"source\":\"ExampleSource\"}}}]");
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response =
                client.assignTermToEntitiesWithResponse(
                        "8a7f65ec-6429-0b9b-3734-ec57bf1e34c2", relatedObjectIds, requestOptions);
    }
}
