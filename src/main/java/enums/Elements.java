package enums;

public enum Elements {
    TEXT_BOX("Text Box"),
    CHECK_BOX("Check Box"),
    RADIO_BUTTON("Radio Button"),
    WEB_TABLES("Web Tables"),
    BUTTONS("Buttons"),
    LINKS("Links"),
    BROKEN_LINKS_IMAGES("Broken Links - Images"),
    UPLOAD_AND_DOWNLOAD("Upload and Download"),
    DYNAMIC_PROPERTIES("Dynamic Properties");

    Elements(String elementName) {
        this.elementName = elementName;

    }

    private String elementName;

    public String getElementName() {
        return elementName;
    }


}
