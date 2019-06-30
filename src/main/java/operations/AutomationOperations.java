package operations;

import config.Components;

public class AutomationOperations {
    public Components components = new Components();

    /**
     * A singleton to serve as an instance for us to initialize our automation components
     */
    private static class SingletonHelper {
        private static final AutomationOperations INSTANCE = new AutomationOperations();
    }
    public static AutomationOperations instance() {
        return SingletonHelper.INSTANCE;
    }

    /**
     *  We use the component object from above to get our operation methods to pass to the driver
     */
    public NavigationOperations navOps = components.getNavigationOperations();
    public UserOperations userOps = components.getUserOperations();
}
