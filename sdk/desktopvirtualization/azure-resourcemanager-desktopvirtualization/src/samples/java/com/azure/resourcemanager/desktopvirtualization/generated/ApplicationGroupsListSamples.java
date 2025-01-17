// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

/** Samples for ApplicationGroups List. */
public final class ApplicationGroupsListSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2022-09-09/examples/ApplicationGroup_ListBySubscription.json
     */
    /**
     * Sample code: ApplicationGroup_List.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationGroupList(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applicationGroups().list("applicationGroupType eq 'RailApplication'", com.azure.core.util.Context.NONE);
    }
}
