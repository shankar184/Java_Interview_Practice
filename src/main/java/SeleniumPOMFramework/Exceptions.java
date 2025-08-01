/**
 * Frequently Experienced Selenium Exceptions
 * 
 * This file provides a list of common Selenium exceptions, their causes, 
 * and potential fixes. These exceptions are frequently encountered when 
 * working with Selenium WebDriver for browser automation.
 */

/**
 * NoSuchElementException
 * 
 * Description: Occurs when an element is not found in the DOM using the given locator.
 * Cause: Wrong locator or element not yet loaded.
 * Fix: Use WebDriverWait or correct locator.
 */

/**
 * TimeoutException
 * 
 * Description: Occurs when an expected condition is not met within the specified wait time.
 * Fix: Increase wait time, use correct expected condition.
 */

/**
 * ElementNotInteractableException
 * 
 * Description: Occurs when an element is present but not clickable or interactable.
 * Cause: Hidden, disabled, or overlapped element.
 * Fix: Wait for elementToBeClickable.
 */

/**
 * StaleElementReferenceException
 * 
 * Description: Occurs when the element is no longer attached to the DOM.
 * Cause: Page refreshed or DOM updated after locating the element.
 * Fix: Re-locate the element before interacting.
 */

/**
 * NoSuchWindowException
 * 
 * Description: Occurs when the target window or tab is not found.
 * Cause: Window closed or wrong handle used.
 * Fix: Switch to correct window handle.
 */

/**
 * NoSuchFrameException
 * 
 * Description: Occurs when the target frame is not available for switching.
 * Fix: Verify frame locator and wait for frame to load.
 */

/**
 * NoAlertPresentException
 * 
 * Description: Occurs when switchTo().alert() is called but no alert is present.
 * Fix: Wait for alertIsPresent().
 */

/**
 * InvalidSelectorException
 * 
 * Description: Occurs when the locator syntax is invalid (e.g., malformed XPath or CSS selector).
 * Fix: Use a valid selector syntax.
 */

/**
 * MoveTargetOutOfBoundsException
 * 
 * Description: Occurs when trying to move the mouse to an element that is outside the page view.
 * Fix: Scroll into view before action.
 */

/**
 * ElementClickInterceptedException
 * 
 * Description: Occurs when another element (like a popup or overlay) is intercepting the click action.
 * Fix: Wait until the element is clickable and not overlapped.
 */

/**
 * SessionNotFoundException
 * 
 * Description: Occurs when the session is deleted or browser is closed unexpectedly.
 * Fix: Restart WebDriver session.
 */

/**
 * WebDriverException
 * 
 * Description: A generic exception for unexpected WebDriver errors.
 * Fix: Check browser compatibility, driver path, and network stability.
 */

/**
 * ElementNotSelectableException
 * 
 * Description: Occurs when attempting to select an option that cannot be selected.
 * Fix: Verify the element supports selection.
 */

/**
 * UnhandledAlertException
 * 
 * Description: Occurs when an unexpected alert appears and is not handled.
 * Fix: Handle the alert before performing the next action.
 */

/**
 * JavascriptException
 * 
 * Description: Occurs when executing a JavaScript command via JavascriptExecutor fails.
 * Fix: Verify the script syntax and browser support.
 */