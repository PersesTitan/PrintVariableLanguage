package print;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.IOException;

public class PrintL {
    String start = null;
    String end = null;
    boolean mode;

    /**
     * @param start 처음 값
     * @param end 마지막 값
     * @param mode 모드 지정 여부
     */
    public PrintL(@NotNull String start, @NotNull String end, @NotNull boolean mode) {
        this.mode = mode;
        this.start = start;
        this.end = end;
    }

    /**
     * @param var 처음 또는 마지막 값 지정
     * @param local 위치 지정
     * @param mode 모드 여부
     * @throws IOException local 에러 발생시 exception 발생
     */
    public PrintL(@NotNull String var, @NotNull Local local, @NotNull boolean mode) throws IOException {
        this.mode = mode;
        if (local.equals(Local.START)) this.start = var;
        else if (local.equals(Local.END)) this.end = var;
        else throw new IOException("Local 값 오류");
    }

    /*메소드*/

    public void setPrint(@NotBlank String line) throws IOException {
        if (start != null && end != null) {

        } else if (start != null) {

        } else if (end != null) {

        } else throw new IOException("프린트 조건에 일치하지 않습니다.");
    }

    public void setScanner(@NotBlank String line) {

    }

}
