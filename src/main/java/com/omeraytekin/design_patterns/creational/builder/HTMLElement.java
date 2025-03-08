package com.omeraytekin.design_patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class HTMLElement {
    private Tag tag;
    private String textContent;
    private List<HTMLElement> children;

    public HTMLElement(Builder builder) {
        this.tag = builder.tag;
        this.textContent = builder.textContent;
        this.children = builder.children;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public void addChild(HTMLElement element) {
        this.children.add(element);
    }

    @Override
    public String toString() {
        return getHTMLElementString(this, 0);
    }

    private String getHTMLElementString(HTMLElement element, int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(getIndentString(level));
        sb.append("<" + element.tag.name().toLowerCase(Locale.GERMANY) + ">\n");
        if (element.textContent != null) {
            sb.append(getIndentString(level + 1));
            sb.append(element.textContent + "\n");
        }
        for (HTMLElement htmlElement : element.children) {
            sb.append(getHTMLElementString(htmlElement, level + 1));
        }
        sb.append(getIndentString(level));
        sb.append("</" + element.tag.name().toLowerCase(Locale.GERMANY) + ">\n");
        return sb.toString();
    }

    private String getIndentString(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level * 2; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public static class Builder {
        private Tag tag;
        private String textContent;
        private List<HTMLElement> children;

        public Builder(Tag tag) {
            this.tag = tag;
            this.children = new ArrayList<>();
        }

        public Builder textContent(String textContent) {
            this.textContent = textContent;
            return this;
        }

        public Builder addChild(HTMLElement child) {
            this.children.add(child);
            return this;
        }

        public Builder addChildren(HTMLElement... children) {
            for (HTMLElement child : children) {
                this.children.add(child);
            }
            return this;
        }

        public HTMLElement build() {
            return new HTMLElement(this);
        }
    }
}
