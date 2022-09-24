package com.anatdimi.android.initials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by anat dimi on 3/15/2020.
 */

public class Game {

    private String gameImage;
    private String answer;
    private List<String> answerList;
    private List<String> gameLetterList;    

    private List<String> wordList;

    public Game(String letter) {

        answerList = new ArrayList<>();
        gameLetterList = new ArrayList<>();
        wordList = new ArrayList<>();

        fillGameLetterList();

                switch (letter) {
                    case "a":
                        gameImage = randomA();
                        answer = gameLetterList.get(0);
                        answerList = getAnswerList(0);
                        break;
                    case "b":
                        gameImage = randomB();
                        answer = gameLetterList.get(1);
                        answerList = getAnswerList(1);
                        break;
                    case "c":
                        gameImage = randomC();
                        answer = gameLetterList.get(2);
                        answerList = getAnswerList(2);
                        break;
                    case "d":
                        gameImage = randomD();
                        answer = gameLetterList.get(3);
                        answerList = getAnswerList(3);
                        break;
                    case "e":
                        gameImage = randomE();
                        answer = gameLetterList.get(4);
                        answerList = getAnswerList(4);
                        break;
                    case "f":
                        gameImage = randomF();
                        answer = gameLetterList.get(5);
                        answerList = getAnswerList(5);
                        break;
                    case "g":
                        gameImage = randomG();
                        answer = gameLetterList.get(6);
                        answerList = getAnswerList(6);
                        break;
                    case "h":
                        gameImage = randomH();
                        answer = gameLetterList.get(7);
                        answerList = getAnswerList(7);
                        break;
                    case "i":
                        gameImage = randomI();
                        answer = gameLetterList.get(8);
                        answerList = getAnswerList(8);
                        break;
                    case "j":
                        gameImage = randomJ();
                        answer = gameLetterList.get(9);
                        answerList = getAnswerList(9);
                        break;
                    case "k":
                        gameImage = randomK();
                        answer = gameLetterList.get(10);
                        answerList = getAnswerList(10);
                        break;
                    case "l":
                        gameImage = randomL();
                        answer = gameLetterList.get(11);
                        answerList = getAnswerList(11);
                        break;
                    case "m":
                        gameImage = randomM();
                        answer = gameLetterList.get(12);
                        answerList = getAnswerList(12);
                        break;
                    case "n":
                        gameImage = randomN();
                        answer = gameLetterList.get(13);
                        answerList = getAnswerList(13);
                        break;
                    case "o":
                        gameImage = randomO();
                        answer = gameLetterList.get(14);
                        answerList = getAnswerList(14);
                        break;
                    case "p":
                        gameImage = randomP();
                        answer = gameLetterList.get(15);
                        answerList = getAnswerList(15);
                        break;
                    case "q":
                        gameImage = randomQ();
                        answer = gameLetterList.get(16);
                        answerList = getAnswerList(16);
                        break;
                    case "r":
                        gameImage = randomR();
                        answer = gameLetterList.get(17);
                        answerList = getAnswerList(17);
                        break;
                    case "s":
                        gameImage = randomS();
                        answer = gameLetterList.get(18);
                        answerList = getAnswerList(18);
                        break;
                    case "t":
                        gameImage = randomT();
                        answer = gameLetterList.get(19);
                        answerList = getAnswerList(19);
                        break;
                    case "u":
                        gameImage = randomU();
                        answer = gameLetterList.get(20);
                        answerList = getAnswerList(20);
                        break;
                    case "v":
                        gameImage = randomV();
                        answer = gameLetterList.get(21);
                        answerList = getAnswerList(21);
                        break;
                    case "w":
                        gameImage = randomW();
                        answer = gameLetterList.get(22);
                        answerList = getAnswerList(22);
                        break;
                    case "x":
                        gameImage = randomX();
                        answer = gameLetterList.get(23);
                        answerList = getAnswerList(23);
                        break;
                    case "y":
                        gameImage = randomY();
                        answer = gameLetterList.get(24);
                        answerList = getAnswerList(24);
                        break;
                    case "z":
                        gameImage = randomZ();
                        answer = gameLetterList.get(25);
                        answerList = getAnswerList(25);
                        break;
                    default:
                        gameImage = null;
                        answer = null;
                        break;
                }
    }

    //This is the list that holds example: " _pple" for apple.
    public List<String> getWordList() {
        return wordList;
    }

    private void fillGameLetterList(){

                    gameLetterList.add("a");
                    gameLetterList.add("b");
                    gameLetterList.add("c");
                    gameLetterList.add("d");
                    gameLetterList.add("e");
                    gameLetterList.add("f");
                    gameLetterList.add("g");
                    gameLetterList.add("h");
                    gameLetterList.add("i");
                    gameLetterList.add("j");
                    gameLetterList.add("k");
                    gameLetterList.add("l");
                    gameLetterList.add("m");
                    gameLetterList.add("n");
                    gameLetterList.add("o");
                    gameLetterList.add("p");
                    gameLetterList.add("q");
                    gameLetterList.add("r");
                    gameLetterList.add("s");
                    gameLetterList.add("t");
                    gameLetterList.add("u");
                    gameLetterList.add("v");
                    gameLetterList.add("w");
                    gameLetterList.add("x");
                    gameLetterList.add("y");
                    gameLetterList.add("z");

    }

    private String randomA(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("corn");
                return "acorn";
            case 2:
                wordList.add("lligator");
                return "alligator";
            case 3:
                wordList.add("pple");
                return "apple";
            default:
                return null;
        }
    }

    private String randomB(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1: 
               wordList.add("anana");
                return "banana";
            case 2:
               wordList.add("all");
                return "game_screen_question_image_ball1";
            case 3:
               wordList.add("ee");
                return "game_screen_question_image_bee";
            default:
                return null;
        }
    }

    private String randomC(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("arrot");
                return "carrot";
            case 2:
                wordList.add("at");
                return "cat";
            case 3:                
                wordList.add("orn");
                return "corn";
            default:
                return null;
        }
    }

    private String randomD(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
               wordList.add("inosaur");
                return "dinosaur";
            case 2:
               wordList.add("og");
                return "dog";
            case 3:
               wordList.add("oughnut");
                return "doughnut";
            default:
                return null;
        }
    }
    private String randomE(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("gg");wordList.add("corn");
                return "egg";
            case 2:
                wordList.add("lephant");
                return "elephant";
            case 3:
                wordList.add("ye");
                return "eye";
            default:
                return null;
        }
    }
    private String randomF(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("eather");
                return "feather";
            case 2:
                wordList.add("iretruck");
                return "firetruck";
            case 3:wordList.add("ish");
                return "fish";
            default:
                return null;
        }
    }
    private String randomG(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("iraffe");
                return "giraffe";
            case 2:
                wordList.add("lue");
                return "glue";
            case 3:
                wordList.add("rape");
                return "grape";
            default:
                return null;
        }
    }
    private String randomH(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("and");
                return "hand";
            case 2:
                wordList.add("at");
                return "hat";
            case 3:
                wordList.add("otdog");
                return "hotdog";
            default:
                return null;
        }
    }
    private String randomI(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("ce Cream");
                return "icecream";
            case 2:
                wordList.add("ce Cube");
                return "icecube";
            case 3:
                wordList.add("gloo");
                return "igloo";
            default:
                return null;
        }
    }
    private String randomJ(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("aguar");
                return "jaguar";
            case 2:
                wordList.add("ar");
                return "jar";
            case 3:
                wordList.add("elly");
                return "jelly";
            default:
                return null;
        }
    }
    private String randomK(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("angaroo");
                return "kangaroo";
            case 2:
                wordList.add("ing");
                return "king";
            case 3:
                wordList.add("ite");
                return "kite";
            default:
                return null;
        }
    }
    private String randomL(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("eaves");
                return "leaves";
            case 2:
                wordList.add("emon");
                return "lemon";
            case 3:
                wordList.add("ion");
                return "lion";
            default:
                return null;
        }
    }
    private String randomM(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("ermaid");
                return "mermaid";
            case 2:
                wordList.add("onkey");
                return "monkey";
            case 3:
                wordList.add("ountain");
                return "mountain";
            default:
                return null;
        }
    }
    private String randomN(){
        Random rand = new Random();
        int n = rand.nextInt(2) + 1;

        switch (n) {
            case 1:
                wordList.add("eedle");
                return "needle";
            case 2:
                wordList.add("est");
                return "nest";
            default:
                return null;
        }
    }
    private String randomO(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("ctopus");
                return "octopus";
            case 2:
                wordList.add("range");
                return "orange";
            case 3:
                wordList.add("strich");
                return "ostrich";
            default:
                return null;
        }
    }
    private String randomP(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("ancake");
                return "pancake";
            case 2:
                wordList.add("encil");
                return "pencil";
            case 3:
                wordList.add("ig");
                return "pig";
            default:
                return null;
        }
    }
    private String randomQ(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("uarter");
                return "quarter";
            case 2:
                wordList.add("ueen");
                return "queen";
            case 3:
                wordList.add("uestion Mark");
                return "question";
            default:
                return null;
        }
    }
    private String randomR(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("obot");
                return "robot";
            case 2:
                wordList.add("ooster");
                return "rooster";
            case 3:
                wordList.add("ose");
                return "rose";
            default:
                return null;
        }
    }
    private String randomS(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("cissors");
                return "scissors";
            case 2:
                wordList.add("nake");
                return "snake";
            case 3:
                wordList.add("nowman");
                return "snowman";
            default:
                return null;
        }
    }
    private String randomT(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("rain");
                return "train";
            case 2:
                wordList.add("ruck");
                return "truck";
            case 3:
                wordList.add("urtle");
                return "turtle";
            default:
                return null;
        }
    }
    private String randomU(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("mbrella");
                return "umbrella";
            case 2:
                wordList.add("nicorn");
                return "unicorn";
            case 3:
                wordList.add("nicycle");
                return "unicycle";
            default:
                return null;
        }
    }
    private String randomV(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("acuum");
                return "vacuum";
            case 2:
                wordList.add("ase");
                return "vase";
            case 3:
                wordList.add("iolin");
                return "violin";
            default:
                return null;
        }
    }
    private String randomW(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                wordList.add("hale");
                return "whale";
            case 2:
                wordList.add("indow");
                return "window";
            case 3:
                wordList.add("orm");
                return "worm";
            default:
                return null;
        }
    }
    private String randomX(){
        Random rand = new Random();
        int n = rand.nextInt(2) + 1;

        switch (n) {
            case 1:
                wordList.add("ray");
                return "xray";
            case 2:
                wordList.add("ylophone");
                return "xylophone";
            default:
                return null;
        }
    }
    private String randomY(){
        Random rand = new Random();
        int n = rand.nextInt(2) + 1;

        switch (n) {
            case 1:
                wordList.add("arn");
                return "yarn";
            case 2:
                wordList.add("o-yo");
                return "yoyo";
            default:
                return null;
        }
    }
    private String randomZ(){
        Random rand = new Random();
        int n = rand.nextInt(2) + 1;

        switch (n) {
            case 1:
                wordList.add("ebra");
                return "zebra";
            case 2:
                wordList.add("ipper");
                return "zipper";
            default:
                return null;
        }
    }

    /* 
        int answer is the position in the alphabet
        
    */
    private List<String> getAnswerList(int answer) {
        List<String> letterList = new ArrayList<>();
        int count = 0;
        int badAnswer1 = -1;
        int badAnswer2 = -1;
        int badAnswer3 = -1;
        int goodAnswer = answer;

        while (count != 3){
            Random rand = new Random();
            int n = rand.nextInt(25) + 1;

            if ((n != goodAnswer) && (n != badAnswer1) && (n != badAnswer2) && (n != badAnswer3))
            {
                letterList.add(gameLetterList.get(n));
                switch (count) {
                    case 0:
                        badAnswer1 = n;
                        break;
                    case 1:
                        badAnswer2 = n;
                        break;
                    case 2:
                        badAnswer3 = n;
                        
                        //Add the correct answer ALWAYS on fourth position
                        letterList.add(gameLetterList.get(answer));
                        break;
                }
                count++;
            }
        }

        Collections.shuffle(letterList);
        
        //The fifth spot in the letterList array holds the correct answer
        letterList.add(gameLetterList.get(answer));

        return letterList;
    }

    public String getGameImage(){
        return gameImage;
    }

    public String getAnswer() {
        return answer;
    }

    public List<String> getAnswerList() {
        return answerList;
    }
}
