// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.DefaultCniNetworkPatchParameters;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DefaultCniNetworkPatchParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefaultCniNetworkPatchParameters model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"vyjtcvu\":\"idttgepus\",\"fuughtuqfec\":\"kasizie\",\"uewmrswnjlxuzrhw\":\"xeygtuhxuic\",\"dohzjq\":\"usxjbaqehg\"}}")
                .toObject(DefaultCniNetworkPatchParameters.class);
        Assertions.assertEquals("idttgepus", model.tags().get("vyjtcvu"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefaultCniNetworkPatchParameters model =
            new DefaultCniNetworkPatchParameters()
                .withTags(
                    mapOf(
                        "vyjtcvu",
                        "idttgepus",
                        "fuughtuqfec",
                        "kasizie",
                        "uewmrswnjlxuzrhw",
                        "xeygtuhxuic",
                        "dohzjq",
                        "usxjbaqehg"));
        model = BinaryData.fromObject(model).toObject(DefaultCniNetworkPatchParameters.class);
        Assertions.assertEquals("idttgepus", model.tags().get("vyjtcvu"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
