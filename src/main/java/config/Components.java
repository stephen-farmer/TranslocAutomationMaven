package config;

import operations.NavigationOperations;
import operations.UserOperations;

public class Components {

    public NavigationOperations getNavigationOperations() {
        return new NavigationOperations();
    }

    public UserOperations getUserOperations() {
        return new UserOperations();
    }

}

