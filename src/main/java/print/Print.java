package print;

import jakarta.validation.constraints.NotNull;

public class Print {
    String start;
    String end;

    public Print(@NotNull String start, @NotNull String end) {
        this.start = start;
        this.end = end;
    }



}
