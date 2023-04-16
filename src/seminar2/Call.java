package seminar2;

import java.util.Objects;

public class Call {
    Person p;
    Cat cat;

    public Call(Person p, Cat cat) {
        this.p = p;
        this.cat = cat;
    }

    public void call() {
        if (Objects.equals(p.getStatus(), "owner")) {
            p.kisKis(p.getName());
            cat.catComeIn(cat.getName());
        } else {
            p.kisKis(p.getName());
            cat.catComeOut(cat.getName());
        }
    }
}

