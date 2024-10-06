package edu.pacificu.cs.cs325.mod3calc;

public class Mod3Calc {

    private Integer mcState;
    private Integer mcDisplay;

    /**
     * Constructor
     */
    public Mod3Calc() {
        mcState = null;
    }

    /**
     * pressInteger(int)
     *
     * call when an integer is pressed
     * the pressed integer will be stored as
     * an operand.
     *
     * the integer should be displayed
     *
     * @param value - the integer pressed
     */
    public void pressInteger(int value) {
        mcDisplay = value;
    }

    /**
     * pressPlus()
     *
     * call when + is pressed.  Will perform any
     * necessary additions and return the value to
     * be displayed
     *
     * @return the value to display
     * @throws Exception - missing operand
     */
    public Integer pressPlus() throws Exception {
        if (null == mcDisplay) {
            throw new Exception("missing operand");
        }

        if ( null == mcState ) {
            // Integers are immutable!
            mcState = mcDisplay;
        } else {
            mcState += mcDisplay;
            mcState %= 3;
        }
        // Integers are immutable!
        return  mcState;
    }
    
    /**
     * pressMultiply()
     *
     * call when * is pressed.  Will perform any
     * necessary multiplications and return the value to
     * be displayed
     *
     * @return the value to display
     * @throws Exception - missing operand
     */
    public Integer pressMultiply() throws Exception {
        if (null == mcDisplay) {
            throw new Exception("missing operand");
        }

        if ( null == mcState ) {
            // Integers are immutable!
            mcState = mcDisplay;
        } else {
            mcState *= mcDisplay;
            mcState %= 3;
        }
        // Integers are immutable!
        return  mcState;
    }

    /**
     * pressEq()
     *
     * call when equal is pressed. Will perform any
     * necessary additions and return the value to
     * be displayed
     *
     * @return the value to display
     * @throws Exception - missing operand
     */
    public Integer pressEq() throws Exception {
        if (null == mcState || null == mcDisplay) {
            throw new Exception("missing operand");
        }

        mcState += mcDisplay;
        mcState %= 3;
        return mcState;
    }

    /**
     * pressClear()
     *
     * reset state
     * must display 0
     */
    public void pressClear() {
        mcState = null;
        mcDisplay = null;
    }

}
