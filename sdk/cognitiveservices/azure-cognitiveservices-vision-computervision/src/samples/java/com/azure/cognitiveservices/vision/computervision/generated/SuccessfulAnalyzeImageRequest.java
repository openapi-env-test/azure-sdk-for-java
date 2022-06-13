// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cognitiveservices.vision.computervision.generated;

import com.azure.cognitiveservices.vision.computervision.ComputerVisionClient;
import com.azure.cognitiveservices.vision.computervision.ComputerVisionClientBuilder;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Configuration;

public class SuccessfulAnalyzeImageRequest {
    public static void main(String[] args) {
        ComputerVisionClient computerVisionClient =
                new ComputerVisionClientBuilder()
                        .credential(new AzureKeyCredential(Configuration.getGlobalConfiguration().get("API_KEY")))
                        .endpoint("https://westus.api.cognitive.microsoft.com")
                        .buildClient();
        // BEGIN:com.azure.cognitiveservices.vision.computervision.generated.analyzeimage.successfulanalyzeimagerequest
        BinaryData ImageUrl = BinaryData.fromString("{\"url\":\"{url}\"}");
        RequestOptions requestOptions =
                new RequestOptions()
                        .addQueryParam(
                                "visualFeatures",
                                "Categories,Adult,Tags,Description,Faces,Color,ImageType,Objects,Brands")
                        .addQueryParam("details", "Celebrities,Landmarks")
                        .addQueryParam("language", "en");
        Response<BinaryData> response = computerVisionClient.analyzeImageWithResponse(ImageUrl, requestOptions);
        // END:com.azure.cognitiveservices.vision.computervision.generated.analyzeimage.successfulanalyzeimagerequest
    }
}
