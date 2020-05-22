import org.springframework.context.annotation.Scope;

@Scope("request")
public class Cat {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String getMessage) {
        this.message = getMessage;
    }
}
