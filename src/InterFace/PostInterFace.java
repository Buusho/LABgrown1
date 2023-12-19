package InterFace;

import Model.Post;

public interface PostInterFace {
    void  savePost(long userId, Post post);
    void getPostsByUserId(long userId);
  Post searchPost (String query);
   void deletePostById(long postId);



}
