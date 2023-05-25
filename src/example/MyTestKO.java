package example;

/*
 IntelliJ IDE > menu > Code > Rearrange code >
 * UPDATE_A is moved to line 15 and produce issue with RESOURCE_ID_1 SOURCE_VERSION_1 TARGET_VERSION_1 illegal forward reference
 */
public class MyTestKO {

    private static final String TENANT_ID = "tenantId";
    private static final String ASSET_ID_NAMESPACE_1 = "assetIdNamespace1";
    private static final String ASSET_ID_NAMESPACE_2 = "assetIdNamespace2";
    private static final String ASSET_ID_1 = "assetId1";
    private static final String ASSET_ID_2 = "assetId2";
    private static final String DEVICE_ID_1 = "urn:lo:nsid:" + ASSET_ID_NAMESPACE_1 + ":" + ASSET_ID_1;

    private static final String RESOURCE_ID_1 = "resourceId1";
    private static final String RESOURCE_ID_2 = "resourceId2";
    private static final String SOURCE_VERSION_1 = "sourceVersion1";
    private static final String SOURCE_VERSION_2 = "sourceVersion2";
    private static final String TARGET_VERSION_1 = "targetVersion1";
    private static final String TARGET_VERSION_2 = "targetVersion2";
    private static final String DEVICE_ID_2 = "urn:lo:nsid:" + ASSET_ID_NAMESPACE_2 + ":" + ASSET_ID_2;

    private static final StateModel UPDATE_A = StateModel.builder()
            .tenantId(TENANT_ID).deviceId(DEVICE_ID_1)
            .resourceId(RESOURCE_ID_1)
            .sourceVersion(SOURCE_VERSION_1)
            .targetVersion(TARGET_VERSION_1)
            .build();
    private static final StateModel UPDATE_B = StateModel.builder()
            .tenantId(TENANT_ID).deviceId(DEVICE_ID_2)
            .resourceId(RESOURCE_ID_2)
            .sourceVersion(SOURCE_VERSION_2)
            .targetVersion(TARGET_VERSION_2)
            .build();
}
