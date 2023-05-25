package example;

/*
 IntelliJ IDE > menu > Code > Rearrange code >
 * UPDATE_A is NOT moved : all is fine
 */
public class MyTestOK {

    private static final String TENANT_ID = "tenantId";
    private static final String DEVICE_ID_1 = "urn:lo:nsid:blah:blah1";
    private static final String RESOURCE_ID_1 = "resourceId1";
    private static final String RESOURCE_ID_2 = "resourceId2";
    private static final String SOURCE_VERSION_1 = "sourceVersion1";
    private static final String SOURCE_VERSION_2 = "sourceVersion2";
    private static final String TARGET_VERSION_1 = "targetVersion1";
    private static final String TARGET_VERSION_2 = "targetVersion2";
    private static final String DEVICE_ID_2 = "urn:lo:nsid:blah:blah2";

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
