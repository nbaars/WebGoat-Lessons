
package org.owasp.webgoat.plugin;

import org.apache.ecs.Element;
import org.apache.ecs.ElementContainer;
import org.apache.ecs.StringElement;
import org.owasp.webgoat.lessons.Category;
import org.owasp.webgoat.lessons.LessonAdapter;
import org.owasp.webgoat.session.WebSession;

import java.util.ArrayList;
import java.util.List;


public class Test2 extends LessonAdapter {
    /**
     * Description of the Method
     *
     * @param s Description of the Parameter
     * @return Description of the Return Value
     */
    protected Element createContent(WebSession s) {
        ElementContainer ec = new ElementContainer();
        ec.addElement(new StringElement("Test-2 lesson"));
        return (ec);
    }

    /**
     * Gets the category attribute of the CommandInjection object
     *
     * @return The category value
     */
    protected Category getDefaultCategory() {
        Category category = new Category("New category", 7);
        Category.addCategory(category);
        return category;
    }

    /**
     * Gets the hints attribute of the DirectoryScreen object
     *
     * @return The hints value
     */
    protected List<String> getHints(WebSession s) {
        List<String> hints = new ArrayList();
        return hints;
    }

    protected Integer getDefaultRanking() {
        return 15;
    }

    /**
     * Gets the title attribute of the DirectoryScreen object
     *
     * @return The title value
     */
    public String getTitle() {
        return "Test-2";
    }
}
