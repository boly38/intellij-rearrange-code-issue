package example;

import lombok.Builder;

@Builder
public class StateModel {
    String tenantId;
    String deviceId;
    String resourceId;
    String sourceVersion;
    String targetVersion;
}
