package vkapiutils.responses;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

public class WallCommentResponse extends Response{
    public WallCommentResponse(HttpResponse<JsonNode> response) {
        super(response);
    }

    public int getCommentId() {
        return response
                .getBody()
                .getObject()
                .getJSONObject("response")
                .getInt("comment_id");
    }
}
