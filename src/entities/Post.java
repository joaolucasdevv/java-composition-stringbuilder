package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private LocalDate date;
    private String title;
    private String content;
    private Integer likes;

    private final List<Comment> comments = new ArrayList<>();

}
