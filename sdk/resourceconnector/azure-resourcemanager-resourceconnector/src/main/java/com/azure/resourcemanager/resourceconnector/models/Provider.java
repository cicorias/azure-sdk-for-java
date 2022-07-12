// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Provider. */
public final class Provider extends ExpandableStringEnum<Provider> {
    /** Static value VMWare for Provider. */
    public static final Provider VMWARE = fromString("VMWare");

    /** Static value HCI for Provider. */
    public static final Provider HCI = fromString("HCI");

    /** Static value SCVMM for Provider. */
    public static final Provider SCVMM = fromString("SCVMM");

    /** Static value KubeVirt for Provider. */
    public static final Provider KUBE_VIRT = fromString("KubeVirt");

    /** Static value OpenStack for Provider. */
    public static final Provider OPEN_STACK = fromString("OpenStack");

    /**
     * Creates or finds a Provider from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Provider.
     */
    @JsonCreator
    public static Provider fromString(String name) {
        return fromString(name, Provider.class);
    }

    /**
     * Gets known Provider values.
     *
     * @return known Provider values.
     */
    public static Collection<Provider> values() {
        return values(Provider.class);
    }
}