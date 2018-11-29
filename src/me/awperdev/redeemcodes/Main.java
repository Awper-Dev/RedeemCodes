package me.awperdev.redeemcodes;


import me.awperdev.redeemcodes.codes.Code;
import me.awperdev.redeemcodes.codes.RandomString;
import org.bukkit.plugin.java.JavaPlugin;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Main extends JavaPlugin {
    private RandomString randomString;

    private List<Code> codeList;

    public void onEnable() {
        String easy = RandomString.digits + "ACEFGHJKLMNPQRUVWXYabcdefhijkprstuvwx";
        randomString = new RandomString(23, new SecureRandom(), easy);
        codeList = new ArrayList<>();
    }

    public void newCode(String key, String command, int uses){
        codeList.add(new Code(key, uses, command, codeList.size() - 1));
    }

    public void newCode(String command){

    }
}
