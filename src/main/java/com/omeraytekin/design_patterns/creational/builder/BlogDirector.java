package com.omeraytekin.design_patterns.creational.builder;

public class BlogDirector {
    private HTMLElement html;
    private HTMLElement head;
    private HTMLElement body;

    public BlogDirector(Builder builder) {
        this.html = builder.html;
        this.head = builder.head;
        this.body = builder.body;
    }

    public void addMetaTag(Tag tag, String text) {
        HTMLElement content = new HTMLElement.Builder(tag)
                .textContent(text)
                .build();
        head.addChild(content);
    }

    public void appendContent(Tag tag, String text) {
        HTMLElement content = new HTMLElement.Builder(tag)
                .textContent(text)
                .build();
        body.addChild(content);
    }

    @Override
    public String toString() {
        return html.toString();
    }

    public static class Builder {
        private HTMLElement html;
        private HTMLElement head;
        private HTMLElement body;

        Builder(String title) {
            HTMLElement titleElement = new HTMLElement.Builder(Tag.TITLE).textContent(title).build();
            head = new HTMLElement.Builder(Tag.HEAD).addChild(titleElement).build();
            body = new HTMLElement.Builder(Tag.BODY).build();
            html = new HTMLElement.Builder(Tag.HTML).addChildren(head, body).build();
        }

        public Builder addContents(HTMLElement... content) {
            for (HTMLElement htmlElement : content) {
                body.addChild(htmlElement);
            }
            return this;
        }

        public BlogDirector build() {
            return new BlogDirector(this);
        }
    }
}
