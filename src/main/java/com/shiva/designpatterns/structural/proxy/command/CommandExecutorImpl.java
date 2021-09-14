package com.shiva.designpatterns.structural.proxy.command;

/**
 * @author : Shivakumar Desai
 * @project : DesignPatterns
 * @created : 2021-09-03 17:00
 **/


public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void runCommand(String cmd) throws Exception {
        //some heavy implementation
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
