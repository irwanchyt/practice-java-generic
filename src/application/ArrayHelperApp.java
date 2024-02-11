package src.application;

import src.utils.ArrayHelper;
public class ArrayHelperApp {

    public static void main(String[] args) {
        String[] name = {"irwan","budi","eko"};
        Integer[] age = {20,21,22};
        // for(int i=0;i<name.length;i++){
        //     System.out.println(name[i]+" "+age[i]);
        // }

        System.out.println(ArrayHelper.count(name));
        System.out.println(ArrayHelper.count(age));
    }
}
