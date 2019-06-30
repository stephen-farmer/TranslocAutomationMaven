package config;

public class ResourceLocator {
    public static String USERNAME_FIELD = "username";
    public static String PASSWORD_FIELD = "password";

    public static String LOGOUT_TEXT = "logout";

    public static String STAGING_ENV = "https://login.stage.transloc.com/login/?next=https://architect.stage.transloc.com/";

    /********************************
     * XPaths
     ********************************/
    public static String FEED_CONTAINER = "//*[@id=\"app\"]/div/div/div[2]/div/div/div[1]/div/div[3]/div";
    public static String FIRST_FEED = "//*[@id=\"app\"]/div/div/div[2]/div/div/div[1]/div/div[3]/div/div[1]/div/a/div/div[1]/span";
    public static String SECOND_FEED = "//*[@id=\"app\"]/div/div/div[2]/div/div/div[1]/div/div[3]/div/div[2]/div/a/div/div[1]/span";

    // Popup
    public static String POPUP_CONFIRM = "/html/body/div[2]/div[2]/div[3]/button[2]/span[1]";
    public static String POPUP_CLOSE = "/html/body/div[2]/div[2]/div[3]/button/span[1]";

    // Overflows
    public static String OVERFLOW_SHARE = "/html/body/div[2]/div[2]/ul/li[1]";
    public static String OVERFLOW_DUPLICATE = "/html/body/div[2]/div[2]/ul/li[3]";
    public static String FIRST_FEED_OVERFLOW = "//*[@id=\"app\"]/div/div/div[2]/div/div/div[1]/div/div[3]/div/div[1]/div/a/div/div[2]/button";

    // Shared Feed Menu
    public static String SHARED_FEED_NAME = "//*[@id=\"app\"]/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div/div[1]/p/strong[1]";

}
