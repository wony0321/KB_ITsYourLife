package basic.ch17.sec03;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Student {
    private String name;
    private int score;
}