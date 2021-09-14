package com.shiva.designpatterns.structural.proxy.command;

/**
 * @author : Shivakumar Desai
 * @project : DesignPatterns
 * @created : 2021-09-03 16:59
 **/


public interface CommandExecutor {
    public void runCommand(String cmd) throws Exception;
}
