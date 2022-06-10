package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Daily {

  public static final String DATE_FORMAT_YY_MM_DD = "yyMMdd";

  public static void main(String[] args) {

    List<String> nameList = List
        .of("岩本蓮加", "遠藤さくら", "賀喜遥香", "久保史緒里", "佐藤璃果", "柴田柚菜", "鈴木絢音", "清宮レイ", "田村真佑", "早川聖来",
            "松尾美佑", "弓木奈於");

    List<String> itemList = List.of("mail", "メッセージ");

    String date = formateDate(new Date());

    StringBuilder builder = new StringBuilder();

    for (String name : nameList) {
      for (String item : itemList) {
        builder.append(name + " " + item + " " + date)
            .append("\n");
      }
      builder.append("\n");
    }

    File file = new File("/Users/tcwang/Dropbox/Daily/daily_" + date + ".md");
    try (FileWriter writer = new FileWriter(file);) {

      writer.write(builder.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }


  }

  public static String formateDate(Date date) {
    SimpleDateFormat sdFormat = new SimpleDateFormat(DATE_FORMAT_YY_MM_DD);
    return sdFormat.format(date);
  }

}
