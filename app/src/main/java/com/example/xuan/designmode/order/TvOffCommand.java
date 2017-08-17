package com.example.xuan.designmode.order;

/**
 * Author : xuan.
 * Data : 2017/8/17.
 * Description :input the description of this file.
 */

public class TvOffCommand implements Command {
    private Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
