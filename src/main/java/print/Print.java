package print;

import jakarta.validation.constraints.NotNull;

public class Print {
    private String start = null;
    private String end = null;

    public Print(@NotNull String start, @NotNull String end) {

    }
}
