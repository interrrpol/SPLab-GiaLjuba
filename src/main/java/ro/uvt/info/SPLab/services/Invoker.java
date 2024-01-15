package ro.uvt.info.SPLab.services;

import lombok.Data;

@Data
public class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void executeCommand(){
        if(command != null){
            command.execute();
        }
    }
}
