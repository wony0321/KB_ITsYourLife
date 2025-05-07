package ch15.sec05.exercise;

public class Student {
    private int id;
    private String name;
    private String email;
    private String github;

    public Student(int id, String name, String email, String github) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.github = github;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGithub() {
        return github;
    }
}
