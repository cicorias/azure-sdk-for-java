// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkDevice;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkDeviceRoleTypes;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class NetworkDevicesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"version\":\"olyahluqwqulsut\",\"networkDeviceSku\":\"jb\",\"networkDeviceRole\":\"NPB\",\"provisioningState\":\"Failed\",\"networkRackId\":\"hyqezvqq\",\"hostName\":\"drftbcvexreuquo\",\"serialNumber\":\"ljvfwhreagk\",\"annotation\":\"xv\"},\"location\":\"tvbczsulm\",\"tags\":{\"eykgsangpszngaf\":\"lmepjpf\",\"lkvec\":\"g\"},\"id\":\"ujcngo\",\"name\":\"dyedmzrgjfo\",\"type\":\"nub\"}]}";

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

        ManagedNetworkFabricManager manager =
            ManagedNetworkFabricManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<NetworkDevice> response =
            manager.networkDevices().listByResourceGroup("it", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("tvbczsulm", response.iterator().next().location());
        Assertions.assertEquals("lmepjpf", response.iterator().next().tags().get("eykgsangpszngaf"));
        Assertions.assertEquals("jb", response.iterator().next().networkDeviceSku());
        Assertions.assertEquals(NetworkDeviceRoleTypes.NPB, response.iterator().next().networkDeviceRole());
        Assertions.assertEquals("drftbcvexreuquo", response.iterator().next().hostname());
        Assertions.assertEquals("ljvfwhreagk", response.iterator().next().serialNumber());
        Assertions.assertEquals("xv", response.iterator().next().annotation());
    }
}
