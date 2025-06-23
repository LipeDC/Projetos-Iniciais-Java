package Application;

import Entities.Comment;
import Entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


Comment c1 = new Comment("Have a nice Trip");
Comment c2 = new Comment("Wow thats awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealend",
                "I'm going to visit this country",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

System.out.println(p1);

    }

}
