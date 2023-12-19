package InterFace;

import Model.Profile;

public interface ProfileInterFace {
    void saveProfile(long userId, Profile profile);
    Profile  findProfileByUserId(long userId);
    void  deleteProfileByUserId(long userId);








}
