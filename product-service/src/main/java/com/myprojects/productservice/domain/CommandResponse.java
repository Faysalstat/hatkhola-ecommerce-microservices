package com.myprojects.productservice.domain;

public class CommandResponse<T> {
    private T content;

    public CommandResponse() {
    }

    public CommandResponse(T content) {
        this.content = content;
    }

    public T getContent() {
        return this.content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public static CommandResponse<Void> asVoid() {
        return new CommandResponse();
    }

    public static <T> CommandResponse<T> of(T content) {
        return new CommandResponse(content);
    }
}
