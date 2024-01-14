package ro.uvt.info.SPLab.example;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ClientComponent {

    private final TransientComponent transientComponent;
    private final SingletonComponent singletonComponent;

    public void operation() {
        System.out.println("Invoked ClientComponent::operation() on " + this);
        System.out.println(" o SingletonComponent = " + singletonComponent);
        System.out.println(" o TransientComponent = " + transientComponent);
    }

    public String getClientMessage() {
        return "Hello from ClientComponent = " + this;
    }
}
