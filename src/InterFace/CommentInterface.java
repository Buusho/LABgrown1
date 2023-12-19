package InterFace;

import Model.Comment;

public interface CommentInterface {
void saveComment(long postId, long userId, Comment comment);
void commentByPostId(long postId);
void updateComment(long commentId,String newText);
void deleteComment(Comment comment);








}
