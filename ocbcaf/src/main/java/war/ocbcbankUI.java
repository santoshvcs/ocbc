package war;

import org.linkki.framework.ui.application.LinkkiUi;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringNavigator;

@Theme("bank1")
@Widgetset("com.vaadin.v7.Vaadin7WidgetSet")
@SpringUI
public class ocbcbankUI extends LinkkiUi {

    private static final long serialVersionUID = 1L;

    private final SpringNavigator springNavigator;

    @Autowired
    public ocbcbankUI(SpringNavigator springNavigator) {
        super(new ocbcbankApplicationConfig());
        this.springNavigator = springNavigator;
    }

    @Override
    protected void configureNavigator(ViewDisplay applicationLayout) {
        springNavigator.init(this, applicationLayout);
    }

}
