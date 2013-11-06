package is.ru.helloworld;

import static spark.Spark.*;
import spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        staticFileLocation("/public");

        post(new Route("/add") {
            @Override
            public Object handle(Request request, Response response) {
                Integer a = Integer.valueOf(request.queryParams("a"));
                Integer b = Integer.valueOf(request.queryParams("b"));
                return a + b;
            }
        });
    }
}

