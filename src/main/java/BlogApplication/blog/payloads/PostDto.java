package BlogApplication.blog.payloads;

import BlogApplication.blog.entities.Category;
import BlogApplication.blog.entities.Comment;
import BlogApplication.blog.entities.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
    private Integer postId;
    private String title;
    private String content;

    private String imageName;
    private String addedDate;


    private CategoryDto category;

    private UserDto user;

    private Set<CommentDto> comments=new HashSet<>();


}
