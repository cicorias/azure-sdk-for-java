// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.ExternalNetworkInner;
import com.azure.resourcemanager.managednetworkfabric.models.ExternalNetworksList;
import com.azure.resourcemanager.managednetworkfabric.models.PeeringOption;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ExternalNetworksListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExternalNetworksList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"networkToNetworkInterconnectId\":\"edkowepbqpcrfk\",\"disabledOnResources\":[],\"administrativeState\":\"Disabled\",\"provisioningState\":\"Succeeded\",\"peeringOption\":\"OptionB\",\"importRoutePolicyId\":\"wxlp\",\"exportRoutePolicyId\":\"kftnkhtjsyin\",\"annotation\":\"fq\"},\"id\":\"mtdh\",\"name\":\"mdvy\",\"type\":\"gikdgsz\"},{\"properties\":{\"networkToNetworkInterconnectId\":\"kbir\",\"disabledOnResources\":[],\"administrativeState\":\"Enabled\",\"provisioningState\":\"Failed\",\"peeringOption\":\"OptionA\",\"importRoutePolicyId\":\"qrvqq\",\"exportRoutePolicyId\":\"t\",\"annotation\":\"nrvgoupmfiibfgg\"},\"id\":\"ool\",\"name\":\"rwxkvtkkgl\",\"type\":\"qwjygvja\"}],\"nextLink\":\"blmhvkzuhb\"}")
                .toObject(ExternalNetworksList.class);
        Assertions.assertEquals(PeeringOption.OPTIONB, model.value().get(0).peeringOption());
        Assertions.assertEquals("wxlp", model.value().get(0).importRoutePolicyId());
        Assertions.assertEquals("kftnkhtjsyin", model.value().get(0).exportRoutePolicyId());
        Assertions.assertEquals("fq", model.value().get(0).annotation());
        Assertions.assertEquals("blmhvkzuhb", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExternalNetworksList model =
            new ExternalNetworksList()
                .withValue(
                    Arrays
                        .asList(
                            new ExternalNetworkInner()
                                .withPeeringOption(PeeringOption.OPTIONB)
                                .withImportRoutePolicyId("wxlp")
                                .withExportRoutePolicyId("kftnkhtjsyin")
                                .withAnnotation("fq"),
                            new ExternalNetworkInner()
                                .withPeeringOption(PeeringOption.OPTIONA)
                                .withImportRoutePolicyId("qrvqq")
                                .withExportRoutePolicyId("t")
                                .withAnnotation("nrvgoupmfiibfgg")))
                .withNextLink("blmhvkzuhb");
        model = BinaryData.fromObject(model).toObject(ExternalNetworksList.class);
        Assertions.assertEquals(PeeringOption.OPTIONB, model.value().get(0).peeringOption());
        Assertions.assertEquals("wxlp", model.value().get(0).importRoutePolicyId());
        Assertions.assertEquals("kftnkhtjsyin", model.value().get(0).exportRoutePolicyId());
        Assertions.assertEquals("fq", model.value().get(0).annotation());
        Assertions.assertEquals("blmhvkzuhb", model.nextLink());
    }
}
