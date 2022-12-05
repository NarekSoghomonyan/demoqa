package enums;

public enum Widgets {
    ELEMENTS("Elements"),
    FORMS("Forms"),
    ALERTS_FRAME_AND_WINDOWS("Alerts, Frame & Windows"),
    WIDGETS("Widgets"),
    INTERACTIONS("Interactions"),
    BOOK_STORE_APPLICATIONS("Book Store Application");

    public String getWidgetName() {
        return widgetName;
    }

    private String widgetName;

    Widgets(String widgetName) {
        this.widgetName = widgetName;
    }


}
