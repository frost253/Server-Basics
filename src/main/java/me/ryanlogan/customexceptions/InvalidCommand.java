package me.ryanlogan.customexceptions;

public class InvalidCommand extends Exception {

    public InvalidCommand(String message) {
        super(message);
    }
}
