package kr.hs.dgsw.web_01_408.Repository;

import kr.hs.dgsw.web_01_408.Domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}

