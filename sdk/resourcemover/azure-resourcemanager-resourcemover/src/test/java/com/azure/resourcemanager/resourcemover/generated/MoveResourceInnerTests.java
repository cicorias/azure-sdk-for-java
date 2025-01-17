// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.fluent.models.MoveResourceInner;
import com.azure.resourcemanager.resourcemover.models.MoveResourceDependencyOverride;
import com.azure.resourcemanager.resourcemover.models.MoveResourceProperties;
import com.azure.resourcemanager.resourcemover.models.ResourceSettings;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MoveResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MoveResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Failed\",\"sourceId\":\"qvkoc\",\"targetId\":\"jdkwtnhxbnjb\",\"existingTargetId\":\"sqrglssainq\",\"resourceSettings\":{\"resourceType\":\"ResourceSettings\",\"targetResourceName\":\"wnzlljfmppeeb\"},\"sourceResourceSettings\":{\"resourceType\":\"ResourceSettings\",\"targetResourceName\":\"gxsabkyq\"},\"moveStatus\":{\"moveState\":\"DiscardInProgress\"},\"dependsOn\":[{\"id\":\"zdzevndh\",\"resolutionStatus\":\"wpdappdsbdkv\",\"resolutionType\":\"Automatic\",\"dependencyType\":\"RequiredForPrepare\",\"isOptional\":\"nhutjeltmrldhugj\"},{\"id\":\"datqxhocdgeabl\",\"resolutionStatus\":\"huticndvkao\",\"resolutionType\":\"Automatic\",\"dependencyType\":\"RequiredForMove\",\"isOptional\":\"xhurok\"},{\"id\":\"yxolniwp\",\"resolutionStatus\":\"ukjfkgiawxklr\",\"resolutionType\":\"Automatic\",\"dependencyType\":\"RequiredForMove\",\"isOptional\":\"syyp\"}],\"dependsOnOverrides\":[{\"id\":\"sgcbac\",\"targetId\":\"ejk\"},{\"id\":\"ynqgoulzndlikwyq\",\"targetId\":\"fgibmadgakeq\"}],\"isResolveRequired\":false,\"errors\":{}},\"id\":\"zqqedq\",\"name\":\"tbciqfouflmm\",\"type\":\"kzsmodm\"}")
                .toObject(MoveResourceInner.class);
        Assertions.assertEquals("qvkoc", model.properties().sourceId());
        Assertions.assertEquals("sqrglssainq", model.properties().existingTargetId());
        Assertions.assertEquals("wnzlljfmppeeb", model.properties().resourceSettings().targetResourceName());
        Assertions.assertEquals("sgcbac", model.properties().dependsOnOverrides().get(0).id());
        Assertions.assertEquals("ejk", model.properties().dependsOnOverrides().get(0).targetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MoveResourceInner model =
            new MoveResourceInner()
                .withProperties(
                    new MoveResourceProperties()
                        .withSourceId("qvkoc")
                        .withExistingTargetId("sqrglssainq")
                        .withResourceSettings(new ResourceSettings().withTargetResourceName("wnzlljfmppeeb"))
                        .withDependsOnOverrides(
                            Arrays
                                .asList(
                                    new MoveResourceDependencyOverride().withId("sgcbac").withTargetId("ejk"),
                                    new MoveResourceDependencyOverride()
                                        .withId("ynqgoulzndlikwyq")
                                        .withTargetId("fgibmadgakeq"))));
        model = BinaryData.fromObject(model).toObject(MoveResourceInner.class);
        Assertions.assertEquals("qvkoc", model.properties().sourceId());
        Assertions.assertEquals("sqrglssainq", model.properties().existingTargetId());
        Assertions.assertEquals("wnzlljfmppeeb", model.properties().resourceSettings().targetResourceName());
        Assertions.assertEquals("sgcbac", model.properties().dependsOnOverrides().get(0).id());
        Assertions.assertEquals("ejk", model.properties().dependsOnOverrides().get(0).targetId());
    }
}
