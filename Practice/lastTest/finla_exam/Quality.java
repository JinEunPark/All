package lastTest.finla_exam;

public enum Quality {

    HD("HD"),
    FK("4k");

    private String quality;

    Quality(String quality) {
        this.quality = quality;
    }
    public void setQuality(String quality){
        this.quality = quality;
    }

    public String getValue() {
        return quality;
    }


}
