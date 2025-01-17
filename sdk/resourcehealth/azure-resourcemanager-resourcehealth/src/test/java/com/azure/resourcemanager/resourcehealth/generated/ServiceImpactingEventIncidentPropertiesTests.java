// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcehealth.models.ServiceImpactingEventIncidentProperties;
import org.junit.jupiter.api.Assertions;

public final class ServiceImpactingEventIncidentPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceImpactingEventIncidentProperties model =
            BinaryData
                .fromString(
                    "{\"title\":\"idf\",\"service\":\"wdzuhtymwisd\",\"region\":\"thwxmnteiwaopvkm\",\"incidentType\":\"c\"}")
                .toObject(ServiceImpactingEventIncidentProperties.class);
        Assertions.assertEquals("idf", model.title());
        Assertions.assertEquals("wdzuhtymwisd", model.service());
        Assertions.assertEquals("thwxmnteiwaopvkm", model.region());
        Assertions.assertEquals("c", model.incidentType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceImpactingEventIncidentProperties model =
            new ServiceImpactingEventIncidentProperties()
                .withTitle("idf")
                .withService("wdzuhtymwisd")
                .withRegion("thwxmnteiwaopvkm")
                .withIncidentType("c");
        model = BinaryData.fromObject(model).toObject(ServiceImpactingEventIncidentProperties.class);
        Assertions.assertEquals("idf", model.title());
        Assertions.assertEquals("wdzuhtymwisd", model.service());
        Assertions.assertEquals("thwxmnteiwaopvkm", model.region());
        Assertions.assertEquals("c", model.incidentType());
    }
}
