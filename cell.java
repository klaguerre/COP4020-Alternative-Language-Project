public class cell {
    // The attributes
    private String oem;
    private String model;
    private String launchAnnounced;
    private String launchStatus;
    private String bodyDimensions;
    private String bodyWeight;
    private String bodySim;
    private String displayType;
    private String displaySize;
    private String displayResolution;
    private String featuresSensors;
    private String platforms;

    // The constructors
    public cell(String oem, String model, String launchAnnounced, String launchStatus,
                String bodyDimensions, String bodyWeight, String bodySim,
                String displayType, String displaySize, String displayResolution,
                String featuresSensors, String platforms) {
        this.oem = oem;
        this.model = model;
        this.launchAnnounced = launchAnnounced;
        this.launchStatus = launchStatus;
        this.bodyDimensions = bodyDimensions;
        this.bodyWeight = bodyWeight;
        this.bodySim = bodySim;
        this.displayType = displayType;
        this.displaySize = displaySize;
        this.displayResolution = displayResolution;
        this.featuresSensors = featuresSensors;
        this.platforms = platforms;
    }

    // The getters and setters
    public String getOem() { return oem; }
    public String getModel() { return model; }
    public String getLaunchAnnounced() { return launchAnnounced; }
    public String getLaunchStatus() { return launchStatus; }
    public String getBodyDimensions() { return bodyDimensions; }
    public String getBodyWeight() { return bodyWeight; }
    public String getBodySim() { return bodySim; }
    public String getDisplayType() { return displayType; }
    public String getDisplaySize() { return displaySize; }
    public String getDisplayResolution() { return displayResolution; }
    public String getFeaturesSensors() { return featuresSensors; }
    public String getPlatforms() { return platforms; }

    public void setOem(String oem) { this.oem = oem; }
    public void setModel(String model) { this.model = model; }
    public void setLaunchAnnounced(String launchAnnounced) { this.launchAnnounced = launchAnnounced; }
    public void setLaunchStatus(String launchStatus) { this.launchStatus = launchStatus; }
    public void setBodyDimensions(String bodyDimensions) { this.bodyDimensions = bodyDimensions; }
    public void setBodyWeight(String bodyWeight) { this.bodyWeight = bodyWeight; }
    public void setBodySim(String bodySim) { this.bodySim = bodySim; }
    public void setDisplayType(String displayType) { this.displayType = displayType; }
    public void setDisplaySize(String displaySize) { this.displaySize = displaySize; }
    public void setDisplayResolution(String displayResolution) { this.displayResolution = displayResolution; }
    public void setFeaturesSensors(String featuresSensors) { this.featuresSensors = featuresSensors; }
    public void setPlatforms(String platformOs) { this.platforms = platforms; }
}
