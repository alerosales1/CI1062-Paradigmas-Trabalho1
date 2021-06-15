public enum Type {
    TEXT("Text"),
    IMAGE("Image"),
    PDF("PDF");

    private String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
