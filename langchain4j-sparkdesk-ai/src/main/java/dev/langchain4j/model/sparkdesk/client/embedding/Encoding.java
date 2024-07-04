package dev.langchain4j.model.sparkdesk.client.embedding;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Locale;

public enum Encoding {
    UTF8,
    GB2312,
    GBK;

    @JsonValue
    public String serialize() {
        return name().toLowerCase(Locale.ROOT);
    }
}