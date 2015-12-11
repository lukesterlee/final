package radiobutton;

/**
 * Represents a group of "radio buttons": toggle buttons for which exactly one is selected
 * at a given time. If a different button is selected, the previously-selected button is
 * automatically unselected.
 *
 * Buttons are numbered from 0 to one less than the number of buttons. For example, if the
 * button group has 4 buttons, they are numbered 0, 1, 2, and 3.
 */
public class RadioButtonGroup {

    private boolean[] buttons;
    private int currentButton;

    /**
     * Creates a group of radio buttons.
     *
     * @param numButtons
     *   The number of buttons in the group.
     * @param initial
     *   The button number that is initially selected.
     * @raise RuntimeException
     *   The initial button number is invalid.
     */
    public RadioButtonGroup(int numButtons, int initial) {
        if (initial < 0 || initial > numButtons - 1)
            throw new RuntimeException();

        buttons = new boolean[numButtons];
        buttons[initial] = true;
        currentButton = initial;
        // TODO: Implement this method.
    }

    /**
     * Creates a group of radio buttons. Button 0 is initially selected.
     */
    public RadioButtonGroup(int numButtons) {
        this(numButtons, 0);
        currentButton = 0;
    }

    /**
     * Selects a button, unselecting the button that was previously selected.
     * @param button
     *   The button number to select.
     * @raise RuntimeException
     *   The button number is invalid.
     */
    public void select(int button) {
        // TODO: Implement this method.
        if (button < 0 || button > buttons.length - 1)
            throw new RuntimeException();

        buttons[button] = true;
        buttons[currentButton] = false;
        currentButton = button;
    }

    /**
     * Returns whether a given button is selected.
     * @param button
     *   The button number to check.
     * @raise RuntimeException
     *   The button number is invalid.
     */
    public boolean isSelected(int button) {
        // TODO: Implement this method.
        if (button < 0 || button > buttons.length - 1)
            throw new RuntimeException();

        return buttons[button];
    }

    // TODO: Add attributes and helper methods as needed.

    public static void main(String[] args) {

        RadioButtonGroup buttons = new RadioButtonGroup(10);
        System.out.println(buttons.isSelected(0));
        System.out.println(buttons.isSelected(1));;

        buttons.select(5);
        System.out.println(buttons.isSelected(0));
        System.out.println(buttons.isSelected(1));
        System.out.println(buttons.isSelected(5));

        buttons.select(10);
        //buttons.select(15);
        //buttons.select(-3);
    }

}
