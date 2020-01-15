package com.zxj.test;

public class test02 {
    public static final String[] WORDS={"this","two","fat","that"};
    public static  final char[][] zimi={{'t','h','i','s'},{'w','a','t','s'},{'o','a','h','g'},{'f','g','d','t'}};

    public static void main(String[] args){
        findWords(zimi,WORDS);

    }
    public static void findWords(char[][] arr,String[] words){
        //找到首字母
        String initWords="";
        for(String word: words){
            String init = word.substring(0, 1);
            if(initWords.contains(init)==false){
                initWords+=init;
            }
        }
        for(int x=0;x<arr.length;x++)
            for(int y=0;y<arr[x].length;y++){
                if(!initWords.contains(String.valueOf(arr[x][y]))) continue;
                else {
                    for(int p=1;p<=8;p++){
                        String tem="";
                        int xEnd = x ,yEnd = y;
                        while (ava(arr,xEnd,yEnd)){
                            tem+=arr[xEnd][yEnd];
                            pointW(tem,x,y,xEnd,yEnd);
                            if(p==1)xEnd--;                        //↑
                            if(p==2)xEnd++;                        //↓
                            if(p==3)yEnd++;                        //→
                            if(p==4)yEnd--;                        //←
                            if(p==5){xEnd--;yEnd++;}               //↗
                            if(p==6){xEnd++;yEnd--;}               //↙
                            if(p==7){xEnd++;yEnd++;}               //↘
                            if(p==8){xEnd--;yEnd--;}               //↖

                        }
                    }

                }
            }
    }
    public static boolean ava(char[][] arr,int x,int y) {
        if (x>=0 && x < arr.length) {
            if (y>=0  && y < arr[x].length)
                return true;
        }
            return false;
    }
    public static void pointW(String words,int x,int y,int xEnd,int yEnd){
        for(int m=0;m<WORDS.length;m++) {
            if (words.equals(WORDS[m])) {
                System.out.println(WORDS[m] + " " + "(" + (x + 1) + "," + (y + 1) + ")" + "->" + "(" + (xEnd + 1) + "," + (yEnd + 1) + ")");
            }
        }
    }
}
