package vkapiutils.responses;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

public class Response {
    protected final HttpResponse<JsonNode> response;

    public Response(HttpResponse<JsonNode> response) {
        this.response = response;
    }

    public JsonNode getBody() {
        return response.getBody();
    }
}
