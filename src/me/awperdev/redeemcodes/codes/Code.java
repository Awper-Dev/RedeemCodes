package me.awperdev.redeemcodes.codes;

import java.util.ArrayList;
import java.util.List;

public class Code {
    private int id;
    private String key;
    private List<String> commands;
    private int uses;

    public Code(String key, int uses, String command, int id){
        this.key = key;
        this.commands = new ArrayList<>();
        this.commands.add(command);
        this.id = id;
        this.uses = uses;
    }

    public void addCommand(String command){
        commands.add(command);
    }

    public boolean removeCommand(String command){
        if(commands.contains(command)){
            commands.remove(command);
            return true;
        }else{
            return false;
        }
    }


    public List<String> getCommands() {
        return commands;
    }

    public int getUses() {
        return uses;
    }

    public void setUses(int uses) {
        this.uses = uses;
    }

    public String getKey() {
        return key;
    }

    public int getId() {
        return id;
    }
}
