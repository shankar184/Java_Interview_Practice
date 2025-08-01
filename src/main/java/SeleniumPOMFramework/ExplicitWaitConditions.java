/**
 * Selenium Explicit Wait Conditions List
 *
 * This file provides a comprehensive list of explicit wait conditions available in Selenium.
 * These conditions are used with WebDriverWait to wait for specific states or properties of web elements
 * before performing actions on them. Each condition is described below:
 */

/**
 * Waits for the presence of an element located by the specified locator in the DOM.
 * @param locator The locator used to find the element.
 */
presenceOfElementLocated(By locator);

/**
 * Waits for the presence of all elements located by the specified locator in the DOM.
 * @param locator The locator used to find the elements.
 */
presenceOfAllElementsLocatedBy(By locator);

/**
 * Waits for the visibility of a specific web element.
 * @param element The web element to check for visibility.
 */
visibilityOf(WebElement element);

/**
 * Waits for the visibility of all elements in the provided list.
 * @param elements The list of web elements to check for visibility.
 */
visibilityOfAllElements(List<WebElement> elements);

/**
 * Waits for the visibility of an element located by the specified locator.
 * @param locator The locator used to find the element.
 */
visibilityOfElementLocated(By locator);

/**
 * Waits for the invisibility of a specific web element.
 * @param element The web element to check for invisibility.
 */
invisibilityOf(WebElement element);

/**
 * Waits for the invisibility of an element located by the specified locator.
 * @param locator The locator used to find the element.
 */
invisibilityOfElementLocated(By locator);

/**
 * Waits for the invisibility of an element with the specified text.
 * @param locator The locator used to find the element.
 * @param text The text to check for invisibility.
 */
invisibilityOfElementWithText(By locator, String text);

/**
 * Waits for an element to be clickable, located by the specified locator.
 * @param locator The locator used to find the element.
 */
elementToBeClickable(By locator);

/**
 * Waits for a specific web element to be clickable.
 * @param element The web element to check for clickability.
 */
elementToBeClickable(WebElement element);

/**
 * Waits for an element to be selected, located by the specified locator.
 * @param locator The locator used to find the element.
 */
elementToBeSelected(By locator);

/**
 * Waits for the selection state of a specific web element to match the expected state.
 * @param element The web element to check.
 * @param selected The expected selection state.
 */
elementSelectionStateToBe(WebElement element, boolean selected);

/**
 * Waits for the specified text to be present in a web element.
 * @param element The web element to check.
 * @param text The text to wait for.
 */
textToBePresentInElement(WebElement element, String text);

/**
 * Waits for the specified text to be present in an element located by the specified locator.
 * @param locator The locator used to find the element.
 * @param text The text to wait for.
 */
textToBePresentInElementLocated(By locator, String text);

/**
 * Waits for the specified text to be present in the value attribute of an element located by the specified locator.
 * @param locator The locator used to find the element.
 * @param text The text to wait for.
 */
textToBePresentInElementValue(By locator, String text);

/**
 * Waits for the page title to match the specified title.
 * @param title The expected title.
 */
titleIs(String title);

/**
 * Waits for the page title to contain the specified text.
 * @param titleFraction The text to check for in the title.
 */
titleContains(String titleFraction);

/**
 * Waits for the current URL to match the specified URL.
 * @param url The expected URL.
 */
urlToBe(String url);

/**
 * Waits for the current URL to contain the specified text.
 * @param fraction The text to check for in the URL.
 */
urlContains(String fraction);

/**
 * Waits for an alert to be present.
 */
alertIsPresent();

/**
 * Waits for a frame to be available and switches to it, located by the specified locator.
 * @param locator The locator used to find the frame.
 */
frameToBeAvailableAndSwitchToIt(By locator);

/**
 * Waits for a frame to be available and switches to it, specified by the frame element.
 * @param frameElement The frame element to switch to.
 */
frameToBeAvailableAndSwitchToIt(WebElement frameElement);

/**
 * Waits for the number of open windows to match the expected number.
 * @param expectedNumber The expected number of windows.
 */
numberOfWindowsToBe(int expectedNumber);

/**
 * Waits for a web element to become stale (no longer attached to the DOM).
 * @param element The web element to check.
 */
stalenessOf(WebElement element);

/**
 * Waits for a specific attribute of a web element to contain the specified value.
 * @param element The web element to check.
 * @param attribute The attribute to check.
 * @param value The value to wait for.
 */
attributeContains(WebElement element, String attribute, String value);

/**
 * Waits for a specific attribute of a web element to match the specified value.
 * @param element The web element to check.
 * @param attribute The attribute to check.
 * @param value The expected value.
 */
attributeToBe(WebElement element, String attribute, String value);

/**
 * Waits for a specific attribute of a web element to be non-empty.
 * @param element The web element to check.
 * @param attribute The attribute to check.
 */
attributeToBeNotEmpty(WebElement element, String attribute);

/**
 * Re-evaluates the specified condition after a page refresh.
 * @param condition The condition to re-evaluate.
 */
refreshed(ExpectedCondition condition);

/**
 * Waits for a JavaScript script to return a non-null value.
 * @param script The JavaScript script to execute.
 */
jsReturnsValue(String script);

/**
 * Waits for a JavaScript script to execute without throwing any exceptions.
 * @param script The JavaScript script to execute.
 */
javaScriptThrowsNoExceptions(String script);