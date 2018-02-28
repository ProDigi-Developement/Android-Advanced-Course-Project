package prodigi_development.advancedcourseproject.Controller;

/**
 * Created by antho on 2/28/2018.
 */

public class CoreFacade {
    private static CoreFacade instance = null;

    private CoreFacade() {};

    public static CoreFacade getInstance() {
        if (instance == null) {
            instance = new CoreFacade();
        }
        return instance;
    }
}
