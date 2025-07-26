package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private LocalDate moment;
    private String title;
    private String content;
    private Integer likes;

    private final List<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(LocalDate moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Integer getLikes() {
        return likes;
    }


}
