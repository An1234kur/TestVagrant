package api;

/**
 * @author : Kamal
 * @project : TestVagrant
 * @created : 22/08/2022 - 11:56 AM
 */

//Declared an Enum to store status code and message
public enum StatusCode {
    CODE_200(200, ""),
    CODE_204(404, "NOT FOUND");

    public final int code;
    public final String msg;

    StatusCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
