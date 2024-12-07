package org.knit.lab9;

public class Us {
    @NotNull
    private String name;
    @MaxLength(10)
    private String username;
    @Min(18)
    private int age;
    public Us(String name, String username, int age) {
        this.name = name;
        this.username = username;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }
    public int getAge() {
        return age;
    }
}