package ru.liga.ppr.exam.task_1_gooseduck;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public List<String> gooseDuck(int n) {
        var result = new ArrayList<String>(n);
        for (int i = 1; i <= n; i++) {
            var gooseDuck = new StringBuilder();
            if (i % 3 == 0)
                gooseDuck.append("Goose");
            if (i % 5 == 0)
                gooseDuck.append("Duck");
            if (gooseDuck.isEmpty())
                result.add(i + "");
            else
                result.add(gooseDuck.toString());
        }
        return result;
    }
}
