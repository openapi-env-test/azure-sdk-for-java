// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.confidentialledger.confidentialledger.generated;

import com.azure.confidentialledger.confidentialledger.ConfidentialLedgerClient;
import com.azure.confidentialledger.confidentialledger.ConfidentialLedgerClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

public class GetReceipt {
    public static void main(String[] args) {
        ConfidentialLedgerClient client =
                new ConfidentialLedgerClientBuilder().ledgerUri("myledger.eastus.cloudapp.azure.com").buildClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = client.getReceiptWithResponse("3.14", requestOptions);
    }
}
