package SeleniumPOMFramework;

public class keyBoardGestures {


    | Gesture                            | Code Example                                                                 |
            | ---------------------------------- | ---------------------------------------------------------------------------- |
            | Press **Enter**                    | `actions.sendKeys(Keys.ENTER).perform();`                                    |
            | Press **Tab**                      | `actions.sendKeys(Keys.TAB).perform();`                                      |
            | Press **Backspace/Delete**         | `actions.sendKeys(Keys.BACK_SPACE).perform();`                               |
            | Press **Escape**                   | `actions.sendKeys(Keys.ESCAPE).perform();`                                   |
            | Press **Control + A (Select All)** | `actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();` |
            | Press **Control + C (Copy)**       | `actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();` |
            | Press **Control + V (Paste)**      | `actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();` |
            | Press **Shift + Key (Uppercase)**  | `actions.keyDown(Keys.SHIFT).sendKeys("text").keyUp(Keys.SHIFT).perform();`  |
            | Press **Arrow Keys**               | `actions.sendKeys(Keys.ARROW_DOWN).perform();`                               |

}
