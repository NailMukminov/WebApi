package vkapiutils.responses;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

public class WallPostResponse extends Response {
    public WallPostResponse(HttpResponse<JsonNode> response) {
        super(response);
    }

    public int getPostId() {
        return response
                .getBody()
                .getObject()
                .getJSONObject("response")
                .getInt("post_id");
    }
}
