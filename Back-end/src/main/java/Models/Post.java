package Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.xml.transform.Source;
import java.util.Date;


@Document(collection = "posts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    private String id;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;

    @Field("dateField")
    private Date publishedAt;

    private String content;}
