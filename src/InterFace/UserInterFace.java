package InterFace;

import Model.Profile;
import Model.User;

public interface UserInterFace {

    void saveUser(User user);
    User findUserById(long id);
    void updateUserPro(long userId, Profile profile);

    void deleteUser(long userId );




}
