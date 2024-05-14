package Students;

import lombok.*;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString


public class Student {

    private String name;
    private Sex sex;
    private Integer age;
    private List<Lessons> lesson;


}
