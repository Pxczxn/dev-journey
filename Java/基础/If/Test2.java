package 基础.If;

import javax.sound.midi.Soundbank;

public class Test2 {
    public static void main(String[] args) {
        //汽车无人驾驶会涉及到大量的判断
        //当汽车行驶的时候遇到了红绿灯，就会进行判断
        //如果红灯亮，就停止
        //如果黄灯亮，就减速
        //如果绿灯亮，就行驶

        boolean isLightGreen=true;
        boolean isLightRed=false;
        boolean isLightYellow=false;

        if (isLightGreen){
            System.out.println("GOGOGO！！！");
        }
        if(isLightRed){
            System.out.println("Stop！！！");
        }
        if (isLightYellow){
            System.out.println("Slow！！！");
        }
    }
}
