package example1;

import lombok.*;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString

public class User implements Comparable<User> {

    private String name;
    private int experience;
    private List<TaskList> tasks;

    public User(String name, int experience, List<TaskList> tasks) {
        this.name = name;
        this.experience = experience;
        this.tasks = tasks;
    }

    @Override
    public int compareTo(User o) {
        return o.experience - experience;
    }

}
