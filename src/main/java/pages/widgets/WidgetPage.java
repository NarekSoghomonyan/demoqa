package pages.widgets;

import enums.WidgetsConstants;
import pages.Base;

public abstract class WidgetPage extends Base {
    public WidgetPage(){
        urlPath = getWidget().getPathText();
    }
      abstract WidgetsConstants getWidget();


}
