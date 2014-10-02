package org.persistentsas.mavenTraining;

/**
 * Simple class for demo purpose.
 * @author laurent.tardif
 *
 */
public class HelloWorld {

    /**
     * The prefix of the greetting message.
     */
    protected StringBuffer msg = new StringBuffer("Hello World, my name is");
    /**
     * Constructor, will use your name is the output message.
     * @param yourName the name use for the greeting.
     */
    public HelloWorld(final String yourName) {
        msg.append(" " + yourName);
    }

    /**
     *
     * @return the greeting message.
     */
    public final StringBuffer getMessage() {
        return msg;
    }
}
