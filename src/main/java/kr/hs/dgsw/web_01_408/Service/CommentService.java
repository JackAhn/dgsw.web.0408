package kr.hs.dgsw.web_01_408.Service;

import kr.hs.dgsw.web_01_408.Domain.Comment;
import kr.hs.dgsw.web_01_408.Protocol.CommentUsernameProtocol;

import java.util.List;

public interface CommentService {
    List<CommentUsernameProtocol> listAllCommments();
    List<CommentUsernameProtocol> findComments(Long userId);
    CommentUsernameProtocol addComments(Comment comment);
    Comment modifyComments(Comment comment);
    boolean deleteComments(Long id);
}
