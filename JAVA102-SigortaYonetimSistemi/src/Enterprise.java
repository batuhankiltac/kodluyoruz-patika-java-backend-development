import java.util.*;

public class Enterprise extends Account {

    public Enterprise(User user, ArrayList<Insurance> userInsuranceList, AuthenticationStatus authenticationStatus) {
        super(user, userInsuranceList, authenticationStatus);
    }

    @Override
    void addInsurancePolicy() {

    }
}