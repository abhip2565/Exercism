import java.util.*;
class ResistorColor {
    int colorCode(String color) {
        HashMap<String,Integer> colorCodes=new HashMap<>();
        colorCodes.put("black",0);
        colorCodes.put("brown",1);
        colorCodes.put("red",2);
        colorCodes.put("orange",3);
        colorCodes.put("yellow",4);
        colorCodes.put("green",5);
        colorCodes.put("blue",6);
        colorCodes.put("violet",7);
        colorCodes.put("grey",8);
        colorCodes.put("white",9);
        return colorCodes.get(color);
    }

    String[] colors() {
        String[] str=new String[10];
        str[0]="black";
        str[1]="brown";
        str[2]="red";
        str[3]="orange";
        str[4]="yellow";
        str[5]="green";
        str[6]="blue";
        str[7]="violet";
        str[8]="grey";
        str[9]="white";
        return str;
    }
}
