package ro.uvt.info.SPLab.services;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

public class SseObserver implements Observer{
    public SseObserver(SseEmitter emitter) {

    }

    @Override
    public void update() {
        System.out.println("Notify");
    }
}