package enums;

public enum WidgetsConstants {
    ELEMENTS("Elements", "elements"),
    FORMS("Forms", "forms"),
    ALERTS_FRAME_AND_WINDOWS("Alerts, Frame & Windows", "alertsWindows"),
    WIDGETS("Widgets", "widgets"),
    INTERACTIONS("Interactions", "interaction"),
    BOOK_STORE_APPLICATIONS("Book Store Application", "books");

    public String getWidgetName() {
        return widgetName;
    }

    private String widgetName;

    WidgetsConstants(String widgetName, String pathText) {
        this.widgetName = widgetName;
        this.pathText = pathText;
    }

    private String pathText;

    public String getPathText() {
        return pathText;
    }
}
