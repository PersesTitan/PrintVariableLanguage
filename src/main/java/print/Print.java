package print;

import jakarta.validation.constraints.NotNull;

public class Print {
    String start = null;
    String end = null;

    public Print(@NotNull String start, @NotNull String end) {
        this.start = start;
        this.end = end;
    }

    public Print(@NotNull String var, @NotNull Local local) {

    }

}
