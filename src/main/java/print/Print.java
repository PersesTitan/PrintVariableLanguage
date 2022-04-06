package print;

import jakarta.validation.constraints.NotNull;

import java.io.IOException;

public class Print {
    String start = null;
    String end = null;

    public Print(@NotNull String start, @NotNull String end, @NotNull boolean mode) {
        this.start = start;
        this.end = end;
    }

    public Print(@NotNull String var, @NotNull Local local) throws IOException {
        if (local.equals(Local.START)) this.start = var;
        else if (local.equals(Local.END)) this.end = var;
        else throw new IOException("Local 값 오류");
    }


}
