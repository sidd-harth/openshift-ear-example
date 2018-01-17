package org.jboss.as.quickstarts.kitchensink_ear.util;

import java.io.Serializable;
import javax.annotation.Generated;
import java.lang.String;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleImplementor", date = "2018-01-16T22:48:18+0530")
public class KitchensinkMessages_$bundle implements KitchensinkMessages,Serializable {
    private static final long serialVersionUID = 1L;
    protected KitchensinkMessages_$bundle() {}
    public static final KitchensinkMessages_$bundle INSTANCE = new KitchensinkMessages_$bundle();
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final String registeredMessage = "Registered!";
    protected String registeredMessage$str() {
        return registeredMessage;
    }
    @Override
    public final String registeredMessage() {
        return String.format(registeredMessage$str());
    }
    private static final String registerSuccessfulMessage = "Successfully registered!";
    protected String registerSuccessfulMessage$str() {
        return registerSuccessfulMessage;
    }
    @Override
    public final String registerSuccessfulMessage() {
        return String.format(registerSuccessfulMessage$str());
    }
    private static final String registerFailMessage = "Registration failed:";
    protected String registerFailMessage$str() {
        return registerFailMessage;
    }
    @Override
    public final String registerFailMessage() {
        return String.format(registerFailMessage$str());
    }
    private static final String defaultErrorMessage = "Registration failed. See server log for more information.";
    protected String defaultErrorMessage$str() {
        return defaultErrorMessage;
    }
    @Override
    public final String defaultErrorMessage() {
        return String.format(defaultErrorMessage$str());
    }
}
