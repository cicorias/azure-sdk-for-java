// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EgressPublicNetworkAccessType. */
public final class EgressPublicNetworkAccessType extends ExpandableStringEnum<EgressPublicNetworkAccessType> {
    /** Static value Enabled for EgressPublicNetworkAccessType. */
    public static final EgressPublicNetworkAccessType ENABLED = fromString("Enabled");

    /** Static value Disabled for EgressPublicNetworkAccessType. */
    public static final EgressPublicNetworkAccessType DISABLED = fromString("Disabled");

    /**
     * Creates or finds a EgressPublicNetworkAccessType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EgressPublicNetworkAccessType.
     */
    @JsonCreator
    public static EgressPublicNetworkAccessType fromString(String name) {
        return fromString(name, EgressPublicNetworkAccessType.class);
    }

    /**
     * Gets known EgressPublicNetworkAccessType values.
     *
     * @return known EgressPublicNetworkAccessType values.
     */
    public static Collection<EgressPublicNetworkAccessType> values() {
        return values(EgressPublicNetworkAccessType.class);
    }
}