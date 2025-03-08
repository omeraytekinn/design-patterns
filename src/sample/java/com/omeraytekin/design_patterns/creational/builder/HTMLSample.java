package com.omeraytekin.design_patterns.creational.builder;

public class HTMLSample {
        public static void main(String[] args) {
                HTMLElement blogHeading = new HTMLElement.Builder(Tag.H1)
                                .textContent("Design Patterns - Builder Pattern")
                                .build();
                HTMLElement blogContent = new HTMLElement.Builder(Tag.P)
                                .textContent(
                                                "Builder pattern can be used in different scenarios. Common usage is for reducing complexity of telescopic constructors. But in this example builder patter used for building tree-like structure.")
                                .build();
                BlogDirector blogDirector = new BlogDirector.Builder("Design Patterns - Builder Pattern")
                                .addContents(blogHeading, blogContent)
                                .build();
                blogDirector.addMetaTag(Tag.DESCRIPTION,
                                "This blog is about builder pattern which is a creational design pattern.");
                blogDirector.appendContent(Tag.P,
                                "Ut pariatur elit cupidatat consectetur qui sint excepteur aliquip. Mollit ad veniam qui ullamco velit dolor nostrud aute consequat excepteur non. Incididunt ex sit quis laboris veniam do deserunt laborum. Dolore officia quis enim tempor consequat exercitation ex tempor aliquip cupidatat aliqua et. Aliquip velit non in duis nostrud sunt ullamco dolore non id irure laborum nostrud aliqua.");
                System.out.println(blogDirector);
        }
}
