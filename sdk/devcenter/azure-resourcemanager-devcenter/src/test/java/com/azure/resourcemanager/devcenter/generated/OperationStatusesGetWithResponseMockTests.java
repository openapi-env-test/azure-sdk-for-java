// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.devcenter.DevCenterManager;
import com.azure.resourcemanager.devcenter.models.OperationStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class OperationStatusesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"resourceId\":\"ipgawtxx\",\"properties\":\"datay\",\"id\":\"xcjxgrytfmpcy\",\"name\":\"lrmcaykg\",\"status\":\"noxuztrksx\",\"percentComplete\":37.622272,\"startTime\":\"2021-05-07T07:31:07Z\",\"endTime\":\"2021-01-21T22:39:06Z\",\"operations\":[{\"id\":\"nthjtwkjaosrxuzv\",\"name\":\"mktcqiosmgbza\",\"status\":\"gxq\",\"percentComplete\":89.86439,\"startTime\":\"2021-07-05T11:42:01Z\",\"endTime\":\"2021-02-05T18:12:47Z\",\"operations\":[{\"id\":\"rltzkatbhjmz\",\"name\":\"bsoqeqala\",\"status\":\"vlagun\",\"percentComplete\":49.933304,\"startTime\":\"2021-08-02T07:38:21Z\",\"endTime\":\"2021-02-03T10:06:11Z\",\"operations\":[{\"status\":\"bmhyreeudz\"},{\"status\":\"av\"}]}]},{\"id\":\"mjxlyyzglgouw\",\"name\":\"mjjyuojq\",\"status\":\"obaxkjeytu\",\"percentComplete\":25.005419,\"startTime\":\"2021-01-05T01:13:39Z\",\"endTime\":\"2021-08-22T14:12:32Z\",\"operations\":[{\"id\":\"nkqbhsyrq\",\"name\":\"jqhden\",\"status\":\"aulk\",\"percentComplete\":13.435656,\"startTime\":\"2021-07-31T21:19:31Z\",\"endTime\":\"2021-06-10T21:14:50Z\",\"operations\":[{\"status\":\"nnawtqabpxuckpgg\"},{\"status\":\"oweyirdhlis\"}]}]}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        DevCenterManager manager =
            DevCenterManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        OperationStatus response =
            manager.operationStatuses().getWithResponse("cs", "mozi", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("xcjxgrytfmpcy", response.id());
        Assertions.assertEquals("lrmcaykg", response.name());
        Assertions.assertEquals("noxuztrksx", response.status());
        Assertions.assertEquals(37.622272F, response.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-07T07:31:07Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-21T22:39:06Z"), response.endTime());
        Assertions.assertEquals("nthjtwkjaosrxuzv", response.operations().get(0).id());
        Assertions.assertEquals("mktcqiosmgbza", response.operations().get(0).name());
        Assertions.assertEquals("gxq", response.operations().get(0).status());
        Assertions.assertEquals(89.86439F, response.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-05T11:42:01Z"), response.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-05T18:12:47Z"), response.operations().get(0).endTime());
        Assertions.assertEquals("rltzkatbhjmz", response.operations().get(0).operations().get(0).id());
        Assertions.assertEquals("bsoqeqala", response.operations().get(0).operations().get(0).name());
        Assertions.assertEquals("vlagun", response.operations().get(0).operations().get(0).status());
        Assertions.assertEquals(49.933304F, response.operations().get(0).operations().get(0).percentComplete());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-08-02T07:38:21Z"),
                response.operations().get(0).operations().get(0).startTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-02-03T10:06:11Z"),
                response.operations().get(0).operations().get(0).endTime());
        Assertions
            .assertEquals("bmhyreeudz", response.operations().get(0).operations().get(0).operations().get(0).status());
    }
}
