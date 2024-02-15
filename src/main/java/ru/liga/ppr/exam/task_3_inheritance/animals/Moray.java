package ru.liga.ppr.exam.task_3_inheritance.animals;

import ru.liga.ppr.exam.task_3_inheritance.abstractions.Fish;
import ru.liga.ppr.exam.task_3_inheritance.enums.SwimType;

public class Moray extends Fish {
    public SwimType swim() {
        return SwimType.BODY_BENDING;
    }
}
