# TransLoc Automation
Thank you for taking the time to review what I've been working on. The original framework was using Gradle for build dependencies, but after fighting many problems with it I decided to migrate the codebase over to Maven to avoid anyone else not being able to run the same code. If you would like to observe how the framework grew over multiple commits please refer to the original repository here: https://github.com/stephen-farmer/TranslocAutomation

This framework is built in Java and uses Maven to bring in dependencies for Selenium, Cucumber, TestNG, and Extent Reports. The main class for our automation in general is the WebDriverWrapper class which is how we access Selenium WebDriver for our tests. This kicks off our automation instance which has access to navigation methods, keeping our test classes clean while also maintaining a structure for easier refactoring if neccesary in the future. These navigation methods also give us the opportunity to reuse the same code across multiple tests (for things like login, URL navigation, and flowing through different functionalities).

Each test class is run using TestNG which gives us lots of options and capabilities for automation testing. After the test run a report is generated using Extent Reports. These are html files that you can view in the Reports folder of the repo.

To use the framework download IntelliJ IDE by JetBrains here and open the repo directory after cloning it to your local hard drive: https://www.jetbrains.com/idea/download

Upon opening the project for the first time, the IDE might take a minute or two to fully import all dependencies and build, just monitor the progress at the very bottom of the IDE window.
