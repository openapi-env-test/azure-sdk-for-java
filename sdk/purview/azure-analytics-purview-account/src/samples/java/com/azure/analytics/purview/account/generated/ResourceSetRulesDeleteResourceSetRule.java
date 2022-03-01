// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.account.generated;

import com.azure.analytics.purview.account.ResourceSetRulesClient;
import com.azure.analytics.purview.account.ResourceSetRulesClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;

public class ResourceSetRulesDeleteResourceSetRule {
    public static void main(String[] args) {
        ResourceSetRulesClient client = new ResourceSetRulesClientBuilder().endpoint("{endpoint}").buildClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response = client.deleteResourceSetRuleWithResponse(requestOptions);
    }
}
