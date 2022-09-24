package com.anatdimi.android.initials;

/**
 * Created by anat dimi on 3/15/2020.
 */

public class GameImageBank {

    public GameImageBank() {
    }

    public Game getGameImageBank(int n) {
        switch (n)
        {
            case 0:
                return new Game("a");
            case 1:
                return new Game("b");
            case 2:
                return new Game("c");
            case 3:
                return new Game("d");
            case 4:
                return new Game("e");
            case 5:
                return new Game("f");
            case 6:
                return new Game("g");
            case 7:
                return new Game("h");
            case 8:
                return new Game("i");
            case 9:
                return new Game("j");
            case 10:
                return new Game("k");
            case 11:
                return new Game("l");
            case 12:
                return new Game("m");
            case 13:
                return new Game("n");
            case 14:
                return new Game("o");
            case 15:
                return new Game("p");
            case 16:
                return new Game("q");
            case 17:
                return new Game("r");
            case 18:
                return new Game("s");
            case 19:
                return new Game("t");
            case 20:
                return new Game("u");
            case 21:
                return new Game("v");
            case 22:
                return new Game("w");
            case 23:
                return new Game("x");
            case 24:
                return new Game("y");
            case 25:
                return new Game("z");
            default:
                return null;
        }
    }
}
